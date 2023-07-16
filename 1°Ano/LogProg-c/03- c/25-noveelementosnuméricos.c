#include<stdio.h>
#include<stdlib.h>
#include<locale.h>
int main()
{
setlocale(LC_ALL,"");
int v[9],i;
printf("Digite nove números \n");
for(i=0;i<9;i++)
scanf("%d",&v[i]);
for(i=0;i<8;i++)
{
if (v[i]%2==0)
printf("Número %d é par e sua posição é %d \n",v[i],i);
}
return 0;
}