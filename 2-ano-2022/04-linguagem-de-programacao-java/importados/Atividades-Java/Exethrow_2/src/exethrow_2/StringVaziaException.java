/*
Identificação: Gilmar da Silva
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: StringVaziaException.java
Explicação: classes agrupam dados e comportamentos; herança e sobrescrita especializam comportamentos.
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
public class StringVaziaException extends RuntimeException{
   
    
    public String getMenssage()
    {
            return "A string (nome) não pode ser vazia";
    }
}
