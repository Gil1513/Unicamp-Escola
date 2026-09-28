package com.localhost.app.testes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.localhost.app.ex1.models.entities.Comum;
import com.localhost.app.ex1.models.entities.Ingresso;
import com.localhost.app.ex1.models.entities.Vip;

public class TestaIngressos {

	public final List<Ingresso> ingressos = new ArrayList<>();
	
	public TestaIngressos() {
		
		ingressos.addAll( Arrays.asList(
				new Vip(100D, 50D),
				new Vip(200D, 60D),
				new Vip(300D, 70D),
				new Vip(400D, 80D),
				new Vip(500D, 90D),
				new Comum(25D),
				new Comum(35D),
				new Comum(45D),
				new Comum(55D),
				new Comum(65D)
				));
		
		for ( Ingresso i : ingressos ) System.out.println( i );
		
		Double total = ingressos.stream().reduce(
				0D, ( valorParcial, ingresso ) -> valorParcial + ingresso.getTotal(), Double::sum);
		
		System.out.println("Faturamento: " + total);
	}
}
