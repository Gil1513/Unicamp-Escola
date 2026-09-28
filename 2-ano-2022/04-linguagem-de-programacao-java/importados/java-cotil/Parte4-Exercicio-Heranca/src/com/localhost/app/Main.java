package com.localhost.app;

import com.localhost.app.test.TestEmployees;
import com.localhost.app.test.TestMedics;
import com.localhost.app.test.TestProperties;
import com.localhost.app.test.AppAccounts;

/**
 * Application entry point class
 * @author lucas
 * @version 1.0
 */
public class Main{
	public static void main(String[] args){
		new TestEmployees().run();

		System.out.println("\n\n\n\n");
		new AppAccounts().run();

		System.out.println("\n\n\n\n");
		new TestProperties().run();

		System.out.println("\n\n\n\n");
		new TestMedics().run();
	}
}
