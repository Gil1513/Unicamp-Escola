package com.localhost.app.ex3.models.entities;

/**
 * Representação de um cubo, forma tri dimensional
 * @author lucas
 * @version 1.0
 */
public class Cubo implements FormaTriDimensional {
	
	private Double lado;
	
	/**
	 * @param lado
	 */
	public Cubo(Double lado) {
		this.lado = lado;
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
		return Math.pow( lado, 2) * 6;
	}

	@Override
	public Double getVolume() {
		return Math.pow(lado, 3);
	}

}
