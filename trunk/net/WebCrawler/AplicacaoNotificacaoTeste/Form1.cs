using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace AplicacaoNotificacaoTeste
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            AplicacaoNotificacaoTeste.ServiceReference1.NotificadorServiceClient cliente = 
                new ServiceReference1.NotificadorServiceClient();

            if (cliente.notificarAtualizacao())
            {
                textBox1.Text = "Existem novas atualizações para pesquisa";
            }
            else
            {
                textBox1.Text = "Não existem novas atualizações para pesquisa";
            }
        }
    }
}
