# Banco de Dados

**Gilmar da Silva | 2021 | 90 horas de formação profissional**

[Voltar ao índice](../../README.md)

Comece por `atividades-comentadas/00-fundamentos/`, na ordem indicada abaixo, e avance para os exemplos e projetos.

## Sequência de estudo

1. Entidades e relacionamentos.
2. cardinalidade.
3. normalização.
4. chaves.
5. SQL.
6. junções.
7. agregações.
8. transações.

Os PDFs de `acervo/01-fluxograma/` introduzem entidades, cardinalidade, chaves e DER. Depois execute modelagem, consultas e transação, nesta ordem. O laboratório novo usa SQLite por não exigir instalação; os materiais originais também tratam de MySQL.

## Atividades comentadas

As atividades abaixo são complementos de estudo organizados a partir da área da disciplina. Leia os comentários no início de cada arquivo.

| Ordem | Atividade | Objetivo e resultado esperado |
|---:|---|---|
| 1 | [CRUD, parâmetros e integridade](atividades-comentadas/00-fundamentos/01_crud_sql.py) | CRUD, parâmetros e integridade |
| 2 | [Normalização e relacionamento N:N](atividades-comentadas/00-fundamentos/02_normalizacao.py) | Normalização e relacionamento N:N |
| 3 | [Modelagem relacional e integridade](atividades-comentadas/01_modelagem.sql) | Criar três tabelas e registrar um empréstimo; rejeitar quantidade negativa e referência inexistente. |
| 4 | [Junções e agregações](atividades-comentadas/02_consultas.sql) | Listar Algoritmos com um empréstimo e Redes com zero. |
| 5 | [Atomicidade com SAVEPOINT](atividades-comentadas/03_transacao.sql) | Simular uma baixa de estoque e desfazê-la, mantendo duas unidades de Algoritmos. |
| 6 | [Laboratório SQL em memória](atividades-comentadas/executar_sql.py) | Executar a sequência SQL, exibir consultas e verificar as restrições do esquema. |

## Execução e prática

Entre na pasta `atividades-comentadas` antes de executar os comandos abaixo.

### CRUD, parâmetros e integridade

`python 00-fundamentos/01_crud_sql.py`

**Conceitos:** INSERT cria, SELECT consulta, UPDATE altera e DELETE remove. Parâmetros separam dados de comandos SQL.

**Pratique:** Inclua UNIQUE no e-mail e verifique duplicatas.

### Normalização e relacionamento N:N

`python 00-fundamentos/02_normalizacao.py`

**Conceitos:** Separar aluno, curso e matrícula evita repetir o nome do aluno em cada inscrição. A chave composta impede inscrição duplicada.

**Pratique:** Explique as dependências funcionais e modele a nota por matrícula.

### Modelagem relacional e integridade

`python executar_sql.py`

**Conceitos:** Chaves primárias identificam registros. A tabela emprestimo resolve o relacionamento entre leitor e livro sem repetir os dados do leitor; FKs mantêm referências válidas.

**Pratique:** Adicione data_devolucao e uma consulta de empréstimos pendentes.

### Junções e agregações

`python executar_sql.py`

**Conceitos:** JOIN reúne registros pelas chaves. LEFT JOIN mantém livros sem empréstimos. COUNT(coluna) não conta NULL; COUNT(*) contaria a linha vazia produzida pela junção.

**Pratique:** Filtre livros com dois ou mais empréstimos usando HAVING.

### Atomicidade com SAVEPOINT

`python executar_sql.py`

**Conceitos:** Uma transação agrupa alterações. ROLLBACK TO desfaz operações posteriores ao ponto salvo. Não se deve confirmar metade de uma operação de negócio.

**Pratique:** Crie uma transação que registre o empréstimo e diminua o estoque apenas se houver disponibilidade.

### Laboratório SQL em memória

`python executar_sql.py`

**Conceitos:** SQLite permite praticar SQL sem instalar um servidor. O banco deste exemplo só existe durante o processo. PRAGMA é específico de SQLite; MySQL usa configuração própria.

**Pratique:** Reproduza as tabelas em MySQL e identifique as diferenças de dialeto.

## Acervo anterior

[Explorar os arquivos anteriores](acervo/). A ordem sugerida acima orienta a revisão.

Consulte [requisitos e comandos por linguagem](../../docs/COMO_EXECUTAR.md) e [o que foi validado](../../docs/VALIDACAO.md).

## Base de consulta

- [SQL: documentação de referência](https://dev.mysql.com/doc/refman/8.4/en/tutorial.html) — tabelas, tipos, consultas, filtros, agrupamentos e relacionamentos.
- [Python: documentação de referência](https://docs.python.org/3/tutorial/) — tipos, controle de fluxo, funções, estruturas de dados, exceções e arquivos.
