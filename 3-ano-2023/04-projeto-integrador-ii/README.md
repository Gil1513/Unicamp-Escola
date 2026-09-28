# Projeto Integrador II

**Gilmar da Silva | 2023 | 90 horas de formação profissional**

[Voltar ao índice](../../README.md)

Comece por `atividades-comentadas/00-fundamentos/`, na ordem indicada abaixo, e avance para os exemplos e projetos.

## Sequência de estudo

1. Integração entre cliente, serviço e banco.
2. API HTTP.
3. testes.
4. tratamento de erros.
5. documentação e entrega.

Este projeto amplia o inventário do Integrador I com HTTP e SQLite. Leia o contrato: GET /materiais retorna lista; POST /materiais recebe nome e quantidade, com respostas 201, 400, 409, 413, 415 ou 422. Execute a API, depois o cliente e os testes. É um laboratório em localhost, sem autenticação ou implantação pública.

## Atividades comentadas

As atividades abaixo são complementos de estudo organizados a partir da área da disciplina. Leia os comentários no início de cada arquivo.

| Ordem | Atividade | Objetivo e resultado esperado |
|---:|---|---|
| 1 | [Paginação e contratos de API](atividades-comentadas/00-fundamentos/01_paginacao.py) | Paginação e contratos de API |
| 2 | [Idempotência e repetição de requisições](atividades-comentadas/00-fundamentos/02_idempotencia.py) | Idempotência e repetição de requisições |
| 3 | [Projeto integrado: API HTTP e banco de dados](atividades-comentadas/api.py) | Criar e consultar materiais por HTTP, rejeitando entrada inválida com 422; banco em inventario.sqlite3. |
| 4 | [Integração de cliente e serviço HTTP](atividades-comentadas/cliente.py) | Enviar Caderno e consultar a lista; reconhecer conflito caso execute novamente. |
| 5 | [Testes de integração com HTTP real](atividades-comentadas/test_api.py) | Verificar cadastro, persistência, conflito, JSON inválido, tipos incorretos e rota desconhecida. |

## Execução e prática

Entre na pasta `atividades-comentadas` antes de executar os comandos abaixo.

### Paginação e contratos de API

`python 00-fundamentos/01_paginacao.py`

**Conceitos:** Página e limite precisam de validação. Retorne metadados para o cliente distinguir lista vazia de página inexistente.

**Pratique:** Acrescente os parâmetros pagina e limite ao GET /materiais da API.

### Idempotência e repetição de requisições

`python 00-fundamentos/02_idempotencia.py`

**Conceitos:** Uma chave permite reconhecer a repetição da mesma operação e evitar cadastro duplicado. O exemplo mantém o registro apenas em memória.

**Pratique:** Explique como persistir a chave e proteger duas requisições simultâneas.

### Projeto integrado: API HTTP e banco de dados

`python api.py; em outro terminal execute python cliente.py`

**Conceitos:** Uma API define rotas, métodos e códigos de resposta. JSON transporta dados; SQLite persiste registros. Consultas parametrizadas separam dados e comandos. Servidor didático local, sem autenticação.

**Pratique:** Implemente PATCH e DELETE com validação de ID e resposta 404 para registros ausentes.

### Integração de cliente e serviço HTTP

`Com api.py em execução: python cliente.py`

**Conceitos:** O cliente serializa o corpo, define Content-Type e interpreta o código HTTP. Uma resposta 409 é um conflito de negócio; falha de conexão é outro tipo de erro.

**Pratique:** Acrescente uma opção de terminal para informar nome e quantidade.

### Testes de integração com HTTP real

`python -m unittest discover -s . -p test_api.py -v`

**Conceitos:** Um teste de integração atravessa cliente, servidor e banco. Porta aleatória e banco temporário isolam a execução; servidor e thread são encerrados ao final.

**Pratique:** Acrescente testes para os endpoints PATCH e DELETE propostos.

Consulte [requisitos e comandos por linguagem](../../docs/COMO_EXECUTAR.md) e [o que foi validado](../../docs/VALIDACAO.md).

## Base de consulta

- [Python: documentação de referência](https://docs.python.org/3/tutorial/) — tipos, controle de fluxo, funções, estruturas de dados, exceções e arquivos.
- [SQL: documentação de referência](https://dev.mysql.com/doc/refman/8.4/en/tutorial.html) — tabelas, tipos, consultas, filtros, agrupamentos e relacionamentos.
