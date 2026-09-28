/*
Persistência com arquivos e tratamento de recursos
Autor: Gilmar da Silva
Matéria: Linguagem de Programação Multiplataforma — Java
Conceitos: Persistir significa manter dados além da execução. Files lê e escreve texto UTF-8; try/finally garante limpeza. Aqui o arquivo é temporário para que a demonstração não deixe dados pessoais.
Objetivo: Gravar três matérias, reler e localizar Java.
Execução (nesta pasta): java 03-arquivos/ArquivoDemo.java
Pratique: Troque o arquivo temporário por um caminho recebido em argumento e defina uma regra para não sobrescrever arquivos existentes.
*/
import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class ArquivoDemo {
    public static void main(String[] args) throws java.io.IOException {
        Path arquivo = Files.createTempFile("cotil-materias-", ".txt");
        try {
            Files.write(arquivo, Arrays.asList("Java", "Banco de Dados", "Web"), StandardCharsets.UTF_8);
            List<String> materias = Files.readAllLines(arquivo, StandardCharsets.UTF_8);
            System.out.println("Matérias: " + materias.size());
            System.out.println("Contém Java: " + materias.contains("Java"));
        } finally { Files.deleteIfExists(arquivo); }
    }
}
