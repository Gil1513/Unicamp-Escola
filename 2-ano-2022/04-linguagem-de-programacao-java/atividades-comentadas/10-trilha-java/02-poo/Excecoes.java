/* 07 — Exceções e recuperação
Gilmar da Silva — 201269
Conceitos: Exceção comunica uma falha; capture o tipo específico. Uma regra de domínio pode definir sua própria exceção.
Atividade: execute, explique a saída e resolva o desafio.
Desafio: Trate saque zero e negativo; não use catch(Exception) para esconder erros de programação.
*/

public class Excecoes {
    static class SaldoInsuficiente extends Exception {
        SaldoInsuficiente() { super("Saldo insuficiente"); }
    }
    static int sacar(int saldo, String entrada) throws SaldoInsuficiente {
        int valor = Integer.parseInt(entrada);
        if (valor <= 0) throw new IllegalArgumentException("Saque deve ser positivo");
        if (valor > saldo) throw new SaldoInsuficiente();
        return saldo - valor;
    }
    public static void main(String[] args) throws Exception {
        if (sacar(100, "30") != 70) throw new AssertionError();
        try { sacar(100, "200"); throw new AssertionError(); }
        catch (SaldoInsuficiente e) { System.out.println(e.getMessage()); }
        try { sacar(100, "abc"); throw new AssertionError(); }
        catch (NumberFormatException e) { System.out.println("Digite um número inteiro"); }
    }
}
