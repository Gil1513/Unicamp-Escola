package com.localhost.app.model.entities.ex3;

import java.io.Serializable;

/**
 * Represents an Property "IMÓVEL"
 * @author lucas
 * @version 1.0
 */
public abstract class Property implements Serializable{
	private static final long serialVersionUID = 1L;

	private Integer code;
	private String  address;
	private Double  price;
	
	/**
	 * Create a new Immobile
	 * @param code
	 * @param address
	 * @param price
	 */
	public Property(Integer code, String address, Double price) {
		super();
		this.code = code;
		this.address = address;
		setPrice(price);
	}


	public Integer getCode() {
		return code;
	}


	public void setCode(Integer code) {
		this.code = code;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Double getPrice() {
		return price;
	}
	
	
	public Double getFinalPrice() {
		return price;
	}


	public void setPrice(Double price) {
		if ( price < 0 )
			throw new IllegalArgumentException("Price must be greater or equal than 0");
		this.price = price;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (  obj instanceof Property == false )
			return false;
		Property other = (Property) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Immobile code = " + code + ", address = " + address + ", price = " + price;
	}
}
