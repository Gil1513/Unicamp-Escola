"""
Análise: estados, invariantes e critérios de aceitação
Gilmar da Silva — 201269
Conceitos: Modele transições permitidas antes da implementação. O diagrama de estados pode ser traduzido em tabela e teste.
Execute: python 20-aplicacao/03_regras_estados.py
Desafio: Desenhe o diagrama, acrescente cancelamento e escreva pré/pós-condições para cada evento.
"""

transicoes = {('rascunho','enviar'):'enviado', ('enviado','aprovar'):'aprovado', ('enviado','rejeitar'):'rascunho'}
def executar(estado, evento):
    if (estado, evento) not in transicoes: raise ValueError('Transição inválida')
    return transicoes[estado, evento]
assert executar('rascunho','enviar') == 'enviado'
assert executar(executar('rascunho','enviar'),'aprovar') == 'aprovado'
try: executar('rascunho','aprovar')
except ValueError: print('Aprovação sem envio rejeitada.')
else: raise AssertionError('Invariante violado')
print(transicoes)
