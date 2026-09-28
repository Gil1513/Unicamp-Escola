"""
Bits, bytes e codificação de texto
Autor: Gilmar da Silva Filho
Matéria: Informática
Material complementar de revisão; não é uma reprodução das aulas de 2021–2023.
Conceitos: Um byte possui 8 bits. UTF-8 usa quantidade variável de bytes por caractere; quantidade de caracteres não é necessariamente tamanho em bytes. KiB equivale a 1024 bytes.
Objetivo: Mostrar 13 em binário e comparar os caracteres e bytes de ação.
Execução (nesta pasta): python 02_representacao.py
Pratique: Teste um emoji e explique por que o tamanho em bytes aumenta.
"""
def representar(numero):
    if not 0 <= numero <= 255:
        raise ValueError('Um byte sem sinal representa valores de 0 a 255.')
    return format(numero, '08b')

if __name__ == '__main__':
    texto = 'ação'
    print('13 em binário:', representar(13))
    print('Caracteres:', len(texto), 'Bytes UTF-8:', len(texto.encode('utf-8')))
    print('2048 bytes em KiB:', 2048 / 1024)
