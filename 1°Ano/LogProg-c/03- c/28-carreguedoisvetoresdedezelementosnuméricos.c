#include<stdio.h>
#include<stdlib.h>
#include<locale.h>
int main()
{
setlocale(LC_ALL,"");
int s=0,p=0,x,prim[10],seg[10],terc[20];
printf("Digite dez elementos para o Vetor 01 \n");
for(x=0;x<10;x++)
scanf("%d",&prim[x]);
printf("%Digite dez elementos para o Vetor 02 \n");
for(x=0;x<10;x++)
scanf("%d",&seg[x]);
for(x=0;x<20;x++)
{
if(x%2==0)
{
terc[x]=prim[p];
p++;
}
else
{
terc[x]=seg[s];
s++;
}
}
for(x=0;x<20;x++)
printf("%d \n",terc[x]);
return 0;
}