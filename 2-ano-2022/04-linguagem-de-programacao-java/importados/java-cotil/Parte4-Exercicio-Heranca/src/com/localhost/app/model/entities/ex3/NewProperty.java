package com.localhost.app.model.entities.ex3;

import java.io.Serializable;

/**
 * Represents an New Propery
 * @author lucas
 * @version 1.0
 */
public class NewProperty extends Property implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Double additional;

	/**
	 * Create an new New Property
	 * @param code
	 * @param address
	 * @param price
	 * @param additional
	 */
	public NewProperty(Integer code, String address, Double price, Double additional) {
		super(code, address, price);
		setAdditional(additional);
	}

	public Double getAdditional() {
		return additional;
	}

	public void setAdditional(Double additional) {
		if ( additional < 0 )
			throw new IllegalArgumentException("Additional must be greater or equal than 0");
		
		this.additional = additional;
	}
	
	@Override
	public Double getFinalPrice() {
		return super.getPrice()  + additional;
	}

	@Override
	public String toString() {
		return super.toString() + ", additional = " + additional + ", final price = " + getFinalPrice();
	}
}
