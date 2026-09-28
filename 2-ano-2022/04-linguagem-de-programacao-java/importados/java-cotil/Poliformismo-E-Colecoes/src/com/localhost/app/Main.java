package com.localhost.app;

import com.localhost.app.testes.TestaFormas;
import com.localhost.app.testes.TestaImoveis;
import com.localhost.app.testes.TestaIngressos;

public class Main {

	public static void main ( String [] args ) {
		new TestaIngressos();
		
		System.out.println("\n\n\n\n");
		
		new TestaImoveis();
		
		System.out.println("\n\n\n\n");
		
		new TestaFormas();
		
	}
}