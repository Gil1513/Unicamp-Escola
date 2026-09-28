/*
Identificação: Gilmar da Silva
Matéria: Lógica de Programação
Arquivo de estudo: 13-tabuada.c
Explicação: entrada de dados alimenta o algoritmo; laços repetem o processamento.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
#include <stdio.h>

int main() {
    int numero;

    printf("Digite um numero: ");
    scanf("%d", &numero);

    printf("Tabuada do %d:\n", numero);
    for (int i = 1; i <= 10; i++) {
        printf("%d X %d = %d\n", numero, i, numero * i);
    }

    return 0;
}
