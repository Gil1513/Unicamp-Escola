#include <stdio.h>

int main() {
    int matriz[5][5];

    printf("Preencha a matriz 5x5 com inteiros positivos:\n");

    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            printf("Digite o valor da posicao [%d][%d]: ", i, j);
            scanf("%d", &matriz[i][j]);

            if (matriz[i][j] % 2 == 0) {
                matriz[i][j] = 1;
            } else {
                matriz[i][j] = -1;
            }
        }
    }

    printf("\nValores da matriz apos a substituicao:\n");

    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            printf("%d ", matriz[i][j]);
        }
        printf("\n");
    }

    return 0;
}
