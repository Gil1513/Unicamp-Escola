/*
Identificação: Gilmar da Silva Filho
Matéria: Linguagem de Programação Multiplataforma — Java
Arquivo de estudo: ExemploArrayList.java
Explicação: classes agrupam dados e comportamentos; coleções armazenam múltiplos objetos.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
import java.util.ArrayList;

public class ExemploArrayList {
    public static void main(String[] args) {

        Poupanca p1 = new Poupanca();
        p1.setSaldo(500);
        Corrente c1 = new Corrente();
        c1.setSaldo(20);
        c1.setLimite(123);
        Corrente c2 = new Corrente();
        c2.setSaldo(850);
        c2.setLimite(2131);

        ArrayList<Conta> lista = new ArrayList();
        lista.add(p1);
        lista.add(c1);
        // lista.add("Jorgin"); - tipagem para classe pai "Conta".
        lista.add(c2);

        for (Conta c : lista) {
            c.mostra();
            System.out.println(c.getSaldo());

            if (c instanceof Poupanca) {
                Poupanca p = (Poupanca) c;
                System.out.println("Taxa da Poupança: " + p.getTaxa());
            }

            if (c instanceof Corrente) {
                Corrente corr = (Corrente) c;
                System.out.println("O limite da conta corrente é: " + corr.getLimite());
            }
        }
    }

}
