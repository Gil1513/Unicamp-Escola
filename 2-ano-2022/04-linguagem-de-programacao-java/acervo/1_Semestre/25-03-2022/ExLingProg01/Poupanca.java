/*
Identificação: Gilmar da Silva
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: Poupanca.java
Explicação: classes agrupam dados e comportamentos.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
public class Poupanca {
    private static double taxaJurosAnual = 0.03;
    private double saldo;

    public double calcularJurosMensais() {
        double jurosMensais = (saldo*taxaJurosAnual)/12;
        saldo += jurosMensais;
        return jurosMensais;
    }

    public static void modificaTaxaJuro(double novoValorTaxaJurosAnual) {
        taxaJurosAnual = novoValorTaxaJurosAnual;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}