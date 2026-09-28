/*
Identificação: Gilmar da Silva Filho
Matéria: Lógica de Programação
Arquivo de estudo: 43-maiorvalor(ponteiro).c
Explicação: entrada de dados alimenta o algoritmo; decisões selecionam caminhos conforme condições; ponteiros permitem acessar valores por endereço.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
void maiorMenor(int *maior, int *menor, int a, int b);
int main()
{
    int a, b, valMaior = 0, valMenor = 0;
    printf("digite dois valor inteiros");
    scanf("%d %d", &a, &b);
    maiorMenor(&valMaior, &valMenor, a, b);
    printf("\nmaior é: %d, menor é: %d", valMaior, valMenor);
    return 0;
}

void maiorMenor(int *maior, int *menor, int a, int b)
{
    if (a < b)
    {

        *maior = b;
        *menor = a;
    }
    else
    {

        *maior = a;
        *menor = b;
    }
}