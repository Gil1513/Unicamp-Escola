/*
Identificação: Gilmar da Silva Filho
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: FlorController.java
Explicação: classes agrupam dados e comportamentos; coleções armazenam múltiplos objetos; controladores coordenam requisições e regras.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Flor;
import model.dao.FlorDAO;

/**
 *
 * @author Gilmar da Silva Filho
 */
public class FlorController {
    public void cadastrarFlorController(String especie, double preco, double altura) throws SQLException {
        Flor f = new Flor(especie, preco, altura);
        
        FlorDAO fDAO = new FlorDAO();
        fDAO.inserirFlor(f);
    }
    
    public void excluirFlorController(String especie) throws SQLException {
        FlorDAO fDAO = new FlorDAO();
        fDAO.ExcluirFlor(especie);
    }
    
    public ArrayList<Flor> buscarFloresController() throws SQLException{
        FlorDAO fDAO = new FlorDAO();
        return (fDAO.buscarFlores());
    }
    
    public ArrayList<Flor> buscarFloresEncontradasController(String nomeFlor) throws SQLException {
        FlorDAO fDAO = new FlorDAO();
        return (fDAO.buscarFlorEspecie(nomeFlor));
    }
}
