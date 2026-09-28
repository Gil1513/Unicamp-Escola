/*
Identificação: Gilmar da Silva Filho
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: controle.java
Explicação: classes agrupam dados e comportamentos.
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
import model.model;
import modelDAO.modelDAO;

/**
 *
 * @author Gilmar da Silva Filho
 */
public class controle {
    
    public void cadastrarJogo(int Codigo,String Nome,String Categoria ) throws SQLException{
        model m1 = new model(Codigo,Nome,Categoria);
        
        modelDAO md = new modelDAO();
        md.inserirJogo(m1);
    }
    
    public void excluirJogo(int Codigo) throws SQLException {
        modelDAO md = new modelDAO();
        md.excluirJogo(Codigo);
    }
    
}
