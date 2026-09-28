"""
Fluxo de caixa e saldo acumulado
Responsável: Gilmar da Silva
Conceitos: Lucro e caixa são diferentes: o prazo do recebimento afeta a disponibilidade. Decimal evita aproximação binária de valores monetários.
Execução: python 00-fundamentos/02_fluxo_caixa.py
Pratique: Acrescente vencimento e diferencie previsto de realizado.
"""
from decimal import Decimal
saldo = Decimal('100.00')
movimentos = [('entrada', '50.00'), ('saida', '80.00'), ('saida', '100.00')]
for tipo, valor in movimentos:
    saldo += Decimal(valor) * (1 if tipo == 'entrada' else -1)
    print(tipo, valor, 'saldo', saldo)
assert saldo == Decimal('-30.00')
print('Simulação: falta caixa mesmo havendo uma entrada no período.')
