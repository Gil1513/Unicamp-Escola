"""
Normalização e relacionamento N:N
Responsável: Gilmar da Silva
Conceitos: Separar aluno, curso e matrícula evita repetir o nome do aluno em cada inscrição. A chave composta impede inscrição duplicada.
Execução: python 00-fundamentos/02_normalizacao.py
Pratique: Explique as dependências funcionais e modele a nota por matrícula.
"""
import sqlite3
with sqlite3.connect(':memory:') as db:
    db.execute('PRAGMA foreign_keys=ON')
    db.executescript('''
      CREATE TABLE aluno(id INTEGER PRIMARY KEY, nome TEXT NOT NULL);
      CREATE TABLE curso(id INTEGER PRIMARY KEY, nome TEXT NOT NULL);
      CREATE TABLE matricula(aluno_id INTEGER REFERENCES aluno(id), curso_id INTEGER REFERENCES curso(id), PRIMARY KEY(aluno_id, curso_id));
      INSERT INTO aluno VALUES(201269, 'Gilmar da Silva');
      INSERT INTO curso VALUES(1, 'Java'), (2, 'Banco de Dados');
      INSERT INTO matricula VALUES(201269, 1), (201269, 2);
    ''')
    consulta = 'SELECT a.nome, c.nome FROM matricula m JOIN aluno a ON a.id=m.aluno_id JOIN curso c ON c.id=m.curso_id ORDER BY c.nome'
    linhas = db.execute(consulta).fetchall()
    assert len(linhas) == 2
    print(linhas)
