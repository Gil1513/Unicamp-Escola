"""
Casos de uso e permissões
Responsável: Gilmar da Silva
Conceitos: Ator é um papel; pré-condição deve ser satisfeita antes da ação. Teste caminhos permitidos e negados.
Execução: python 00-fundamentos/01_casos_de_uso.py
Pratique: Modele a renovação com uma regra para reservas pendentes.
"""
def pode_emprestar(papel, exemplares, bloqueado):
    return papel == 'bibliotecario' and exemplares > 0 and not bloqueado

cenarios = [('bibliotecario', 1, False, True), ('leitor', 1, False, False),
            ('bibliotecario', 0, False, False), ('bibliotecario', 1, True, False)]
for papel, quantidade, bloqueado, esperado in cenarios:
    obtido = pode_emprestar(papel, quantidade, bloqueado)
    assert obtido == esperado
    print(papel, quantidade, bloqueado, '=>', obtido)
