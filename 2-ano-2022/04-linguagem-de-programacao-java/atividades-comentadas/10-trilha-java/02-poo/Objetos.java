/* 05 — Classes, objetos, construtores e encapsulamento
Gilmar da Silva — 201269
Conceitos: Cada objeto tem seu estado. O construtor estabelece invariantes; atributos privados são alterados por métodos que validam regras.
Atividade: execute, explique a saída e resolva o desafio.
Desafio: Crie duas instâncias e comprove que mudar a nota de uma não altera a outra.
*/

public class Objetos {
    static final class Aluno {
        private final int ra;
        private final String nome;
        private double nota;
        Aluno(int ra, String nome) {
            if (ra <= 0 || nome == null || nome.isBlank()) throw new IllegalArgumentException("Aluno inválido");
            this.ra = ra; this.nome = nome.trim();
        }
        void avaliar(double nota) {
            if (!Double.isFinite(nota) || nota < 0 || nota > 10) throw new IllegalArgumentException("Nota inválida");
            this.nota = nota;
        }
        boolean aprovado() { return nota >= 6; }
        String resumo() { return ra + " - " + nome + ": " + nota; }
    }
    public static void main(String[] args) {
        Aluno aluno = new Aluno(201269, "Gilmar da Silva");
        aluno.avaliar(8);
        if (!aluno.aprovado()) throw new AssertionError();
        try { aluno.avaliar(11); throw new AssertionError("Nota inválida aceita"); }
        catch (IllegalArgumentException esperado) { System.out.println(esperado.getMessage()); }
        System.out.println(aluno.resumo());
    }
}
