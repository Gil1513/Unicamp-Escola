/*
Busca em vetores e diagonal de matriz
Autor: Gilmar da Silva Filho
Matéria: Lógica de Programação
Material complementar de revisão; não é uma reprodução das aulas de 2021–2023.
Conceitos: Um vetor usa um índice; uma matriz usa linha e coluna. Índices começam em zero. A busca linear visita até n elementos, com custo O(n).
Objetivo: Encontrar 7 no índice 1 e somar a diagonal para obter 15.
Execução (nesta pasta): gcc -std=c11 -Wall -Wextra 02_vetores_e_matrizes.c -o vetores; ./vetores
Pratique: Procure um valor ausente e some a diagonal secundária.
*/
#include <stdio.h>
int buscar(const int dados[], int tamanho, int alvo) {
    for (int i = 0; i < tamanho; i++) if (dados[i] == alvo) return i;
    return -1;
}
int main(void) {
    int vetor[] = {4, 7, 9};
    int matriz[3][3] = {{1,2,3},{4,5,6},{7,8,9}};
    int soma = 0;
    for (int i = 0; i < 3; i++) soma += matriz[i][i];
    printf("Indice: %d\nDiagonal: %d\n", buscar(vetor, 3, 7), soma);
    return 0;
}
