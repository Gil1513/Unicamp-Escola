#include <stdio.h>
#include <stdlib.h>
struct dados{
int idade;
char sexo;
float salario;
int nfilhos;
};
int main () {
int i;
float somaSalario,somaFilhos;
struct dados habitante[4];
for (i=0;i<4;i++) {
printf ("Digite a sua idade:");
scanf ("%d", &habitante[i].idade);
printf ("Digite o seu sexo - F p/ Feminino e M p/ Masculino:");
scanf ("%s", &habitante[i].sexo);
printf ("Digite o seu salario:");
scanf ("%f", &habitante[i].salario);
printf ("Digite o numero de filhos:");
scanf ("%d", &habitante[i].nfilhos);
}
for (i=0;i<4;i++) {
somaSalario=somaSalario+habitante[i].salario;
somaFilhos=somaFilhos+habitante[i].nfilhos;
}
printf ("Media dos salarios: %f",somaSalario/4);
printf ("Media do numero de filhos: %f",somaFilhos/4);
system ("pause");
return 0;
}