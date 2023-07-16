#include <stdio.h>
#include <stdlib.h>

int contarMultiplos(int *vetor, int tamanho, int x) {
    int contador = 0;

    for (int i = 0; i < tamanho; i++) {
        if (vetor[i] % x == 0) {
            contador++;
        }
    }

    return contador;
}

int main() {
    int N, x;

    printf("Digite a quantidade de numeros: ");
    scanf("%d", &N);

    int *vetor = (int *) malloc(N * sizeof(int));

    printf("Digite os numeros:\n");
    for (int i = 0; i < N; i++) {
        scanf("%d", &vetor[i]);
    }

    printf("Digite o numero x: ");
    scanf("%d", &x);

    int multiplos = contarMultiplos(vetor, N, x);

    printf("Vetor: ");
    for (int i = 0; i < N; i++) {
        printf("%d ", vetor[i]);
    }
    printf("\n");

    printf("Quantidade de elementos multiplos de %d: %d\n", x, multiplos);

    free(vetor);

    return 0;
}
