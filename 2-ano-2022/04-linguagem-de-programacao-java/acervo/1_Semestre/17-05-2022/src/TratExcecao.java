/*
Identificação: Gilmar da Silva Filho
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: TratExcecao.java
Explicação: classes agrupam dados e comportamentos; exceções tratam falhas durante a execução.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/

public class TratExcecao 
{

	public static void aumentarLetra() {
		String teste = "Rapaizzz";
		
		try {
			System.out.println(teste.toUpperCase());
		} 
		
		catch (NullPointerException e) {
			System.out.println("Desculpe! A string não pode ser null");
		}
		
		finally {
			System.out.println("Hmmm aulinha do matioli amanhã!!");
		}
	}

	public static void main(String[] args) {
		aumentarLetra();
	}
}
