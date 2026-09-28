"""
TI: recursão, divide-and-conquer e custo
Gilmar da Silva — 201269
Conceitos: Busca binária reduz pela metade um intervalo ordenado. Conte comparações; tempo real depende também do ambiente.
Execute: python 20-aplicacao/03_busca_complexidade.py
Desafio: Compare vetores de 16, 256 e 4096 elementos e explique o custo extra dos slices na recursão.
"""

def busca(v,alvo):
    inicio,fim,passos=0,len(v)-1,0
    while inicio<=fim:
        passos+=1; meio=(inicio+fim)//2
        if v[meio]==alvo:return meio,passos
        if v[meio]<alvo:inicio=meio+1
        else:fim=meio-1
    return -1,passos
def soma_recursiva(v):
    if len(v)<=1:return sum(v)
    meio=len(v)//2
    return soma_recursiva(v[:meio])+soma_recursiva(v[meio:])
v=list(range(1024)); indice,passos=busca(v,1023)
assert indice==1023 and passos<=11
assert busca([],3)==(-1,0) and soma_recursiva([1,2,3,4])==10
print('Binária:',passos,'comparações; linear até',len(v))
