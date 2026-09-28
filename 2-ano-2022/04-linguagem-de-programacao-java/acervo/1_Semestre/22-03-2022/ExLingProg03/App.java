/*
Identificação: Gilmar da Silva Filho
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: App.java
Explicação: classes agrupam dados e comportamentos.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite duas palavra: ");
        String myString = sc.nextLine();

        String myString2 = sc.nextLine();

        if (myString.equalsIgnoreCase(myString2) == true)
            System.out.println("As duas strings são iguais");
        
        else 
        {
            System.out.println("As duas strings são diferentes");
        } 
    }
}
