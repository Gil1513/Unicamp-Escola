# Desenvolvimento de Aplicação Web II

**Gilmar da Silva | 2023 | 90 horas de formação profissional**

[Voltar ao índice](../../README.md)

Comece por `atividades-comentadas/00-fundamentos/`, na ordem indicada abaixo, e avance para os exemplos e projetos.

Veja a [trilha por conteúdo, com atividades e desafios](TRILHA_COMPLETA.md).

## Sequência de estudo

1. JavaScript.
2. PHP.
3. cliente e servidor.
4. formulários.
5. sessões.
6. autenticação.
7. PDO.
8. SQL.
9. integração entre serviços.

Revise JavaScript em `importados/Daw-II/JavaScript`, depois PHP em `importados/Daw-II/PHP`. Siga variáveis/decisões/laços → funções → arrays/objetos/JSON → eventos → HTTP/formulários → sessões/autenticação → banco com PDO. Os slides originais em `acervo/Arquivo das Aulas` seguem como material de consulta.

## Atividades comentadas

As atividades abaixo são complementos de estudo organizados a partir da área da disciplina. Leia os comentários no início de cada arquivo.

| Ordem | Atividade | Objetivo e resultado esperado |
|---:|---|---|
| 1 | [Tipos, funções e arrays em PHP](atividades-comentadas/00-fundamentos/01_php_basico.php) | Tipos, funções e arrays em PHP |
| 2 | [JSON, erros e resposta HTTP](atividades-comentadas/00-fundamentos/02_json.php) | JSON, erros e resposta HTTP |
| 3 | [PHP, HTTP e validação no servidor](atividades-comentadas/01_formulario.php) | Receber nome e nota, rejeitar arrays ou nota fora de 0 a 10 e mostrar texto escapado. |
| 4 | [Sessões e autenticação demonstrativa](atividades-comentadas/02_sessoes.php) | Entrar usando usuário gilmar e senha estudo-local, sair por POST e rejeitar token inválido. |
| 5 | [CRUD, PDO e consultas preparadas](atividades-comentadas/03_pdo.php) | Criar, inserir, consultar, atualizar e excluir em um banco SQLite em memória. |

## Execução e prática

Entre na pasta `atividades-comentadas` antes de executar os comandos abaixo.

### Tipos, funções e arrays em PHP

`php 00-fundamentos/01_php_basico.php`

**Conceitos:** Arrays podem ter chaves nomeadas. Comparação estrita evita conversões inesperadas; funções devem validar o domínio.

**Pratique:** Adicione uma função que selecione alunos com média maior ou igual a seis.

### JSON, erros e resposta HTTP

`php 00-fundamentos/02_json.php`

**Conceitos:** JSON representa dados para troca entre programas. Trate falhas de conversão e escape texto somente na saída HTML.

**Pratique:** Use esses dados em um endpoint GET e defina o Content-Type application/json.

### PHP, HTTP e validação no servidor

`php -S 127.0.0.1:8000; abra http://127.0.0.1:8000/01_formulario.php`

**Conceitos:** GET consulta recursos e POST envia dados. O servidor deve validar mesmo quando o HTML usa required. htmlspecialchars protege a saída de texto interpretado como HTML.

**Pratique:** Envie um nome com sinais < e > e confirme que o navegador mostra texto, sem executar marcação.

### Sessões e autenticação demonstrativa

`php -S 127.0.0.1:8000; abra /02_sessoes.php`

**Conceitos:** HTTP não mantém estado por si só. Uma sessão associa requisições a um identificador; regenerar o ID após login evita reutilizar o identificador anterior. Token CSRF protege formulários.

**Pratique:** Substitua a conta de demonstração por consulta preparada a uma tabela com hashes de senha.

### CRUD, PDO e consultas preparadas

`php 03_pdo.php (requer pdo_sqlite)`

**Conceitos:** PDO separa SQL dos valores recebidos. Placeholders representam valores, não nomes de tabelas. Uma transação confirma ou desfaz um conjunto de operações.

**Pratique:** Adapte a conexão para MySQL via variáveis de ambiente e mantenha os parâmetros preparados.

## Acervo anterior

[Explorar os arquivos anteriores](acervo/). A ordem sugerida acima orienta a revisão.

## Atividades importadas

[Explorar atividades importadas](importados/). Os projetos são independentes; mantenha arquivos de cada projeto juntos.

Consulte [requisitos e comandos por linguagem](../../docs/COMO_EXECUTAR.md) e [o que foi validado](../../docs/VALIDACAO.md).

## Base de consulta

- [Web: documentação de referência](https://developer.mozilla.org/en-US/docs/Learn_web_development/Core) — HTML semântico, formulários, CSS, layout, JavaScript, DOM e acessibilidade.
- [PHP: documentação de referência](https://www.php.net/manual/en/langref.php) — tipos, variáveis, operadores, controle de fluxo, funções, arrays, classes e exceções.
- [SQL: documentação de referência](https://dev.mysql.com/doc/refman/8.4/en/tutorial.html) — tabelas, tipos, consultas, filtros, agrupamentos e relacionamentos.
