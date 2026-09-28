# Trilha por conteúdo — Desenvolvimento de Aplicação Web II

Gilmar da Silva — 201269

[Voltar à matéria](README.md)

Siga a ordem abaixo: fundamentos → aplicação → integração. Cada linha aponta para uma atividade concreta.

| Conteúdo | Atividade |
|---|---|
| PHP: tipos, condições, laços, funções e arrays | [Tipos, funções e arrays em PHP](atividades-comentadas/00-fundamentos/01_php_basico.php) |
| JSON, tipos e erros | [JSON, erros e resposta HTTP](atividades-comentadas/00-fundamentos/02_json.php) |
| POO, interfaces e exceções | [PHP: classes, interfaces e exceções](atividades-comentadas/20-aplicacao/03_poo_php.php) |
| Cliente/servidor, formulário e validação | [PHP, HTTP e validação no servidor](atividades-comentadas/01_formulario.php) |
| Sessões, autenticação e CSRF | [Sessões e autenticação demonstrativa](atividades-comentadas/02_sessoes.php) |
| Banco de dados, PDO e SQL | [CRUD, PDO e consultas preparadas](atividades-comentadas/03_pdo.php) |
| Métodos HTTP e API JSON | [PHP: endpoint JSON e contrato HTTP](atividades-comentadas/20-aplicacao/04_http_json.php) |
| JavaScript assíncrono, fetch e integração | [JavaScript: fetch, async/await e erros HTTP](atividades-comentadas/20-aplicacao/05_fetch.html) |

## Como praticar

Para cada atividade: leia a explicação, preveja o resultado, execute o exemplo e resolva o desafio. Registre um caso válido, um limite e um caso inválido. Os exemplos são pontos de partida; os desafios exigem adaptação.

## Comandos e desafios

### Tipos, funções e arrays em PHP

Arrays podem ter chaves nomeadas. Comparação estrita evita conversões inesperadas; funções devem validar o domínio.

Execução a partir de `atividades-comentadas`: `php 00-fundamentos/01_php_basico.php`

Desafio: Adicione uma função que selecione alunos com média maior ou igual a seis.

### JSON, erros e resposta HTTP

JSON representa dados para troca entre programas. Trate falhas de conversão e escape texto somente na saída HTML.

Execução a partir de `atividades-comentadas`: `php 00-fundamentos/02_json.php`

Desafio: Use esses dados em um endpoint GET e defina o Content-Type application/json.

### PHP, HTTP e validação no servidor

GET consulta recursos e POST envia dados. O servidor deve validar mesmo quando o HTML usa required. htmlspecialchars protege a saída de texto interpretado como HTML.

Execução a partir de `atividades-comentadas`: `php -S 127.0.0.1:8000; abra http://127.0.0.1:8000/01_formulario.php`

Desafio: Envie um nome com sinais < e > e confirme que o navegador mostra texto, sem executar marcação.

### Sessões e autenticação demonstrativa

HTTP não mantém estado por si só. Uma sessão associa requisições a um identificador; regenerar o ID após login evita reutilizar o identificador anterior. Token CSRF protege formulários.

Execução a partir de `atividades-comentadas`: `php -S 127.0.0.1:8000; abra /02_sessoes.php`

Desafio: Substitua a conta de demonstração por consulta preparada a uma tabela com hashes de senha.

### CRUD, PDO e consultas preparadas

PDO separa SQL dos valores recebidos. Placeholders representam valores, não nomes de tabelas. Uma transação confirma ou desfaz um conjunto de operações.

Execução a partir de `atividades-comentadas`: `php 03_pdo.php (requer pdo_sqlite)`

Desafio: Adapte a conexão para MySQL via variáveis de ambiente e mantenha os parâmetros preparados.

### PHP: classes, interfaces e exceções

Uma interface define o contrato; propriedades privadas protegem o estado. A implementação pode ser substituída.

Execução a partir de `atividades-comentadas`: `php 20-aplicacao/03_poo_php.php`

Desafio: Crie RepositorioPDO com o mesmo contrato, usando comandos parametrizados.

### PHP: endpoint JSON e contrato HTTP

Separe método HTTP, tipo de conteúdo, parsing e validação de domínio. Responda com status coerente.

Execução a partir de `atividades-comentadas`: `php -S 127.0.0.1:8081 -t 20-aplicacao`

Desafio: Teste GET, POST válido, JSON inválido, nome vazio e método DELETE; integre a um formulário via fetch.

### JavaScript: fetch, async/await e erros HTTP

fetch não rejeita automaticamente status 400/500: confira response.ok. O formulário está na mesma origem do endpoint.

Execução a partir de `atividades-comentadas`: `Inicie PHP e abra http://127.0.0.1:8081/05_fetch.html`

Desafio: Pare o servidor e observe a falha; depois trate timeout usando AbortController.
