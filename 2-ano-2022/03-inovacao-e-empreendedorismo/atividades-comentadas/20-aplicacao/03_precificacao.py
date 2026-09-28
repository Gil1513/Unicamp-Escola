"""
Empreendedorismo: margem, canais e cenários
Gilmar da Silva — 201269
Conceitos: Margem de contribuição desconta custos variáveis; receita não equivale a lucro. Compare cenários antes da decisão.
Execute: python 20-aplicacao/03_precificacao.py
Desafio: Calcule quantidade de equilíbrio por canal e preencha proposta de valor, público e hipótese de compra.
"""

from decimal import Decimal as D
def resultado(preco,custo,taxa,quantidade,fixos):
    margem=preco*(1-taxa)-custo
    return margem, margem*quantidade-fixos
for canal,taxa in [('direto',D('0')),('plataforma',D('0.15'))]:
    margem,lucro=resultado(D('50'),D('20'),taxa,10,D('200'))
    print(canal,'margem',margem,'resultado',lucro)
assert resultado(D('50'),D('20'),D('0.15'),10,D('200'))==(D('22.50'),D('25.00'))
print('Dados fictícios para análise de cenários.')
