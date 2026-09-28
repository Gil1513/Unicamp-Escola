/*
Identificação: Gilmar da Silva
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: App.java
Explicação: classes agrupam dados e comportamentos.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String myString = sc.nextLine();

        if (myString.endsWith("em") == true) {
            System.out.println("A string termina com [em]");
        } else {
            System.out.println("A string não termina com [em]");
        }
    }
}
