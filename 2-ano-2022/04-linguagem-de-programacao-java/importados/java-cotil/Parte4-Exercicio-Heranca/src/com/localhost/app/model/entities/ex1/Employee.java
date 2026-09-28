package com.localhost.app.model.entities.ex1;

import java.io.Serializable;

/**
 * Represents a simple abstract employee class
 * @author lucas
 * @version 1.0
 */
public abstract class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	private String name;
	private Double salary;
	
	/**
	 * Create a new Employee
	 * @param name name of employee
	 * @param salary salary of employee
	 */
	public Employee(String name, Double salary) {
		this.name = name;
		setSalary(salary);
	}
	
	/**
	 * Get the bonification of employee, is 10% of the salary
	 * @return the bonification value
	 */
	public Double calculateBonification( ) {
		return salary * .1;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		if ( salary < 0 )
			throw new IllegalArgumentException("Salary must be greater than 0");
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if ( obj instanceof Employee  == false )
			return false;
		Employee other = (Employee) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	/**
	 * References "MOSTRADADOS", using toString to better reading and sintax
	 * @return the employee data
	 */
	@Override
	public String toString() {
		return "Employee: name = " + name 
				+ ", salary = " + salary 
				+ ", Bonification( 10% ) = " + calculateBonification();
	}
}
