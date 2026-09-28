"""
Requisitos e critérios de aceitação
Autor: Gilmar da Silva
Matéria: Análise e Projeto de Sistemas de Informação
Conceitos: Requisito funcional descreve uma ação; uma regra de negócio limita quando ela é válida. Critérios verificáveis ligam a necessidade ao teste.
Objetivo: Rastrear RF01 e rejeitar empréstimo sem exemplar ou com três empréstimos ativos.
Execução (nesta pasta): python 01_requisitos.py
Pratique: Acrescente a regra de bloquear um usuário com devolução em atraso e crie um novo cenário.
"""
from dataclasses import dataclass

@dataclass(frozen=True)
class Cenario:
    descricao: str
    disponiveis: int
    ativos: int
    permitido: bool

def pode_emprestar(disponiveis, ativos):
    if disponiveis < 0 or ativos < 0:
        raise ValueError('Quantidades não podem ser negativas.')
    return disponiveis > 0 and ativos < 3

def main():
    print('RF01: registrar empréstimo de um exemplar disponível.')
    cenarios = [Cenario('Fluxo principal', 1, 0, True),
                Cenario('Sem estoque', 0, 0, False),
                Cenario('Limite atingido', 4, 3, False)]
    for cenario in cenarios:
        observado = pode_emprestar(cenario.disponiveis, cenario.ativos)
        assert observado == cenario.permitido
        print(f'{cenario.descricao}: {observado}')

if __name__ == '__main__': main()
