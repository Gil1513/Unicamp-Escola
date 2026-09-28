/*
Tipos, decisões, laços e métodos em Java
Responsável: Gilmar da Silva
Conceitos: Métodos recebem parâmetros e retornam resultados. Valide argumentos antes do cálculo; arrays têm tamanho fixo.
Execução: cd 00-fundamentos; javac BasicosDemo.java; java BasicosDemo
Pratique: Teste notas negativas, acima de dez e NaN.
*/
public class BasicosDemo {
    static double media(double[] notas) {
        if (notas.length == 0) throw new IllegalArgumentException("Sem notas");
        double soma = 0;
        for (double nota : notas) {
            if (!Double.isFinite(nota) || nota < 0 || nota > 10) throw new IllegalArgumentException("Nota inválida");
            soma += nota;
        }
        return soma / notas.length;
    }
    public static void main(String[] args) {
        if (media(new double[]{6,8,10}) != 8) throw new AssertionError("Média");
        try { media(new double[0]); throw new AssertionError("Vazio aceito"); }
        catch (IllegalArgumentException e) { System.out.println(e.getMessage()); }
        System.out.println("Gilmar da Silva: " + media(new double[]{6,8,10}));
    }
}
