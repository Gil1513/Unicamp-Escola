"""
Integrador I: serviço, repositório e testes de aceitação
Gilmar da Silva — 201269
Conceitos: Injeção de dependência permite testar a regra sem arquivo. O repositório tem um contrato mínimo para cadastro e consulta.
Execute: python 20-aplicacao/03_integracao_camadas.py
Desafio: Implemente o mesmo contrato com JSON e rode os critérios sem mudar a classe Cadastro.
"""

class Memoria:
    def __init__(self): self.dados={}
    def obter(self,codigo): return self.dados.get(codigo)
    def salvar(self,codigo,nome): self.dados[codigo]=nome
class Cadastro:
    def __init__(self,repo): self.repo=repo
    def cadastrar(self,codigo,nome):
        if not nome.strip() or codigo<=0: raise ValueError('Dados inválidos')
        if self.repo.obter(codigo) is not None: raise ValueError('Duplicado')
        self.repo.salvar(codigo,nome.strip())
repo=Memoria(); servico=Cadastro(repo); servico.cadastrar(1,' Cabo ')
assert repo.obter(1)=='Cabo'
try: servico.cadastrar(1,'Monitor')
except ValueError: print('Duplicidade rejeitada')
else: raise AssertionError('Duplicidade aceita')
print(repo.dados)
