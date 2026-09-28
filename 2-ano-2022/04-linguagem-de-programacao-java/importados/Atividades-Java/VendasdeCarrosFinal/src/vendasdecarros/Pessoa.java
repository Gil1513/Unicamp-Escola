/*
Identificação: Gilmar da Silva
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: Pessoa.java
Explicação: classes agrupam dados e comportamentos.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendasdecarros;

/**
 *
 * @author Gilmar da Silva
 */
public abstract class Pessoa {
   
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
    	this.nome = nome;
    }
    
 
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
    	if (idade < 1) {
            throw new IllegalArgumentException("Idade invalida");
 	} else{
            this.idade = idade;
    }
    }
    public Pessoa(){
        
    }
    
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    

}
