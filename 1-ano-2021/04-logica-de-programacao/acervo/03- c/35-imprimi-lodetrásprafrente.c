/*
Identificação: Gilmar da Silva
Matéria: Lógica de Programação
Arquivo de estudo: 35-imprimi-lodetrásprafrente.c
Explicação: entrada de dados alimenta o algoritmo; laços repetem o processamento; vetores e strings usam índices.
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
char nome[51];
int x,tamanho;
printf("Digite um nome \n");
gets(nome);
tamanho=strlen(nome);
for(x=tamanho-1;x>=0;x--) // tamanho-1 para desconsiderar o "\0"
printf("%c",nome[x]);
}