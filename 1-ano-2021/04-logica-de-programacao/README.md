# Lógica de Programação

**Gilmar da Silva | 2021 | 150 horas de formação profissional**

[Voltar ao índice](../../README.md)

Comece por `atividades-comentadas/00-fundamentos/`, na ordem indicada abaixo, e avance para os exemplos e projetos.

## Sequência de estudo

1. Algoritmos.
2. variáveis.
3. decisões.
4. laços.
5. vetores.
6. matrizes.
7. funções.
8. ponteiros.
9. estruturas.
10. arquivos.

No acervo, siga: fluxogramas → pseudocódigos → entrada e expressões (01–05) → decisões (06–12) → laços (13–24) → vetores e strings (25–35) → matrizes (36–40) → estruturas, ponteiros, funções, recursão e memória (41–48). Os arquivos antigos mantêm a numeração original, inclusive exemplos que ainda precisam de revisão.

## Atividades comentadas

As atividades abaixo são complementos de estudo organizados a partir da área da disciplina. Leia os comentários no início de cada arquivo.

| Ordem | Atividade | Objetivo e resultado esperado |
|---:|---|---|
| 1 | [Tipos, operadores e divisão](atividades-comentadas/00-fundamentos/01_tipos.c) | Tipos, operadores e divisão |
| 2 | [Funções, strings e limites](atividades-comentadas/00-fundamentos/02_funcoes_strings.c) | Funções, strings e limites |
| 3 | [Decisões, laços e validação de notas](atividades-comentadas/01_decisoes_e_lacos.c) | Calcular média 7.00 e classificar a situação com limite 6.0. |
| 4 | [Busca em vetores e diagonal de matriz](atividades-comentadas/02_vetores_e_matrizes.c) | Encontrar 7 no índice 1 e somar a diagonal para obter 15. |
| 5 | [Struct, memória dinâmica e ponteiros](atividades-comentadas/03_estruturas_e_ponteiros.c) | Criar um cadastro em memória e calcular o maior valor, inclusive com números negativos. |
| 6 | [Arquivos e função recursiva](atividades-comentadas/04_arquivos_e_recursao.c) | Gravar e recuperar o fatorial de 5 em arquivo temporário, exibindo 120. |

## Execução e prática

Entre na pasta `atividades-comentadas` antes de executar os comandos abaixo.

### Tipos, operadores e divisão

`gcc -std=c11 -Wall -Wextra 00-fundamentos/01_tipos.c -o tipos; ./tipos`

**Conceitos:** int guarda inteiros; double permite frações. Converter antes da divisão evita truncamento.

**Pratique:** Compare divisão inteira e real para 5/2.

### Funções, strings e limites

`gcc -std=c11 -Wall -Wextra 00-fundamentos/02_funcoes_strings.c -o funcoes; ./funcoes`

**Conceitos:** Strings terminam com zero. O tamanho do buffer precisa incluir esse terminador; funções isolam cálculos.

**Pratique:** Crie uma função para contar vogais respeitando o fim da string.

### Decisões, laços e validação de notas

`gcc -std=c11 -Wall -Wextra 01_decisoes_e_lacos.c -o notas; ./notas`

**Conceitos:** Laços percorrem entradas; acumuladores guardam resultados parciais. Uma função separa o cálculo da apresentação e rejeita conjuntos vazios.

**Pratique:** Inclua uma nota inválida e verifique a rejeição antes de calcular a média.

### Busca em vetores e diagonal de matriz

`gcc -std=c11 -Wall -Wextra 02_vetores_e_matrizes.c -o vetores; ./vetores`

**Conceitos:** Um vetor usa um índice; uma matriz usa linha e coluna. Índices começam em zero. A busca linear visita até n elementos, com custo O(n).

**Pratique:** Procure um valor ausente e some a diagonal secundária.

### Struct, memória dinâmica e ponteiros

`gcc -std=c11 -Wall -Wextra 03_estruturas_e_ponteiros.c -o estruturas; ./estruturas`

**Conceitos:** Struct reúne campos. malloc reserva memória; um ponteiro guarda seu endereço. Conferir NULL e liberar a alocação evita falha de acesso e vazamento.

**Pratique:** Crie uma função que retorne também o menor valor por um ponteiro de saída.

### Arquivos e função recursiva

`gcc -std=c11 -Wall -Wextra 04_arquivos_e_recursao.c -o arquivos; ./arquivos`

**Conceitos:** Recursão precisa de um caso base e de avanço até ele. Arquivos têm operações de abertura, escrita, leitura e fechamento; sempre verifique erros.

**Pratique:** Explique por que restringir o argumento evita estouro de unsigned long long.

## Acervo anterior

[Explorar os arquivos anteriores](acervo/). A ordem sugerida acima orienta a revisão.

Consulte [requisitos e comandos por linguagem](../../docs/COMO_EXECUTAR.md) e [o que foi validado](../../docs/VALIDACAO.md).

## Base de consulta

- [C: referência da linguagem](https://learn.microsoft.com/en-us/cpp/c-language/c-language-reference?view=msvc-170) — tipos, expressões, declarações, instruções e funções. A documentação descreve a implementação Microsoft; estes exercícios usam GCC/C11 e recursos comuns da linguagem.

Para C, pratique primeiro tipos, operadores, decisões, laços, funções, arrays e strings; depois ponteiros, structs, arquivos e memória. A referência Arduino ajuda a comparar os conceitos usados posteriormente no terceiro ano, mas contém extensões de C++.
