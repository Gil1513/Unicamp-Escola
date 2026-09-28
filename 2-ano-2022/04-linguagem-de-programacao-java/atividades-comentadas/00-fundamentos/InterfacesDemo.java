/*
Interfaces, composição e polimorfismo
Responsável: Gilmar da Silva
Conceitos: Uma interface define um contrato. A classe recebe uma estratégia, permitindo trocar a regra sem alterar o cálculo principal.
Execução: cd 00-fundamentos; javac InterfacesDemo.java; java InterfacesDemo
Pratique: Implemente frete grátis acima de um valor usando uma classe concreta.
*/
public class InterfacesDemo {
    interface Frete { int centavos(int peso); }
    static class Pedido {
        private final Frete frete;
        Pedido(Frete frete) { this.frete = frete; }
        int total(int produtos, int peso) {
            if (produtos < 0 || peso <= 0) throw new IllegalArgumentException("Valores inválidos");
            return produtos + frete.centavos(peso);
        }
    }
    public static void main(String[] args) {
        Pedido retirada = new Pedido(peso -> 0);
        Pedido entrega = new Pedido(peso -> 500 + peso * 100);
        if (retirada.total(2000, 2) != 2000 || entrega.total(2000, 2) != 2700)
            throw new AssertionError("Estratégia incorreta");
        System.out.println("Entrega: " + entrega.total(2000, 2) + " centavos");
    }
}
