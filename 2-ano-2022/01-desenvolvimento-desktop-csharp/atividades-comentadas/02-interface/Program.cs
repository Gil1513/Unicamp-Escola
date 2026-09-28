/*
Eventos e validação na interface desktop
Autor: Gilmar da Silva
Matéria: Desenvolvimento de Aplicação Desktop
Conceitos: Aplicações gráficas reagem a eventos. O clique lê a entrada, valida e atualiza a lista; campos vazios e cadastros repetidos são rejeitados.
Objetivo: Adicionar nomes à lista e mostrar uma mensagem para entrada vazia ou repetida.
Execução (nesta pasta): dotnet run --project 02-interface
Pratique: Acrescente exclusão do item selecionado e persistência em JSON usando o exemplo anterior.
*/
using System.Windows.Forms;

internal static class Program
{
    [STAThread]
    static void Main()
    {
        ApplicationConfiguration.Initialize();
        Application.Run(new Cadastro());
    }
}
public class Cadastro : Form
{
    readonly TextBox nome = new() { Width = 300, AccessibleName = "Nome do cadastro" };
    readonly ListBox registros = new() { Width = 360, Height = 180 };
    public Cadastro()
    {
        Text = "Cadastro - Gilmar da Silva"; Width = 440; Height = 340;
        var painel = new FlowLayoutPanel { Dock = DockStyle.Fill, FlowDirection = FlowDirection.TopDown, Padding = new Padding(12) };
        var botao = new Button { Text = "Adicionar", AutoSize = true };
        botao.Click += (_, _) => Adicionar();
        painel.Controls.AddRange([new Label { Text = "Nome", AutoSize = true }, nome, botao, registros]);
        Controls.Add(painel); AcceptButton = botao;
    }
    void Adicionar()
    {
        string valor = nome.Text.Trim();
        if (valor.Length == 0 || registros.Items.Cast<string>().Any(x => x.Equals(valor, StringComparison.OrdinalIgnoreCase)))
        { MessageBox.Show("Informe um nome novo e não vazio."); return; }
        registros.Items.Add(valor); nome.Clear(); nome.Focus();
    }
}
