"""
Contrato entre módulos
Responsável: Gilmar da Silva
Conceitos: Validar a entrada na fronteira impede que os módulos recebam um estado inconsistente; diferencie campo ausente de valor inválido.
Execução: python 00-fundamentos/01_contrato.py
Pratique: Integre o contrato ao módulo de persistência do inventário.
"""
def material(dados):
    if not isinstance(dados.get('nome'), str) or not dados['nome'].strip():
        raise ValueError('Nome obrigatório')
    q = dados.get('quantidade')
    if type(q) is not int or q < 0:
        raise ValueError('Quantidade inteira não negativa')
    return {'nome': dados['nome'].strip(), 'quantidade': q}
assert material({'nome':' Cabo ', 'quantidade':0})['nome'] == 'Cabo'
for dados in [{}, {'nome':'Cabo','quantidade':True}, {'nome':'Cabo','quantidade':-1}]:
    try: material(dados)
    except ValueError: pass
    else: raise AssertionError('Contrato violado')
print('Entradas válidas normalizadas; inválidas rejeitadas.')
