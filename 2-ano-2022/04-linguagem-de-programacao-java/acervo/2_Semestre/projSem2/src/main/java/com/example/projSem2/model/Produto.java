/*
Identificação: Gilmar da Silva Filho
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: Produto.java
Explicação: classes agrupam dados e comportamentos; persistência conecta objetos ao banco de dados.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
package com.example.projSem2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ProdutoProjSem")
public class Produto {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigo;

    @Column
    private String descricao;

    @Column
    private String marca;

    @Column
    private int preco;

    public Produto() {
    }

    public Produto(int codigo, String descricao, String marca, int preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.marca = marca;
        this.preco = preco;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPreco() {
        return this.preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

}
