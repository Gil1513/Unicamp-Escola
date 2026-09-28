/*
Identificação: Gilmar da Silva Filho
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: Circuferencia.java
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
 * @author Gilmar da Silva Filho
 */
public class Circuferencia implements AreaCalculavel{
    
    private double PI;
    private double R;
    private double area;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {
        this.PI = PI;
    }

    public double getR() {
        return R;
    }

    public void setR(double R) {
        this.R = R;
    }
    
    public void calcularArea (){
       
        if (PI < 1)
        {
            throw new IllegalArgumentException("Era esperado um valor maior que 0");   
        }
        if (R < 1)
        {
            throw new IllegalArgumentException("Era esperado um valor maior que 0");
        }
        else
        {
          area = PI * (R*R);
        }
    }

    public void voidcalcularArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
