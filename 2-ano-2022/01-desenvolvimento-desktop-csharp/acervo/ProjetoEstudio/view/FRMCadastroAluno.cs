/*
Identificação: Gilmar da Silva Filho
Matéria: Desenvolvimento de Aplicação Desktop
Arquivo de estudo: FRMCadastroAluno.cs
Explicação: classes agrupam dados e comportamentos; controles e eventos compõem uma interface gráfica.
Estudo: acompanhe a entrada, o processamento e a saída; teste também um caso limite.
Consulte o README da matéria para a sequência de estudo e execução.
*/
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ProjetoEstudio
{
    public partial class FRMCadastroAluno : Form
    {
        public FRMCadastroAluno()
        {
            InitializeComponent();
        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void lblCEP_Click(object sender, EventArgs e)
        {

        }

        private void lblEndereco_Click(object sender, EventArgs e)
        {

        }

        private void lblEstado_Click(object sender, EventArgs e)
        {

        }

        private void maskedTextBox1_MaskInputRejected(object sender, MaskInputRejectedEventArgs e)
        {

        }

        private void btnCadastrar_Click(object sender, EventArgs e)
        {
            Aluno aluno = new Aluno(txtCPF.Text, txtNome.Text, txtEndereco.Text, txtNumero.Text, txtBairro.Text, txtComplemento.Text, txtCEP.Text, txtCidade.Text, txtEstado.Text, txtTelefone.Text, txtEmail.Text, true);
            if(aluno.cadAluno())
            {
                MessageBox.Show("Aluno cadastrado com sucesso");
            } else
            {
                MessageBox.Show("Erro ao cadastrar aluno...");
            }

        }

        private void textBox3_TextChanged(object sender, EventArgs e)
        {

        }

        private void CadastroAluno_Load(object sender, EventArgs e)
        {

        }

        private void listView1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void txtCPF_Leave(object sender, EventArgs e)
        {

        }
    }
}
