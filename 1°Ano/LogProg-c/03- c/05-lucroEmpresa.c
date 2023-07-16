#include <stdio.h>

int main() {
    float receitaAnual;
    float despesaAnual;
    float lucro;

    printf("Digite a receita anual da empresa: ");
    scanf("%f", &receitaAnual);

    printf("Digite a despesa anual da empresa: ");
    scanf("%f", &despesaAnual);

    lucro = receitaAnual - despesaAnual;

    printf("Lucro da empresa: %.2f\n", lucro);

    return 0;
}
