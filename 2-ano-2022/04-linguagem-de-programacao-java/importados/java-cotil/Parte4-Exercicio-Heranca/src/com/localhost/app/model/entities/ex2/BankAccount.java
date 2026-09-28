package com.localhost.app.model.entities.ex2;

import java.io.Serializable;

/**
 * Represents an Bank Account
 * @author lucas
 * @version 1.0
 */
public class BankAccount implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String client;
	private Integer accountNumber;
	private Double balance;
	
	/**
	 * Create a new Bank Account
	 * @param client
	 * @param accountNumber
	 * @param balance
	 */
	public BankAccount(String client, Integer accountNumber, Double balance) {
		this.client = client;
		this.accountNumber = accountNumber;
		
		if ( balance < 0 )
			throw new IllegalArgumentException("Invalid value for balance");
		
		this.balance = balance;
	}

	public boolean withdraw( Double ammount ) {
		if ( ammount < 0 )
			throw new IllegalArgumentException("Ammount for withdraw must be greater or equal than 0");
		
		if ( ammount > balance )
			return false;
		
		balance -= ammount;
		return true;
	}
	
	public boolean deposit( Double ammount ) {
		if ( ammount < 0 )
			throw new IllegalArgumentException("Ammount for deposit must be greater or equal than 0");
		
		balance += ammount;
		return true;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Double getBalance() {
		return balance;
	}

	protected void setBalance( Double balance ) {
		this.balance = balance;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountNumber == null) ? 0 : accountNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if ( obj instanceof BankAccount  == false )
			return false;
		BankAccount other = (BankAccount) obj;
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BankAccount client = " + client 
				+ ", accountNumber = " + accountNumber 
				+ ", balance = " + balance;
	}
	
	
}
