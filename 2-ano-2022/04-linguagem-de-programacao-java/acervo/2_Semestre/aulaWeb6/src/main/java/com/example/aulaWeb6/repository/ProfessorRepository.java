/*
Identificação: Gilmar da Silva Filho
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: ProfessorRepository.java
Explicação: herança e sobrescrita especializam comportamentos; interfaces definem contratos; persistência conecta objetos ao banco de dados.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
package com.example.aulaWeb6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.aulaWeb6.model.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Integer> {

}