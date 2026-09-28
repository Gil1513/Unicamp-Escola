/*
Identificação: Gilmar da Silva
Matéria: Lógica de Programação
Arquivo de estudo: 17-fatorialdo-while.c
Explicação: entrada de dados alimenta o algoritmo; decisões selecionam caminhos conforme condições; laços repetem o processamento.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
#include <stdio.h>

int main()
{
    int numero;
    int fatorial = 1;

    do
    {
        printf("Digite um numero positivo: ");
        scanf("%d", &numero);

        if (numero < 0)
        {
            printf("Erro: Numero negativo nao possui fatorial.\n");
        }
    } while (numero < 0);

    for (int i = 1; i <= numero; i++)
    {
        fatorial *= i;
    }

    printf("%d! = %d\n", numero, fatorial);

    return 0;
}
