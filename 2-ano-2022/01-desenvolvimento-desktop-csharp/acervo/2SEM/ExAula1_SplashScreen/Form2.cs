/*
Identificação: Gilmar da Silva
Matéria: Desenvolvimento de Aplicação Desktop
Arquivo de estudo: Form2.cs
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

namespace ExAula1_SplashScreen
{
    public partial class SplashScreen : Form
    {
        public SplashScreen()
        {
            InitializeComponent();
        }

        private void TimerProgressBar(object sender, EventArgs e)
        {
            progressBar1.Increment(30);
            if (progressBar1.Value==100)
            {
                timer1.Enabled = false;
                // ou timer.Stop();
            }
        }
    }
}
