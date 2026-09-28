/*
Identificação: Gilmar da Silva Filho
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: appFigurasGeometricas.java
Explicação: classes agrupam dados e comportamentos; exceções tratam falhas durante a execução.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
public class appFigurasGeometricas {
	public static void main(String[] args) {
		try {
			Quadrado q1 = new Quadrado(0);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		
	}
}
