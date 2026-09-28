# Tópicos em Tecnologia da Informação

**Gilmar da Silva | 2023 | 90 horas de formação profissional**

[Voltar ao índice](../../README.md)

Comece por `atividades-comentadas/00-fundamentos/`, na ordem indicada abaixo, e avance para os exemplos e projetos.

## Sequência de estudo

1. Controle de versão.
2. formatos de dados.
3. integridade.
4. testes automatizados.
5. integração contínua.
6. complexidade de algoritmos.

Siga análise de algoritmos → integridade de dados → Git → testes → integração contínua. O workflow `.github/workflows/atividades.yml` executa as verificações em push e pull request quando enviado ao GitHub. O pipeline foi preparado, mas não há execução remota confirmada nesta organização.

## Atividades comentadas

As atividades abaixo são complementos de estudo organizados a partir da área da disciplina. Leia os comentários no início de cada arquivo.

| Ordem | Atividade | Objetivo e resultado esperado |
|---:|---|---|
| 1 | [Listas, conjuntos e dicionários](atividades-comentadas/00-fundamentos/01_estruturas.py) | Listas, conjuntos e dicionários |
| 2 | [Testes de fronteira e invariantes](atividades-comentadas/00-fundamentos/02_testes_limites.py) | Testes de fronteira e invariantes |
| 3 | [Busca linear e binária](atividades-comentadas/01_complexidade.py) | Localizar o índice 3 de 8 em [2,4,6,8,10] e devolver -1 quando ausente. |
| 4 | [Hash e integridade de arquivos](atividades-comentadas/02_integridade.py) | Comparar resumos iguais e diferentes, lendo arquivos por blocos para economizar memória. |
| 5 | [Git: histórico, branch e comparação](atividades-comentadas/03_git_laboratorio.py) | Criar dois commits locais em branches diferentes e exibir o diff. |
| 6 | [Testes unitários e casos de borda](atividades-comentadas/test_buscas.py) | Conferir buscas em listas vazias e preenchidas, incluindo alvo ausente. |

## Execução e prática

Entre na pasta `atividades-comentadas` antes de executar os comandos abaixo.

### Listas, conjuntos e dicionários

`python 00-fundamentos/01_estruturas.py`

**Conceitos:** Lista preserva sequência, conjunto remove duplicatas e dicionário associa chaves a valores. Escolha pela operação necessária.

**Pratique:** Compare busca por matrícula em lista e dicionário para mil registros.

### Testes de fronteira e invariantes

`python 00-fundamentos/02_testes_limites.py`

**Conceitos:** Teste valores imediatamente antes, no limite e depois da regra. Um invariante precisa continuar verdadeiro em todas as entradas válidas.

**Pratique:** Teste uma função de desconto nos limites de quantidade e preço.

### Busca linear e binária

`python 01_complexidade.py`

**Conceitos:** Busca linear custa O(n). Busca binária reduz o intervalo pela metade, O(log n), mas exige dados ordenados. Ordenar tem custo próprio e não deve ser omitido na comparação.

**Pratique:** Conte as comparações para diferentes tamanhos e compare o custo de uma consulta com muitas consultas.

### Hash e integridade de arquivos

`python 02_integridade.py`

**Conceitos:** SHA-256 gera um resumo do conteúdo; mudar um byte altera o resumo com altíssima probabilidade. Hash não é criptografia, não recupera o arquivo e sozinho não comprova autoria.

**Pratique:** Crie um manifesto com hashes e detecte qual arquivo mudou.

### Git: histórico, branch e comparação

`python 03_git_laboratorio.py (requer Git)`

**Conceitos:** Commit registra uma versão; branch aponta para uma linha de desenvolvimento; diff compara conteúdos. Este laboratório cria um repositório temporário, sem alterar o repositório de estudos nem a configuração global.

**Pratique:** No repositório temporário, crie mudanças conflitantes em duas branches e explique a resolução.

### Testes unitários e casos de borda

`python -m unittest discover -s . -p test_buscas.py -v`

**Conceitos:** Um teste deve exercitar comportamento observável. Casos de borda como lista vazia, primeiro elemento, último elemento e valor ausente revelam erros nos limites do algoritmo.

**Pratique:** Acrescente elementos repetidos; defina se o contrato deve devolver qualquer ocorrência ou a primeira.

Consulte [requisitos e comandos por linguagem](../../docs/COMO_EXECUTAR.md) e [o que foi validado](../../docs/VALIDACAO.md).

## Base de consulta

- [Python: documentação de referência](https://docs.python.org/3/tutorial/) — tipos, controle de fluxo, funções, estruturas de dados, exceções e arquivos.
