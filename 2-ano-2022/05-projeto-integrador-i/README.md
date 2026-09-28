# Projeto Integrador I

**Gilmar da Silva | 2022 | 60 horas de formação profissional**

[Voltar ao índice](../../README.md)

Comece por `atividades-comentadas/00-fundamentos/`, na ordem indicada abaixo, e avance para os exemplos e projetos.

Veja a [trilha por conteúdo, com atividades e desafios](TRILHA_COMPLETA.md).

## Sequência de estudo

1. Requisitos.
2. planejamento.
3. integração de módulos.
4. cadastro.
5. validação.
6. persistência.
7. apresentação do protótipo.

O projeto é um inventário de materiais. Primeiro leia os critérios, depois implemente o domínio, a persistência e os testes. Para apresentar o protótipo, demonstre um cadastro válido, uma rejeição, a gravação e a recuperação dos dados.

## Atividades comentadas

As atividades abaixo são complementos de estudo organizados a partir da área da disciplina. Leia os comentários no início de cada arquivo.

| Ordem | Atividade | Objetivo e resultado esperado |
|---:|---|---|
| 1 | [Contrato entre módulos](atividades-comentadas/00-fundamentos/01_contrato.py) | Contrato entre módulos |
| 2 | [Dependências e ordem de implementação](atividades-comentadas/00-fundamentos/02_planejamento.py) | Dependências e ordem de implementação |
| 3 | [Planejamento e rastreabilidade do protótipo](atividades-comentadas/01_requisitos.py) | Listar três requisitos de um inventário com o módulo e a verificação correspondente. |
| 4 | [Protótipo integrado de inventário](atividades-comentadas/inventario.py) | Cadastrar dois materiais e recuperar o inventário de um arquivo temporário. |
| 5 | [Verificação dos critérios de aceitação](atividades-comentadas/test_inventario.py) | Passar os testes de cadastro, entrada inválida, duplicidade e persistência. |

## Execução e prática

Entre na pasta `atividades-comentadas` antes de executar os comandos abaixo.

### Contrato entre módulos

`python 00-fundamentos/01_contrato.py`

**Conceitos:** Validar a entrada na fronteira impede que os módulos recebam um estado inconsistente; diferencie campo ausente de valor inválido.

**Pratique:** Integre o contrato ao módulo de persistência do inventário.

### Dependências e ordem de implementação

`python 00-fundamentos/02_planejamento.py`

**Conceitos:** Uma entrega depende de outras etapas. Ordenação topológica encontra uma sequência possível e detecta ciclos.

**Pratique:** Inclua documentação e atividades que podem ocorrer em paralelo.

### Planejamento e rastreabilidade do protótipo

`python 01_requisitos.py`

**Conceitos:** Cada requisito deve ter um critério observável. O backlog organiza trabalho e a rastreabilidade conecta requisito, módulo e verificação.

**Pratique:** Adicione RF04: impedir remoção de um item que não existe; implemente e teste.

### Protótipo integrado de inventário

`python inventario.py`

**Conceitos:** A camada de domínio valida regras antes de alterar dados. Persistência converte a lista em JSON. Ao carregar, reconstruímos a lista usando as mesmas regras, sem confiar cegamente no arquivo.

**Pratique:** Acrescente atualização de quantidade e mantenha as regras de integridade.

### Verificação dos critérios de aceitação

`python -m unittest discover -s . -p test_inventario.py -v`

**Conceitos:** Testes verificam comportamentos observáveis: duplicidade, limite de quantidade e recuperação. Cada teste cria um estado independente.

**Pratique:** Teste um JSON com estrutura incorreta e um arquivo inexistente.

Consulte [requisitos e comandos por linguagem](../../docs/COMO_EXECUTAR.md) e [o que foi validado](../../docs/VALIDACAO.md).

## Base de consulta

- [Python: documentação de referência](https://docs.python.org/3/tutorial/) — tipos, controle de fluxo, funções, estruturas de dados, exceções e arquivos.
