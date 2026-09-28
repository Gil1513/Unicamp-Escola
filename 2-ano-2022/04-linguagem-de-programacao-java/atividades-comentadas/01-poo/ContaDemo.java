/*
Encapsulamento, herança e polimorfismo
Autor: Gilmar da Silva
Matéria: Linguagem de Programação Multiplataforma — Java
Conceitos: Campos privados protegem invariantes. Uma subclasse especializa o cálculo de tarifa. Chamar um método pela referência da classe base executa a implementação do objeto.
Objetivo: Debitar 10 mais tarifa de 1 de uma conta com saldo 100, resultando em 89.
Execução (nesta pasta): java 01-poo/ContaDemo.java
Pratique: Crie outra conta sem tarifa e trate tentativa de saque maior que o saldo.
*/
import java.math.BigDecimal;

public class ContaDemo {
    static abstract class Conta {
        private BigDecimal saldo;
        Conta(BigDecimal saldo) {
            if (saldo.signum() < 0) throw new IllegalArgumentException("Saldo inválido");
            this.saldo = saldo;
        }
        abstract BigDecimal tarifa();
        void sacar(BigDecimal valor) {
            if (valor.signum() <= 0) throw new IllegalArgumentException("Valor deve ser positivo");
            BigDecimal debito = valor.add(tarifa());
            if (saldo.compareTo(debito) < 0) throw new IllegalArgumentException("Saldo insuficiente");
            saldo = saldo.subtract(debito);
        }
        BigDecimal saldo() { return saldo; }
    }
    static class Corrente extends Conta {
        Corrente(BigDecimal saldo) { super(saldo); }
        @Override BigDecimal tarifa() { return new BigDecimal("1.00"); }
    }
    public static void main(String[] args) {
        Conta conta = new Corrente(new BigDecimal("100.00"));
        conta.sacar(new BigDecimal("10.00"));
        System.out.println("Saldo: " + conta.saldo());
        try { conta.sacar(new BigDecimal("1000.00")); }
        catch (IllegalArgumentException e) { System.out.println(e.getMessage()); }
    }
}
