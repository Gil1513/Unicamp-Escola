#include <stdio.h>
#include <stdlib.h>
int main()
{ int p=0,n=0,a,v[8],vn[8],vp[8];
printf("Digite 8 numeros inteiros: \n");
for (a=0;a<8;a++)
{
scanf("%d",&v[a]);
if (v[a]>0)
{
vp[p]=v[a];
p+=1;
}
else
{
vn[n]=v[a];
n+=1;
}
}
printf("Vetor de numeros positivos :");
for(a=0;a<p;a++)
{
printf("%d ||",vp[a]);
}
printf("\n\n Vetor de numeros negativos :");
for(a=0;a<p;a++)
{
printf("%d ||",vn[a]);
}
return 0;
}