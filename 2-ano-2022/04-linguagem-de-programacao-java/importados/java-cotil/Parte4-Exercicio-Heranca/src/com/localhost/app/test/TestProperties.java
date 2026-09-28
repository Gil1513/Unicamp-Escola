package com.localhost.app.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.localhost.app.model.entities.ex3.NewProperty;
import com.localhost.app.model.entities.ex3.Property;
import com.localhost.app.model.entities.ex3.UsedProperty;

public class TestProperties implements Runnable {

	private final Set<Property> properties = new HashSet<>();
	
	@Override
	public void run() {

		properties.addAll( Arrays.asList(
				new NewProperty(1, "Street of nowhere", 250000D, 10000D),
				new UsedProperty(2, "Street of somewhere", 250000D, 7000D)
				) );
		
		for ( Property property : properties )
			System.out.println(property);
	}

}
