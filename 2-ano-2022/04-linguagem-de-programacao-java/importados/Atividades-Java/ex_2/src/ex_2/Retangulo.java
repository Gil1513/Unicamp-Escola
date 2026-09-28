/*
Identificação: Gilmar da Silva
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: Retangulo.java
Explicação: classes agrupam dados e comportamentos; interfaces definem contratos.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_2;

/**
 *
 * @author Gilmar da Silva
 */
public class Retangulo implements AreaCalculavel{
     private double base;
     private double h;
     private double area;
     
    
        public void calcularArea (){
       
         if (base < 1){
         throw new IllegalArgumentException("Era esperado um valor maior que 0");   
        }
         if (h < 1){
             throw new IllegalArgumentException("Era esperado um valor maior que 0");
         }
        else{
        area = base * h;
        }
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
