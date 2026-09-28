/*
Identificação: Gilmar da Silva
Matéria: Lógica de Programação
Arquivo de estudo: 37-matriz 3x3.c
Explicação: entrada de dados alimenta o algoritmo; decisões selecionam caminhos conforme condições; laços repetem o processamento; matrizes organizam linhas e colunas.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
#include <stdio.h>

int main() {
    int matriz[3][3];
    int somaTotal = 0;
    int somaDiagonalPrincipal = 0;

    printf("Preencha a matriz 3x3:\n");

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            printf("Digite o valor da posicao [%d][%d]: ", i, j);
            scanf("%d", &matriz[i][j]);
            somaTotal += matriz[i][j];

            if (i == j) {
                somaDiagonalPrincipal += matriz[i][j];
            }
        }
    }

    printf("\nValores da matriz:\n");

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            printf("%d ", matriz[i][j]);
        }
        printf("\n");
    }

    printf("\nSoma de todos os valores: %d\n", somaTotal);
    printf("Soma dos valores da diagonal principal: %d\n", somaDiagonalPrincipal);

    return 0;
}
