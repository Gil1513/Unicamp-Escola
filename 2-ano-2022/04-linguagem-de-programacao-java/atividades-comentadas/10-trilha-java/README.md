# Trilha Java: do ambiente à API

Gilmar da Silva — 201269

## Preparação do ambiente

Instale um JDK 17 a 26 a partir do [site do fornecedor](https://www.oracle.com/java/technologies/downloads/) e confirme `java -version` e `javac -version` no terminal. Se não forem encontrados, configure JAVA_HOME para a pasta do JDK e acrescente seu `bin` ao PATH. Feche e reabra o terminal. JRE sozinho não fornece o compilador.

Escolha [IntelliJ IDEA](https://www.jetbrains.com/idea/) ou [Eclipse](https://www.eclipse.org/), selecione o mesmo JDK como SDK do projeto e abra `01-basico`. Crie uma configuração para executar `Ambiente.main`. Coloque um breakpoint e observe uma variável no depurador. Depois repita a execução pelo terminal para distinguir IDE de compilador.

## Atividades na ordem

| Etapa | Arquivo/projeto | Verificação e entrega |
|---|---|---|
| 1. Ambiente | [Ambiente.java](01-basico/Ambiente.java) | Versões, compilação, execução e breakpoint |
| 2. Sintaxe | [Sintaxe.java](01-basico/Sintaxe.java) | int, double, boolean, strings e operadores |
| 3. Fluxo | [Fluxo.java](01-basico/Fluxo.java) | if/else, switch, for, while e limites |
| 4. Organização | [MetodosArrays.java](01-basico/MetodosArrays.java) | Métodos, parâmetros, retorno, array e ArrayList |
| 5. Objetos | [Objetos.java](02-poo/Objetos.java) | Classe, atributos, objetos, construtor e encapsulamento |
| 6. Pilares | [Polimorfismo.java](02-poo/Polimorfismo.java) | Herança, classe abstrata, interface e polimorfismo |
| 7. Erros | [Excecoes.java](02-poo/Excecoes.java) | try/catch, throws e exceção de domínio |
| 8. APIs | [DatasColecoesStreams.java](02-poo/DatasColecoesStreams.java) | Datas, List, Set, Map, filtros, ordenação e agrupamento |
| 9. JDBC | [Laboratório SQL](03-api-banco/README.md#09--jdbc-sql-e-transações) | SQL parametrizado, transação e drivers de MySQL/PostgreSQL |
| 10. JPA e REST | [API](03-api-banco/) | Entidade, Hibernate, CRUD e códigos HTTP |
| 11. Maven | [Projeto Maven](03-api-banco/pom.xml) | Dependências, testes, empacotamento e execução do JAR |
| 12. Git/GitHub | [Laboratório](04-git-github/) | Branch, commit, diff, push, PR e merge |

Para os oito arquivos isolados, entre na pasta correspondente e use `javac -encoding UTF-8 Nome.java` seguido de `java Nome`. Cada arquivo tem comentário, exemplo completo, verificação interna e desafio. Não compile a API isoladamente com javac: ela depende do POM.

Referência da linguagem: [dev.java](https://dev.java/learn/). Primeiro execute o exemplo, depois explique uma decisão do código e resolva o desafio sem consultar a solução.
