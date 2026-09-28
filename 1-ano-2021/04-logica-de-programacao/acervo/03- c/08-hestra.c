/*
Identificação: Gilmar da Silva Filho
Matéria: Lógica de Programação
Arquivo de estudo: 08-hestra.c
Explicação: entrada de dados alimenta o algoritmo; decisões selecionam caminhos conforme condições; vetores e strings usam índices.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
int main(void)
{
    setlocale(LC_ALL, "");
    char nome[30];
    float ht, sh, sal, hextra;
    printf("Digite seu nome:");
    gets(nome);
    printf("Digite o valor do salário hora:");
    scanf("%f", &sh);
    printf("Digite o número de horas trabalhadas");
    scanf("%f", &ht);

    if (ht <= 8)
        sal = ht * sh;
    else
    {
        hextra = ht - 8;
        sal = sh * 8 + hextra * sh * 1.50;
    }
    printf("%s seu salário é R$%.2f\n", nome, sal);
    return 0;
}