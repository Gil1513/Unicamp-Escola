/*
Identificação: Gilmar da Silva Filho
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: AlunoControl.java
Explicação: classes agrupam dados e comportamentos; coleções armazenam múltiplos objetos; exceções tratam falhas durante a execução.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Aluno;
import model.DAO.AlunoDAO;

/**
 *
 * @author Gilmar da Silva Filho
 */

public class AlunoControl {
   private ArrayList<Aluno> listaAluno; 
   
   public AlunoControl(){
       listaAluno = new ArrayList<>();
   }
   
   public void Cadastrar(String nome, int RA){
       Aluno a1 = new Aluno(RA, nome);
       AlunoDAO aldao = new AlunoDAO();
       try{
           aldao.inserirAluno(a1);
       } catch (SQLException ex){
          
       }
       
       
   }
   
   public ArrayList<Aluno> buscarTodosAlunos(){
       return listaAluno;
   }
   
}
