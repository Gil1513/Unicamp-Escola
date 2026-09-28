"""
Debounce e máquina de estados
Responsável: Gilmar da Silva
Conceitos: Um botão pode oscilar ao mudar. Confirme a mudança somente após um intervalo de estabilidade; simulação sem placa.
Execução: python 00-fundamentos/02_debounce.py
Pratique: Transfira a lógica para millis() e digitalRead() no Arduino.
"""
def filtrar(amostras, intervalo=30):
    candidato, estavel, inicio = False, False, 0
    eventos = []
    for tempo, leitura in amostras:
        if leitura != candidato:
            candidato, inicio = leitura, tempo
        if tempo - inicio >= intervalo and estavel != candidato:
            estavel = candidato
            eventos.append((tempo, estavel))
    return eventos
amostras = [(0,False),(10,True),(15,False),(20,True),(49,True),(50,True),(70,False),(100,False)]
assert filtrar(amostras) == [(50,True),(100,False)]
print(filtrar(amostras))
