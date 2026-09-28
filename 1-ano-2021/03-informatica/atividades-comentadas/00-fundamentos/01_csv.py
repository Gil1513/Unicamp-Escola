"""
Planilhas e dados tabulares
Responsável: Gilmar da Silva
Conceitos: CSV separa campos por delimitadores; usar a biblioteca evita quebrar nomes com vírgulas.
Execução: python 00-fundamentos/01_csv.py
Pratique: Exporte um resumo e confira a diferença entre texto e número.
"""
import csv
from io import StringIO
arquivo = StringIO('nome,horas\nJava,120\nBanco de Dados,90\n')
linhas = list(csv.DictReader(arquivo))
total = sum(int(linha['horas']) for linha in linhas)
assert total == 210
print('Carga horária:', total)
