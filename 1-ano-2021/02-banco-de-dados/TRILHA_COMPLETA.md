# Trilha por conteúdo — Banco de Dados

Gilmar da Silva — 201269

[Voltar à matéria](README.md)

Siga a ordem abaixo: fundamentos → aplicação → integração. Cada linha aponta para uma atividade concreta.

| Conteúdo | Atividade |
|---|---|
| Tipos, tabelas, chaves, restrições e CRUD | [CRUD, parâmetros e integridade](atividades-comentadas/00-fundamentos/01_crud_sql.py) |
| Normalização, cardinalidade e relacionamento N:N | [Normalização e relacionamento N:N](atividades-comentadas/00-fundamentos/02_normalizacao.py) |
| SELECT, JOIN, filtros e agregações | [Junções e agregações](atividades-comentadas/02_consultas.sql) |
| Transações, commit e rollback | [Atomicidade com SAVEPOINT](atividades-comentadas/03_transacao.sql) |
| Views, índices e plano de consulta | [SQL: JOIN, GROUP BY, view, índice e plano](atividades-comentadas/20-aplicacao/03_indices_views.py) |

## Como praticar

Para cada atividade: leia a explicação, preveja o resultado, execute o exemplo e resolva o desafio. Registre um caso válido, um limite e um caso inválido. Os exemplos são pontos de partida; os desafios exigem adaptação.

## Comandos e desafios

### CRUD, parâmetros e integridade

INSERT cria, SELECT consulta, UPDATE altera e DELETE remove. Parâmetros separam dados de comandos SQL.

Execução a partir de `atividades-comentadas`: `python 00-fundamentos/01_crud_sql.py`

Desafio: Inclua UNIQUE no e-mail e verifique duplicatas.

### Normalização e relacionamento N:N

Separar aluno, curso e matrícula evita repetir o nome do aluno em cada inscrição. A chave composta impede inscrição duplicada.

Execução a partir de `atividades-comentadas`: `python 00-fundamentos/02_normalizacao.py`

Desafio: Explique as dependências funcionais e modele a nota por matrícula.

### Junções e agregações

JOIN reúne registros pelas chaves. LEFT JOIN mantém livros sem empréstimos. COUNT(coluna) não conta NULL; COUNT(*) contaria a linha vazia produzida pela junção.

Execução a partir de `atividades-comentadas`: `python executar_sql.py`

Desafio: Filtre livros com dois ou mais empréstimos usando HAVING.

### Atomicidade com SAVEPOINT

Uma transação agrupa alterações. ROLLBACK TO desfaz operações posteriores ao ponto salvo. Não se deve confirmar metade de uma operação de negócio.

Execução a partir de `atividades-comentadas`: `python executar_sql.py`

Desafio: Crie uma transação que registre o empréstimo e diminua o estoque apenas se houver disponibilidade.

### SQL: JOIN, GROUP BY, view, índice e plano

Uma view nomeia uma consulta; um índice acelera determinadas buscas com custo em armazenamento e escrita.

Execução a partir de `atividades-comentadas`: `python 20-aplicacao/03_indices_views.py`

Desafio: Inclua um curso sem inscrições e explique NULL no resultado do LEFT JOIN.
