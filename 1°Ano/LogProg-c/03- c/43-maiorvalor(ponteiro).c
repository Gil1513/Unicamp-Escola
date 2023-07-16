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