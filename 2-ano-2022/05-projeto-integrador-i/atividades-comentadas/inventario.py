"""
Protótipo integrado de inventário
Autor: Gilmar da Silva
Matéria: Projeto Integrador I
Conceitos: A camada de domínio valida regras antes de alterar dados. Persistência converte a lista em JSON. Ao carregar, reconstruímos a lista usando as mesmas regras, sem confiar cegamente no arquivo.
Objetivo: Cadastrar dois materiais e recuperar o inventário de um arquivo temporário.
Execução (nesta pasta): python inventario.py
Pratique: Acrescente atualização de quantidade e mantenha as regras de integridade.
"""
import json
from pathlib import Path
from tempfile import TemporaryDirectory

class Inventario:
    def __init__(self): self.itens = []
    def cadastrar(self, nome, quantidade):
        if not isinstance(nome, str) or not nome.strip(): raise ValueError('Nome obrigatório.')
        if type(quantidade) is not int or quantidade < 0: raise ValueError('Quantidade inválida.')
        if any(i['nome'].casefold() == nome.strip().casefold() for i in self.itens):
            raise ValueError('Item já cadastrado.')
        self.itens.append({'nome': nome.strip(), 'quantidade': quantidade})
    def salvar(self, arquivo):
        Path(arquivo).write_text(json.dumps(self.itens, ensure_ascii=False), encoding='utf-8')
    @classmethod
    def carregar(cls, arquivo):
        dados = json.loads(Path(arquivo).read_text(encoding='utf-8'))
        if not isinstance(dados, list): raise ValueError('Esperada uma lista.')
        inventario = cls()
        for item in dados:
            if not isinstance(item, dict) or set(item) != {'nome','quantidade'}:
                raise ValueError('Registro inválido.')
            inventario.cadastrar(item['nome'], item['quantidade'])
        return inventario

if __name__ == '__main__':
    inventario = Inventario()
    inventario.cadastrar('Caderno', 3); inventario.cadastrar('Caneta', 5)
    with TemporaryDirectory() as pasta:
        arquivo = Path(pasta)/'itens.json'
        inventario.salvar(arquivo)
        print(Inventario.carregar(arquivo).itens)
