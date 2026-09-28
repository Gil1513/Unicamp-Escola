/*
Identificação: Gilmar da Silva Filho
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: Poupanca.java
Explicação: classes agrupam dados e comportamentos; herança e sobrescrita especializam comportamentos.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
public class Poupanca extends Conta {
    private double taxa;

    @Override
    public void mostra() {
        System.out.println("É UMA POUPANÇA !!");
    }

    public double getTaxa() {
        return this.taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
}
