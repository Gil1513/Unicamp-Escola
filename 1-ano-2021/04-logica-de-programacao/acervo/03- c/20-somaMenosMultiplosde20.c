/*
Identificação: Gilmar da Silva
Matéria: Lógica de Programação
Arquivo de estudo: 20-somaMenosMultiplosde20.c
Explicação: decisões selecionam caminhos conforme condições; laços repetem o processamento.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
#include <stdio.h>
int main()
{
int cont, soma=0;
for(cont=1 ; cont<=100 ; cont++)
{
if( cont%5 ==0)
continue;
soma += cont;
}
printf("Soma %d", soma);
}