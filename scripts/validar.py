"""Valida as atividades complementares e a integridade da organização.
Responsável: Gilmar da Silva Filho.
Execute: python scripts/validar.py. Compiladores ausentes são registrados como NÃO EXECUTADO.
Os projetos antigos têm dependências próprias; esta rotina não promete compilá-los.
"""
import argparse
import ast
from collections import Counter
from contextlib import contextmanager
import json
import os
from pathlib import Path
import re
import shutil
import subprocess
import sys
from tempfile import TemporaryDirectory
from urllib.parse import unquote
import xml.etree.ElementTree as ET

ROOT = Path(__file__).resolve().parents[1]

def main():
    parser = argparse.ArgumentParser()
    parser.add_argument('--gcc', help='Caminho opcional do compilador C')
    parser.add_argument('--relatorio', help='Destino opcional do relatório JSON')
    args = parser.parse_args()
    resultados = []
    env = dict(os.environ, PYTHONIOENCODING='utf-8', PYTHONDONTWRITEBYTECODE='1')
    def registrar(nome, status, detalhe=''):
        resultados.append(dict(verificacao=nome,status=status,detalhe=detalhe))
        print(f'{status}: {nome}')
    def executar(nome, comando, cwd, expected=None):
        try:
            r = subprocess.run(comando,cwd=cwd,env=env,capture_output=True,text=True,encoding='utf-8',errors='replace',timeout=90)
            ok=r.returncode==0 and (expected is None or expected in r.stdout)
            registrar(nome,'OK' if ok else 'FALHA',(r.stdout+r.stderr)[-3500:])
            return ok
        except OSError as erro:
            if getattr(erro,'winerror',None)==4551:
                registrar(nome,'NÃO EXECUTADO','Política de Controle de Aplicativo do Windows bloqueou a execução. '+str(erro))
                return False
            registrar(nome,'FALHA',str(erro));return False
        except subprocess.TimeoutExpired as erro:
            registrar(nome,'FALHA',str(erro));return False

    catalogo=json.loads((ROOT/'docs/atividades.json').read_text(encoding='utf-8'))
    manifesto=json.loads((ROOT/'docs/manifesto-organizacao.json').read_text(encoding='utf-8'))
    faltantes=[r['arquivo'] for r in manifesto['arquivos'] if not (ROOT/r['arquivo']).is_file()]
    registrar('Arquivos originais e importados preservados','FALHA' if faltantes else 'OK',str(faltantes))
    materias={item['materia'] for item in catalogo}
    registrar('Cobertura das 15 disciplinas','OK' if materias==set(range(15)) else 'FALHA')
    nomes=[r['arquivo'].casefold() for r in manifesto['arquivos']]
    registrar('Ausência de colisões de nomes no Windows','OK' if len(nomes)==len(set(nomes)) else 'FALHA')
    for readme in ROOT.rglob('*.md'):
        if not (readme.name=='README.md' and 'acervo' not in readme.parts and 'importados' not in readme.parts):continue
        for link in re.findall(r'\]\(([^)]+)\)',readme.read_text(encoding='utf-8')):
            if '://' in link or link.startswith('#'):continue
            destino=unquote(link.split('#')[0])
            if destino and not (readme.parent/destino).exists():registrar('Link '+str(readme.relative_to(ROOT)),'FALHA',link)

    gcc=args.gcc or shutil.which('gcc')
    if gcc:env['PATH']=str(Path(gcc).resolve().parent)+os.pathsep+env.get('PATH','')
    java=shutil.which('java');javac=shutil.which('javac');php=shutil.which('php');node=shutil.which('node')
    esperados={
        '01_decisoes_e_lacos.c':'Media: 7.00 - Aprovado',
        '02_vetores_e_matrizes.c':'Indice: 1\nDiagonal: 15',
        '03_estruturas_e_ponteiros.c':'Maior: -2',
        '04_arquivos_e_recursao.c':'Fatorial: 120',
        '01_sensor.c':'ADC=390, V=1.91, saida=0',
        'ContaDemo.java':'Saldo: 89.00',
        'ColecoesDemo.java':'Java: 8.0',
        'ArquivoDemo.java':'Java: true',
    }
    with TemporaryDirectory(prefix='cotil-validacao-') as temporario:
        saida=Path(temporario)
        for i,item in enumerate(catalogo):
            p=ROOT/item['arquivo'];nome=item['arquivo']
            if not p.exists():registrar(nome,'FALHA','Arquivo ausente');continue
            s=p.read_text(encoding='utf-8')
            if p.suffix=='.py':
                try:ast.parse(s)
                except SyntaxError as erro:registrar(nome,'FALHA',str(erro));continue
                if p.name in {'api.py','cliente.py'}:continue
                executar(nome,[sys.executable,str(p)],p.parent)
            elif p.suffix=='.java':
                if not java or not javac:registrar(nome,'NÃO EXECUTADO','JDK ausente');continue
                destino=saida/str(i);destino.mkdir()
                if executar(nome+' compilação',[javac,'-encoding','UTF-8','-d',str(destino),str(p)],p.parent):
                    executar(nome+' execução',[java,'-cp',str(destino),p.stem],p.parent,esperados[p.name])
            elif p.suffix=='.c':
                if not gcc:registrar(nome,'NÃO EXECUTADO','Compilador C ausente');continue
                exe=saida/f'atividade-{i}.exe'
                if executar(nome+' compilação',[gcc,'-std=c11','-Wall','-Wextra','-Werror',str(p),'-o',str(exe)],p.parent):
                    executar(nome+' execução',[str(exe)],p.parent,esperados[p.name])
            elif p.suffix=='.php':
                if php:executar(nome+' sintaxe',[php,'-l',str(p)],p.parent)
                else:registrar(nome,'NÃO EXECUTADO','PHP ausente')
            elif p.suffix=='.html':
                scripts=re.findall(r'<script(?:\s[^>]*)?>(.*?)</script>',s,re.S|re.I)
                for indice,script in enumerate(scripts):
                    if node:
                        arquivo=saida/f'script-{i}-{indice}.js';arquivo.write_text(script,encoding='utf-8')
                        executar(nome+' sintaxe JavaScript',[node,'--check',str(arquivo)],p.parent)
                    else:registrar(nome,'NÃO EXECUTADO','Node.js ausente')
            elif p.suffix=='.csproj':
                try:ET.fromstring(s);registrar(nome+' XML','OK')
                except ET.ParseError as erro:registrar(nome+' XML','FALHA',str(erro))
            elif p.suffix in {'.dart','.ino'}:
                registrar(nome,'NÃO EXECUTADO','Exige Dart/Flutter ou Arduino IDE; confira instruções da matéria')
    resumo=dict(Counter(r['status'] for r in resultados))
    print(json.dumps(resumo,ensure_ascii=False))
    if args.relatorio:
        Path(args.relatorio).write_text(json.dumps(dict(resumo=resumo,resultados=resultados),ensure_ascii=False,indent=2)+'\n',encoding='utf-8')
    return 1 if resumo.get('FALHA',0) else 0

if __name__=='__main__':sys.exit(main())
