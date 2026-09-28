"""
Testes de fronteira e invariantes
Responsável: Gilmar da Silva
Conceitos: Teste valores imediatamente antes, no limite e depois da regra. Um invariante precisa continuar verdadeiro em todas as entradas válidas.
Execução: python 00-fundamentos/02_testes_limites.py
Pratique: Teste uma função de desconto nos limites de quantidade e preço.
"""
import unittest
def aprovado(nota):
    if not 0 <= nota <= 10: raise ValueError('Nota fora do intervalo')
    return nota >= 6
class TesteNota(unittest.TestCase):
    def test_fronteiras(self):
        for nota, resultado in [(0,False),(5.99,False),(6,True),(10,True)]:
            with self.subTest(nota=nota): self.assertEqual(aprovado(nota), resultado)
    def test_invalidas(self):
        for nota in [-1, 11, float('nan')]:
            with self.subTest(nota=nota), self.assertRaises(ValueError): aprovado(nota)
if __name__ == '__main__': unittest.main()
