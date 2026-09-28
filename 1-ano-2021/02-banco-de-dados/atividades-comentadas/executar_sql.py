"""
Laboratório SQL em memória
Autor: Gilmar da Silva
Matéria: Banco de Dados
Conceitos: SQLite permite praticar SQL sem instalar um servidor. O banco deste exemplo só existe durante o processo. PRAGMA é específico de SQLite; MySQL usa configuração própria.
Objetivo: Executar a sequência SQL, exibir consultas e verificar as restrições do esquema.
Execução (nesta pasta): python executar_sql.py
Pratique: Reproduza as tabelas em MySQL e identifique as diferenças de dialeto.
"""
import sqlite3
from pathlib import Path

def executar():
    with sqlite3.connect(':memory:') as banco:
        base = Path(__file__).parent
        banco.executescript((base/'01_modelagem.sql').read_text(encoding='utf-8'))
        for arquivo in ['02_consultas.sql', '03_transacao.sql']:
            texto = (base/arquivo).read_text(encoding='utf-8')
            # O parser reconhece o término da instrução, ignorando ; em comentários.
            comando = ''
            for linha in texto.splitlines(keepends=True):
                comando += linha
                if sqlite3.complete_statement(comando):
                    cursor = banco.execute(comando)
                    if cursor.description: print(cursor.fetchall())
                    comando = ''
        assert banco.execute('SELECT quantidade FROM livro WHERE id=1').fetchone()[0] == 2
        for comando in ["UPDATE livro SET quantidade=-1 WHERE id=1",
                        "INSERT INTO emprestimo VALUES(2,99,1,'2023-03-02')"]:
            try: banco.execute(comando)
            except sqlite3.IntegrityError: print('Restrição respeitada.')
            else: raise AssertionError('A restrição deveria ter rejeitado o comando.')

if __name__ == '__main__': executar()
