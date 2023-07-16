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
