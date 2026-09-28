/*
Identificação: Gilmar da Silva Filho
Matéria: Lógica de Programação
Arquivo de estudo: 11-semana.c
Explicação: entrada de dados alimenta o algoritmo; decisões selecionam caminhos conforme condições.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
int main()
{
setlocale(LC_ALL,"portuguese");
int x;
printf("Digite um número entre 1 e 7 :");
scanf("%d",&x);
switch(x)
{
case 1: printf("Domingo");
break;
case 2: printf("Segunda-feira");
break;
case 3: printf("Terça-feira");
break;
case 4: printf("Quarta-feira");
break;
case 5: printf("Quinta-feira");
break;
case 6: printf("Sexta-feira");
break;
case 7: printf("Sábado");
break;
default:printf("Valor inválido");
}
return 0;
}