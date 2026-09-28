"""
Custos, receita e ponto de equilíbrio
Autor: Gilmar da Silva Filho
Matéria: Inovação e Empreendedorismo
Material complementar de revisão; não é uma reprodução das aulas de 2021–2023.
Conceitos: Margem de contribuição = preço menos custo variável. O ponto de equilíbrio cobre o custo fixo; arredondamos para cima porque vendemos unidades inteiras. Valores são fictícios para exercício.
Objetivo: Calcular 20 unidades para cobrir 600 de custo fixo com margem de 30.
Execução (nesta pasta): python 01_viabilidade.py
Pratique: Simule mudança de preço e teste margem nula ou negativa; explique por que o modelo deixa de ter equilíbrio.
"""
from decimal import Decimal, ROUND_CEILING

def equilibrio(fixo, preco, variavel):
    fixo, preco, variavel = map(Decimal, (str(fixo), str(preco), str(variavel)))
    if min(fixo, preco, variavel) < 0: raise ValueError('Custos e preço devem ser não negativos.')
    margem = preco - variavel
    if margem <= 0: raise ValueError('Margem deve ser positiva.')
    return int((fixo / margem).to_integral_value(rounding=ROUND_CEILING))

if __name__ == '__main__':
    print('Unidades:', equilibrio(600, 50, 20))
    assert equilibrio(601, 50, 20) == 21
