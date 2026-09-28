/*
Identificação: Gilmar da Silva Filho
Matéria: Desenvolvimento de Aplicação Desktop
Arquivo de estudo: Form1.cs
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

namespace Ex2
{
    public partial class Form1 : Form
    {
        int tempo;
        public Form1()
        {
            InitializeComponent();
        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            tempo++;
            if (tempo <= 10)
            {
                panel1.BackColor = Color.Red;
                panel2.BackColor = Color.Black;
                panel3.BackColor = Color.Black;
            } else if (tempo > 10 && tempo <= 15) {
                panel1.BackColor = Color.Black;
                panel2.BackColor = Color.Yellow;
                panel3.BackColor = Color.Black;
            } if (tempo >= 15 && tempo <= 17)
            {
                panel1.BackColor = Color.Black;
                panel2.BackColor = Color.Black;
                panel3.BackColor = Color.Green;
            } else
            {
                tempo = 0;
            }
        }

        private void Form1_Activated(object sender, EventArgs e)
        {
            timer1.Start();
            panel1.BackColor = Color.Red;
            panel2.BackColor = Color.Black;
            panel3.BackColor = Color.Black;
        }

        private void panel1_Paint(object sender, PaintEventArgs e)
        {
            panel1.BackColor = Color.Black;
        }
    }
}
