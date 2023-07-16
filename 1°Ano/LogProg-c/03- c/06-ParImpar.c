#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(void)
{
    setlocale(LC_ALL, "");
    int a;

    printf("Insira um numero inteiro:");
    scanf("%d", &a);

    if (a % 2 == 0)
        printf("Voce inseriu um numero par!\n");

    else
        printf("Voce inseriu um numero impar!\n");
    return 0;
}