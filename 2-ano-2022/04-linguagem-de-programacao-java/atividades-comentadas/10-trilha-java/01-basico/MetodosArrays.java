/* 04 — Métodos, parâmetros, retornos, arrays e listas
Gilmar da Silva — 201269
Conceitos: Métodos isolam regras. Array tem tamanho fixo; ArrayList pode crescer. Não altere a entrada sem necessidade.
Atividade: execute, explique a saída e resolva o desafio.
Desafio: Escreva uma função que retorne o maior valor; defina o comportamento para lista vazia.
*/

import java.util.*;
public class MetodosArrays {
    static List<Integer> pares(int[] numeros) {
        List<Integer> resultado = new ArrayList<>();
        for (int numero : numeros) if (numero % 2 == 0) resultado.add(numero);
        return resultado;
    }
    static int soma(List<Integer> numeros) {
        int total = 0; for (int numero : numeros) total += numero; return total;
    }
    public static void main(String[] args) {
        int[] entrada = {1,2,3,4};
        List<Integer> saida = pares(entrada);
        if (!saida.equals(List.of(2,4)) || soma(saida) != 6 || !pares(new int[0]).isEmpty()) throw new AssertionError();
        saida.add(6);
        if (entrada.length != 4) throw new AssertionError();
        System.out.println(saida);
    }
}
