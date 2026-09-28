/*
Identificação: Gilmar da Silva Filho
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: Aluno.java
Explicação: classes agrupam dados e comportamentos; herança e sobrescrita especializam comportamentos.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author Gilmar da Silva Filho
 */
public class Aluno extends Pessoa{

    private int RA;
    
    public void mostraDados()
    {
        System.out.println("É um aluno");
    }
    public double calculaMedia(double n1, double n2)
    {
        return(n1+n2)/2;
    }
    
    public int getRA() {
        return RA;
    }

    public void setRA(int RA) {
        this.RA = RA;
    }
}
