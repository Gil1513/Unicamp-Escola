#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(void)
{
    setlocale(LC_ALL, "");
    char nome[30];
    float n1, n2, n3, media;
    printf("Digite seu nome:");
    gets(nome);
    printf("Digite as notas das três provas:");
    scanf("%f %f %f", &n1, &n2, &n3);
    media = (n1 + n2 + n3) / 3;
    printf("Nome: %s\n", nome);
    printf("Prova1: %.1f\n", n1);
    printf("Prova2: %.1f\n", n2);
    printf("Prova3: %.1f\n", n3);
    printf("Média: %.1f\n", media);
    if (media >= 6)
        printf("Aprovado\n");
    else
        printf("Reprovado\n");
    return 0;
}