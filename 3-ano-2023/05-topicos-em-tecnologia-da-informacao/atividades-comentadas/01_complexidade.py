"""
Busca linear e binária
Autor: Gilmar da Silva Filho
Matéria: Tópicos em Tecnologia da Informação
Material complementar de revisão; não é uma reprodução das aulas de 2021–2023.
Conceitos: Busca linear custa O(n). Busca binária reduz o intervalo pela metade, O(log n), mas exige dados ordenados. Ordenar tem custo próprio e não deve ser omitido na comparação.
Objetivo: Localizar o índice 3 de 8 em [2,4,6,8,10] e devolver -1 quando ausente.
Execução (nesta pasta): python 01_complexidade.py
Pratique: Conte as comparações para diferentes tamanhos e compare o custo de uma consulta com muitas consultas.
"""
def linear(dados, alvo):
    for i, valor in enumerate(dados):
        if valor==alvo:return i
    return -1

def binaria(dados, alvo):
    esquerda,direita=0,len(dados)-1
    while esquerda<=direita:
        meio=(esquerda+direita)//2
        if dados[meio]==alvo:return meio
        if dados[meio]<alvo:esquerda=meio+1
        else:direita=meio-1
    return -1

if __name__=='__main__':
    dados=[2,4,6,8,10]
    for alvo in [8,7]:print(alvo,linear(dados,alvo),binaria(dados,alvo))
