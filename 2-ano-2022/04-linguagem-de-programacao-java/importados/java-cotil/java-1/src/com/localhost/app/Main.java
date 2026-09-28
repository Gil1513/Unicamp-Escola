package com.localhost.app;

import com.localhost.app.model.entities.Funcionario;
import com.localhost.app.model.entities.Item;
import com.localhost.app.model.entities.Pessoa;
import com.localhost.app.model.entities.ProdutoDeEstoque;
import com.localhost.app.model.entities.exceptions.DataInvalidaException;

/**
 * @author lucas
 */
public class Main{

	public static void main(String[] args) {
		//testaFuncionario();
		//testaItem();
		//testaPessoa();
		//testaProdutoEstoque();
	}

	/**
	 * Teste da classe Funcionario conforme solicitado no exercicio nº 1
	 */
	private static void testaFuncionario() {
		Funcionario f1 = new Funcionario("Lucas", "Rafael de Quadros", -9999D);
		Funcionario f2 = new Funcionario("Lucas", "Quadros", 1000D);

		System.out.println(f1);
		System.out.println(f2);

		f1.setSalarioMensal(100D);
		f1.aumentaSalarioEm(10);

		f2.aumentaSalarioEm(50);

		System.out.println(f1);
		System.out.println(f2);

		System.out.println(f1.getSalarioAnual());
		System.out.println(f2.getSalarioAnual());
	}

	/**
	 * Teste da classe Item conforme solicitado no exercicio nº 2
	 */
	public static void testaItem() {
		Item i1 = new Item(1, "Teclado gamer", 10, 20D);

		System.out.println(i1 + "\nTotal da compra: " + i1.getTotal());
		i1.setValor(-10D);

		System.out.println(i1 + "\nTotal da compra: " + i1.getTotal());
	}

	public static void testaPessoa() {
		try {
			Pessoa p1 = new Pessoa("Albert Einstein", "14/03/1879");
			
			// lançam um erro do tipo DataInvalidaException
			//Pessoa p2 = new Pessoa("Isaac Newton", "04/01/164346");
			//Pessoa p2 = new Pessoa("Isaac Newton", "aa04/01/164346");
			
			Pessoa p2 = new Pessoa("Isaac Newton", "04/01/1643");
			
			System.out.println(p1);
			System.out.println(p2);
			
		}catch ( DataInvalidaException die_err ) {
			System.out.println(die_err.getMessage() + "\n\n");
			die_err.printStackTrace();
		}
	}
	
	public static void testaProdutoEstoque() {
		ProdutoDeEstoque produto1 = new ProdutoDeEstoque("Impressora", 13, 6);
		ProdutoDeEstoque produto2 = new ProdutoDeEstoque("Monitor", 11, 13);
		ProdutoDeEstoque produto3 = new ProdutoDeEstoque("Mouse", 6, 2);
		
		produto1.darBaixaEm(5);
		produto2.reporEstoqueEm(7);
		produto3.darBaixaEm(4);
		
		System.out.println(produto1 + "\nPrecisa repor ? " + ( produto1.precisaRepor() ? "Sim" : "Não" ));
		System.out.println(produto2 + "\nPrecisa repor ? " + ( produto2.precisaRepor() ? "Sim" : "Não" ));
		System.out.println(produto3 + "\nPrecisa repor ? " + ( produto3.precisaRepor() ? "Sim" : "Não" ));
		
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println(produto1.mostra());
		System.out.println(produto2.mostra());
		System.out.println(produto3); // toString() like mostra()
	}
}
