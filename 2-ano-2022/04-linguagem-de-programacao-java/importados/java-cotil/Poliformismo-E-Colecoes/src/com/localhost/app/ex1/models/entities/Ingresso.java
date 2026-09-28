package com.localhost.app.ex1.models.entities;

/**
 * Representação de um ingresso base
 * @author lucas
 * @version
 */
public abstract class Ingresso {
	private Double valor;
	
	/**
	 * @param valor do ingresso
	 */
	public Ingresso(Double valor) {
		setValor(valor);
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		if ( valor < 0 ) throw new IllegalArgumentException("Valor invalido para o ingresso");
		this.valor = valor;
	}
	
	public Double getTotal () {
		return valor;
	}
	
	@Override
	public String toString() {
		return "Ingresso comum - valor: " + valor;
	}
}
