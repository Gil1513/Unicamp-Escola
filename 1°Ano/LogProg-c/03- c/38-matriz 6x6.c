#include <stdio.h>

int main() {
    int matriz[6][6];
    int count = 0;

    printf("Preencha a matriz 6x6:\n");

    for (int i = 0; i < 6; i++) {
        for (int j = 0; j < 6; j++) {
            printf("Digite o valor da posicao [%d][%d]: ", i, j);
            scanf("%d", &matriz[i][j]);

            if (matriz[i][j] > 10) {
                count++;
            }
        }
    }

    printf("\nQuantidade de valores maiores que 10: %d\n", count);

    return 0;
}
