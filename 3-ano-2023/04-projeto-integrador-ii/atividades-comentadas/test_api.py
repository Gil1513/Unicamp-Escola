"""
Testes de integração com HTTP real
Autor: Gilmar da Silva Filho
Matéria: Projeto Integrador II
Material complementar de revisão; não é uma reprodução das aulas de 2021–2023.
Conceitos: Um teste de integração atravessa cliente, servidor e banco. Porta aleatória e banco temporário isolam a execução; servidor e thread são encerrados ao final.
Objetivo: Verificar cadastro, persistência, conflito, JSON inválido, tipos incorretos e rota desconhecida.
Execução (nesta pasta): python -m unittest discover -s . -p test_api.py -v
Pratique: Acrescente testes para os endpoints PATCH e DELETE propostos.
"""
import json, threading, unittest
from tempfile import TemporaryDirectory
from pathlib import Path
from urllib.request import Request, urlopen
from urllib.error import HTTPError
from api import criar_servidor

class TestAPI(unittest.TestCase):
    def setUp(self):
        self.temp=TemporaryDirectory()
        self.server=criar_servidor(str(Path(self.temp.name)/'teste.sqlite3'))
        self.thread=threading.Thread(target=self.server.serve_forever,daemon=True);self.thread.start()
        self.url=f'http://127.0.0.1:{self.server.server_port}'
    def tearDown(self):
        self.server.shutdown();self.server.server_close();self.thread.join();self.temp.cleanup()
    def request(self,path='/materiais',data=None,raw=None):
        corpo=raw if raw is not None else (json.dumps(data).encode() if data is not None else None)
        pedido=Request(self.url+path,data=corpo,headers={'Content-Type':'application/json'})
        try:
            with urlopen(pedido,timeout=5) as r:return r.status,json.load(r)
        except HTTPError as e:return e.code,json.load(e)
    def test_cadastro_e_consulta(self):
        status, registro=self.request(data={'nome':'Caneta','quantidade':2});self.assertEqual(status,201)
        self.assertEqual(self.request(),(200,[registro]))
    def test_conflito(self):
        self.request(data={'nome':'Caderno','quantidade':1})
        self.assertEqual(self.request(data={'nome':'Caderno','quantidade':2})[0],409)
    def test_invalidos(self):
        for dados in [{'nome':'','quantidade':1},{'nome':'Item','quantidade':-1},{'nome':'Item','quantidade':True},[]]:
            with self.subTest(dados=dados):self.assertEqual(self.request(data=dados)[0],422)
    def test_json_invalido(self):self.assertEqual(self.request(raw=b'{')[0],400)
    def test_rota(self):self.assertEqual(self.request('/inexistente')[0],404)

if __name__=='__main__':unittest.main()
