"""
Hipóteses e indicadores
Responsável: Gilmar da Silva
Conceitos: Defina indicador, população e limiar antes de avaliar um experimento. Estes dados são fictícios para exercitar o cálculo.
Execução: python 00-fundamentos/01_hipoteses.py
Pratique: Defina uma hipótese de retenção e os dados necessários para testá-la.
"""
def avaliar(convites, interessados, limiar):
    if convites <= 0 or not 0 <= interessados <= convites:
        raise ValueError('Contagens inválidas')
    taxa = interessados / convites
    return taxa, taxa >= limiar
assert avaliar(20, 8, 0.4) == (0.4, True)
assert avaliar(20, 7, 0.4) == (0.35, False)
print('Simulação:', avaliar(20, 8, 0.4))
print('Interesse declarado não comprova disposição de pagar.')
