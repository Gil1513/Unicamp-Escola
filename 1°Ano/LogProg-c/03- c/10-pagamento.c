#include<stdio.h>
#include<locale.h>
#include<ctype.h> //biblioteca necessária para usar toupper
int main()
{
float valor, desconto, valorFinal;
char opcao;
setlocale(LC_ALL,"Portuguese");
printf(" Informe o valor do produto: ");
scanf("%f",&valor);
printf("\t Forma de pagamento: ");
printf("\n V - À vista ");
printf("\n P - A prazo ");
printf("\n Escolha a forma de pagamento: ");
scanf(" %c",&opcao);//colocar o espaço antes do formatador para desconsiderar o enter anterior

opcao=toupper(opcao);//converte o caractere digitado em maiúsculo
switch(opcao)
{
case 'V':
desconto=valor*0.1;
valorFinal=valor-desconto;
printf("\n O total a pagar à vista = R$ %.2f",valorFinal);
break;
case 'P':
printf("\n O total a pagar a prazo = R$ %.2f", valor);
break;
default:
printf(" \n Forma de pagamento inválida");
}
return 0;
}