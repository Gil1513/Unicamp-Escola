/*
Identificação: Gilmar da Silva Filho
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: Quadrado.java
Explicação: classes agrupam dados e comportamentos; herança e sobrescrita especializam comportamentos; interfaces definem contratos.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculaesfere;

/**
 *
 * @author Gilmar da Silva Filho
 */
public class Quadrado extends FomaGeometrica implements Calcula, IBiodimensional {

    private double lado;
    
    @Override
    public double calcArea() {
       
       return lado*lado;
    }

    @Override
    public double calcerimetro() {
        System.out.println(lado*4);
        return lado*4;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calSeccao() {
       return 0;
    }

    @Override
    public void mostrar() {
        System.out.println("é um quadrado");
    }

    @Override
    public void ehBiodimensional() {
        System.out.println("Bidimensional");
    }
    
}
