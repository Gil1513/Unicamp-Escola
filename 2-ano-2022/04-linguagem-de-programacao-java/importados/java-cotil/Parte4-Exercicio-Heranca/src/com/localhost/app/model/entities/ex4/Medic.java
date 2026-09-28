package com.localhost.app.model.entities.ex4;

import java.io.Serializable;

/**
 * I cant understand this class
 * @author lucas
 * @deprecated
 */
public class Medic implements Serializable{
	private static final long serialVersionUID = 1L;

	private Boolean worksInHospital;
	
	public Medic(Boolean worksInHospital) {
		this.worksInHospital = worksInHospital;
	}

	public Boolean getWorksInHospital () {
		return worksInHospital;
	}
	
	public void treatPatient () {
		// DO SOMETHING
	}

	@Override
	public String toString() {
		return "Medic worksInHospital = " + worksInHospital;
	}
}
