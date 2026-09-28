-- Atomicidade com SAVEPOINT
-- Autor: Gilmar da Silva
-- Matéria: Banco de Dados
-- Conceitos: Uma transação agrupa alterações. ROLLBACK TO desfaz operações posteriores ao ponto salvo. Não se deve confirmar metade de uma operação de negócio.
-- Objetivo: Simular uma baixa de estoque e desfazê-la, mantendo duas unidades de Algoritmos.
-- Execução (nesta pasta): python executar_sql.py
-- Pratique: Crie uma transação que registre o empréstimo e diminua o estoque apenas se houver disponibilidade.
SAVEPOINT simulacao;
UPDATE livro SET quantidade = quantidade - 1 WHERE id = 1 AND quantidade > 0;
ROLLBACK TO simulacao;
RELEASE simulacao;
SELECT titulo, quantidade FROM livro WHERE id = 1;
