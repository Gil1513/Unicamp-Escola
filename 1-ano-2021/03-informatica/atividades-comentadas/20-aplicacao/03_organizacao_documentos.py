"""
Informática: caminhos, extensões e inventário de arquivos
Gilmar da Silva — 201269
Conceitos: Separar nome, extensão e tamanho permite organizar documentos; operações ficam em diretório temporário.
Execute: python 20-aplicacao/03_organizacao_documentos.py
Desafio: Abra o CSV em uma planilha e filtre por extensão; compare caminho relativo e absoluto.
"""

from pathlib import Path
from tempfile import TemporaryDirectory
import csv
with TemporaryDirectory() as tmp:
    raiz=Path(tmp)
    for nome,conteudo in [('aula.txt','Anotação'),('dados.csv','nome,ra\nGilmar da Silva,201269')]:
        (raiz/nome).write_text(conteudo,encoding='utf-8')
    arquivos=sorted(raiz.iterdir())
    with (raiz/'inventario.csv').open('w',encoding='utf-8',newline='') as f:
        w=csv.writer(f); w.writerow(['nome','extensao','bytes'])
        w.writerows((p.name,p.suffix,p.stat().st_size) for p in arquivos)
    assert len(arquivos)==2
    print((raiz/'inventario.csv').read_text(encoding='utf-8'))
