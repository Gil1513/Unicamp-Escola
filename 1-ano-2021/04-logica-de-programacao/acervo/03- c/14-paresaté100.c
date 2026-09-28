/*
Identificação: Gilmar da Silva
Matéria: Lógica de Programação
Arquivo de estudo: 14-paresaté100.c
Explicação: laços repetem o processamento.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
#include <stdio.h>

int main() {
    printf("Numeros pares ate 100:\n");
    for (int i = 2; i <= 100; i += 2) {
        printf("%d\n", i);
    }

    return 0;
}
