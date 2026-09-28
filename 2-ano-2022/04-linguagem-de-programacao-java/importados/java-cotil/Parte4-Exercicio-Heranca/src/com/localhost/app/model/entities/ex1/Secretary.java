package com.localhost.app.model.entities.ex1;

import java.io.Serializable;

/**
 * Represents an secretary, extends Employee
 * @author lucas
 * @version 1.0
 */
public final class Secretary extends Employee implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer branchLine;

	/**
	 * Create a new Secretary
	 * @param name name of secretary
	 * @param salary salary of secretary
	 * @param branchLine branchLine of secretary
	 */
	public Secretary(String name, Double salary, Integer branchLine) {
		super(name, salary);
		this.branchLine = branchLine;
	}

	public Integer getBranchLine() {
		return branchLine;
	}

	public void setBranchLine(Integer branchLine) {
		this.branchLine = branchLine;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", branch line = " + branchLine;
	}
}
