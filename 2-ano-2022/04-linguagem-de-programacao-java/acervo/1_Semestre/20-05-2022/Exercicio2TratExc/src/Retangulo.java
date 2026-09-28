/*
Identificação: Gilmar da Silva Filho
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: Retangulo.java
Explicação: classes agrupam dados e comportamentos; interfaces definem contratos.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
public class Retangulo implements AreaCalculavel {
	private double ladoBase;
	private double ladoAltura;

	public Retangulo(double ladoBase, double ladoAltura) {
		super();
		if (ladoBase < 1 || ladoAltura < 1 || ladoBase == ladoAltura) {
			throw new IllegalArgumentException("Valores inválidos");
			// throw new IllegalArgumentException("Modifique um dos valores a fim de
			// torná-los válidos");
		} else {
			this.ladoBase = ladoBase;
			this.ladoAltura = ladoAltura;
		}
	}

	@Override
	public double calcularArea() {
		return ladoBase * ladoAltura;
	}

}
