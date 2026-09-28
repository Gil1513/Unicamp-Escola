/*
Identificação: Gilmar da Silva
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: Cliente.java
Explicação: classes agrupam dados e comportamentos; persistência conecta objetos ao banco de dados.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
package com.example.exApi2110.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ClienteAPI")
public class Cliente {
    @Id
    @Column
    private int idCliente;

    @Column
    private int idade;

    @Column
    private String nome;

    public int getIdCliente() {
        return this.idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
