package com.localhost.app.ex2.models.entities;

/**
 * Representa um imóvel
 * @author lucas
 * @version 1.0
 */
public abstract class Imovel {
	private Double preco;
	private String endereco;
	
	public Imovel(Double preco, String endereco) {
		setPreco(preco);
		this.endereco = endereco;
	}
	
	public abstract Double getTotal ();

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		if ( preco < 0 ) throw new IllegalArgumentException("Valor invalido para o preço");
		this.preco = preco;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Imovel - preco: " + preco + ", endereco: " + endereco;
	}
	
	
}
