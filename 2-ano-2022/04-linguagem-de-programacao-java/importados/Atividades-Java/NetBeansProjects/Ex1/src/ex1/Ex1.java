/*
Identificação: Gilmar da Silva
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: Ex1.java
Explicação: classes agrupam dados e comportamentos.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.io.PrintStream;

/**
 *
 * @author Gilmar da Silva
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal a1 = new Cachorro();
        Animal a2 = new Cavalo();
        Animal a3 = new Preguica();
        
        a1.animalSom();
        a2.animalSom();
        a3.animalSom();
        
    }
    
}
