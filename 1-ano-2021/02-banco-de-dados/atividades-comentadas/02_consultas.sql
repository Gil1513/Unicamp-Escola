-- Junções e agregações
-- Autor: Gilmar da Silva
-- Matéria: Banco de Dados
-- Conceitos: JOIN reúne registros pelas chaves. LEFT JOIN mantém livros sem empréstimos. COUNT(coluna) não conta NULL; COUNT(*) contaria a linha vazia produzida pela junção.
-- Objetivo: Listar Algoritmos com um empréstimo e Redes com zero.
-- Execução (nesta pasta): python executar_sql.py
-- Pratique: Filtre livros com dois ou mais empréstimos usando HAVING.
SELECT leitor.nome, livro.titulo, emprestimo.data_emprestimo
FROM emprestimo
JOIN leitor ON leitor.id = emprestimo.leitor_id
JOIN livro ON livro.id = emprestimo.livro_id;

SELECT livro.titulo, COUNT(emprestimo.id) AS total
FROM livro LEFT JOIN emprestimo ON livro.id = emprestimo.livro_id
GROUP BY livro.id, livro.titulo ORDER BY livro.id;
