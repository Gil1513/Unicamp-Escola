"""
Planejamento e rastreabilidade do protótipo
Autor: Gilmar da Silva
Matéria: Projeto Integrador I
Conceitos: Cada requisito deve ter um critério observável. O backlog organiza trabalho e a rastreabilidade conecta requisito, módulo e verificação.
Objetivo: Listar três requisitos de um inventário com o módulo e a verificação correspondente.
Execução (nesta pasta): python 01_requisitos.py
Pratique: Adicione RF04: impedir remoção de um item que não existe; implemente e teste.
"""
REQUISITOS = [
    ('RF01', 'Cadastrar item', 'inventario.cadastrar', 'Nome não vazio; quantidade inteira >= 0'),
    ('RF02', 'Evitar duplicidade', 'inventario.cadastrar', 'Rejeitar nomes iguais ignorando maiúsculas'),
    ('RF03', 'Persistir dados', 'inventario.salvar/carregar', 'Salvar e recuperar a mesma lista'),
]
if __name__ == '__main__':
    for codigo, nome, modulo, criterio in REQUISITOS:
        print(f'{codigo} | {nome} | {modulo} | {criterio}')
