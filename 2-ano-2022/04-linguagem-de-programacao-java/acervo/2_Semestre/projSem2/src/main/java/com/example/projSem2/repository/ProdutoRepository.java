/*
Identificação: Gilmar da Silva
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: ProdutoRepository.java
Explicação: herança e sobrescrita especializam comportamentos; interfaces definem contratos; coleções armazenam múltiplos objetos; persistência conecta objetos ao banco de dados.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
package com.example.projSem2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.projSem2.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

    List<Produto> findByDescricao(String descricao);

    List<Produto> findByMarca(String marca);

    List<Produto> findByPreco(int preco);

    @Query("SELECT p FROM Produto p WHERE p.descricao like %?1%")
    List<Produto> findByInicialDescricao(String descricao);

    @Query("SELECT p FROM Produto p WHERE p.marca like %?1%")
    List<Produto> findByInicialMarca(String marca);

    @Query("SELECT p FROM Produto p WHERE p.preco > ?1")
    List<Produto> findByPrecoMaiorQue(int preco);

    @Query("SELECT p FROM Produto p WHERE p.preco < ?1")
    List<Produto> findByPrecoMenorQue(int preco);

    @Query("SELECT p FROM Produto p WHERE p.descricao like %?1% and p.marca like %?1%")
    List<Produto> findByParteDescricaoMarca(String descricao, String marca);

    @Query("SELECT p FROM Produto p WHERE p.descricao like %?1% and p.preco < ?1")
    List<Produto> findByParteDescricaoPrecoMenorQue(String descricao, int preco);

}
