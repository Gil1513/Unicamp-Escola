"""
Verificação dos critérios de aceitação
Autor: Gilmar da Silva
Matéria: Projeto Integrador I
Conceitos: Testes verificam comportamentos observáveis: duplicidade, limite de quantidade e recuperação. Cada teste cria um estado independente.
Objetivo: Passar os testes de cadastro, entrada inválida, duplicidade e persistência.
Execução (nesta pasta): python -m unittest discover -s . -p test_inventario.py -v
Pratique: Teste um JSON com estrutura incorreta e um arquivo inexistente.
"""
import unittest
from pathlib import Path
from tempfile import TemporaryDirectory
from inventario import Inventario

class TestInventario(unittest.TestCase):
    def test_cadastro(self):
        inv = Inventario(); inv.cadastrar(' Caderno ', 0)
        self.assertEqual(inv.itens, [{'nome':'Caderno','quantidade':0}])
    def test_entrada_invalida(self):
        for nome, quantidade in [('',1),('Item',-1),('Item',True),('Item',1.5)]:
            with self.subTest(nome=nome, quantidade=quantidade):
                with self.assertRaises(ValueError): Inventario().cadastrar(nome,quantidade)
    def test_duplicidade(self):
        inv=Inventario(); inv.cadastrar('Caneta',1)
        with self.assertRaises(ValueError): inv.cadastrar('caneta',2)
    def test_persistencia(self):
        inv=Inventario(); inv.cadastrar('Lápis',4)
        with TemporaryDirectory() as pasta:
            arquivo=Path(pasta)/'dados.json'; inv.salvar(arquivo)
            self.assertEqual(Inventario.carregar(arquivo).itens, inv.itens)

if __name__ == '__main__': unittest.main()
