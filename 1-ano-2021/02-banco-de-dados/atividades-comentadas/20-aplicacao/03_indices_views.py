"""
SQL: JOIN, GROUP BY, view, índice e plano
Gilmar da Silva — 201269
Conceitos: Uma view nomeia uma consulta; um índice acelera determinadas buscas com custo em armazenamento e escrita.
Execute: python 20-aplicacao/03_indices_views.py
Desafio: Inclua um curso sem inscrições e explique NULL no resultado do LEFT JOIN.
"""

import sqlite3
with sqlite3.connect(':memory:') as db:
    db.executescript('''
    CREATE TABLE curso(id INTEGER PRIMARY KEY, nome TEXT);
    CREATE TABLE inscricao(id INTEGER PRIMARY KEY, curso_id INTEGER REFERENCES curso(id), nota REAL);
    INSERT INTO curso VALUES(1,'Java'),(2,'Web');
    INSERT INTO inscricao VALUES(1,1,8),(2,1,6),(3,2,9);
    CREATE INDEX idx_inscricao_curso ON inscricao(curso_id);
    CREATE VIEW media_curso AS SELECT c.nome, AVG(i.nota) media FROM curso c LEFT JOIN inscricao i ON i.curso_id=c.id GROUP BY c.id,c.nome;
    ''')
    assert db.execute("SELECT media FROM media_curso WHERE nome='Java'").fetchone()[0] == 7
    plano = db.execute('EXPLAIN QUERY PLAN SELECT * FROM inscricao WHERE curso_id=1').fetchall()
    assert any('idx_inscricao_curso' in linha[-1] for linha in plano)
    print(db.execute('SELECT * FROM media_curso ORDER BY nome').fetchall(), plano)
