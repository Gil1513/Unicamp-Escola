/*
Identificação: Gilmar da Silva
Matéria: Lógica de Programação
Arquivo de estudo: 33-quantasletrastem.c
Explicação: entrada de dados alimenta o algoritmo; vetores e strings usam índices.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
#include<stdio.h>
#include<stdlib.h>
#include<locale.h>
#include<string.h>
void main()
{
setlocale(LC_ALL,"");
char nome[15];
printf("Digite um nome \n");
gets(nome);
printf("Esse nome possui %d letras \n",strlen(nome));
}