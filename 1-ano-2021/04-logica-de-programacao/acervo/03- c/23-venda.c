/*
Identificação: Gilmar da Silva Filho
Matéria: Lógica de Programação
Arquivo de estudo: 23-venda.c
Explicação: entrada de dados alimenta o algoritmo; decisões selecionam caminhos conforme condições.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
#include <stdio.h>

int main() {
    float valorCompra, valorVenda;

    printf("Digite o valor da compra da garrafa de vinho: ");
    scanf("%f", &valorCompra);

    if (valorCompra < 100) {
        valorVenda = valorCompra + 50;
    } else {
        valorVenda = valorCompra + 30;
    }

    printf("Valor de venda: R$ %.2f\n", valorVenda);

    return 0;
}
