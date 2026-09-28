/*
Conversão analógica e histerese
Autor: Gilmar da Silva Filho
Matéria: Desenvolvimento para Sistemas Embarcados
Material complementar de revisão; não é uma reprodução das aulas de 2021–2023.
Conceitos: Um ADC de 10 bits retorna 0 a 1023. Histerese usa limites diferentes para ligar e desligar, reduzindo oscilações próximas a um limiar. Exemplo simulado, sem hardware.
Objetivo: Manter a saída ligada entre os limiares e desligar abaixo de 400.
Execução (nesta pasta): gcc -std=c11 -Wall -Wextra 01_sensor.c -o sensor; ./sensor
Pratique: Converta a leitura em tensão para uma referência de 5 V e explique o erro de quantização.
*/
#include <stdio.h>
int atualizar(int ligado, int leitura) {
    if (leitura >= 600) return 1;
    if (leitura <= 400) return 0;
    return ligado;
}
int main(void) {
    int leituras[] = {300, 650, 500, 390}, ligado = 0;
    for (int i = 0; i < 4; i++) {
        ligado = atualizar(ligado, leituras[i]);
        printf("ADC=%d, V=%.2f, saida=%d\n", leituras[i], leituras[i] * 5.0 / 1023, ligado);
    }
    return 0;
}
