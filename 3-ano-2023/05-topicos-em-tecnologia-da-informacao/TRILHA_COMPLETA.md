# Trilha por conteúdo — Tópicos em Tecnologia da Informação

Gilmar da Silva — 201269

[Voltar à matéria](README.md)

Siga a ordem abaixo: fundamentos → aplicação → integração. Cada linha aponta para uma atividade concreta.

| Conteúdo | Atividade |
|---|---|
| Estruturas de dados | [Listas, conjuntos e dicionários](atividades-comentadas/00-fundamentos/01_estruturas.py) |
| Complexidade, busca e recursão | [TI: recursão, divide-and-conquer e custo](atividades-comentadas/20-aplicacao/03_busca_complexidade.py) |
| Integridade e hash | [Hash e integridade de arquivos](atividades-comentadas/02_integridade.py) |
| Testes, limites e invariantes | [Testes de fronteira e invariantes](atividades-comentadas/00-fundamentos/02_testes_limites.py) |
| Git e histórico | [Git: histórico, branch e comparação](atividades-comentadas/03_git_laboratorio.py) |
| Integração contínua e entrega | [Git, testes, integração contínua e entrega](atividades-comentadas/20-aplicacao/04_ci.md) |

## Como praticar

Para cada atividade: leia a explicação, preveja o resultado, execute o exemplo e resolva o desafio. Registre um caso válido, um limite e um caso inválido. Os exemplos são pontos de partida; os desafios exigem adaptação.

## Comandos e desafios

### Listas, conjuntos e dicionários

Lista preserva sequência, conjunto remove duplicatas e dicionário associa chaves a valores. Escolha pela operação necessária.

Execução a partir de `atividades-comentadas`: `python 00-fundamentos/01_estruturas.py`

Desafio: Compare busca por matrícula em lista e dicionário para mil registros.

### Testes de fronteira e invariantes

Teste valores imediatamente antes, no limite e depois da regra. Um invariante precisa continuar verdadeiro em todas as entradas válidas.

Execução a partir de `atividades-comentadas`: `python 00-fundamentos/02_testes_limites.py`

Desafio: Teste uma função de desconto nos limites de quantidade e preço.

### Hash e integridade de arquivos

SHA-256 gera um resumo do conteúdo; mudar um byte altera o resumo com altíssima probabilidade. Hash não é criptografia, não recupera o arquivo e sozinho não comprova autoria.

Execução a partir de `atividades-comentadas`: `python 02_integridade.py`

Desafio: Crie um manifesto com hashes e detecte qual arquivo mudou.

### Git: histórico, branch e comparação

Commit registra uma versão; branch aponta para uma linha de desenvolvimento; diff compara conteúdos. Este laboratório cria um repositório temporário, sem alterar o repositório de estudos nem a configuração global.

Execução a partir de `atividades-comentadas`: `python 03_git_laboratorio.py (requer Git)`

Desafio: No repositório temporário, crie mudanças conflitantes em duas branches e explique a resolução.

### TI: recursão, divide-and-conquer e custo

Busca binária reduz pela metade um intervalo ordenado. Conte comparações; tempo real depende também do ambiente.

Execução a partir de `atividades-comentadas`: `python 20-aplicacao/03_busca_complexidade.py`

Desafio: Compare vetores de 16, 256 e 4096 elementos e explique o custo extra dos slices na recursão.

### Git, testes, integração contínua e entrega

Git, testes, integração contínua e entrega

Execução a partir de `atividades-comentadas`: `Siga o roteiro neste arquivo.`

Desafio: Complete o desafio final.
