package com.localhost.app.ex3.models.entities;

/**
 * Representação de um circulo, uma forma bi dimensional
 * @author lucas
 * @version 1.0
 */
public class Circulo implements FormaBiDimensional {

	private Double raio;
	
	/**
	 * @param raio
	 */
	public Circulo(Double raio) {
		setRaio(raio);
	}


	public Double getRaio() {
		return raio;
	}


	public void setRaio(Double raio) {
		if ( raio < 0 ) throw new IllegalArgumentException("O raio deve ser maior ou igual a 0");
		this.raio = raio;
	}


	@Override
	public Double getArea() {
		return Math.PI * Math.pow(raio, 2);
	}

}
