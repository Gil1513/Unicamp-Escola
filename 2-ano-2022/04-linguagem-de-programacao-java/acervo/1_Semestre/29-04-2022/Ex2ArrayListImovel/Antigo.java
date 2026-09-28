/*
Identificação: Gilmar da Silva Filho
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: Antigo.java
Explicação: classes agrupam dados e comportamentos; herança e sobrescrita especializam comportamentos.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
public class Antigo extends Imovel {
  private double desconto;

  public void setDesconto(double desconto) {
    this.desconto = desconto;
  }

  public double getDesconto() {
    return this.desconto;
  }

  
}