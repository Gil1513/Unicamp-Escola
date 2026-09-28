/*
Identificação: Gilmar da Silva
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: App.java
Explicação: classes agrupam dados e comportamentos.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
public class App {
    public static void main(String[] args) {
        String myString = new String("Joaozinho");
        String newString = " e Maria";

        System.out.println("String concatenada: " + myString.concat(newString));
    }
}
