package com.localhost.app.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.localhost.app.model.entities.ex1.Employee;
import com.localhost.app.model.entities.ex1.Manager;
import com.localhost.app.model.entities.ex1.Secretary;
import com.localhost.app.model.entities.ex1.Telephonist;

/**
 * Used to test employee activity, can be used as thread
 * @author lucas
 * @version 1.0
 */
public class TestEmployees implements Runnable{
	private final Set<Employee> employees = new HashSet<>();
	
	@Override
	public void run() {

		employees.addAll( Arrays.asList(
				new Manager    ("manager", 2000D, "username", "password"),
				new Secretary  ("secretary", 1500D, 1),
				new Telephonist("telephonist", 1000D, 1)
				) );
		
		for ( Employee employee : employees ) System.out.println( employee );
		
		
	}
}
