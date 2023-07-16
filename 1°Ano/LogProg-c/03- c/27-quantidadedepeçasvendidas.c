#include <stdio.h>
#include <stdlib.h>
int main()
{
int q[10],a,s=0;
float p[10];
printf("Digite a quantidade de pecas e seus respectivos precos:\n");
for (a=0;a<10;a++)
{
printf("\nPeca %d\nQuantidade:",a+1);
scanf("%d",&q[a]);
printf("Preco:");
scanf("%f",&p[a]);
s+=q[a];
}
printf("A soma total de pecas vendidas foi %d \n O valor obtido por peca foi:\n",s);
for (a=0;a<10;a++)
printf("Peca %d : %.2f \n",a+1,q[a]*p[a]);
return 0;
}