#include<stdio.h>
#include<stdlib.h>
#include<locale.h>
int main()
{
setlocale(LC_ALL,"");
int x;
char nome[15];
printf("Digite um nome \n");
gets(nome);
for(x=0;x<4;x++)
printf("%c",nome[x]);
return 0;
}