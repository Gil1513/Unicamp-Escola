/*
Identificação: Gilmar da Silva Filho
Matéria: Lógica de Programação
Arquivo de estudo: 44-MedidadoLadodoQuadrado.c
Explicação: entrada de dados alimenta o algoritmo; ponteiros permitem acessar valores por endereço.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
#include <stdio.h>
#include <math.h>

void calcularQuadrado(float lado, float *area, float *perimetro, float *diagonal) {
    *area = lado * lado;
    *perimetro = 4 * lado;
    *diagonal = lado * sqrt(2);
}

int main() {
    float lado, area, perimetro, diagonal;

    printf("Digite o lado do quadrado: ");
    scanf("%f", &lado);

    calcularQuadrado(lado, &area, &perimetro, &diagonal);

    printf("Area do quadrado: %.2f\n", area);
    printf("Perimetro do quadrado: %.2f\n", perimetro);
    printf("Diagonal do quadrado: %.2f\n", diagonal);

    return 0;
}
