/* 02 — Variáveis, tipos e strings
Gilmar da Silva — 201269
Conceitos: int é inteiro, double representa ponto flutuante, boolean guarda uma condição; strings são imutáveis.
Atividade: execute, explique a saída e resolva o desafio.
Desafio: Compare equals com == usando new String; explique divisão inteira e arredondamento.
*/

public class Sintaxe {
    public static void main(String[] args) {
        int ra = 201269, acertos = 7, questoes = 10;
        double porcentagem = 100.0 * acertos / questoes;
        boolean aprovado = porcentagem >= 60;
        String nome = "  Gilmar da Silva  ";
        String limpo = nome.trim();
        if (porcentagem != 70 || !aprovado || !limpo.equals("Gilmar da Silva")) throw new AssertionError();
        if (acertos / questoes != 0) throw new AssertionError("Divisão inteira");
        System.out.printf("%d - %s: %.1f%% (%s)%n", ra, limpo, porcentagem, aprovado);
    }
}
