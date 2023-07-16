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