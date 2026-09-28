package com.localhost.app.ex3.models.entities;

/**
 * Representação de um quadrado, uma forma bi dimensional
 * @author lucas
 *
 */
public class Quadrado implements FormaBiDimensional {

	private Double lado;

	/**
	 * @param lado
	 */
	public Quadrado(Double lado) {
		setLado(lado);
	}

	public Double getLado() {
		return lado;
	}

	public void setLado(Double lado) {
		if ( lado < 0 ) throw new IllegalArgumentException("O lado deve ser maior ou igual a 0");
		this.lado = lado;
	}

	@Override
	public Double getArea() {
		return Math.pow(lado, 2);
	}

}
