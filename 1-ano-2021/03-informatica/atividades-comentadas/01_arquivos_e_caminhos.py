"""
Arquivos, diretórios e caminhos portáveis
Autor: Gilmar da Silva
Matéria: Informática
Conceitos: Diretórios organizam arquivos; um caminho relativo depende do diretório atual. pathlib evita concatenar separadores diferentes no Windows e no Linux.
Objetivo: Criar, ler e listar documentos em um diretório temporário, removido automaticamente.
Execução (nesta pasta): python 01_arquivos_e_caminhos.py
Pratique: Crie subpastas por matéria e compare caminho absoluto com caminho relativo.
"""
from pathlib import Path
from tempfile import TemporaryDirectory

if __name__ == '__main__':
    with TemporaryDirectory() as temporario:
        pasta = Path(temporario)/'estudos'
        pasta.mkdir()
        arquivo = pasta/'anotacoes.txt'
        arquivo.write_text('Gilmar da Silva\nRevisão de informática\n', encoding='utf-8')
        print('Extensão:', arquivo.suffix)
        print('Caminho relativo:', arquivo.relative_to(temporario))
        print(arquivo.read_text(encoding='utf-8'))
        print('Arquivos:', [item.name for item in pasta.iterdir()])
