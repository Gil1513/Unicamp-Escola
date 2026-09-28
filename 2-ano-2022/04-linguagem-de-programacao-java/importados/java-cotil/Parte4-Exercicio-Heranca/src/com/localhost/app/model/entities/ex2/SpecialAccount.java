package com.localhost.app.model.entities.ex2;

import java.io.Serializable;

/**
 * Represents an Special Account
 * @author lucas
 * @version 1.0
 */
public class SpecialAccount extends BankAccount implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Double limit;

	/**
	 * Create a new Special Account
	 * @param client
	 * @param accountNumber
	 * @param balance
	 * @param limit
	 */
	public SpecialAccount(String client, Integer accountNumber, Double balance, Double limit) {
		super(client, accountNumber, balance);
		setLimit(limit);
	}
	
	public Double getLimit() {
		return limit;
	}

	public void setLimit(Double limit) {
		if ( limit < 0 )
			throw new IllegalArgumentException("Limit must be greater or equal than 0");
		
		this.limit = limit;
	}

	@Override
	public boolean withdraw( Double ammount ) {
		if ( ammount < 0 )
			throw new IllegalArgumentException("Ammount for withdraw must be greater or equal than 0");
		
		if ( getBalance() < ( ammount + limit ) )
			return false;
		
		setBalance( getBalance() - ammount );
		return true;
	}
	
	@Override
	public String toString(  ) {
		return super.toString() + ", limit = " + limit;
	}
}
