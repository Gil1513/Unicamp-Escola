package com.localhost.app.model.entities.ex1;

import java.io.Serializable;

/**
 * Represents an manager, extends Employee
 * @author lucas
 * @version 1.0
 */
public final class Manager extends Employee implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String username;
	private String password;
	
	/**
	 * Create a new manager
	 * @param name name of manager
	 * @param salary salary of manager
	 * @param username username of manager
	 * @param password password of manager
	 */
	public Manager(String name, Double salary, String username, String password) {
		super(name, salary);
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * Managers have 15% of bonification, 5% more then normal employees
	 */
	@Override
	public Double calculateBonification() {
		return getSalary() * .15;
	}

	@Override
	public String toString() {
		return "Employee: name = " + getName() 
				+ ", salary = " + getSalary() 
				+ ", Bonification( 15% ) = " + calculateBonification() 
				+ ", username = " + username 
				+ ", password = " + password;
	}
	
}
