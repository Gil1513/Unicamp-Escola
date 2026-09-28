/*
Identificação: Gilmar da Silva
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: Ex1.java
Explicação: classes agrupam dados e comportamentos; exceções tratam falhas durante a execução.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;


public class Ex1 {
      
 public static void main(String[] args) {
        
     Object o = null;
     
     try
     {
         o.toString();
     }
     catch(NullPointerException e)
     {
         System.out.println("Erro no valor");
     }
     
   }
    
}
