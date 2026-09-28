/*
Identificação: Gilmar da Silva
Matéria: Lógica de Programação
Arquivo de estudo: 38-matriz 6x6.c
Explicação: entrada de dados alimenta o algoritmo; decisões selecionam caminhos conforme condições; laços repetem o processamento; matrizes organizam linhas e colunas.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
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
