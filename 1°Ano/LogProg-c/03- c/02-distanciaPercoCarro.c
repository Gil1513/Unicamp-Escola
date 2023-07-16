#include <stdio.h>

int main() {
    int quilometragemInicial = 200000;
    int quilometragemFinal = 205701;
    int distanciaPercorrida;

    distanciaPercorrida = quilometragemFinal - quilometragemInicial;

    printf("Distancia percorrida: %d km\n", distanciaPercorrida);

    return 0;
}
