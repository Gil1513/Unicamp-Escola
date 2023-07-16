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
