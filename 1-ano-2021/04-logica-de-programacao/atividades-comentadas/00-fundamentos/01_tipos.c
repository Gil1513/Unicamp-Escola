/*
Tipos, operadores e divisão
Responsável: Gilmar da Silva
Conceitos: int guarda inteiros; double permite frações. Converter antes da divisão evita truncamento.
Execução: gcc -std=c11 -Wall -Wextra 00-fundamentos/01_tipos.c -o tipos; ./tipos
Pratique: Compare divisão inteira e real para 5/2.
*/
#include <stdio.h>
#include <assert.h>
int main(void) {
    int acertos = 7, total = 10;
    double percentual = 100.0 * acertos / total;
    assert(acertos / total == 0);
    assert(percentual == 70.0);
    printf("Acertos: %.1f%%\n", percentual);
    return 0;
}
