# Trilha por conteúdo — Linguagem de Programação Multiplataforma — Java

Gilmar da Silva — 201269

[Voltar à matéria](README.md)

Siga a ordem abaixo: fundamentos → aplicação → integração. Cada linha aponta para uma atividade concreta.

| Conteúdo | Atividade |
|---|---|
| Ambiente: JDK, terminal e IDE | [01 — Ambiente JDK e IDE](atividades-comentadas/10-trilha-java/01-basico/Ambiente.java) |
| Sintaxe, variáveis, tipos e strings | [02 — Variáveis, tipos e strings](atividades-comentadas/10-trilha-java/01-basico/Sintaxe.java) |
| if/else, switch, for e while | [03 — if, else, switch, for e while](atividades-comentadas/10-trilha-java/01-basico/Fluxo.java) |
| Métodos, parâmetros, retornos, arrays e listas | [04 — Métodos, parâmetros, retornos, arrays e listas](atividades-comentadas/10-trilha-java/01-basico/MetodosArrays.java) |
| Classes, objetos, atributos, métodos, construtores e encapsulamento | [05 — Classes, objetos, construtores e encapsulamento](atividades-comentadas/10-trilha-java/02-poo/Objetos.java) |
| Herança, polimorfismo e interfaces | [06 — Herança, interface e polimorfismo](atividades-comentadas/10-trilha-java/02-poo/Polimorfismo.java) |
| try/catch e exceções | [07 — Exceções e recuperação](atividades-comentadas/10-trilha-java/02-poo/Excecoes.java) |
| Datas, List, Set, Map e Streams | [08 — Datas, List, Set, Map e Streams](atividades-comentadas/10-trilha-java/02-poo/DatasColecoesStreams.java) |
| JDBC, SQL, MySQL/PostgreSQL, JPA/Hibernate, REST e Maven | [JDBC, JPA, Spring Boot e Maven](atividades-comentadas/10-trilha-java/03-api-banco/README.md) |
| Git, GitHub, branch, commit e PR | [Git e GitHub](atividades-comentadas/10-trilha-java/04-git-github/README.md) |

## Como praticar

Para cada atividade: leia a explicação, preveja o resultado, execute o exemplo e resolva o desafio. Registre um caso válido, um limite e um caso inválido. Os exemplos são pontos de partida; os desafios exigem adaptação.

## Comandos e desafios

### 01 — Ambiente JDK e IDE

JDK inclui javac e java; a classe pública deve ter o mesmo nome do arquivo.

Execução a partir de `atividades-comentadas`: `cd 10-trilha-java/01-basico; javac -encoding UTF-8 Ambiente.java; java Ambiente`

Desafio: Compile no terminal e execute pela IDE; coloque um breakpoint antes do primeiro println.

### 02 — Variáveis, tipos e strings

int é inteiro, double representa ponto flutuante, boolean guarda uma condição; strings são imutáveis.

Execução a partir de `atividades-comentadas`: `cd 10-trilha-java/01-basico; javac -encoding UTF-8 Sintaxe.java; java Sintaxe`

Desafio: Compare equals com == usando new String; explique divisão inteira e arredondamento.

### 03 — if, else, switch, for e while

Condicionais selecionam caminhos; laços repetem um bloco até cumprir um limite.

Execução a partir de `atividades-comentadas`: `cd 10-trilha-java/01-basico; javac -encoding UTF-8 Fluxo.java; java Fluxo`

Desafio: Implemente um menu switch com opção inválida e tente os valores 0, 5, 6, 10 e 11.

### 04 — Métodos, parâmetros, retornos, arrays e listas

Métodos isolam regras. Array tem tamanho fixo; ArrayList pode crescer. Não altere a entrada sem necessidade.

Execução a partir de `atividades-comentadas`: `cd 10-trilha-java/01-basico; javac -encoding UTF-8 MetodosArrays.java; java MetodosArrays`

Desafio: Escreva uma função que retorne o maior valor; defina o comportamento para lista vazia.

### 05 — Classes, objetos, construtores e encapsulamento

Cada objeto tem seu estado. O construtor estabelece invariantes; atributos privados são alterados por métodos que validam regras.

Execução a partir de `atividades-comentadas`: `cd 10-trilha-java/02-poo; javac -encoding UTF-8 Objetos.java; java Objetos`

Desafio: Crie duas instâncias e comprove que mudar a nota de uma não altera a outra.

### 06 — Herança, interface e polimorfismo

Uma referência da interface chama a implementação concreta. Use super para reaproveitar a construção do estado herdado.

Execução a partir de `atividades-comentadas`: `cd 10-trilha-java/02-poo; javac -encoding UTF-8 Polimorfismo.java; java Polimorfismo`

Desafio: Adicione Seminario sem alterar o laço; explique quando composição seria mais adequada que herança.

### 07 — Exceções e recuperação

Exceção comunica uma falha; capture o tipo específico. Uma regra de domínio pode definir sua própria exceção.

Execução a partir de `atividades-comentadas`: `cd 10-trilha-java/02-poo; javac -encoding UTF-8 Excecoes.java; java Excecoes`

Desafio: Trate saque zero e negativo; não use catch(Exception) para esconder erros de programação.

### 08 — Datas, List, Set, Map e Streams

LocalDate representa uma data sem horário. Set elimina duplicatas; Map agrupa por chave; streams encadeiam operações.

Execução a partir de `atividades-comentadas`: `cd 10-trilha-java/02-poo; javac -encoding UTF-8 DatasColecoesStreams.java; java DatasColecoesStreams`

Desafio: Inclua uma entrega na data limite e agrupe as entregas por mês; use data fixa no teste.

### JDBC, JPA, Spring Boot e Maven

SQL, ORM, REST e gerenciamento de dependências

Execução a partir de `atividades-comentadas`: `Siga os comandos do laboratório.`

Desafio: Conclua os desafios e confira os resultados.

### Git e GitHub

Branch, commit, diff, push e pull request

Execução a partir de `atividades-comentadas`: `Siga os comandos do laboratório.`

Desafio: Conclua os desafios e confira os resultados.

Consulte a [trilha Java detalhada](atividades-comentadas/10-trilha-java/README.md) para instalação, IDE e os 12 laboratórios. Maven foi escolhido como gerenciador deste projeto.
