package com.localhost.app.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.localhost.app.model.entities.ex4.GeneralPractitioner;
import com.localhost.app.model.entities.ex4.Medic;
import com.localhost.app.model.entities.ex4.Surgeon;

@SuppressWarnings("deprecation")
public class TestMedics implements Runnable {
	private final Set<Medic> medics = new HashSet<>();
	
	@Override
	public void run() {
		medics.addAll( Arrays.asList(
				new Medic(true),
				new Surgeon(true),
				new GeneralPractitioner(false)
				));
		
		for ( Medic medic : medics ) System.out.println(medic);
	}
}
