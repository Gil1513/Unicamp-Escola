# Desenvolvimento de Aplicação Desktop

**Gilmar da Silva | 2022 | 90 horas de formação profissional**

[Voltar ao índice](../../README.md)

Comece por `atividades-comentadas/00-fundamentos/`, na ordem indicada abaixo, e avance para os exemplos e projetos.

## Sequência de estudo

1. C#.
2. classes.
3. validação.
4. eventos.
5. Windows Forms.
6. separação de responsabilidades.
7. persistência.

Comece pelo projeto de console para classes, validação e JSON; depois use Windows Forms para entrada por eventos. Em `acervo/2SEM`, revise formulários; em `acervo/ProjetoEstudio`, acompanhe model, DAO e view. Os projetos antigos usam .NET Framework/MySQL; os complementares usam .NET 10.

## Atividades comentadas

As atividades abaixo são complementos de estudo organizados a partir da área da disciplina. Leia os comentários no início de cada arquivo.

| Ordem | Atividade | Objetivo e resultado esperado |
|---:|---|---|
| 1 | [Tipos, coleções, métodos e exceções em C#](atividades-comentadas/00-fundamentos/Program.cs) | Tipos, coleções, métodos e exceções em C# |
| 2 | [Eventos e encapsulamento](atividades-comentadas/00-fundamentos/02_eventos.cs) | Eventos e encapsulamento |
| 3 | [Classes, validação e persistência em C#](atividades-comentadas/01-console/Program.cs) | Recuperar o produto Caderno com preço 12.50 e rejeitar preço negativo. |
| 4 | [Eventos e validação na interface desktop](atividades-comentadas/02-interface/Program.cs) | Adicionar nomes à lista e mostrar uma mensagem para entrada vazia ou repetida. |

## Execução e prática

Entre na pasta `atividades-comentadas` antes de executar os comandos abaixo.

### Tipos, coleções, métodos e exceções em C#

`dotnet run --project 00-fundamentos/Fundamentos.csproj`

**Conceitos:** TryParse trata entrada inválida sem exceção. List e LINQ permitem selecionar e agregar; regras do domínio podem lançar ArgumentException.

**Pratique:** Encapsule as notas em uma classe e adicione um evento de aprovação.

### Eventos e encapsulamento

`dotnet run --project 00-fundamentos/Fundamentos.csproj`

**Conceitos:** Um evento notifica assinantes quando algo muda. O publicador protege o estado e não conhece a interface.

**Pratique:** Crie um assinante no Program.cs e confirme que duas chamadas produzem dois avisos.

### Classes, validação e persistência em C#

`dotnet run --project 01-console`

**Conceitos:** Propriedades encapsulam dados; decimal evita erros binários comuns em valores decimais. JSON serializa objetos. try/finally assegura a limpeza do arquivo temporário.

**Pratique:** Acrescente quantidade e calcule o valor em estoque, validando a entrada.

### Eventos e validação na interface desktop

`dotnet run --project 02-interface`

**Conceitos:** Aplicações gráficas reagem a eventos. O clique lê a entrada, valida e atualiza a lista; campos vazios e cadastros repetidos são rejeitados.

**Pratique:** Acrescente exclusão do item selecionado e persistência em JSON usando o exemplo anterior.

## Acervo anterior

[Explorar os arquivos anteriores](acervo/). A ordem sugerida acima orienta a revisão.

Consulte [requisitos e comandos por linguagem](../../docs/COMO_EXECUTAR.md) e [o que foi validado](../../docs/VALIDACAO.md).

## Base de consulta

- [C#: documentação de referência](https://learn.microsoft.com/en-us/dotnet/csharp/tour-of-csharp/overview) — tipos, métodos, classes, interfaces, coleções, eventos e exceções.
