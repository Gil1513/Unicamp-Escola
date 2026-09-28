/*
Identificação: Gilmar da Silva
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: Calcula.java
Explicação: interfaces definem contratos.
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
 * @author Gilmar da Silva
 */
public interface Calcula {
    public double calcArea();
    public double calcerimetro();
    public double calSeccao();
    public void mostrar();
}
