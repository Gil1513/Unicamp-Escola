#include <stdio.h>
#include <stdlib.h>
int main()
{ int k=0,b,a,n[15];
char v[10],notas[150];
float p=0;
printf("Digite o gabarito :\n");
for (a=0;a<10;a++)
{
scanf("%s",&v[a]);
}
printf("\n Digite o numero de cada aluno :\n");
for (a=0;a<15;a++)
{
scanf("%d",&n[a]);
}
for (a=0;a<15;a++)
{
printf("\n Digite as respostas do aluno %d \n",n[a]);
for (b=0;b<10;b++)
{
scanf("%s",&notas[b]);
if (notas[b]==v[b])
k+=1;
}
printf(" \n Nota : %d ",k);
if (k>=6)
p=p+1;
k=0;
}
p=(p*100)/15;
printf("\n A porcentagem de alunos aprovados foi : %.2f",p);
return 0;
}