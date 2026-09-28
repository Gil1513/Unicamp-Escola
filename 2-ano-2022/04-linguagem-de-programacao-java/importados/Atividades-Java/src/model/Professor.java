/*
Identificação: Gilmar da Silva Filho
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: Professor.java
Explicação: classes agrupam dados e comportamentos; persistência conecta objetos ao banco de dados.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import static org.hibernate.criterion.Projections.id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Gilmar da Silva Filho
 */
@Entity
@Table (name="ProfeHib")

public class Professor {
    
    @Column (name="Nome", nullable = false , length = 100)

    @javax.persistence.Id
    private String nome;
    
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Column (name="Id", unique = true)
private int Id;

@Column (name="email",unique=true)
private String email;

@Column(name="Salario")
private double Salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }
    
    public Professor (String nome, int id){
        this.nome = nome;
        this.Id = id;
    }

    public Professor(String nome, int Id, String email, double Salario) {
        this.nome = nome;
        this.Id = Id;
        this.email = email;
        this.Salario = Salario;
    }

    public Professor() {
    }
    

}
