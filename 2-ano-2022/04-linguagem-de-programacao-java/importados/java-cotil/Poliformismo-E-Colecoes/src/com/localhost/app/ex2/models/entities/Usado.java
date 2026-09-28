package com.localhost.app.ex2.models.entities;

/**
 * Representa um imóvel usado, possui um desconto no valor base
 * @author lucas
 * @version 1.0
 */
public final class Usado extends Imovel {

	private Double desconto;
	
	public Usado(Double preco, String endereco, Double desconto) {
		super(preco, endereco);
		this.desconto = desconto;
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		if ( desconto < 0 ) throw new IllegalArgumentException("Valor invalido para o desconto");
		this.desconto = desconto;
	}

	@Override
	public Double getTotal() {
		return getPreco() + desconto;
	}

	@Override
	public String toString() {
		return "Imovel usado - preco: " + getPreco() 
		+ ", desconot: " + desconto 
		+ ", valor final: " + getTotal()  
		+ ", endereco: " + getEndereco();
	}

}
