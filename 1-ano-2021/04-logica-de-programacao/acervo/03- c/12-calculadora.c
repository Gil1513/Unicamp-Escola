/*
Identificação: Gilmar da Silva
Matéria: Lógica de Programação
Arquivo de estudo: 12-calculadora.c
Explicação: entrada de dados alimenta o algoritmo; decisões selecionam caminhos conforme condições.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
#include <stdio.h>

int main()
{
    float num1, num2, resultado;
    char op;

    printf("Digite a expressao matematica no formato: numero1 operador numero2\n");
    scanf("%f %c %f", &num1, &op, &num2);

    switch (op)
    {
    case '+':
        resultado = num1 + num2;
        printf("Resultado: %.2f\n", resultado);
        break;
    case '-':
        resultado = num1 - num2;
        printf("Resultado: %.2f\n", resultado);
        break;
    case '*':
        resultado = num1 * num2;
        printf("Resultado: %.2f\n", resultado);
        break;
    case '/':
        if (num2 != 0)
        {
            resultado = num1 / num2;
            printf("Resultado: %.2f\n", resultado);
        }
        else
        {
            printf("Erro: Divisao por zero nao e permitida.\n");
        }
        break;
    default:
        printf("Erro: Operador invalido.\n");
        break;
    }

    return 0;
}
