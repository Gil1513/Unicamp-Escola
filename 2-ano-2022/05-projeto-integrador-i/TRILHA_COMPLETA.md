# Trilha por conteúdo — Projeto Integrador I

Gilmar da Silva — 201269

[Voltar à matéria](README.md)

Siga a ordem abaixo: fundamentos → aplicação → integração. Cada linha aponta para uma atividade concreta.

| Conteúdo | Atividade |
|---|---|
| Requisitos e critérios | [Planejamento e rastreabilidade do protótipo](atividades-comentadas/01_requisitos.py) |
| Planejamento e dependências | [Dependências e ordem de implementação](atividades-comentadas/00-fundamentos/02_planejamento.py) |
| Contrato, validação e domínio | [Contrato entre módulos](atividades-comentadas/00-fundamentos/01_contrato.py) |
| Cadastro e persistência | [Protótipo integrado de inventário](atividades-comentadas/inventario.py) |
| Separação de camadas e integração | [Integrador I: serviço, repositório e testes de aceitação](atividades-comentadas/20-aplicacao/03_integracao_camadas.py) |
| Testes | [Verificação dos critérios de aceitação](atividades-comentadas/test_inventario.py) |
| Documentação e apresentação | [Planejamento, protótipo, documentação e apresentação](atividades-comentadas/20-aplicacao/04_entrega.md) |

## Como praticar

Para cada atividade: leia a explicação, preveja o resultado, execute o exemplo e resolva o desafio. Registre um caso válido, um limite e um caso inválido. Os exemplos são pontos de partida; os desafios exigem adaptação.

## Comandos e desafios

### Contrato entre módulos

Validar a entrada na fronteira impede que os módulos recebam um estado inconsistente; diferencie campo ausente de valor inválido.

Execução a partir de `atividades-comentadas`: `python 00-fundamentos/01_contrato.py`

Desafio: Integre o contrato ao módulo de persistência do inventário.

### Dependências e ordem de implementação

Uma entrega depende de outras etapas. Ordenação topológica encontra uma sequência possível e detecta ciclos.

Execução a partir de `atividades-comentadas`: `python 00-fundamentos/02_planejamento.py`

Desafio: Inclua documentação e atividades que podem ocorrer em paralelo.

### Planejamento e rastreabilidade do protótipo

Cada requisito deve ter um critério observável. O backlog organiza trabalho e a rastreabilidade conecta requisito, módulo e verificação.

Execução a partir de `atividades-comentadas`: `python 01_requisitos.py`

Desafio: Adicione RF04: impedir remoção de um item que não existe; implemente e teste.

### Protótipo integrado de inventário

A camada de domínio valida regras antes de alterar dados. Persistência converte a lista em JSON. Ao carregar, reconstruímos a lista usando as mesmas regras, sem confiar cegamente no arquivo.

Execução a partir de `atividades-comentadas`: `python inventario.py`

Desafio: Acrescente atualização de quantidade e mantenha as regras de integridade.

### Verificação dos critérios de aceitação

Testes verificam comportamentos observáveis: duplicidade, limite de quantidade e recuperação. Cada teste cria um estado independente.

Execução a partir de `atividades-comentadas`: `python -m unittest discover -s . -p test_inventario.py -v`

Desafio: Teste um JSON com estrutura incorreta e um arquivo inexistente.

### Integrador I: serviço, repositório e testes de aceitação

Injeção de dependência permite testar a regra sem arquivo. O repositório tem um contrato mínimo para cadastro e consulta.

Execução a partir de `atividades-comentadas`: `python 20-aplicacao/03_integracao_camadas.py`

Desafio: Implemente o mesmo contrato com JSON e rode os critérios sem mudar a classe Cadastro.

### Planejamento, protótipo, documentação e apresentação

Planejamento, protótipo, documentação e apresentação

Execução a partir de `atividades-comentadas`: `Siga o roteiro neste arquivo.`

Desafio: Complete o desafio final.
