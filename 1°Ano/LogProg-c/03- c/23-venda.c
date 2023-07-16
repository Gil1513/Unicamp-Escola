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
