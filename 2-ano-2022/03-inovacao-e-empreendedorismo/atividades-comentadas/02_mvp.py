"""
Priorização de um MVP e hipótese de validação
Autor: Gilmar da Silva
Matéria: Inovação e Empreendedorismo
Conceitos: MVP é uma versão mínima que testa uma hipótese de valor. Uma pontuação impacto/esforço ajuda a discutir prioridades, mas não substitui observar usuários; os dados abaixo são simulados.
Objetivo: Selecionar funcionalidades sob um orçamento de cinco dias; explicitar uma hipótese mensurável.
Execução (nesta pasta): python 02_mvp.py
Pratique: Inclua dependências e explique por que escolher sempre a maior razão não garante a solução ótima.
"""
def priorizar(funcionalidades, dias):
    if dias < 0: raise ValueError('Orçamento inválido.')
    if any(esforco <= 0 or impacto < 0 for _, impacto, esforco in funcionalidades):
        raise ValueError('Impacto não negativo e esforço positivo são necessários.')
    selecionadas = []
    for nome, impacto, esforco in sorted(funcionalidades, key=lambda f: f[1]/f[2], reverse=True):
        if esforco <= dias:
            selecionadas.append(nome); dias -= esforco
    return selecionadas

if __name__ == '__main__':
    recursos = [('Cadastro',8,2), ('Busca',9,2), ('Tema visual',2,3), ('Feedback',5,1)]
    print(priorizar(recursos, 5))
    print('Hipótese proposta: 4 de 5 participantes conseguem localizar um material em até 1 minuto.')
    print('Isso é um critério para um teste futuro, não um resultado de pesquisa realizada.')
