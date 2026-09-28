/* 03 — if, else, switch, for e while
Gilmar da Silva — 201269
Conceitos: Condicionais selecionam caminhos; laços repetem um bloco até cumprir um limite.
Atividade: execute, explique a saída e resolva o desafio.
Desafio: Implemente um menu switch com opção inválida e tente os valores 0, 5, 6, 10 e 11.
*/

public class Fluxo {
    static String situacao(int nota) {
        if (nota < 0 || nota > 10) return "invalida";
        else if (nota >= 6) return "aprovado";
        else return "recuperacao";
    }
    static String dia(int codigo) {
        return switch(codigo) { case 1 -> "segunda"; case 2 -> "terca"; default -> "outro"; };
    }
    public static void main(String[] args) {
        int soma = 0;
        for (int n = 1; n <= 5; n++) soma += n;
        int restante = 3, tentativas = 0;
        while (restante > 0) { restante--; tentativas++; }
        if (soma != 15 || tentativas != 3 || !situacao(6).equals("aprovado")
                || !situacao(-1).equals("invalida") || !dia(2).equals("terca")) throw new AssertionError();
        System.out.println("Soma=" + soma + "; tentativas=" + tentativas);
    }
}
