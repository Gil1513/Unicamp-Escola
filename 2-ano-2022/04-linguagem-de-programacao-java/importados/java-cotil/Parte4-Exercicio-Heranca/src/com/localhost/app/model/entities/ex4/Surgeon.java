package com.localhost.app.model.entities.ex4;

import java.io.Serializable;

/**
 * I cant understand this class
 * @author lucas
 * @deprecated
 */
public class Surgeon extends Medic implements Serializable{
	private static final long serialVersionUID = 1L;
	
	public Surgeon(Boolean worksInHospital) {
		super(worksInHospital);
	}
	
	public void makeIncision() {
		// DO SOMETHING
	}
}
