package com.localhost.app.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.localhost.app.model.entities.ex2.BankAccount;
import com.localhost.app.model.entities.ex2.SavingsAccount;
import com.localhost.app.model.entities.ex2.SpecialAccount;

public class AppAccounts implements Runnable{
	private final Set<BankAccount> accounts = new HashSet<>();
	
	private static final Double DEFAULT_FEE = 15D;
	
	@Override
	public void run() {

		accounts.addAll( Arrays.asList(
				new BankAccount("bank account", 1, 1000D),
				new SavingsAccount("savings account", 2, 1000D, 12),
				new SpecialAccount("special account", 3, 1000D, 500D)
				) );
		
		for ( BankAccount account : accounts )
			System.out.println(account);
		
		for ( BankAccount account : accounts )
			account.deposit (100D);
		
		for ( BankAccount account : accounts )
			account.withdraw(50D );
		
		for ( BankAccount account : accounts ) {
			if ( account instanceof SavingsAccount )
				( (SavingsAccount) account ).calculateNewBalance(DEFAULT_FEE);
			System.out.println(account);
		}
		
	}
}
