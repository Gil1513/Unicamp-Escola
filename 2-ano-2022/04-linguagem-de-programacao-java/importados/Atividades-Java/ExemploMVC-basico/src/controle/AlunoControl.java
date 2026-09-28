/*
Identificação: Gilmar da Silva Filho
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: AlunoControl.java
Explicação: classes agrupam dados e comportamentos; coleções armazenam múltiplos objetos.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.ArrayList;
import model.Aluno;

/**
 *
 * @author Gilmar da Silva Filho
 */
public class AlunoControl {
    
    private ArrayList<Aluno> ListaAl;

    public AlunoControl(){
        ListaAl = new ArrayList<>();
    }
    public void cadastrarAluno (int ra,String nome){
        Aluno al = new Aluno (ra,nome);
        ListaAl.add(al);
    }
    public ArrayList<Aluno> buscarTodos(){
        return ListaAl;
        
    }
    
}
