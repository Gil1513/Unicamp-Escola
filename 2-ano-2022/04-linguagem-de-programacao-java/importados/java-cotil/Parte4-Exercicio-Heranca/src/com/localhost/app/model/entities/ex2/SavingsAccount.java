package com.localhost.app.model.entities.ex2;

import java.io.Serializable;
import java.time.Month;
import java.time.MonthDay;

/**
 * Represent an Savings Account
 * @author lucas
 * @version 1.0
 */
public final class SavingsAccount extends BankAccount implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private MonthDay incomedDay;

	/**
	 * Create a new Savings Account
	 * @param client
	 * @param accountNumber
	 * @param balance
	 * @param incomedDay day in february month
	 */
	public SavingsAccount(String client, Integer accountNumber, Double balance, Integer incomedDay) {
		super(client, accountNumber, balance);
		this.incomedDay = MonthDay.of( Month.FEBRUARY , incomedDay );
	}
	
	/**
	 * Calculate and deposit the income based on fee and balance
	 * @param fee the fee to calculate
	 */
	public void calculateNewBalance( Double fee ) {
		if ( fee < 0 )
			throw new IllegalArgumentException("Fee must be greater than 0");
		
		double income = ( getBalance() / 100 ) * fee;
		deposit(income);
	}

	public MonthDay getIncomedDay() {
		return incomedDay;
	}

	public void setIncomedDay(Integer incomedDay) {
		this.incomedDay = this.incomedDay.withDayOfMonth(incomedDay);
	}

	@Override
	public String toString() {
		return super.toString() + ", incomedDay = " + incomedDay.getDayOfMonth();
	}
	
	
}
