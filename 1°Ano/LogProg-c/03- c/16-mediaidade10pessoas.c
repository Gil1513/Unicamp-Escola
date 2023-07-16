#include <stdio.h>

int main() {
    int idade, somaIdades = 0;
    int maiorIdade = 0, menorIdade = 0;
    float mediaIdades;
    int totalPessoas = 10;

    for (int i = 1; i <= totalPessoas; i++) {
        printf("Digite a idade da pessoa %d: ", i);
        scanf("%d", &idade);

        somaIdades += idade;

        if (i == 1) {
            maiorIdade = idade;
            menorIdade = idade;
        } else {
            if (idade > maiorIdade) {
                maiorIdade = idade;
            }
            if (idade < menorIdade) {
                menorIdade = idade;
            }
        }
    }

    mediaIdades = (float) somaIdades / totalPessoas;

    printf("Media de idade: %.2f\n", mediaIdades);
    printf("Maior idade: %d\n", maiorIdade);
    printf("Menor idade: %d\n", menorIdade);

    return 0;
}
