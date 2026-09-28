"""
Integração de cliente e serviço HTTP
Autor: Gilmar da Silva
Matéria: Projeto Integrador II
Conceitos: O cliente serializa o corpo, define Content-Type e interpreta o código HTTP. Uma resposta 409 é um conflito de negócio; falha de conexão é outro tipo de erro.
Objetivo: Enviar Caderno e consultar a lista; reconhecer conflito caso execute novamente.
Execução (nesta pasta): Com api.py em execução: python cliente.py
Pratique: Acrescente uma opção de terminal para informar nome e quantidade.
"""
import json
from urllib.request import Request, urlopen
from urllib.error import HTTPError, URLError

def main():
    url='http://127.0.0.1:8001/materiais'
    corpo=json.dumps({'nome':'Caderno','quantidade':3}).encode()
    try:
        try:
            with urlopen(Request(url,data=corpo,headers={'Content-Type':'application/json'}),timeout=5) as resposta:
                print('Cadastro:',resposta.status,json.load(resposta))
        except HTTPError as erro:
            print('Resposta do servidor:',erro.code,erro.read().decode())
        with urlopen(url,timeout=5) as resposta: print('Lista:',json.load(resposta))
    except URLError as erro: print('Não foi possível conectar. Inicie api.py.',erro.reason)

if __name__=='__main__':main()
