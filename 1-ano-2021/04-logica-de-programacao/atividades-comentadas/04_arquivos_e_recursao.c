/*
Arquivos e função recursiva
Autor: Gilmar da Silva Filho
Matéria: Lógica de Programação
Material complementar de revisão; não é uma reprodução das aulas de 2021–2023.
Conceitos: Recursão precisa de um caso base e de avanço até ele. Arquivos têm operações de abertura, escrita, leitura e fechamento; sempre verifique erros.
Objetivo: Gravar e recuperar o fatorial de 5 em arquivo temporário, exibindo 120.
Execução (nesta pasta): gcc -std=c11 -Wall -Wextra 04_arquivos_e_recursao.c -o arquivos; ./arquivos
Pratique: Explique por que restringir o argumento evita estouro de unsigned long long.
*/
#include <stdio.h>
unsigned long long fatorial(unsigned n) {
    return n < 2 ? 1 : n * fatorial(n - 1);
}
int main(void) {
    unsigned n = 5;
    if (n > 20) return 1;
    FILE *arquivo = tmpfile();
    if (!arquivo) return 1;
    if (fprintf(arquivo, "%llu\n", fatorial(n)) < 0) { fclose(arquivo); return 1; }
    rewind(arquivo);
    unsigned long long lido;
    int ok = fscanf(arquivo, "%llu", &lido) == 1;
    fclose(arquivo);
    if (!ok) return 1;
    printf("Fatorial: %llu\n", lido);
    return 0;
}
