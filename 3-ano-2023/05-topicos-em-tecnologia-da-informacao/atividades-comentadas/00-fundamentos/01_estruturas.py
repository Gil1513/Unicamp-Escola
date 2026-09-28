"""
Listas, conjuntos e dicionários
Responsável: Gilmar da Silva
Conceitos: Lista preserva sequência, conjunto remove duplicatas e dicionário associa chaves a valores. Escolha pela operação necessária.
Execução: python 00-fundamentos/01_estruturas.py
Pratique: Compare busca por matrícula em lista e dicionário para mil registros.
"""
from collections import Counter
acessos = ['java','web','java','flutter','web','java']
contagens = Counter(acessos)
assert contagens['java'] == 3
assert len(set(acessos)) == 3
assert contagens.most_common(1) == [('java', 3)]
print('Ordem:', acessos, 'Únicos:', sorted(set(acessos)), 'Frequência:', dict(contagens))
