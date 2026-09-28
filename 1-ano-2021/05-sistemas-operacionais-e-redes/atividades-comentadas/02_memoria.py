"""
Paginação e substituição FIFO
Autor: Gilmar da Silva Filho
Matéria: Sistemas Operacionais e Redes de Computadores
Material complementar de revisão; não é uma reprodução das aulas de 2021–2023.
Conceitos: Memória virtual divide endereços em páginas. Quando a página solicitada não está nos quadros disponíveis, ocorre falta de página. FIFO remove a página carregada há mais tempo, não a menos usada.
Objetivo: Simular três quadros e contar 9 faltas na sequência de referência.
Execução (nesta pasta): python 02_memoria.py
Pratique: Implemente LRU e compare com FIFO usando a mesma sequência.
"""
from collections import deque

def fifo(referencias, capacidade):
    if capacidade <= 0: raise ValueError('Capacidade deve ser positiva.')
    quadros = deque(); faltas = 0
    for pagina in referencias:
        if pagina not in quadros:
            faltas += 1
            if len(quadros) == capacidade: quadros.popleft()
            quadros.append(pagina)
    return faltas, list(quadros)

if __name__ == '__main__':
    referencias = [1,2,3,4,1,2,5,1,2,3,4,5]
    faltas, quadros = fifo(referencias,3)
    print('Faltas:',faltas,'Quadros:',quadros)
    assert faltas == 9
