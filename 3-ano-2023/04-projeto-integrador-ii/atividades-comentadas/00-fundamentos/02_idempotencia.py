"""
Idempotência e repetição de requisições
Responsável: Gilmar da Silva
Conceitos: Uma chave permite reconhecer a repetição da mesma operação e evitar cadastro duplicado. O exemplo mantém o registro apenas em memória.
Execução: python 00-fundamentos/02_idempotencia.py
Pratique: Explique como persistir a chave e proteger duas requisições simultâneas.
"""
import json
registros, respostas = [], {}
def cadastrar(chave, dados):
    assinatura = json.dumps(dados, sort_keys=True)
    if chave in respostas:
        anterior, resposta = respostas[chave]
        if assinatura != anterior: raise ValueError('Chave reutilizada com outros dados')
        return dict(resposta)
    resposta = {**dados, 'id': len(registros)+1}
    registros.append(dict(resposta))
    respostas[chave] = (assinatura, dict(resposta))
    return resposta
a = cadastrar('pedido-1', {'nome':'Cabo'})
b = cadastrar('pedido-1', {'nome':'Cabo'})
assert a == b and len(registros) == 1
try: cadastrar('pedido-1', {'nome':'Monitor'})
except ValueError: print('Conflito detectado.')
else: raise AssertionError('Conflito ignorado')
print(registros)
