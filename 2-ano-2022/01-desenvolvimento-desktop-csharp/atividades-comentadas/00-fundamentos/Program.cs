/*
Tipos, coleções, métodos e exceções em C#
Responsável: Gilmar da Silva
Conceitos: TryParse trata entrada inválida sem exceção. List e LINQ permitem selecionar e agregar; regras do domínio podem lançar ArgumentException.
Execução: dotnet run --project 00-fundamentos/Fundamentos.csproj
Pratique: Encapsule as notas em uma classe e adicione um evento de aprovação.
*/
using System;
using System.Collections.Generic;
using System.Linq;
static decimal Media(List<decimal> notas) {
    if (notas.Count == 0 || notas.Any(n => n < 0 || n > 10))
        throw new ArgumentException("Informe notas de zero a dez.");
    return notas.Average();
}
var notas = new List<decimal>();
foreach (var entrada in new[] { "6", "8", "10", "erro" }) {
    if (decimal.TryParse(entrada, out var nota)) notas.Add(nota);
    else Console.WriteLine("Entrada rejeitada: " + entrada);
}
if (Media(notas) != 8m) throw new Exception("Média incorreta");
try { Media(new List<decimal>()); throw new Exception("Lista vazia aceita"); }
catch (ArgumentException) { Console.WriteLine("Lista vazia rejeitada."); }
Console.WriteLine($"Gilmar da Silva: {Media(notas)}");

var contador = new Contador();
var notificacoes = new List<int>();
contador.Alterado += valor => notificacoes.Add(valor);
contador.Incrementar(); contador.Incrementar();
if (!notificacoes.SequenceEqual(new[] {1, 2})) throw new Exception("Evento não disparou");
Console.WriteLine("Eventos recebidos: " + string.Join(", ", notificacoes));
