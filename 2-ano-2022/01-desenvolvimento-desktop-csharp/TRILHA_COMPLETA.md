# Trilha por conteúdo — Desenvolvimento de Aplicação Desktop

Gilmar da Silva — 201269

[Voltar à matéria](README.md)

Siga a ordem abaixo: fundamentos → aplicação → integração. Cada linha aponta para uma atividade concreta.

| Conteúdo | Atividade |
|---|---|
| C# tipos, controle, métodos, coleções e exceções | [Tipos, coleções, métodos e exceções em C#](atividades-comentadas/00-fundamentos/Program.cs) |
| Encapsulamento e eventos | [Eventos e encapsulamento](atividades-comentadas/00-fundamentos/02_eventos.cs) |
| Classes, validação e JSON | [Classes, validação e persistência em C#](atividades-comentadas/01-console/Program.cs) |
| Windows Forms, controles e interação | [Eventos e validação na interface desktop](atividades-comentadas/02-interface/Program.cs) |
| Interfaces, LINQ, async/await, camadas e persistência | [C#: interface, LINQ, async/await e persistência JSON](atividades-comentadas/20-aplicacao/Program.cs) |

## Como praticar

Para cada atividade: leia a explicação, preveja o resultado, execute o exemplo e resolva o desafio. Registre um caso válido, um limite e um caso inválido. Os exemplos são pontos de partida; os desafios exigem adaptação.

## Comandos e desafios

### Tipos, coleções, métodos e exceções em C#

TryParse trata entrada inválida sem exceção. List e LINQ permitem selecionar e agregar; regras do domínio podem lançar ArgumentException.

Execução a partir de `atividades-comentadas`: `dotnet run --project 00-fundamentos/Fundamentos.csproj`

Desafio: Encapsule as notas em uma classe e adicione um evento de aprovação.

### Eventos e encapsulamento

Um evento notifica assinantes quando algo muda. O publicador protege o estado e não conhece a interface.

Execução a partir de `atividades-comentadas`: `dotnet run --project 00-fundamentos/Fundamentos.csproj`

Desafio: Crie um assinante no Program.cs e confirme que duas chamadas produzem dois avisos.

### Classes, validação e persistência em C#

Propriedades encapsulam dados; decimal evita erros binários comuns em valores decimais. JSON serializa objetos. try/finally assegura a limpeza do arquivo temporário.

Execução a partir de `atividades-comentadas`: `dotnet run --project 01-console`

Desafio: Acrescente quantidade e calcule o valor em estoque, validando a entrada.

### Eventos e validação na interface desktop

Aplicações gráficas reagem a eventos. O clique lê a entrada, valida e atualiza a lista; campos vazios e cadastros repetidos são rejeitados.

Execução a partir de `atividades-comentadas`: `dotnet run --project 02-interface`

Desafio: Acrescente exclusão do item selecionado e persistência em JSON usando o exemplo anterior.

### C#: interface, LINQ, async/await e persistência JSON

Separe a regra do armazenamento por uma interface; await aguarda I/O e LINQ consulta objetos.

Execução a partir de `atividades-comentadas`: `dotnet run --project 20-aplicacao/Aplicacao.csproj`

Desafio: Crie um repositório em memória e troque a implementação sem alterar a consulta.
