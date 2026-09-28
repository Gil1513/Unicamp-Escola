/*
Struct, memória dinâmica e ponteiros
Autor: Gilmar da Silva
Matéria: Lógica de Programação
Conceitos: Struct reúne campos. malloc reserva memória; um ponteiro guarda seu endereço. Conferir NULL e liberar a alocação evita falha de acesso e vazamento.
Objetivo: Criar um cadastro em memória e calcular o maior valor, inclusive com números negativos.
Execução (nesta pasta): gcc -std=c11 -Wall -Wextra 03_estruturas_e_ponteiros.c -o estruturas; ./estruturas
Pratique: Crie uma função que retorne também o menor valor por um ponteiro de saída.
*/
#include <stdio.h>
#include <stdlib.h>
typedef struct { int codigo; double nota; } Aluno;
int maior(const int valores[], size_t n, int *saida) {
    if (!valores || !saida || n == 0) return 0;
    *saida = valores[0];
    for (size_t i = 1; i < n; i++) if (valores[i] > *saida) *saida = valores[i];
    return 1;
}
int main(void) {
    Aluno *turma = malloc(2 * sizeof *turma);
    if (!turma) return 1;
    turma[0] = (Aluno){1, 8.5}; turma[1] = (Aluno){2, 7.0};
    int dados[] = {-9, -2, -5}, resultado;
    if (!maior(dados, 3, &resultado)) { free(turma); return 1; }
    printf("Nota: %.1f\nMaior: %d\n", turma[0].nota, resultado);
    free(turma);
    return 0;
}
