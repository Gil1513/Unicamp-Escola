# Análise e Projeto de Sistemas de Informação

**Gilmar da Silva Filho | 2021 | 60 horas de formação profissional**

[Voltar ao índice](../../README.md)

## Sequência de estudo

1. Requisitos.
2. regras de negócio.
3. casos de uso.
4. modelagem de entidades.
5. documentação e rastreabilidade.

Faça o levantamento das regras antes de desenhar as classes. Registre ator, ação, pré-condição, fluxo principal, exceções e resultado esperado para cada caso de uso. Use o segundo exemplo para desenhar Leitor, Livro e Empréstimo e justificar as multiplicidades.

## Atividades comentadas

As atividades abaixo são complementos de estudo organizados a partir da área da disciplina. Leia os comentários no início de cada arquivo.

| Ordem | Atividade | Objetivo e resultado esperado |
|---:|---|---|
| 1 | [Requisitos e critérios de aceitação](atividades-comentadas/01_requisitos.py) | Rastrear RF01 e rejeitar empréstimo sem exemplar ou com três empréstimos ativos. |
| 2 | [Entidades e transições de estado](atividades-comentadas/02_modelagem.py) | Modelar o vínculo entre um livro e um leitor; bloquear a segunda devolução. |

## Execução e prática

Entre na pasta `atividades-comentadas` antes de executar os comandos abaixo.

### Requisitos e critérios de aceitação

`python 01_requisitos.py`

**Conceitos:** Requisito funcional descreve uma ação; uma regra de negócio limita quando ela é válida. Critérios verificáveis ligam a necessidade ao teste.

**Pratique:** Acrescente a regra de bloquear um usuário com devolução em atraso e crie um novo cenário.

### Entidades e transições de estado

`python 02_modelagem.py`

**Conceitos:** Uma entidade tem identidade e comportamento. Encapsular a transição protege a regra: só se devolve um empréstimo ativo.

**Pratique:** Desenhe as classes e a associação Leitor 1:N Empréstimo; acrescente a data prevista.

Consulte [requisitos e comandos por linguagem](../../docs/COMO_EXECUTAR.md) e [o que foi validado](../../docs/VALIDACAO.md).
