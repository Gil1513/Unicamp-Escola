#include<stdio.h>
#include<stdlib.h>
#include<locale.h>
#include<string.h>
void main()
{
setlocale(LC_ALL,"");
char nome[51];
int x,tamanho;
printf("Digite um nome \n");
gets(nome);
tamanho=strlen(nome);
for(x=tamanho-1;x>=0;x--) // tamanho-1 para desconsiderar o "\0"
printf("%c",nome[x]);
}