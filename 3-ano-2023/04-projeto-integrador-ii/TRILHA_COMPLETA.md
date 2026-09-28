# Trilha por conteúdo — Projeto Integrador II

Gilmar da Silva — 201269

[Voltar à matéria](README.md)

Siga a ordem abaixo: fundamentos → aplicação → integração. Cada linha aponta para uma atividade concreta.

| Conteúdo | Atividade |
|---|---|
| API, serviço, banco e contrato | [Contrato HTTP, integração, testes e entrega](atividades-comentadas/20-aplicacao/04_entrega_api.md) |
| Cliente HTTP | [Integração de cliente e serviço HTTP](atividades-comentadas/cliente.py) |
| Testes, validação e erros | [Testes de integração com HTTP real](atividades-comentadas/test_api.py) |
| Paginação | [Paginação e contratos de API](atividades-comentadas/00-fundamentos/01_paginacao.py) |
| Idempotência | [Idempotência e repetição de requisições](atividades-comentadas/00-fundamentos/02_idempotencia.py) |
| Migrações e versionamento do banco | [Integrador II: migração versionada e repetição segura](atividades-comentadas/20-aplicacao/03_migracao_sql.py) |

## Como praticar

Para cada atividade: leia a explicação, preveja o resultado, execute o exemplo e resolva o desafio. Registre um caso válido, um limite e um caso inválido. Os exemplos são pontos de partida; os desafios exigem adaptação.

## Comandos e desafios

### Paginação e contratos de API

Página e limite precisam de validação. Retorne metadados para o cliente distinguir lista vazia de página inexistente.

Execução a partir de `atividades-comentadas`: `python 00-fundamentos/01_paginacao.py`

Desafio: Acrescente os parâmetros pagina e limite ao GET /materiais da API.

### Idempotência e repetição de requisições

Uma chave permite reconhecer a repetição da mesma operação e evitar cadastro duplicado. O exemplo mantém o registro apenas em memória.

Execução a partir de `atividades-comentadas`: `python 00-fundamentos/02_idempotencia.py`

Desafio: Explique como persistir a chave e proteger duas requisições simultâneas.

### Integração de cliente e serviço HTTP

O cliente serializa o corpo, define Content-Type e interpreta o código HTTP. Uma resposta 409 é um conflito de negócio; falha de conexão é outro tipo de erro.

Execução a partir de `atividades-comentadas`: `Com api.py em execução: python cliente.py`

Desafio: Acrescente uma opção de terminal para informar nome e quantidade.

### Testes de integração com HTTP real

Um teste de integração atravessa cliente, servidor e banco. Porta aleatória e banco temporário isolam a execução; servidor e thread são encerrados ao final.

Execução a partir de `atividades-comentadas`: `python -m unittest discover -s . -p test_api.py -v`

Desafio: Acrescente testes para os endpoints PATCH e DELETE propostos.

### Integrador II: migração versionada e repetição segura

Uma migração registra a versão aplicada. Reexecutar o processo não deve duplicar colunas ou dados.

Execução a partir de `atividades-comentadas`: `python 20-aplicacao/03_migracao_sql.py`

Desafio: Adicione uma terceira migração e teste atualização de uma base que já está na versão 1.

### Contrato HTTP, integração, testes e entrega

Contrato HTTP, integração, testes e entrega

Execução a partir de `atividades-comentadas`: `Siga o roteiro neste arquivo.`

Desafio: Complete o desafio final.
