/*
Identificação: Gilmar da Silva
Matéria: Lógica de Programação
Arquivo de estudo: 01-Atv-ReceberEMostrarDados.c
Explicação: entrada de dados alimenta o algoritmo; vetores e strings usam índices.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
#include <stdio.h>

int main() {
    char disciplina[50];
    int ra;
    float nota1, nota2;

    // Solicita os dados do usuário
    printf("Digite o nome da disciplina: ");
    fgets(disciplina, sizeof(disciplina), stdin);

    printf("Digite o RA: ");
    scanf("%d", &ra);

    printf("Digite a nota da primeira prova: ");
    scanf("%f", &nota1);

    printf("Digite a nota da segunda prova: ");
    scanf("%f", &nota2);

    // Exibe as informações digitadas
    printf("\n=== Dados Digitados ===\n");
    printf("Disciplina: %s", disciplina);
    printf("RA: %d\n", ra);
    printf("Nota da primeira prova: %.2f\n", nota1);
    printf("Nota da segunda prova: %.2f\n", nota2);

    return 0;
}
