/*
Identificação: Gilmar da Silva
Matéria: Lógica de Programação
Arquivo de estudo: 05-lucroEmpresa.c
Explicação: entrada de dados alimenta o algoritmo.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
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
