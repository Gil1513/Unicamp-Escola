/*
Identificação: Gilmar da Silva
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: DAO.java
Explicação: classes agrupam dados e comportamentos; coleções armazenam múltiplos objetos; persistência conecta objetos ao banco de dados.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;
import conexao.conection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Produtos;
/**
 *
 * @author Gilmar da Silva
 */
public class DAO {
     Connection con;
    
    public void inserirAluno(Produtos al) throws SQLException
    { 
            con = new conection().getConnection();
            String sql = "Insert into ALUNO (RA,NOME) values (?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, al.getRA());
            stmt.setString(2, al.getNome());
            stmt.execute();
            stmt.close();
            con.close();    
    }
    
}
