#include <stdio.h>

int main()
{
    int ra, totalAlunos = 0, aprovados = 0;
    float nota1, nota2, media, somaMedias = 0;

    printf("=== Cadastro de Alunos ===\n");

    do
    {
        printf("\nDigite o RA (ou 0 para encerrar): ");
        scanf("%d", &ra);

        if (ra != 0)
        {
            printf("Digite as duas notas do aluno (0 a 10): ");
            scanf("%f %f", &nota1, &nota2);

            if (nota1 >= 0 && nota1 <= 10 && nota2 >= 0 && nota2 <= 10)
            {
                media = (nota1 + nota2) / 2;
                printf("Media do aluno: %.2f\n", media);

                somaMedias += media;
                totalAlunos++;

                if (media >= 6)
                {
                    aprovados++;
                }
            }
            else
            {
                printf("Erro: Notas invalidas!\n");
            }
        }
    } while (ra != 0);

    if (totalAlunos > 0)
    {
        float mediaTurma = somaMedias / totalAlunos;

        printf("\n=== Relatorio ===\n");
        printf("Media da turma: %.2f\n", mediaTurma);
        printf("Alunos aprovados: %d\n", aprovados);
    }
    else
    {
        printf("\nNenhum aluno cadastrado.\n");
    }

    return 0;
}
