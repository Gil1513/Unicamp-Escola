#include<stdio.h>
#include<stdlib.h>
#include<locale.h>
void main()
{
setlocale(LC_ALL,"");
char msg[81];
int contador=0,i;
puts("Digite uma mensagem \n");
gets(msg);
for(i=0;i<81;i++)
msg[i]=toupper(msg[i]);
for(i=0;msg[i]!='\0';i++)
{
if ((msg[i]=='A') || (msg[i]=='E') || (msg[i]=='I') || (msg[i]=='O') || (msg[i]=='U'))
contador++;
}
printf("Essa mensagem possui %d vogais \n",contador);
}