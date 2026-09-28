/*
Interfaces, coleções e exceções
Autor: Gilmar da Silva Filho
Matéria: Linguagem de Programação Multiplataforma — Java
Material complementar de revisão; não é uma reprodução das aulas de 2021–2023.
Conceitos: List mantém uma sequência; Map associa chave e valor. Uma interface especifica um contrato. Exceções comunicam entradas inválidas sem inventar um resultado.
Objetivo: Agrupar notas por matéria e calcular média 8.0; rejeitar lista vazia.
Execução (nesta pasta): java 02-colecoes/ColecoesDemo.java
Pratique: Use Set para deduplicar matérias e ordene o resultado alfabeticamente.
*/
import java.util.*;

public class ColecoesDemo {
    interface Resumo { double calcular(List<Double> valores); }
    static class Media implements Resumo {
        public double calcular(List<Double> valores) {
            if (valores.isEmpty()) throw new IllegalArgumentException("Sem notas");
            double soma = 0;
            for (double nota : valores) {
                if (!Double.isFinite(nota) || nota < 0 || nota > 10)
                    throw new IllegalArgumentException("Nota inválida");
                soma += nota;
            }
            return soma / valores.size();
        }
    }
    public static void main(String[] args) {
        Map<String, List<Double>> notas = new TreeMap<>();
        notas.put("Java", new ArrayList<>(Arrays.asList(7.0, 9.0)));
        Resumo resumo = new Media();
        notas.forEach((materia, valores) -> System.out.println(materia + ": " + resumo.calcular(valores)));
        try { resumo.calcular(Collections.emptyList()); }
        catch (IllegalArgumentException e) { System.out.println(e.getMessage()); }
    }
}
