/*
Identificação: Gilmar da Silva Filho
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: FlorRepository.java
Explicação: herança e sobrescrita especializam comportamentos; interfaces definem contratos; persistência conecta objetos ao banco de dados.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
package com.example.exApi2110.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.exApi2110.model.Flor;

public interface FlorRepository extends JpaRepository<Flor, Integer> {

}
