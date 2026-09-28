"""
Entidades e transições de estado
Autor: Gilmar da Silva
Matéria: Análise e Projeto de Sistemas de Informação
Conceitos: Uma entidade tem identidade e comportamento. Encapsular a transição protege a regra: só se devolve um empréstimo ativo.
Objetivo: Modelar o vínculo entre um livro e um leitor; bloquear a segunda devolução.
Execução (nesta pasta): python 02_modelagem.py
Pratique: Desenhe as classes e a associação Leitor 1:N Empréstimo; acrescente a data prevista.
"""
from dataclasses import dataclass
from enum import Enum

class Situacao(Enum):
    ATIVO = 'ativo'
    DEVOLVIDO = 'devolvido'

@dataclass
class Emprestimo:
    codigo: int
    leitor: str
    livro: str
    situacao: Situacao = Situacao.ATIVO

    def devolver(self):
        if self.situacao != Situacao.ATIVO:
            raise ValueError('Empréstimo já devolvido.')
        self.situacao = Situacao.DEVOLVIDO

if __name__ == '__main__':
    emprestimo = Emprestimo(1, 'Gilmar da Silva', 'Algoritmos')
    emprestimo.devolver()
    print(emprestimo.situacao.value)
    try: emprestimo.devolver()
    except ValueError as erro: print(erro)
