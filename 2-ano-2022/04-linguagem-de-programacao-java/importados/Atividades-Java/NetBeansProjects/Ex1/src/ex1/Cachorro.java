/*
Identificação: Gilmar da Silva
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: Cachorro.java
Explicação: classes agrupam dados e comportamentos; herança e sobrescrita especializam comportamentos.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

/**
 *
 * @author Gilmar da Silva
 */
public class Cachorro extends Animal {

    private boolean correr;

    public void animalSom(){
        System.out.println("AuAu");
    }
    
    public boolean getCorrer() {
        return correr;
    }

    public void setCorrer(boolean correr) {
        this.correr = correr;
    }
    
    
}
