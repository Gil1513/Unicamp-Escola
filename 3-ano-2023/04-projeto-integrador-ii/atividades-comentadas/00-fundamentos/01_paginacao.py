"""
Paginação e contratos de API
Responsável: Gilmar da Silva
Conceitos: Página e limite precisam de validação. Retorne metadados para o cliente distinguir lista vazia de página inexistente.
Execução: python 00-fundamentos/01_paginacao.py
Pratique: Acrescente os parâmetros pagina e limite ao GET /materiais da API.
"""
def pagina(itens, numero=1, limite=2):
    if type(numero) is not int or type(limite) is not int or numero < 1 or not 1 <= limite <= 100:
        raise ValueError('Paginação inválida')
    inicio = (numero - 1) * limite
    return {'itens': itens[inicio:inicio+limite], 'total': len(itens), 'pagina': numero}
assert pagina([1,2,3], 2)['itens'] == [3]
assert pagina([], 1)['total'] == 0
assert pagina([1], 2)['itens'] == []
print(pagina(['Java','Web','Flutter'], 2))
