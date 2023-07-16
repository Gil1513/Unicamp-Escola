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
