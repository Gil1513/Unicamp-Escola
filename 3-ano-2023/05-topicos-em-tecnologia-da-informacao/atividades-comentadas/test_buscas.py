"""
Testes unitários e casos de borda
Autor: Gilmar da Silva Filho
Matéria: Tópicos em Tecnologia da Informação
Material complementar de revisão; não é uma reprodução das aulas de 2021–2023.
Conceitos: Um teste deve exercitar comportamento observável. Casos de borda como lista vazia, primeiro elemento, último elemento e valor ausente revelam erros nos limites do algoritmo.
Objetivo: Conferir buscas em listas vazias e preenchidas, incluindo alvo ausente.
Execução (nesta pasta): python -m unittest discover -s . -p test_buscas.py -v
Pratique: Acrescente elementos repetidos; defina se o contrato deve devolver qualquer ocorrência ou a primeira.
"""
import importlib.util
from pathlib import Path
import unittest

spec = importlib.util.spec_from_file_location('buscas', Path(__file__).with_name('01_complexidade.py'))
buscas = importlib.util.module_from_spec(spec)
spec.loader.exec_module(buscas)

class TestBuscas(unittest.TestCase):
    def test_casos_de_borda(self):
        for busca in [buscas.linear, buscas.binaria]:
            for dados, alvo, esperado in [([],1,-1),([2],2,0),([2],3,-1),([2,4,6],2,0),([2,4,6],6,2),([2,4,6],5,-1)]:
                with self.subTest(funcao=busca.__name__, dados=dados, alvo=alvo):
                    self.assertEqual(busca(dados,alvo),esperado)

if __name__ == '__main__':unittest.main()
