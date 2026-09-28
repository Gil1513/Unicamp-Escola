package com.localhost.app.ex1.models.entities;

/**
 * Representação de ingresso VIP com valor adicional
 * @author lucas
 * @version 1.0
 */
public final class Vip extends Ingresso{
	private Double adicional;

	/**
	 * @param valor base do ingresso
	 * @param adicional em custo
	 */
	public Vip(Double valor, Double adicional) {
		super(valor);
		setAdicional(adicional);
	}

	public Double getAdicional() {
		return adicional;
	}

	public void setAdicional(Double adcional) {
		if ( adcional < 0 ) throw new IllegalArgumentException("Valor invalido para o adcional VIP");
		this.adicional = adcional;
	}
	
	@Override
	public Double getTotal () {
		return getValor() + adicional;
	}
	
	@Override
	public String toString() {
		return "Ingresso Vip - valor : " + getValor() + ", adicional: " + adicional + ", total : " + getTotal();
	}
}
