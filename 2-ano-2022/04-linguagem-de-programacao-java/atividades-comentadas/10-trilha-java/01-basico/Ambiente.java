/* 01 — Ambiente JDK e IDE
Gilmar da Silva — 201269
Conceitos: JDK inclui javac e java; a classe pública deve ter o mesmo nome do arquivo.
Atividade: execute, explique a saída e resolva o desafio.
Desafio: Compile no terminal e execute pela IDE; coloque um breakpoint antes do primeiro println.
*/

public class Ambiente {
    public static void main(String[] args) {
        System.out.println("Gilmar da Silva — 201269");
        System.out.println("Java: " + System.getProperty("java.version"));
        System.out.println("Pasta: " + System.getProperty("user.dir"));
        if (Runtime.version().feature() < 17) throw new IllegalStateException("Use JDK 17 ou superior");
    }
}
