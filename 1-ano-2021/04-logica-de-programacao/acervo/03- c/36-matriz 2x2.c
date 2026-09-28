/*
Identificação: Gilmar da Silva Filho
Matéria: Lógica de Programação
Arquivo de estudo: 36-matriz 2x2.c
Explicação: entrada de dados alimenta o algoritmo; laços repetem o processamento; matrizes organizam linhas e colunas.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
#include <stdio.h>

int main() {
    int matriz[2][2];
    int soma = 0;

    printf("Preencha a matriz 2x2:\n");

    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 2; j++) {
            printf("Digite o valor da posicao [%d][%d]: ", i, j);
            scanf("%d", &matriz[i][j]);
            soma += matriz[i][j];
        }
    }

    printf("\nValores da matriz:\n");

    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 2; j++) {
            printf("%d ", matriz[i][j]);
        }
        printf("\n");
    }

    printf("\nSoma de todos os valores: %d\n", soma);

    return 0;
}
