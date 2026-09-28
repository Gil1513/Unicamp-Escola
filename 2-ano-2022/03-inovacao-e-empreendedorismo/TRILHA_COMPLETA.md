# Trilha por conteúdo — Inovação e Empreendedorismo

Gilmar da Silva — 201269

[Voltar à matéria](README.md)

Siga a ordem abaixo: fundamentos → aplicação → integração. Cada linha aponta para uma atividade concreta.

| Conteúdo | Atividade |
|---|---|
| Problema, público, proposta de valor e modelo de negócio | [Problema, público, proposta de valor e MVP](atividades-comentadas/20-aplicacao/04_canvas.md) |
| Hipóteses, indicadores e validação | [Hipóteses e indicadores](atividades-comentadas/00-fundamentos/01_hipoteses.py) |
| MVP e priorização | [Priorização de um MVP e hipótese de validação](atividades-comentadas/02_mvp.py) |
| Custos, receita e equilíbrio | [Custos, receita e ponto de equilíbrio](atividades-comentadas/01_viabilidade.py) |
| Caixa, entradas e saídas | [Fluxo de caixa e saldo acumulado](atividades-comentadas/00-fundamentos/02_fluxo_caixa.py) |
| Preço, margem e canais | [Empreendedorismo: margem, canais e cenários](atividades-comentadas/20-aplicacao/03_precificacao.py) |

## Como praticar

Para cada atividade: leia a explicação, preveja o resultado, execute o exemplo e resolva o desafio. Registre um caso válido, um limite e um caso inválido. Os exemplos são pontos de partida; os desafios exigem adaptação.

## Comandos e desafios

### Hipóteses e indicadores

Defina indicador, população e limiar antes de avaliar um experimento. Estes dados são fictícios para exercitar o cálculo.

Execução a partir de `atividades-comentadas`: `python 00-fundamentos/01_hipoteses.py`

Desafio: Defina uma hipótese de retenção e os dados necessários para testá-la.

### Fluxo de caixa e saldo acumulado

Lucro e caixa são diferentes: o prazo do recebimento afeta a disponibilidade. Decimal evita aproximação binária de valores monetários.

Execução a partir de `atividades-comentadas`: `python 00-fundamentos/02_fluxo_caixa.py`

Desafio: Acrescente vencimento e diferencie previsto de realizado.

### Custos, receita e ponto de equilíbrio

Margem de contribuição = preço menos custo variável. O ponto de equilíbrio cobre o custo fixo; arredondamos para cima porque vendemos unidades inteiras. Valores são fictícios para exercício.

Execução a partir de `atividades-comentadas`: `python 01_viabilidade.py`

Desafio: Simule mudança de preço e teste margem nula ou negativa; explique por que o modelo deixa de ter equilíbrio.

### Priorização de um MVP e hipótese de validação

MVP é uma versão mínima que testa uma hipótese de valor. Uma pontuação impacto/esforço ajuda a discutir prioridades, mas não substitui observar usuários; os dados abaixo são simulados.

Execução a partir de `atividades-comentadas`: `python 02_mvp.py`

Desafio: Inclua dependências e explique por que escolher sempre a maior razão não garante a solução ótima.

### Empreendedorismo: margem, canais e cenários

Margem de contribuição desconta custos variáveis; receita não equivale a lucro. Compare cenários antes da decisão.

Execução a partir de `atividades-comentadas`: `python 20-aplicacao/03_precificacao.py`

Desafio: Calcule quantidade de equilíbrio por canal e preencha proposta de valor, público e hipótese de compra.

### Problema, público, proposta de valor e MVP

Problema, público, proposta de valor e MVP

Execução a partir de `atividades-comentadas`: `Siga o roteiro neste arquivo.`

Desafio: Complete o desafio final.
