package com.localhost.app.testes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.localhost.app.ex2.models.entities.Imovel;
import com.localhost.app.ex2.models.entities.Novo;
import com.localhost.app.ex2.models.entities.Usado;

public class TestaImoveis {

	private final List<Imovel> imoveis = new ArrayList<>();
	
	public TestaImoveis() {
		imoveis.addAll( Arrays.asList(
				new Usado(10000D, "Rua da lula", 1500D),
				new Usado(20000D, "Rua do nemo", 2500D),
				new Usado(30000D, "Rua da estrela do mar", 3500D),
				new Usado(40000D, "Rua do salmão", 4500D),
				new Novo(50000D, "Rua do leão", 5500D),
				new Novo(60000D, "Rua da onça", 6500D),
				new Novo(70000D, "Rua do mico leão", 7500D),
				new Novo(80000D, "Rua do tatu", 8500D)
				));
		
		List<Imovel> filtrado = imoveis.stream()
				.filter( (residencia) -> residencia instanceof Novo)
				.collect( Collectors.toList() );
		
		for ( Imovel imovel : filtrado ) System.out.println(imovel);
	}
}
