/*
Funções, strings e limites
Responsável: Gilmar da Silva
Conceitos: Strings terminam com zero. O tamanho do buffer precisa incluir esse terminador; funções isolam cálculos.
Execução: gcc -std=c11 -Wall -Wextra 00-fundamentos/02_funcoes_strings.c -o funcoes; ./funcoes
Pratique: Crie uma função para contar vogais respeitando o fim da string.
*/
#include <stdio.h>
#include <string.h>
#include <assert.h>
double media(const double notas[], size_t n) {
    double soma = 0;
    for (size_t i = 0; i < n; i++) soma += notas[i];
    return n ? soma / n : 0;
}
int main(void) {
    char nome[40] = "Gilmar da Silva";
    double notas[] = {6, 8, 10};
    assert(strlen(nome) == 15);
    assert(media(notas, 3) == 8);
    assert(media(notas, 0) == 0);
    printf("%s: %.1f\n", nome, media(notas, 3));
    return 0;
}
