package com.localhost.app.model.entities.ex1;

import java.io.Serializable;

/**
 * Represents an telephonist, extends Employee
 * @author lucas
 * @version 1.0
 */
public final class Telephonist extends Employee implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer workstationCode;

    /**
     * Create a new Telephonist
     * @param name name of secretary
     * @param salary salary of secretary
     * @param workstationCode workstation code of secretary
     */
	public Telephonist(String name, Double salary, Integer workstationCode) {
		super(name, salary);
		this.workstationCode = workstationCode;
	}

	public Integer getWorkstationCode() {
		return workstationCode;
	}

	public void setWorkstationCode(Integer workstationCode) {
		this.workstationCode = workstationCode;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", workstation code = " + workstationCode;
	}
}
