/*
Identificação: Gilmar da Silva
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: Polimorfismo.java
Explicação: classes agrupam dados e comportamentos.
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
 * @author Gilmar da Silva
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Pessoa p1 = new Pessoa();
     Aluno a1 = new Aluno();
     
     //polimorfismo
     Pessoa p2 = new Aluno();
     p2.mostraDados();
        System.out.println(a1.calculaMedia(10,8));
    
    Pessoa p3 = new Aluno();
    Aluno a3 = (Aluno) p3;
    System.out.println(a3.calculaMedia(2,5));
    
    if(p3 instanceof Aluno)
            System.out.println("è instancia");
    else
            System.out.println("Não é instância");
    }
    
}
