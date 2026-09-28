package com.localhost.app.model.entities.ex3;

import java.io.Serializable;
/**
 * Represents an Used Property
 * @author lucas
 * @version 1.0
 */
public class UsedProperty extends Property implements Serializable{
	private static final long serialVersionUID = 1L;

	private Double discount;

	/**
	 * Create a new Used Property
	 * @param code
	 * @param address
	 * @param price
	 * @param discount
	 */
	public UsedProperty(Integer code, String address, Double price, Double discount) {
		super(code, address, price);
		this.discount = discount;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		
		if ( discount < 0 )
			throw new IllegalArgumentException("Discount must be greater or equal than 0");
		
		this.discount = discount;
	}
	
	@Override
	public Double getFinalPrice() {
		return getPrice() - discount;
	}

	@Override
	public String toString () {
		return super.toString() + ", discount = " + discount + ", final price = " + getFinalPrice();
	}
}
