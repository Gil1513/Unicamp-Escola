"""
Pilha de chamadas e fila de processos
Responsável: Gilmar da Silva
Conceitos: Pilha segue LIFO; fila segue FIFO. São modelos de estruturas usadas pelo sistema, não processos reais.
Execução: python 00-fundamentos/01_pilhas_processos.py
Pratique: Simule rodízio de processos com quantidades diferentes de trabalho.
"""
from collections import deque
pilha = ['main', 'carregar', 'ler_arquivo']
assert pilha.pop() == 'ler_arquivo'
fila = deque(['editor', 'terminal', 'navegador'])
assert fila.popleft() == 'editor'
fila.append('editor')  # Processo volta ao final após seu turno.
assert list(fila) == ['terminal', 'navegador', 'editor']
print('Chamadas pendentes:', pilha, 'Fila:', list(fila))
