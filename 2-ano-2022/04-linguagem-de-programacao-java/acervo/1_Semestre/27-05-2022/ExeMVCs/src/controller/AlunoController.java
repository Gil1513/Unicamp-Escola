/*
Identificação: Gilmar da Silva
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: AlunoController.java
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
import model.Aluno;

/**
 *
 * @author Gilmar da Silva
 */
public class AlunoController {

    ArrayList<Aluno> lista;

    public AlunoController() {
        lista = new ArrayList<Aluno>();
    }

    public void cadastrar(String nome, int idade) {
        Aluno a1 = new Aluno(nome, idade);
        lista.add(a1);
    }
    
    public String imprimirArrayList() {
        for (Aluno a: lista) {
            return a + "| ";
        }
    }
}
