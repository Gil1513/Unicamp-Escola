/*
Identificação: Gilmar da Silva
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: Professor.java
Explicação: classes agrupam dados e comportamentos; persistência conecta objetos ao banco de dados.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
package com.example.aulaWeb6.model;

import javax.persistence.*;

@Entity
@Table(name = "ProfessorWeb")
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int matricula;

    @Column
    private String nome;

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
