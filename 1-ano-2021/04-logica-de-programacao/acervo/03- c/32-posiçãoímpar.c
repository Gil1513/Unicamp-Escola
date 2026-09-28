/*
Identificação: Gilmar da Silva Filho
Matéria: Lógica de Programação
Arquivo de estudo: 32-posiçãoímpar.c
Explicação: entrada de dados alimenta o algoritmo; decisões selecionam caminhos conforme condições; laços repetem o processamento; vetores e strings usam índices.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
#include<stdio.h>
#include<stdlib.h>
#include<locale.h>
void main()
{
setlocale(LC_ALL,"");
int x;
char nome[15];
printf("Digite um nome \n");
gets(nome);
for(x=0;x<15;x++)
if(x%2!=0)
printf("%c",nome[x]);
}