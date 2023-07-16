#include <stdio.h>
int main() {
int cont;
for(cont=1 ; cont<=1000000 ; cont++)
if((cont%11==0) && (cont%13==0) && (cont%17==0))
{
printf("O numero e: %d",cont);
break;
}
}