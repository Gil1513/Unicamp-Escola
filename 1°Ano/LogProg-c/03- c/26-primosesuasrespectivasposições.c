#include<stdio.h>
#include<stdlib.h>
#include<locale.h>
int main(void)
{
setlocale(LC_ALL,"");
int v[9],ContDiv[9],i,aux=1,QtdDiv=0;
printf("Digite nove números \n");
for(i=0;i<9;i++)
scanf("%d",&v[i]);
for(i=0;i<9;i++)
{
while(aux<=v[i])
{
if(v[i]%aux==0)
QtdDiv+=1; //essa ação será executada se o resto for zero
aux++; //essa ação está fora do if e será executada de qualquer forma
}
ContDiv[i]=QtdDiv;
aux=1;
QtdDiv=0;
}
for(i=0;i<9;i++)
{
if(ContDiv[i]==2)
printf("%d é um número primo e está na posição %d \n",v[i],i);
}
}