-- Modelagem relacional e integridade
-- Autor: Gilmar da Silva Filho
-- Matéria: Banco de Dados
-- Material complementar de revisão; não é uma reprodução das aulas de 2021–2023.
-- Conceitos: Chaves primárias identificam registros. A tabela emprestimo resolve o relacionamento entre leitor e livro sem repetir os dados do leitor; FKs mantêm referências válidas.
-- Objetivo: Criar três tabelas e registrar um empréstimo; rejeitar quantidade negativa e referência inexistente.
-- Execução (nesta pasta): python executar_sql.py
-- Pratique: Adicione data_devolucao e uma consulta de empréstimos pendentes.
PRAGMA foreign_keys = ON;
CREATE TABLE leitor (
    id INTEGER PRIMARY KEY,
    nome TEXT NOT NULL CHECK(length(trim(nome)) > 0)
);
CREATE TABLE livro (
    id INTEGER PRIMARY KEY,
    titulo TEXT NOT NULL,
    quantidade INTEGER NOT NULL CHECK(quantidade >= 0)
);
CREATE TABLE emprestimo (
    id INTEGER PRIMARY KEY,
    leitor_id INTEGER NOT NULL REFERENCES leitor(id),
    livro_id INTEGER NOT NULL REFERENCES livro(id),
    data_emprestimo TEXT NOT NULL
);
INSERT INTO leitor VALUES (1, 'Gilmar da Silva Filho');
INSERT INTO livro VALUES (1, 'Algoritmos', 2), (2, 'Redes', 1);
INSERT INTO emprestimo VALUES (1, 1, 1, '2023-03-01');
