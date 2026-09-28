/*
Bits, máscaras e registradores
Responsável: Gilmar da Silva
Conceitos: Uma máscara seleciona bits. OR liga, AND com complemento desliga, XOR alterna sem afetar os demais bits.
Execução: gcc -std=c11 -Wall -Wextra 00-fundamentos/01_bits.c -o bits; ./bits
Pratique: Reserve bits diferentes para dois sensores e um atuador.
*/
#include <stdint.h>
#include <stdio.h>
#include <assert.h>
int main(void) {
    uint8_t registrador = 0;
    const uint8_t led = 1u << 3;
    registrador |= led;
    assert((registrador & led) != 0);
    registrador ^= led;
    assert(registrador == 0);
    registrador |= 3u;
    registrador &= (uint8_t)~1u;
    assert(registrador == 2);
    printf("Registrador: %u\n", (unsigned)registrador);
    return 0;
}
