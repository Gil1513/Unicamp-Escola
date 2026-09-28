"""
Escalonamento FCFS
Autor: Gilmar da Silva
Matéria: Sistemas Operacionais e Redes de Computadores
Conceitos: First Come First Served atende por ordem de chegada, sem preempção. Espera = início menos chegada; retorno = fim menos chegada. A CPU pode ficar ociosa.
Objetivo: Calcular espera e retorno e tratar um intervalo sem processos prontos.
Execução (nesta pasta): python 01_escalonamento.py
Pratique: Compare com uma ordem que priorize tarefas curtas; discuta o risco de espera prolongada.
"""
def fcfs(processos):
    tempo = 0
    resultado = []
    for nome, chegada, duracao in sorted(processos, key=lambda p: p[1]):
        if chegada < 0 or duracao <= 0: raise ValueError('Tempos inválidos.')
        inicio = max(tempo, chegada)
        tempo = inicio + duracao
        resultado.append((nome, inicio - chegada, tempo - chegada))
    return resultado

if __name__ == '__main__':
    for nome, espera, retorno in fcfs([('P1',0,4),('P2',1,2),('P3',10,1)]):
        print(f'{nome}: espera={espera}, retorno={retorno}')
