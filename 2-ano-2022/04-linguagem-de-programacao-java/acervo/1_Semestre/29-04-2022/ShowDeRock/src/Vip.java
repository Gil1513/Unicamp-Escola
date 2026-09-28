/*
Identificação: Gilmar da Silva
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: Vip.java
Explicação: classes agrupam dados e comportamentos; herança e sobrescrita especializam comportamentos.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
public class Vip extends Ingresso {
    private double valorAdicional;

<<<<<<< HEAD
    public Vip() {
        this.setValor(200);
        this.valorAdicional = 50;
    }

    public Vip(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
=======
    public double getValorAdicional() {
        return this.valorAdicional;
>>>>>>> origin/main
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
}
