"""
Integrador II: migração versionada e repetição segura
Gilmar da Silva — 201269
Conceitos: Uma migração registra a versão aplicada. Reexecutar o processo não deve duplicar colunas ou dados.
Execute: python 20-aplicacao/03_migracao_sql.py
Desafio: Adicione uma terceira migração e teste atualização de uma base que já está na versão 1.
"""

import sqlite3
def migrar(db):
    versao=db.execute('PRAGMA user_version').fetchone()[0]
    with db:
        if versao<1:
            db.execute('CREATE TABLE material(id INTEGER PRIMARY KEY,nome TEXT NOT NULL)')
            db.execute('PRAGMA user_version=1')
        if versao<2:
            db.execute('ALTER TABLE material ADD COLUMN quantidade INTEGER NOT NULL DEFAULT 0 CHECK(quantidade>=0)')
            db.execute('PRAGMA user_version=2')
with sqlite3.connect(':memory:') as db:
    migrar(db); db.execute("INSERT INTO material(id,nome) VALUES(1,'Cabo')"); db.commit()
    migrar(db)
    assert db.execute('SELECT quantidade FROM material').fetchone()[0]==0
    assert db.execute('PRAGMA user_version').fetchone()[0]==2
    print(db.execute('PRAGMA table_info(material)').fetchall())
