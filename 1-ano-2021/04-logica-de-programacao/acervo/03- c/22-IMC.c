/*
Identificação: Gilmar da Silva Filho
Matéria: Lógica de Programação
Arquivo de estudo: 22-IMC.c
Explicação: entrada de dados alimenta o algoritmo; decisões selecionam caminhos conforme condições.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
#include <stdio.h>

int main() {
    float peso, altura, imc;

    printf("Digite o peso (em kg): ");
    scanf("%f", &peso);

    printf("Digite a altura (em metros): ");
    scanf("%f", &altura);

    imc = peso / (altura * altura);

    if (imc > 30) {
        printf("Obesidade: IMC = %.2f\n", imc);
    } else {
        printf("Peso normal: IMC = %.2f\n", imc);
    }

    return 0;
}
