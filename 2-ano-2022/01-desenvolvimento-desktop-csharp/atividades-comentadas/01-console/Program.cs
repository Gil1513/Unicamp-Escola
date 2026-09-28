/*
Classes, validação e persistência em C#
Autor: Gilmar da Silva
Matéria: Desenvolvimento de Aplicação Desktop
Conceitos: Propriedades encapsulam dados; decimal evita erros binários comuns em valores decimais. JSON serializa objetos. try/finally assegura a limpeza do arquivo temporário.
Objetivo: Recuperar o produto Caderno com preço 12.50 e rejeitar preço negativo.
Execução (nesta pasta): dotnet run --project 01-console
Pratique: Acrescente quantidade e calcule o valor em estoque, validando a entrada.
*/
using System.Text.Json;
using System.Globalization;

var produto = new Produto("Caderno", 12.50m);
string arquivo = Path.GetTempFileName();
try
{
    File.WriteAllText(arquivo, JsonSerializer.Serialize(produto));
    var recuperado = JsonSerializer.Deserialize<Produto>(File.ReadAllText(arquivo))
        ?? throw new InvalidDataException("Cadastro vazio.");
    Console.WriteLine($"{recuperado.Nome}: {recuperado.Preco.ToString("F2", CultureInfo.InvariantCulture)}");
    try { _ = new Produto("Inválido", -1); }
    catch (ArgumentException) { Console.WriteLine("Preço inválido rejeitado."); }
}
finally { File.Delete(arquivo); }

public class Produto
{
    public string Nome { get; }
    public decimal Preco { get; }
    public Produto(string nome, decimal preco)
    {
        if (string.IsNullOrWhiteSpace(nome)) throw new ArgumentException("Nome obrigatório.");
        if (preco < 0) throw new ArgumentException("Preço não pode ser negativo.");
        Nome = nome.Trim(); Preco = preco;
    }
}
