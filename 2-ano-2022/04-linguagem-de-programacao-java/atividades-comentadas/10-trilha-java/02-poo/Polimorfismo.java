/* 06 — Herança, interface e polimorfismo
Gilmar da Silva — 201269
Conceitos: Uma referência da interface chama a implementação concreta. Use super para reaproveitar a construção do estado herdado.
Atividade: execute, explique a saída e resolva o desafio.
Desafio: Adicione Seminario sem alterar o laço; explique quando composição seria mais adequada que herança.
*/

import java.util.List;
public class Polimorfismo {
    interface Avaliavel { int pontos(); }
    static abstract class Atividade implements Avaliavel {
        private final String titulo;
        Atividade(String titulo) { this.titulo = titulo; }
        String titulo() { return titulo; }
    }
    static class Prova extends Atividade {
        private final int acertos;
        Prova(int acertos) { super("Prova"); this.acertos = acertos; }
        @Override public int pontos() { return acertos * 2; }
    }
    static class Projeto extends Atividade {
        Projeto() { super("Projeto"); }
        @Override public int pontos() { return 10; }
    }
    public static void main(String[] args) {
        List<Avaliavel> atividades = List.of(new Prova(3), new Projeto());
        int total = 0; for (Avaliavel atividade : atividades) total += atividade.pontos();
        if (total != 16) throw new AssertionError();
        System.out.println("Pontuação: " + total);
    }
}
