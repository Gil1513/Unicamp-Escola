# Trilha por conteúdo — Análise e Projeto de Sistemas de Informação

Gilmar da Silva — 201269

[Voltar à matéria](README.md)

Siga a ordem abaixo: fundamentos → aplicação → integração. Cada linha aponta para uma atividade concreta.

| Conteúdo | Atividade |
|---|---|
| Requisitos, atores, regras e casos de uso | [Casos de uso e permissões](atividades-comentadas/00-fundamentos/01_casos_de_uso.py) |
| Critérios de aceitação e rastreabilidade | [Rastreabilidade de requisitos](atividades-comentadas/00-fundamentos/02_rastreabilidade.py) |
| Classes, entidades, cardinalidade e UML | [Modelagem UML, entidades e documentação](atividades-comentadas/20-aplicacao/04_modelagem.md) |
| Estados e invariantes | [Análise: estados, invariantes e critérios de aceitação](atividades-comentadas/20-aplicacao/03_regras_estados.py) |

## Como praticar

Para cada atividade: leia a explicação, preveja o resultado, execute o exemplo e resolva o desafio. Registre um caso válido, um limite e um caso inválido. Os exemplos são pontos de partida; os desafios exigem adaptação.

## Comandos e desafios

### Casos de uso e permissões

Ator é um papel; pré-condição deve ser satisfeita antes da ação. Teste caminhos permitidos e negados.

Execução a partir de `atividades-comentadas`: `python 00-fundamentos/01_casos_de_uso.py`

Desafio: Modele a renovação com uma regra para reservas pendentes.

### Rastreabilidade de requisitos

Cada requisito deve estar ligado a um critério observável e a um cenário de teste.

Execução a partir de `atividades-comentadas`: `python 00-fundamentos/02_rastreabilidade.py`

Desafio: Acrescente um requisito não funcional com critério mensurável.

### Análise: estados, invariantes e critérios de aceitação

Modele transições permitidas antes da implementação. O diagrama de estados pode ser traduzido em tabela e teste.

Execução a partir de `atividades-comentadas`: `python 20-aplicacao/03_regras_estados.py`

Desafio: Desenhe o diagrama, acrescente cancelamento e escreva pré/pós-condições para cada evento.

### Modelagem UML, entidades e documentação

Modelagem UML, entidades e documentação

Execução a partir de `atividades-comentadas`: `Siga o roteiro neste arquivo.`

Desafio: Complete o desafio final.
