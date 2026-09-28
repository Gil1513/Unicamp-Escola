"""
Rastreabilidade de requisitos
Responsável: Gilmar da Silva
Conceitos: Cada requisito deve estar ligado a um critério observável e a um cenário de teste.
Execução: python 00-fundamentos/02_rastreabilidade.py
Pratique: Acrescente um requisito não funcional com critério mensurável.
"""
requisitos = {'RF01': 'Cadastrar material', 'RF02': 'Consultar material'}
testes = {'CT01': {'requisito': 'RF01', 'criterio': 'Nome vazio é rejeitado'}}
def sem_cobertura(requisitos, testes):
    cobertos = {t['requisito'] for t in testes.values()}
    return sorted(set(requisitos) - cobertos)
assert sem_cobertura(requisitos, testes) == ['RF02']
testes['CT02'] = {'requisito': 'RF02', 'criterio': 'Busca retorna o nome cadastrado'}
assert sem_cobertura(requisitos, testes) == []
print('Todos os requisitos têm um cenário especificado; executar os cenários é uma etapa separada.')
