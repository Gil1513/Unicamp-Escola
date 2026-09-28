"""
Projeto integrado: API HTTP e banco de dados
Autor: Gilmar da Silva Filho
Matéria: Projeto Integrador II
Material complementar de revisão; não é uma reprodução das aulas de 2021–2023.
Conceitos: Uma API define rotas, métodos e códigos de resposta. JSON transporta dados; SQLite persiste registros. Consultas parametrizadas separam dados e comandos. Servidor didático local, sem autenticação.
Objetivo: Criar e consultar materiais por HTTP, rejeitando entrada inválida com 422; banco em inventario.sqlite3.
Execução (nesta pasta): python api.py; em outro terminal execute python cliente.py
Pratique: Implemente PATCH e DELETE com validação de ID e resposta 404 para registros ausentes.
"""
import json
import sqlite3
from contextlib import closing
from pathlib import Path
from http.server import BaseHTTPRequestHandler, ThreadingHTTPServer

def criar_servidor(arquivo, porta=0):
    with closing(sqlite3.connect(arquivo)) as banco, banco:
        banco.execute('CREATE TABLE IF NOT EXISTS material (id INTEGER PRIMARY KEY, nome TEXT NOT NULL UNIQUE, quantidade INTEGER NOT NULL CHECK(quantidade>=0))')
    class Handler(BaseHTTPRequestHandler):
        def responder(self, status, dados):
            corpo=json.dumps(dados, ensure_ascii=False).encode('utf-8')
            self.send_response(status)
            self.send_header('Content-Type','application/json; charset=utf-8')
            self.send_header('Content-Length',str(len(corpo)))
            self.end_headers(); self.wfile.write(corpo)
        def do_GET(self):
            if self.path != '/materiais': return self.responder(404, {'erro':'Rota inexistente'})
            with closing(sqlite3.connect(arquivo)) as banco, banco:
                banco.row_factory=sqlite3.Row
                dados=[dict(row) for row in banco.execute('SELECT * FROM material ORDER BY id')]
            self.responder(200,dados)
        def do_POST(self):
            if self.path != '/materiais': return self.responder(404, {'erro':'Rota inexistente'})
            if self.headers.get_content_type() != 'application/json':
                return self.responder(415, {'erro':'Use application/json'})
            try:
                tamanho=int(self.headers.get('Content-Length','0'))
                if not 0 < tamanho <= 4096: return self.responder(413, {'erro':'Corpo ausente ou grande demais'})
                dados=json.loads(self.rfile.read(tamanho))
            except (ValueError, UnicodeError): return self.responder(400, {'erro':'JSON inválido'})
            if not isinstance(dados,dict): return self.responder(422, {'erro':'Esperado objeto JSON'})
            nome=dados.get('nome'); quantidade=dados.get('quantidade')
            if not isinstance(nome,str) or not nome.strip() or len(nome.strip())>100 or type(quantidade) is not int or not 0 <= quantidade <= 1000000:
                return self.responder(422, {'erro':'Nome e quantidade inválidos'})
            try:
                with closing(sqlite3.connect(arquivo)) as banco, banco:
                    cursor=banco.execute('INSERT INTO material(nome,quantidade) VALUES (?,?)',(nome.strip(),quantidade))
                    identificador=cursor.lastrowid
            except sqlite3.IntegrityError: return self.responder(409, {'erro':'Material já cadastrado'})
            self.responder(201, {'id':identificador,'nome':nome.strip(),'quantidade':quantidade})
        def log_message(self, formato, *args): pass
    return ThreadingHTTPServer(('127.0.0.1',porta),Handler)

if __name__=='__main__':
    servidor=criar_servidor(str(Path(__file__).with_name('inventario.sqlite3')),8001)
    print('API local: http://127.0.0.1:8001/materiais (Ctrl+C para encerrar)')
    try: servidor.serve_forever()
    except KeyboardInterrupt: pass
    finally: servidor.server_close()
