package com.localhost.app.ex2.models.entities;

/**
 * Represena um imóvel novo possui um adicional no valor base
 * @author lucas
 * @version 1.0
 */
public final class Novo extends Imovel {
	private Double adicional;

	public Novo(Double preco, String endereco, Double adicional) {
		super(preco, endereco);
		setAdicional(adicional);
	}

	public Double getAdicional() {
		return adicional;
	}

	public void setAdicional(Double adicional) {
		if ( adicional < 0 ) throw new IllegalArgumentException("Valor invalido para o adicional");
		
		this.adicional = adicional;
	}

	@Override
	public Double getTotal() {
		return getPreco() + adicional;
	}

	@Override
	public String toString() {
		return "Imovel novo - preco: " + getPreco() 
		+ ", adicional: " + adicional 
		+ ", valor final: " + getTotal()  
		+ ", endereco: " + getEndereco();
	}
	
	
}
