/*
Identificação: Gilmar da Silva
Matéria: Lógica de Programação
Arquivo de estudo: 41-5alunos(vetor).c
Explicação: entrada de dados alimenta o algoritmo; laços repetem o processamento; vetores e strings usam índices; estruturas agrupam campos relacionados.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
#include<stdlib.h>
#include<stdio.h>
#include<conio.h>
struct Aluno
{
char nome[50],
email[50];
float notas[5];
} alunos[5];
int main()
{
int cont, cont2;
float soma;
for(cont=0; cont < 5; cont++)
{
printf("Nome: ");
gets(alunos[cont].nome);
printf("Email: ");
gets(alunos[cont].email);
for(cont2=0; cont2 < 5; cont2++) {
printf("\nNota %d: ", cont2);
scanf("%f", &alunos[cont].notas[cont2]);
}
getchar();//limpa o buffer
}
for(cont=0; cont < 5; cont++)
{
printf("Nome: %s", alunos[cont].nome);
printf("\nEmail: %s", alunos[cont].email);
soma = 0;
for(cont2=0; cont2 < 5; cont2++) {
soma += alunos[cont].notas[cont2];
}
printf("\nMedia: %f", soma/5);

}
return 0;
}