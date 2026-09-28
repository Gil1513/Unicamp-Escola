/*
Identificação: Gilmar da Silva Filho
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: ProduosControl.java
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
import model.Produtos;

/**
 *
 * @author Gilmar da Silva Filho
 */
public class ProduosControl {
    
    private ArrayList<Produtos> ListaPR;

    public ProduosControl(){
        ListaPR = new ArrayList<>();
    }
    public void cadastrarProduto (int cod,String descricao, float preco){
        Produtos PR = new Produtos (cod, descricao, preco);
        ListaPR.add(PR);
    }
    public ArrayList<Produtos> buscarTodos(){
        return ListaPR;
        
    }
    
}
