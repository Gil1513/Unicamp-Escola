/*
Identificação: Gilmar da Silva
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: Exethrow_2.java
Explicação: classes agrupam dados e comportamentos; exceções tratam falhas durante a execução.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exethrow_2;

/**
 *
 * @author Gilmar da Silva
 */
public class Exethrow_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        
        try
        {
        a1.setNome("nome");
        }
        catch(StringVaziaException e)
        {
            System.out.println(e.getMenssage());
        }
        catch(RuntimeException e)
        {
            e.printStackTrace();
        }
        //System.out.println("===" + a1.getNome());
        
        try
        {
        a1.setRa(-1);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
        catch (RuntimeException e)
        {
            System.out.println("Errroooo");
        }            
        System.out.println(a1.getRa());
        System.out.println("Término do programa");
    }
    
}
