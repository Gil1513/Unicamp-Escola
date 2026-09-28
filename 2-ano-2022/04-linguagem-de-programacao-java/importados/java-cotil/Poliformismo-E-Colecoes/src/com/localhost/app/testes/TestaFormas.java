package com.localhost.app.testes;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.localhost.app.ex3.models.entities.Circulo;
import com.localhost.app.ex3.models.entities.Cubo;
import com.localhost.app.ex3.models.entities.Esfera;
import com.localhost.app.ex3.models.entities.Forma;
import com.localhost.app.ex3.models.entities.FormaTriDimensional;
import com.localhost.app.ex3.models.entities.Quadrado;
import com.localhost.app.ex3.models.entities.Tetraedro;
import com.localhost.app.ex3.models.entities.Triangulo;

public class TestaFormas {

	private final List<Forma> formas = new ArrayList<>();
	private final DecimalFormat nFormatter = new DecimalFormat("0.###");
	
	public TestaFormas() {
		formas.addAll( Arrays.asList(
				new Quadrado(3D),
				new Triangulo( 3D, 3D),
				new Circulo( 3D ),
				new Cubo(3D),
				new Esfera(3D),
				new Tetraedro(3D)
				));
		
		for( Forma f : formas ) {
			System.out.print("Classe: " + f.getClass().getSimpleName() + ", area: " + nFormatter.format(f.getArea()));
			
			if ( f instanceof FormaTriDimensional )
				System.out.println(", volume: " + nFormatter.format(((FormaTriDimensional)f).getVolume()) );
			else
				System.out.println();
		}
	}
}
