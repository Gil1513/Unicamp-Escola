"""
Hash e integridade de arquivos
Autor: Gilmar da Silva Filho
Matéria: Tópicos em Tecnologia da Informação
Material complementar de revisão; não é uma reprodução das aulas de 2021–2023.
Conceitos: SHA-256 gera um resumo do conteúdo; mudar um byte altera o resumo com altíssima probabilidade. Hash não é criptografia, não recupera o arquivo e sozinho não comprova autoria.
Objetivo: Comparar resumos iguais e diferentes, lendo arquivos por blocos para economizar memória.
Execução (nesta pasta): python 02_integridade.py
Pratique: Crie um manifesto com hashes e detecte qual arquivo mudou.
"""
import hashlib
from pathlib import Path
from tempfile import TemporaryDirectory

def sha256(arquivo):
    resumo=hashlib.sha256()
    with Path(arquivo).open('rb') as stream:
        for bloco in iter(lambda:stream.read(65536),b''):resumo.update(bloco)
    return resumo.hexdigest()

if __name__=='__main__':
    with TemporaryDirectory() as pasta:
        p=Path(pasta)/'exemplo.txt';p.write_text('versão 1',encoding='utf-8')
        primeiro=sha256(p);assert primeiro==sha256(p)
        p.write_text('versão 2',encoding='utf-8')
        print('Conteúdo alterado:',primeiro!=sha256(p))
