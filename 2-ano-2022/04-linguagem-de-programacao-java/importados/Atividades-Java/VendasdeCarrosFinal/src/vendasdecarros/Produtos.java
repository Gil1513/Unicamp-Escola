/*
Identificação: Gilmar da Silva Filho
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: Produtos.java
Explicação: classes agrupam dados e comportamentos; exceções tratam falhas durante a execução.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendasdecarros;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Gilmar da Silva Filho
 */
public class Produtos {
   
    Scanner entrada = new Scanner(System.in);
    
    private double preco;
    private String descricao;
    private String nome;
    private String cor;
    private int aro;

    public Produtos() {
        this.preco = 0.0;
        this.descricao="";
        this.nome="";
        this.cor="";
        this.aro = 0;
        
    }

    public Produtos(Double preco, String descricao, String nome, String cor, int aro) {
        this.preco = preco;
        this.descricao=descricao;
        this.nome=nome;
        this.cor=cor;
        this.aro=aro;

    }
    public void exibir(){
        System.out.println("Nome: " + this.getNome() + "\nPreço: " + this.getPreco() + "\nCor: " + this.getCor() + "\nAro: " + this.getAro() + "\nDescrição: " + this.getDescricao());
    }
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco <0){
            throw new IllegalArgumentException("valor inválido");
        }else
            this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAro() {
        return aro;
    }

    public void setAro(int aro) {
        this.aro = aro;
    }
    
    public Produtos CriarProdutos(){
        
    Produtos p1 = new Produtos();
		
    System.out.println("Digite o nome do carro: ");
    p1.setNome(entrada.nextLine());
	
        while (p1.getPreco() < 1) {	
            try {
		 System.out.println("Digite o preço do carro: ");
                  p1.setPreco(entrada.nextDouble());
		}catch (IllegalArgumentException e)
                {
                    System.out.println("Preco invalido... ");
		}catch (InputMismatchException e)
                {
                    System.out.println("Tipo de preço inválido... ");
                    entrada.nextLine();
		}
		}
            entrada.nextLine();
            System.out.println("Digite a descricao do carro: ");
            p1.setDescricao(entrada.nextLine());
            
            System.out.println("Digite a cor: ");
            p1.setCor(entrada.nextLine());
            
           while (p1.getAro() <  1) {	
            try {
		 System.out.println("Digite o aro do carro: ");
                  p1.setAro(entrada.nextInt());
            }
            catch (IllegalArgumentException e){
                    System.out.println("Aro invalido... ");
            }
            catch (InputMismatchException e)
                {
                    System.out.println("Tipo de Aro inválido... ");
                    //entrada.nextLine();
		}
	
           }
           
           return p1;
           
    }

}