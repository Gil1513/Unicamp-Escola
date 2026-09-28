package com.localhost.app.ex3.models.entities;

/**
 * Representação de um Triangulo, uma forma bi dimensional
 * @author lucas
 * @version 1.0
 */
public class Triangulo implements FormaBiDimensional {

	private Double base;
	private Double altura;
	
	/**
	 * @param base
	 * @param altura
	 */
	public Triangulo(Double base, Double altura) {
		setBase(base);
		setAltura(altura);
	}

	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		if ( base < 0 ) throw new IllegalArgumentException("A base deve ser maior ou igual a 0");
		this.base = base;
	}
	
	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		if ( altura < 0 ) throw new IllegalArgumentException("A altura deve ser maior ou igual a 0");
		this.altura = altura;
	}

	@Override
	public Double getArea() {
		return ( base * altura ) / 2;
	}

}
