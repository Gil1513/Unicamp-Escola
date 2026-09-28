"""
Git: histórico, branch e comparação
Autor: Gilmar da Silva Filho
Matéria: Tópicos em Tecnologia da Informação
Material complementar de revisão; não é uma reprodução das aulas de 2021–2023.
Conceitos: Commit registra uma versão; branch aponta para uma linha de desenvolvimento; diff compara conteúdos. Este laboratório cria um repositório temporário, sem alterar o repositório de estudos nem a configuração global.
Objetivo: Criar dois commits locais em branches diferentes e exibir o diff.
Execução (nesta pasta): python 03_git_laboratorio.py (requer Git)
Pratique: No repositório temporário, crie mudanças conflitantes em duas branches e explique a resolução.
"""
import subprocess
from tempfile import TemporaryDirectory
from pathlib import Path

def laboratorio():
    with TemporaryDirectory() as pasta:
        def git(*args):
            return subprocess.check_output(['git','-c','user.name=Gilmar da Silva Filho','-c','user.email=estudo@example.invalid',*args],cwd=pasta,stderr=subprocess.STDOUT).decode('utf-8',errors='replace')
        git('init','-b','main')
        arquivo=Path(pasta)/'revisao.txt';arquivo.write_text('Primeira versão\n',encoding='utf-8')
        git('add','revisao.txt');git('commit','-m','Registra revisão inicial')
        git('switch','-c','revisao')
        arquivo.write_text('Primeira versão\nNovo exercício\n',encoding='utf-8')
        git('add','revisao.txt');git('commit','-m','Acrescenta exercício')
        print(git('diff','main','revisao','--','revisao.txt'))

if __name__=='__main__':laboratorio()
