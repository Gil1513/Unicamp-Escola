"""
CRUD, parâmetros e integridade
Responsável: Gilmar da Silva
Conceitos: INSERT cria, SELECT consulta, UPDATE altera e DELETE remove. Parâmetros separam dados de comandos SQL.
Execução: python 00-fundamentos/01_crud_sql.py
Pratique: Inclua UNIQUE no e-mail e verifique duplicatas.
"""
import sqlite3
with sqlite3.connect(':memory:') as db:
    db.execute('CREATE TABLE aluno (ra INTEGER PRIMARY KEY, nome TEXT NOT NULL, nota REAL CHECK(nota BETWEEN 0 AND 10))')
    db.execute('INSERT INTO aluno VALUES (?, ?, ?)', (201269, 'Gilmar da Silva', 7))
    db.execute('UPDATE aluno SET nota = ? WHERE ra = ?', (8.5, 201269))
    assert db.execute('SELECT nota FROM aluno WHERE ra = ?', (201269,)).fetchone() == (8.5,)
    try:
        db.execute('UPDATE aluno SET nota = 11')
    except sqlite3.IntegrityError:
        print('CHECK rejeitou a nota fora do intervalo.')
    else:
        raise AssertionError('Nota inválida foi aceita')
    db.execute('DELETE FROM aluno WHERE ra = ?', (201269,))
    assert db.execute('SELECT COUNT(*) FROM aluno').fetchone()[0] == 0
