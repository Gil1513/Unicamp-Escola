/* 08 — Datas, List, Set, Map e Streams
Gilmar da Silva — 201269
Conceitos: LocalDate representa uma data sem horário. Set elimina duplicatas; Map agrupa por chave; streams encadeiam operações.
Atividade: execute, explique a saída e resolva o desafio.
Desafio: Inclua uma entrega na data limite e agrupe as entregas por mês; use data fixa no teste.
*/

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;
public class DatasColecoesStreams {
    record Entrega(String materia, LocalDate prazo, int pontos) {}
    public static void main(String[] args) {
        LocalDate referencia = LocalDate.of(2023, 10, 1);
        List<Entrega> entregas = List.of(new Entrega("Java", referencia.plusDays(2), 8),
                new Entrega("Java", referencia.plusDays(5), 6), new Entrega("Web", referencia.minusDays(1), 10));
        Set<String> materias = entregas.stream().map(Entrega::materia).collect(Collectors.toSet());
        Map<String,Integer> totais = entregas.stream().collect(Collectors.groupingBy(Entrega::materia, Collectors.summingInt(Entrega::pontos)));
        List<Entrega> pendentes = entregas.stream().filter(e -> !e.prazo().isBefore(referencia))
                .sorted(Comparator.comparing(Entrega::prazo)).toList();
        if (materias.size()!=2 || totais.get("Java")!=14 || pendentes.size()!=2
                || ChronoUnit.DAYS.between(referencia, pendentes.get(0).prazo())!=2) throw new AssertionError();
        System.out.println(totais); System.out.println(pendentes);
    }
}
