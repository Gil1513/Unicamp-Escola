/*
Identificação: Gilmar da Silva
Matéria: Lógica de Programação
Arquivo de estudo: 06-ParImpar.c
Explicação: entrada de dados alimenta o algoritmo; decisões selecionam caminhos conforme condições.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
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