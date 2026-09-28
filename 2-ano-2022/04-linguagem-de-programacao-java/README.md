# Linguagem de Programação Multiplataforma — Java

**Gilmar da Silva Filho | 2022 | 120 horas de formação profissional**

[Voltar ao índice](../../README.md)

## Sequência de estudo

1. Classes.
2. encapsulamento.
3. herança.
4. interfaces.
5. polimorfismo.
6. coleções.
7. exceções.
8. arquivos.
9. MVC.
10. JDBC e ORM nos projetos existentes.

Java corresponde aqui à pasta histórica da disciplina Linguagem de Programação Multiplataforma. Siga classes e encapsulamento → herança/interfaces → polimorfismo → coleções/exceções → arquivos → MVC/Swing → JDBC → Hibernate → API Spring. Consulte também o índice dentro de `importados/Atividades-Java`.

## Atividades comentadas

As atividades abaixo são complementos de estudo organizados a partir da área da disciplina. Leia os comentários no início de cada arquivo.

| Ordem | Atividade | Objetivo e resultado esperado |
|---:|---|---|
| 1 | [Encapsulamento, herança e polimorfismo](atividades-comentadas/01-poo/ContaDemo.java) | Debitar 10 mais tarifa de 1 de uma conta com saldo 100, resultando em 89. |
| 2 | [Interfaces, coleções e exceções](atividades-comentadas/02-colecoes/ColecoesDemo.java) | Agrupar notas por matéria e calcular média 8.0; rejeitar lista vazia. |
| 3 | [Persistência com arquivos e tratamento de recursos](atividades-comentadas/03-arquivos/ArquivoDemo.java) | Gravar três matérias, reler e localizar Java. |

## Execução e prática

Entre na pasta `atividades-comentadas` antes de executar os comandos abaixo.

### Encapsulamento, herança e polimorfismo

`java 01-poo/ContaDemo.java`

**Conceitos:** Campos privados protegem invariantes. Uma subclasse especializa o cálculo de tarifa. Chamar um método pela referência da classe base executa a implementação do objeto.

**Pratique:** Crie outra conta sem tarifa e trate tentativa de saque maior que o saldo.

### Interfaces, coleções e exceções

`java 02-colecoes/ColecoesDemo.java`

**Conceitos:** List mantém uma sequência; Map associa chave e valor. Uma interface especifica um contrato. Exceções comunicam entradas inválidas sem inventar um resultado.

**Pratique:** Use Set para deduplicar matérias e ordene o resultado alfabeticamente.

### Persistência com arquivos e tratamento de recursos

`java 03-arquivos/ArquivoDemo.java`

**Conceitos:** Persistir significa manter dados além da execução. Files lê e escreve texto UTF-8; try/finally garante limpeza. Aqui o arquivo é temporário para que a demonstração não deixe dados pessoais.

**Pratique:** Troque o arquivo temporário por um caminho recebido em argumento e defina uma regra para não sobrescrever arquivos existentes.

## Acervo anterior

[Explorar os arquivos anteriores](acervo/). A ordem sugerida acima orienta a revisão.

## Atividades importadas

[Explorar atividades importadas](importados/). Os projetos são independentes; mantenha arquivos de cada projeto juntos.

Consulte [requisitos e comandos por linguagem](../../docs/COMO_EXECUTAR.md) e [o que foi validado](../../docs/VALIDACAO.md).
