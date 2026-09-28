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

     ArrayList<Aluno> Lista;

    public AlunoController() {
        Lista = new ArrayList();
    }
    
     
public void cadastrar(String nome, int idade) {
    Aluno al = new Aluno (nome, idade);
   Lista.add(al);
   mostrar();
    
}
    public void mostrar(){
        for (Aluno a: Lista)
        {
            System.out.println(a.getNome() + " " + a.getIdade() + "\n");
        }
    }
}
