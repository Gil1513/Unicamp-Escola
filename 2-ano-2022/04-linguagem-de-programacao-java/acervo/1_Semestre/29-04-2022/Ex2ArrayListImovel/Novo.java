/*
Identificação: Gilmar da Silva
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: Novo.java
Explicação: classes agrupam dados e comportamentos; herança e sobrescrita especializam comportamentos.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
public class Novo extends Imovel {
  private double valorAdicional;

  public Novo() {
    super();
    this.valorAdicional = 10;
  }

  public Novo(String endereco, double preco, double valorAdicional) {
    super(endereco, preco);
    this.valorAdicional = valorAdicional;
  }

  @Override
  public void imprimeImovel() { 
    System.out.println("\nOs dados do imovel são: \n Endereco: " + this.getEndereco() + "\n Preço: " + this.getPreco() + "\n Valor Adicional: " + valorAdicional);
  }
}