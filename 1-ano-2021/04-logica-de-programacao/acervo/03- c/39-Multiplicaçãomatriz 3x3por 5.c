/*
Identificação: Gilmar da Silva Filho
Matéria: Lógica de Programação
Arquivo de estudo: 39-Multiplicaçãomatriz 3x3por 5.c
Explicação: entrada de dados alimenta o algoritmo; laços repetem o processamento; matrizes organizam linhas e colunas.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
#include <stdio.h>

int main() {
    int matriz[3][3];

    printf("Preencha a matriz 3x3:\n");

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            printf("Digite o valor da posicao [%d][%d]: ", i, j);
            scanf("%d", &matriz[i][j]);
            matriz[i][j] *= 5;
        }
    }

    printf("\nValores da matriz multiplicados por 5:\n");

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            printf("%d ", matriz[i][j]);
        }
        printf("\n");
    }

    return 0;
}
