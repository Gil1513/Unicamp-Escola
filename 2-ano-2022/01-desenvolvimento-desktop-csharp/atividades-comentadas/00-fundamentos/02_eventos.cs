/*
Eventos e encapsulamento
Responsável: Gilmar da Silva
Conceitos: Um evento notifica assinantes quando algo muda. O publicador protege o estado e não conhece a interface.
Execução: dotnet run --project 00-fundamentos/Fundamentos.csproj
Pratique: Crie um assinante no Program.cs e confirme que duas chamadas produzem dois avisos.
*/
// Arquivo incluído automaticamente no projeto Fundamentos.csproj.
public sealed class Contador {
    public int Valor { get; private set; }
    public event System.Action<int>? Alterado;
    public void Incrementar() {
        Valor++;
        Alterado?.Invoke(Valor);
    }
}
