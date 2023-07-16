#include <stdio.h>

int main() {
    float salario, somaSalarios = 0, maiorSalario = 0;
    int numFilhos, totalPessoas = 0, numPessoasAte320 = 0;
    float mediaSalarios, mediaFilhos;
    float porcentagemPessoasAte320;

    do {
        printf("Digite o salario da pessoa (ou 0 para encerrar): ");
        scanf("%f", &salario);

        if (salario > 0) {
            printf("Digite o numero de filhos: ");
            scanf("%d", &numFilhos);

            somaSalarios += salario;
            totalPessoas++;

            if (salario > maiorSalario) {
                maiorSalario = salario;
            }

            if (salario <= 320) {
                numPessoasAte320++;
            }
        }
    } while (salario > 0);

    if (totalPessoas > 0) {
        mediaSalarios = somaSalarios / totalPessoas;
        mediaFilhos = (float) numFilhos / totalPessoas;
        porcentagemPessoasAte320 = (float) numPessoasAte320 / totalPessoas * 100;

        printf("Media dos salarios: R$ %.2f\n", mediaSalarios);
        printf("Media do numero de filhos: %.2f\n", mediaFilhos);
        printf("Maior salario: R$ %.2f\n", maiorSalario);
        printf("Porcentagem de pessoas com salario ate R$ 320,00: %.2f%%\n", porcentagemPessoasAte320);
    } else {
        printf("Nenhum dado cadastrado.\n");
    }

    return 0;
}
