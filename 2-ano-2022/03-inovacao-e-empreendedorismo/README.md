# Inovação e Empreendedorismo

**Gilmar da Silva | 2022 | 30 horas de formação profissional**

[Voltar ao índice](../../README.md)

Comece por `atividades-comentadas/00-fundamentos/`, na ordem indicada abaixo, e avance para os exemplos e projetos.

Veja a [trilha por conteúdo, com atividades e desafios](TRILHA_COMPLETA.md).

## Sequência de estudo

1. Problema e público.
2. proposta de valor.
3. MVP.
4. validação de hipóteses.
5. custos.
6. receita.
7. priorização.

Antes dos cálculos, escreva problema, público, proposta de valor, canais, custos e receitas de uma ideia. Transforme uma hipótese em um critério de validação e escolha um MVP. Todos os números dos exemplos são fictícios, sem alegar pesquisa de mercado realizada.

## Atividades comentadas

As atividades abaixo são complementos de estudo organizados a partir da área da disciplina. Leia os comentários no início de cada arquivo.

| Ordem | Atividade | Objetivo e resultado esperado |
|---:|---|---|
| 1 | [Hipóteses e indicadores](atividades-comentadas/00-fundamentos/01_hipoteses.py) | Hipóteses e indicadores |
| 2 | [Fluxo de caixa e saldo acumulado](atividades-comentadas/00-fundamentos/02_fluxo_caixa.py) | Fluxo de caixa e saldo acumulado |
| 3 | [Custos, receita e ponto de equilíbrio](atividades-comentadas/01_viabilidade.py) | Calcular 20 unidades para cobrir 600 de custo fixo com margem de 30. |
| 4 | [Priorização de um MVP e hipótese de validação](atividades-comentadas/02_mvp.py) | Selecionar funcionalidades sob um orçamento de cinco dias; explicitar uma hipótese mensurável. |

## Execução e prática

Entre na pasta `atividades-comentadas` antes de executar os comandos abaixo.

### Hipóteses e indicadores

`python 00-fundamentos/01_hipoteses.py`

**Conceitos:** Defina indicador, população e limiar antes de avaliar um experimento. Estes dados são fictícios para exercitar o cálculo.

**Pratique:** Defina uma hipótese de retenção e os dados necessários para testá-la.

### Fluxo de caixa e saldo acumulado

`python 00-fundamentos/02_fluxo_caixa.py`

**Conceitos:** Lucro e caixa são diferentes: o prazo do recebimento afeta a disponibilidade. Decimal evita aproximação binária de valores monetários.

**Pratique:** Acrescente vencimento e diferencie previsto de realizado.

### Custos, receita e ponto de equilíbrio

`python 01_viabilidade.py`

**Conceitos:** Margem de contribuição = preço menos custo variável. O ponto de equilíbrio cobre o custo fixo; arredondamos para cima porque vendemos unidades inteiras. Valores são fictícios para exercício.

**Pratique:** Simule mudança de preço e teste margem nula ou negativa; explique por que o modelo deixa de ter equilíbrio.

### Priorização de um MVP e hipótese de validação

`python 02_mvp.py`

**Conceitos:** MVP é uma versão mínima que testa uma hipótese de valor. Uma pontuação impacto/esforço ajuda a discutir prioridades, mas não substitui observar usuários; os dados abaixo são simulados.

**Pratique:** Inclua dependências e explique por que escolher sempre a maior razão não garante a solução ótima.

Consulte [requisitos e comandos por linguagem](../../docs/COMO_EXECUTAR.md) e [o que foi validado](../../docs/VALIDACAO.md).

## Base de consulta

- [Python: documentação de referência](https://docs.python.org/3/tutorial/) — tipos, controle de fluxo, funções, estruturas de dados, exceções e arquivos.
