# Desenvolvimento de Aplicação Web II

**Gilmar da Silva Filho | 2023 | 90 horas de formação profissional**

[Voltar ao índice](../../README.md)

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
| 1 | [PHP, HTTP e validação no servidor](atividades-comentadas/01_formulario.php) | Receber nome e nota, rejeitar arrays ou nota fora de 0 a 10 e mostrar texto escapado. |
| 2 | [Sessões e autenticação demonstrativa](atividades-comentadas/02_sessoes.php) | Entrar usando usuário gilmar e senha estudo-local, sair por POST e rejeitar token inválido. |
| 3 | [CRUD, PDO e consultas preparadas](atividades-comentadas/03_pdo.php) | Criar, inserir, consultar, atualizar e excluir em um banco SQLite em memória. |

## Execução e prática

Entre na pasta `atividades-comentadas` antes de executar os comandos abaixo.

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
