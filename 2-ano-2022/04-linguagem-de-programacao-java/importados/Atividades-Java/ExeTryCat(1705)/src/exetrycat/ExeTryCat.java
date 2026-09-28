/*
Identificação: Gilmar da Silva
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: ExeTryCat.java
Explicação: classes agrupam dados e comportamentos; exceções tratam falhas durante a execução.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exetrycat;

/**
 *
 * @author Gilmar da Silva
 */
public class ExeTryCat {

    public static void aumentarLetra()
    {
        String teste = "Rapaizzzzzzz";
        try
        {
            
        System.out.println(teste.toUpperCase());
        }
        catch (NullPointerException e)
        {
            System.out.println("Descilpe! " + "A string não pode ser null");
        }
        finally{
            System.out.println("Finish Progam");
        }
    }
    
    public static void main(String[] args) {
        aumentarLetra();

    }

    }
