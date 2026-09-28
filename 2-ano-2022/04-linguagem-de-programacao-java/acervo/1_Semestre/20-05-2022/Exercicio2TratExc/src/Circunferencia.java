/*
Identificação: Gilmar da Silva
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: Circunferencia.java
Explicação: classes agrupam dados e comportamentos; interfaces definem contratos.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
public class Circunferencia implements AreaCalculavel{
	private double raio;
	@Override
	public double calcularArea() {
		return Math.PI*raio*raio;
	}

}
