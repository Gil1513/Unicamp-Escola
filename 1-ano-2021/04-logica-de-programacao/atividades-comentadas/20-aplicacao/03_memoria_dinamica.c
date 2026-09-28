/*
C: alocação dinâmica, ponteiros e ordenação
Gilmar da Silva — 201269
Conceitos: malloc reserva memória; verifique NULL e libere com free. Ordenação altera o vetor recebido por ponteiro.
Execute: gcc -std=c11 -Wall -Wextra 20-aplicacao/03_memoria_dinamica.c -o memoria; ./memoria
Desafio: Use uma struct Aluno e ordene por nota; explique por que não acessar o vetor depois de free.
*/

#include <stdio.h>
#include <stdlib.h>
#include <assert.h>
void ordenar(int *v,size_t n) {
    for(size_t i=1;i<n;i++) {
        int atual=v[i]; size_t j=i;
        while(j>0 && v[j-1]>atual) { v[j]=v[j-1]; j--; }
        v[j]=atual;
    }
}
int main(void) {
    size_t n=5;
    int *v=malloc(n*sizeof *v);
    if(v==NULL) { fputs("Sem memória\n",stderr); return 1; }
    int entrada[]={5,-1,3,3,0};
    for(size_t i=0;i<n;i++) v[i]=entrada[i];
    ordenar(v,n);
    assert(v[0]==-1 && v[4]==5);
    for(size_t i=1;i<n;i++) assert(v[i-1]<=v[i]);
    for(size_t i=0;i<n;i++) printf("%d ",v[i]);
    puts(""); free(v); return 0;
}
