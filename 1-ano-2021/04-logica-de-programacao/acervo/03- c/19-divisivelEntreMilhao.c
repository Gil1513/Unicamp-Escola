/*
Identificação: Gilmar da Silva
Matéria: Lógica de Programação
Arquivo de estudo: 19-divisivelEntreMilhao.c
Explicação: decisões selecionam caminhos conforme condições; laços repetem o processamento.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
#include <stdio.h>
int main() {
int cont;
for(cont=1 ; cont<=1000000 ; cont++)
if((cont%11==0) && (cont%13==0) && (cont%17==0))
{
printf("O numero e: %d",cont);
break;
}
}