/*
Identificação: Gilmar da Silva
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: teste.java
Explicação: classes agrupam dados e comportamentos; exceções tratam falhas durante a execução.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
public class teste{
	public static void main(String[] args) {
		MetodoMatematico m1 = new MetodoMatematico();
		
		try {
			
			System.out.println(m1.divisao(4, 0));
		} catch (IllegalArgumentException e){
			e.printStackTrace();
		}
	}
}
