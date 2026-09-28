/*
Identificação: Gilmar da Silva Filho
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: MetodoMatematico.java
Explicação: classes agrupam dados e comportamentos; exceções tratam falhas durante a execução.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
public class MetodoMatematico {
	public double divisao(int valor1, int valor2) {
		try {
			return valor1/valor2;
		} catch (Exception e){
			System.out.println("Operação Inválida...");
			return 0;
		}
	}
}
