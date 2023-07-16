#include <stdio.h>
#include <locale.h>
int soma_num(int num)
{
    int resultado;
    if (num == 1)
    {
        return (1);
    }
    else
    {
        resultado = num + soma_num(num - 1);
    }
    return (resultado);
}
int main()
{
    int num_N;
    int somatorio;
    setlocale(LC_ALL, "portuguese");
    printf("\n\t Programa para calcular a somatória de todos os números de 1 a N:\n");
    printf("\n Digite o número N : ");
    scanf("%d", &num_N);         /*o número digitado vai ser guardado na memória*/
    somatorio = soma_num(num_N); /*A variável somatório está chamando a função
    soma_num*/
    printf("\n O somatório dos números de 1 até %d = %d \n", num_N, somatorio);
    return 0;
}