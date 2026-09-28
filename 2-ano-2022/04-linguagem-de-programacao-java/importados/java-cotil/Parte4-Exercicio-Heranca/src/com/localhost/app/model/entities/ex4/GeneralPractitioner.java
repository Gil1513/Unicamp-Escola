package com.localhost.app.model.entities.ex4;

import java.io.Serializable;

/**
 * I cant understand this class
 * @author lucas
 * @deprecated
 */
public class GeneralPractitioner extends Medic implements Serializable{
	private static final long serialVersionUID = 1L;
	
	public GeneralPractitioner(Boolean worksInHospital) {
		super(worksInHospital);
	}
	
	public void prescribe() {
		// DO SOMETHING
	}
}
