/*
Identificação: Gilmar da Silva
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: AlunoController.java
Explicação: classes agrupam dados e comportamentos; coleções armazenam múltiplos objetos; controladores coordenam requisições e regras.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Aluno;
import model.DAO.AlunoDAO;

/**
 *
 * @author Gilmar da Silva
 */
public class AlunoController {

    private ArrayList<Aluno> listaAluno;

    public AlunoController() {
        listaAluno = new ArrayList<>();
    }

    public void cadastrarAluno(int ra, String nome) throws SQLException {
        Aluno a = new Aluno(ra, nome);
        //listaAluno.add(al);
        AlunoDAO aldao = new AlunoDAO();
        aldao.inserirAluno(a);
    }

    public ArrayList<Aluno> buscarTodosAlunos() {
        return listaAluno;
    }
    
    public void excluirAluno(int ra) throws SQLException {
        AlunoDAO alDao = new  AlunoDAO();
        alDao.excluir(ra);
    }
    /*
    public Aluno buscarAluno(int ra) {
        return aluno;
    }
    */
}
