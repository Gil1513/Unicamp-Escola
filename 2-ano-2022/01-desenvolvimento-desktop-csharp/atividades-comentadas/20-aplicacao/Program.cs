/*
C#: interface, LINQ, async/await e persistência JSON
Gilmar da Silva — 201269
Conceitos: Separe a regra do armazenamento por uma interface; await aguarda I/O e LINQ consulta objetos.
Execute: dotnet run --project 20-aplicacao/Aplicacao.csproj
Desafio: Crie um repositório em memória e troque a implementação sem alterar a consulta.
*/

using System.Text.Json;
var pasta=Path.Combine(Path.GetTempPath(),Guid.NewGuid().ToString());
Directory.CreateDirectory(pasta);
try {
    IRepositorio repo=new RepositorioJson(Path.Combine(pasta,"alunos.json"));
    var alunos=new List<Aluno> { new(201269,"Gilmar da Silva",8),new(2,"Aluno de exemplo",4) };
    await repo.Salvar(alunos);
    var recuperados=await repo.Ler();
    var aprovados=recuperados.Where(a=>a.Nota>=6).OrderBy(a=>a.Nome).ToList();
    if(aprovados.Count!=1 || aprovados[0].Ra!=201269) throw new Exception("Consulta incorreta");
    Console.WriteLine(JsonSerializer.Serialize(aprovados));
} finally { Directory.Delete(pasta,true); }
record Aluno(int Ra,string Nome,decimal Nota);
interface IRepositorio {
    Task Salvar(List<Aluno> alunos);
    Task<List<Aluno>> Ler();
}
sealed class RepositorioJson(string caminho):IRepositorio {
    public async Task Salvar(List<Aluno> alunos) => await File.WriteAllTextAsync(caminho,JsonSerializer.Serialize(alunos));
    public async Task<List<Aluno>> Ler() => JsonSerializer.Deserialize<List<Aluno>>(await File.ReadAllTextAsync(caminho)) ?? new();
}
