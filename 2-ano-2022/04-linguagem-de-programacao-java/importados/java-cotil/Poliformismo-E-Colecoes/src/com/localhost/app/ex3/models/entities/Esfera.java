package com.localhost.app.ex3.models.entities;

/**
 * Representação de uma esféra, forma tri dimensional
 * @author lucas
 * @version 1.0
 */
public class Esfera implements FormaTriDimensional {

	private Double raio;
	
	/**
	 * @param raio
	 */
	public Esfera(Double raio) {
		setRaio(raio);
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		if ( raio < 0  ) throw new IllegalArgumentException("Valor de raio deve ser maior ou igual a 0");
		this.raio = raio;
	}

	@Override
	public Double getArea() {
		return 4 * Math.PI * Math.pow(raio, 2);
	}

	@Override
	public Double getVolume() {
		return ( 4 * Math.PI * Math.pow( raio , 3) ) / 3; 
	}
}
