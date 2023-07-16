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