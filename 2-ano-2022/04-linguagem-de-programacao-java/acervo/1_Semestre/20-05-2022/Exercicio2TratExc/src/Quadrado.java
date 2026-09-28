/*
Identificação: Gilmar da Silva Filho
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: Quadrado.java
Explicação: classes agrupam dados e comportamentos; interfaces definem contratos.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
public class Quadrado implements AreaCalculavel{
	private double lado;
	
	public Quadrado(double lado) {
		super();
		if (lado < 1) {
			throw new IllegalArgumentException("Valor inválido");
		} else {
			this.lado = lado;
		}
	}

	@Override
	public double calcularArea() {
		return lado*lado;
	}

}
