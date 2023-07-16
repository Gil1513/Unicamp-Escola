#include <stdio.h>
#include <stdlib.h>
#define MAX 3
typedef struct
{
    int codigo[MAX];
    int topo;
} PILHA;
int estaVazia(PILHA pilha)
{
    return (pilha.topo == 0);
}
int estaCheia(PILHA pilha)
{
    return (pilha.topo == MAX);
}
void empilha(int codContainer, PILHA *pilha)
{
    if (estaCheia(*pilha))
        printf("\n\n Erro - pilha cheia");
    else
    {
        pilha->codigo[pilha->topo] = codContainer;
        pilha->topo++;
    }
}
int desempilha(PILHA *pilha)
{
    int codContainer = 0;
    if (estaVazia(*pilha))
        printf("\n\n Erro - pilha vazia");
    else
    {
        pilha->topo--;
        codContainer = pilha->codigo[pilha->topo];
    }
    return codContainer;
}
int retornaTopo(PILHA pilha)
{
    return pilha.topo;
}
void mostraPilha(PILHA pilha)
{
    int i;
    if (!(estaVazia(pilha)))
    {
        printf("\n");
        for (i = pilha.topo - 1; i >= 0; i--)
        {
            printf("\n%d", pilha.codigo[i]);
        }
    }
}

int main(int argc, char *argv[])
{
    int codContainer, topo1, topo2, op, container;
    PILHA pilha1, pilha2; // vetor que representa pilha
    pilha1.topo = 0;
    pilha2.topo = 0;
    printf("\n\ndigite\n 1 para empilhar\n 2 para desempilhar\n 0 para sair\n ");
    scanf("%d", &op);
    while (op != 0)
    {
        if (op == 1)
        {
            if ((!estaCheia(pilha1)) || (!estaCheia(pilha2)))
            {
                printf("\nDigite o codigo do container");
                scanf("%d", &codContainer);
                topo1 = retornaTopo(pilha1);
                topo2 = retornaTopo(pilha2);
                if (topo1 < topo2)
                    empilha(codContainer, &pilha1);
                else
                    empilha(codContainer, &pilha2);
                printf("\n\n*******************\nmostrando pilha 1");
                mostraPilha(pilha1);
                printf("\n\n*******************\nmostrando pilha 2");
                mostraPilha(pilha2);
            }
            else
                printf("\nNao ha· espacoo para empilhar");
        }
        else
        {
            if ((!estaVazia(pilha1)) || (!estaVazia(pilha2)))
            {
                printf("\nDigite o codigo do container");
                scanf("%d", &codContainer);
                if ((pilha1.codigo[pilha1.topo - 1]) == codContainer)
                    container = desempilha(&pilha1);
                else if ((pilha2.codigo[pilha2.topo - 1]) == codContainer)
                    container = desempilha(&pilha2);
                else
                    printf("\nEste container deve estar no topo da pilha para ser desempilhado");

                printf("\n\n*******************\nmostrando pilha 1");
                mostraPilha(pilha1);
                printf("\n\n*******************\nmostrando pilha 2");
                mostraPilha(pilha2);
            }
            else
                printf("\n\nNao ha containers para desempilhar");
        }
        printf("\n\ndigite\n 1 para empilhar\n 2 para desempilhar\n 0 para sair\n ");
        scanf("%d", &op);
    }
}