# Análise e Projeto de Sistemas de Informação

**Gilmar da Silva | 2021 | 60 horas de formação profissional**

[Voltar ao índice](../../README.md)

Comece por `atividades-comentadas/00-fundamentos/`, na ordem indicada abaixo, e avance para os exemplos e projetos.

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
| 1 | [Casos de uso e permissões](atividades-comentadas/00-fundamentos/01_casos_de_uso.py) | Casos de uso e permissões |
| 2 | [Rastreabilidade de requisitos](atividades-comentadas/00-fundamentos/02_rastreabilidade.py) | Rastreabilidade de requisitos |
| 3 | [Requisitos e critérios de aceitação](atividades-comentadas/01_requisitos.py) | Rastrear RF01 e rejeitar empréstimo sem exemplar ou com três empréstimos ativos. |
| 4 | [Entidades e transições de estado](atividades-comentadas/02_modelagem.py) | Modelar o vínculo entre um livro e um leitor; bloquear a segunda devolução. |

## Execução e prática

Entre na pasta `atividades-comentadas` antes de executar os comandos abaixo.

### Casos de uso e permissões

`python 00-fundamentos/01_casos_de_uso.py`

**Conceitos:** Ator é um papel; pré-condição deve ser satisfeita antes da ação. Teste caminhos permitidos e negados.

**Pratique:** Modele a renovação com uma regra para reservas pendentes.

### Rastreabilidade de requisitos

`python 00-fundamentos/02_rastreabilidade.py`

**Conceitos:** Cada requisito deve estar ligado a um critério observável e a um cenário de teste.

**Pratique:** Acrescente um requisito não funcional com critério mensurável.

### Requisitos e critérios de aceitação

`python 01_requisitos.py`

**Conceitos:** Requisito funcional descreve uma ação; uma regra de negócio limita quando ela é válida. Critérios verificáveis ligam a necessidade ao teste.

**Pratique:** Acrescente a regra de bloquear um usuário com devolução em atraso e crie um novo cenário.

### Entidades e transições de estado

`python 02_modelagem.py`

**Conceitos:** Uma entidade tem identidade e comportamento. Encapsular a transição protege a regra: só se devolve um empréstimo ativo.

**Pratique:** Desenhe as classes e a associação Leitor 1:N Empréstimo; acrescente a data prevista.

Consulte [requisitos e comandos por linguagem](../../docs/COMO_EXECUTAR.md) e [o que foi validado](../../docs/VALIDACAO.md).

## Base de consulta

- [Python: documentação de referência](https://docs.python.org/3/tutorial/) — tipos, controle de fluxo, funções, estruturas de dados, exceções e arquivos.
