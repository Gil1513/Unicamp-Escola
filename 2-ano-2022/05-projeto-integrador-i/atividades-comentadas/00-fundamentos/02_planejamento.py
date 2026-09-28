"""
Dependências e ordem de implementação
Responsável: Gilmar da Silva
Conceitos: Uma entrega depende de outras etapas. Ordenação topológica encontra uma sequência possível e detecta ciclos.
Execução: python 00-fundamentos/02_planejamento.py
Pratique: Inclua documentação e atividades que podem ocorrer em paralelo.
"""
from graphlib import TopologicalSorter, CycleError
etapas = {'requisitos': set(), 'modelo': {'requisitos'}, 'cadastro': {'modelo'},
          'testes': {'cadastro'}, 'demonstracao': {'testes'}}
ordem = list(TopologicalSorter(etapas).static_order())
assert ordem.index('modelo') < ordem.index('testes')
try: list(TopologicalSorter({'a': {'b'}, 'b': {'a'}}).static_order())
except CycleError: print('Ciclo detectado no segundo planejamento.')
else: raise AssertionError('Ciclo não detectado')
print(' → '.join(ordem))
