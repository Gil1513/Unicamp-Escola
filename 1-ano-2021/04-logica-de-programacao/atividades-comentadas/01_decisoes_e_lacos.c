/*
Decisões, laços e validação de notas
Autor: Gilmar da Silva Filho
Matéria: Lógica de Programação
Material complementar de revisão; não é uma reprodução das aulas de 2021–2023.
Conceitos: Laços percorrem entradas; acumuladores guardam resultados parciais. Uma função separa o cálculo da apresentação e rejeita conjuntos vazios.
Objetivo: Calcular média 7.00 e classificar a situação com limite 6.0.
Execução (nesta pasta): gcc -std=c11 -Wall -Wextra 01_decisoes_e_lacos.c -o notas; ./notas
Pratique: Inclua uma nota inválida e verifique a rejeição antes de calcular a média.
*/
#include <stdio.h>
#include <stddef.h>

int media(const double notas[], size_t quantidade, double *resultado) {
    if (quantidade == 0 || resultado == NULL || notas == NULL) return 0;
    double soma = 0;
    for (size_t i = 0; i < quantidade; i++) {
        if (notas[i] < 0 || notas[i] > 10) return 0;
        soma += notas[i];
    }
    *resultado = soma / quantidade;
    return 1;
}
int main(void) {
    double notas[] = {6, 7, 8}, resultado;
    if (!media(notas, 3, &resultado)) return 1;
    printf("Media: %.2f - %s\n", resultado, resultado >= 6 ? "Aprovado" : "Revisar");
    return 0;
}
