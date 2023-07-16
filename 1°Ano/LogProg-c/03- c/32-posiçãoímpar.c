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