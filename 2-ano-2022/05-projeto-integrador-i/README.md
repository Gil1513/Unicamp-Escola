# Projeto Integrador I

**Gilmar da Silva Filho | 2022 | 60 horas de formação profissional**

[Voltar ao índice](../../README.md)

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
| 1 | [Planejamento e rastreabilidade do protótipo](atividades-comentadas/01_requisitos.py) | Listar três requisitos de um inventário com o módulo e a verificação correspondente. |
| 2 | [Protótipo integrado de inventário](atividades-comentadas/inventario.py) | Cadastrar dois materiais e recuperar o inventário de um arquivo temporário. |
| 3 | [Verificação dos critérios de aceitação](atividades-comentadas/test_inventario.py) | Passar os testes de cadastro, entrada inválida, duplicidade e persistência. |

## Execução e prática

Entre na pasta `atividades-comentadas` antes de executar os comandos abaixo.

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
