#include <stdio.h>

int main() {
    char nome[50];
    float nota1, nota2, nota3;
    float media;

    printf("Digite o nome do aluno: ");
    fgets(nome, sizeof(nome), stdin);

    printf("Digite a primeira nota: ");
    scanf("%f", &nota1);

    printf("Digite a segunda nota: ");
    scanf("%f", &nota2);

    printf("Digite a terceira nota: ");
    scanf("%f", &nota3);

    media = (nota1 + nota2 + nota3) / 3;

    printf("Aluno: %s", nome);
    printf("Media: %.2f\n", media);

    return 0;
}
