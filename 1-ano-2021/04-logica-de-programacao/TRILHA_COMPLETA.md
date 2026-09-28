# Trilha por conteúdo — Lógica de Programação

Gilmar da Silva — 201269

[Voltar à matéria](README.md)

Siga a ordem abaixo: fundamentos → aplicação → integração. Cada linha aponta para uma atividade concreta.

| Conteúdo | Atividade |
|---|---|
| Tipos, variáveis, operadores e conversão | [Tipos, operadores e divisão](atividades-comentadas/00-fundamentos/01_tipos.c) |
| Entrada, saída, decisões e laços | [Decisões, laços e validação de notas](atividades-comentadas/01_decisoes_e_lacos.c) |
| Arrays, matrizes e índices | [Busca em vetores e diagonal de matriz](atividades-comentadas/02_vetores_e_matrizes.c) |
| Funções, parâmetros e strings | [Funções, strings e limites](atividades-comentadas/00-fundamentos/02_funcoes_strings.c) |
| Structs e ponteiros | [Struct, memória dinâmica e ponteiros](atividades-comentadas/03_estruturas_e_ponteiros.c) |
| Arquivos e recursão | [Arquivos e função recursiva](atividades-comentadas/04_arquivos_e_recursao.c) |
| Memória dinâmica e ordenação | [C: alocação dinâmica, ponteiros e ordenação](atividades-comentadas/20-aplicacao/03_memoria_dinamica.c) |

## Como praticar

Para cada atividade: leia a explicação, preveja o resultado, execute o exemplo e resolva o desafio. Registre um caso válido, um limite e um caso inválido. Os exemplos são pontos de partida; os desafios exigem adaptação.

## Comandos e desafios

### Tipos, operadores e divisão

int guarda inteiros; double permite frações. Converter antes da divisão evita truncamento.

Execução a partir de `atividades-comentadas`: `gcc -std=c11 -Wall -Wextra 00-fundamentos/01_tipos.c -o tipos; ./tipos`

Desafio: Compare divisão inteira e real para 5/2.

### Funções, strings e limites

Strings terminam com zero. O tamanho do buffer precisa incluir esse terminador; funções isolam cálculos.

Execução a partir de `atividades-comentadas`: `gcc -std=c11 -Wall -Wextra 00-fundamentos/02_funcoes_strings.c -o funcoes; ./funcoes`

Desafio: Crie uma função para contar vogais respeitando o fim da string.

### Decisões, laços e validação de notas

Laços percorrem entradas; acumuladores guardam resultados parciais. Uma função separa o cálculo da apresentação e rejeita conjuntos vazios.

Execução a partir de `atividades-comentadas`: `gcc -std=c11 -Wall -Wextra 01_decisoes_e_lacos.c -o notas; ./notas`

Desafio: Inclua uma nota inválida e verifique a rejeição antes de calcular a média.

### Busca em vetores e diagonal de matriz

Um vetor usa um índice; uma matriz usa linha e coluna. Índices começam em zero. A busca linear visita até n elementos, com custo O(n).

Execução a partir de `atividades-comentadas`: `gcc -std=c11 -Wall -Wextra 02_vetores_e_matrizes.c -o vetores; ./vetores`

Desafio: Procure um valor ausente e some a diagonal secundária.

### Struct, memória dinâmica e ponteiros

Struct reúne campos. malloc reserva memória; um ponteiro guarda seu endereço. Conferir NULL e liberar a alocação evita falha de acesso e vazamento.

Execução a partir de `atividades-comentadas`: `gcc -std=c11 -Wall -Wextra 03_estruturas_e_ponteiros.c -o estruturas; ./estruturas`

Desafio: Crie uma função que retorne também o menor valor por um ponteiro de saída.

### Arquivos e função recursiva

Recursão precisa de um caso base e de avanço até ele. Arquivos têm operações de abertura, escrita, leitura e fechamento; sempre verifique erros.

Execução a partir de `atividades-comentadas`: `gcc -std=c11 -Wall -Wextra 04_arquivos_e_recursao.c -o arquivos; ./arquivos`

Desafio: Explique por que restringir o argumento evita estouro de unsigned long long.

### C: alocação dinâmica, ponteiros e ordenação

malloc reserva memória; verifique NULL e libere com free. Ordenação altera o vetor recebido por ponteiro.

Execução a partir de `atividades-comentadas`: `gcc -std=c11 -Wall -Wextra 20-aplicacao/03_memoria_dinamica.c -o memoria; ./memoria`

Desafio: Use uma struct Aluno e ordene por nota; explique por que não acessar o vetor depois de free.
