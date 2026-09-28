package com.localhost.app.model.entities;

import java.io.Serializable;

/**
 * Representa uma entidade do tipo produto estoque, alguns nomes foram refatorados por questões de legibilidade
 * @author lucas
 * @version 0.1
 */
public class ProdutoDeEstoque implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private Integer quantidadeEmEstoque;
	private Integer quantidadeMinima;
	
	public ProdutoDeEstoque() {
		
	}

	public ProdutoDeEstoque(String nome, Integer quantidadeEmEstoque, Integer quantidadeMinima)  throws IllegalArgumentException {
		this.nome = nome;
		setQuantidadeEmEstoque(quantidadeEmEstoque);
		setQuantidadeMinima(quantidadeMinima);
	}
	
	/**
	 * Verifica se a quantidadeEmEstoque é menor que a quantidadeMinima e retorna a comparação
	 * @return true caso quantidadeEmEstoque seja menor que quantidadeMinima, false caso contrario
	 */
	public Boolean precisaRepor() {
		return quantidadeEmEstoque <= quantidadeMinima;
	}
	
	/**
	 * Alias para toString()
	 * @return a string contendo os dados do Produto
	 * @see toString()
	 */
	public String mostra() {
		return toString(); 
	}
	
	/**
	 * Aumenta a quantidadeEmEstoque com o valor fornecido
	 * @param quantidade A quantidade a ser acrescda
	 * @throws IllegalArgumentException Caso quantidade seja negativo
	 */
	public void reporEstoqueEm( Integer quantidade ) throws IllegalArgumentException  {
		if ( quantidade < 0 ) throw new IllegalArgumentException("Valor invalido para repor estoque");
		quantidadeEmEstoque += quantidade;
	}
	
	/**
	 * Reduz a quantidadeEmEstoque com a quantidade passada
	 * @param quantidade A quantidade a ser descrescida
	 * @throws IllegalArgumentException Caso quantidade seja negativa ou insuficiente
	 */
	public void darBaixaEm( Integer quantidade ) throws IllegalArgumentException {
		if ( quantidade < 0 ) throw new IllegalArgumentException("Valor invalido para repor estoque");
		else if ( quantidadeEmEstoque < quantidade ) throw new IllegalArgumentException("Quantidade indisponivel para dar baixa");
		quantidadeEmEstoque -= quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuantidadeEmEstoque() {
		return quantidadeEmEstoque;
	}

	public void setQuantidadeEmEstoque(Integer quantidadeEmEstoque) {
		if ( quantidadeEmEstoque < 0 ) throw new IllegalArgumentException("Valor invalido");
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}
	
	public Integer getQuantidadeMinima() {
		return quantidadeMinima;
	}

	public void setQuantidadeMinima(Integer quantidadeMinima) {
		if ( quantidadeMinima < 0 ) throw new IllegalArgumentException("Valor invalido");
		this.quantidadeMinima = quantidadeMinima;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + ", quantidade minima: " + quantidadeMinima + ", quantidade em estoque: " + quantidadeEmEstoque;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((quantidadeEmEstoque == null) ? 0 : quantidadeEmEstoque.hashCode());
		result = prime * result + ((quantidadeMinima == null) ? 0 : quantidadeMinima.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProdutoDeEstoque other = (ProdutoDeEstoque) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (quantidadeEmEstoque == null) {
			if (other.quantidadeEmEstoque != null)
				return false;
		} else if (!quantidadeEmEstoque.equals(other.quantidadeEmEstoque))
			return false;
		if (quantidadeMinima == null) {
			if (other.quantidadeMinima != null)
				return false;
		} else if (!quantidadeMinima.equals(other.quantidadeMinima))
			return false;
		return true;
	}
	
}
