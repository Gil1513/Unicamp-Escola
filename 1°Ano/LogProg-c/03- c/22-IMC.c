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
