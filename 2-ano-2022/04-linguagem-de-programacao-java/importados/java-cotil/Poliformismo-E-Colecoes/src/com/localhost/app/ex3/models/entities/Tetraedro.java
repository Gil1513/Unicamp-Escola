package com.localhost.app.ex3.models.entities;

/**
 * Representação de um tetraedro, figura tri dimensional
 * @author lucas
 * @version 1.0
 */
public class Tetraedro implements FormaTriDimensional {

	private Double aresta;
	private Double alturaBase;
	
	/**
	 * @param aresta
	 */
	public Tetraedro(Double aresta) {
		setAresta(aresta);
		calculaAlturaBase();
	}

	public Double getAresta() {
		return aresta;
	}
	
	public void setAresta(Double aresta) {
		if ( aresta < 0 ) throw new IllegalArgumentException("A aresta deve ser maior ou igual a 0");
		this.aresta = aresta;
	}
	
	private void calculaAlturaBase() {
		this.alturaBase = Math.sqrt( Math.pow( aresta, 2 ) - ( Math.pow(aresta / 2, 2) ) );
	}

	@Override
	public Double getArea() {
		return 2 * aresta * alturaBase;
	}

	@Override
	public Double getVolume() {
		
		double altura     = ( aresta * Math.sqrt(6) ) / 3;
		
		double areaBase   = ( aresta * alturaBase ) / 2; 
		
		return ( areaBase * altura ) / 3;
	}

}