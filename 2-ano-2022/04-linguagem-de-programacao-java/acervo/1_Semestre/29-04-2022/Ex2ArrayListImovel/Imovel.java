/*
Identificação: Gilmar da Silva Filho
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: Imovel.java
Explicação: classes agrupam dados e comportamentos.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
public class Imovel {
  private String endereco;
  private double preco;

  public Imovel() {
    this.endereco = "Av. Costa e Silva";
    this.preco = 256;
  }

  public Imovel(String endereco, double preco) {
    this.endereco = endereco;
    this.preco = preco;
  }
  
  public void imprimeImovel() {
    System.out.println("\nOs dados do imovel são: \n Endereco: " + this.endereco + "\n Preço: " + this.preco);
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public String getEndereco() {
    return this.endereco;
  }

  public double getPreco() {
    return this.preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }
  
}