#include <stdio.h>

int main() {
    int anoNascimento;
    int idade, dias, horas, minutos, segundos;
    int anoAtual = 2023;

    printf("Digite o ano de nascimento: ");
    scanf("%d", &anoNascimento);

    idade = anoAtual - anoNascimento;
    dias = idade * 365;
    horas = dias * 24;
    minutos = horas * 60;
    segundos = minutos * 60;

    printf("Idade: %d anos\n", idade);
    printf("Tempo de vida:\n");
    printf("Dias: %d\n", dias);
    printf("Horas: %d\n", horas);
    printf("Minutos: %d\n", minutos);
    printf("Segundos: %d\n", segundos);

    return 0;
}
