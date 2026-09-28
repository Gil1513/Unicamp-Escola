/*
Identificação: Gilmar da Silva
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: ProdutoController.java
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

import java.util.ArrayList;
import model.Produto;

/**
 *
 * @author Gilmar da Silva
 */
public class ProdutoController {

    ArrayList<Produto> listaProduto = new ArrayList<Produto>();

    public void cadastraProduto(int codigo, String descricao, double preco) {
        Produto p = new Produto(codigo, descricao, preco);
        listaProduto.add(p);
    }

    public ArrayList buscarTodos() {
        return listaProduto;
    }

    public void excluir(int Codigo) {
        for (Produto p : listaProduto) {
            if (p.getCodigo() == Codigo) {
                listaProduto.remove(p);
            }
        }
    }

}
