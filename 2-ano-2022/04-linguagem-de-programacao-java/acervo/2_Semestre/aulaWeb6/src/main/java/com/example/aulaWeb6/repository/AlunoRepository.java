/*
Identificação: Gilmar da Silva
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: AlunoRepository.java
Explicação: herança e sobrescrita especializam comportamentos; interfaces definem contratos; persistência conecta objetos ao banco de dados.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.aulaWeb6.repository;

import com.example.aulaWeb6.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Gilmar da Silva
 */
public interface AlunoRepository extends JpaRepository<Aluno, Integer>{
    
}
