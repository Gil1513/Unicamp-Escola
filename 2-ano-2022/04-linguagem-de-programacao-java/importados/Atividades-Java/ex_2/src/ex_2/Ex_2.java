/*
Identificação: Gilmar da Silva Filho
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: Ex_2.java
Explicação: classes agrupam dados e comportamentos; exceções tratam falhas durante a execução.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_2;

import java.util.Scanner;

/**
 *
 * @author Gilmar da Silva Filho
 */
public class Ex_2 {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Quadrado p = new Quadrado();
        Retangulo R = new Retangulo();
        Circuferencia C = new Circuferencia();
        
        System.out.println("Calculando a área do quadrado!\n");
        System.out.println("Digite o lado: ");
        p.setLado(entrada.nextDouble());
        
        try{
           p.calcularArea();
       }catch(IllegalArgumentException e){
           System.out.println("Digite um lado que não seja negativo!");
           System.out.println("Calculando a área do quadrado!\n");
           System.out.println("Digite o lado: ");
           p.setLado(entrada.nextDouble());
           p.calcularArea();
       }
        System.out.println(p.getLado());
        
        
        System.out.println("Calculando a área do retângulo!\n");
        System.out.println("Digite a base e a altura: ");
        R.setBase(entrada.nextDouble());
        R.setH(entrada.nextDouble());
         try{
            R.calcularArea();
         }catch(IllegalArgumentException e){
           System.out.println("Digite um número que não seja negativo!");
           System.out.println("Digite a base e a altura: ");
           R.setBase(entrada.nextDouble());
           R.setH(entrada.nextDouble());
           
           R.calcularArea();
         
       }
        System.out.println(R.getArea());
        
        System.out.println("Calculando a área da circuferencia ");
        
        System.out.println("Digite o valor de PI e o valor do Raio");
            C.setPI(entrada.nextDouble());
            C.setR(entrada.nextDouble());
        try{
            C.calcularArea();
        }catch(IllegalArgumentException e){
            System.out.println("Digite um número que não seja negativo!");
            System.out.println("Digite o valor de PI e o valor do Raio");
            C.setPI(entrada.nextDouble());
            C.setR(entrada.nextDouble());
            
            C.calcularArea();
        }
        System.out.println(C.getArea());
        
    }
    
}
