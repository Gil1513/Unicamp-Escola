/*
Identificação: Gilmar da Silva Filho
Matéria: Lógica de Programação
Arquivo de estudo: 02-distanciaPercoCarro.c
Explicação: acompanhe os dados de entrada, as operações e o resultado do exemplo.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
#include <stdio.h>

int main() {
    int quilometragemInicial = 200000;
    int quilometragemFinal = 205701;
    int distanciaPercorrida;

    distanciaPercorrida = quilometragemFinal - quilometragemInicial;

    printf("Distancia percorrida: %d km\n", distanciaPercorrida);

    return 0;
}
