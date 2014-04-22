using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using moduloPersistencia.dominio;
using moduloPersistencia.persistencia;
using WebApplication.wrapper;

namespace WebApplication
{
    public partial class Monitor : Page
    {

        protected void Button3_Click(object sender, EventArgs e)
        {
            MonitorServiceReference.MonitorServiceClient client = new MonitorServiceReference.MonitorServiceClient();
            string mensagem = client.listarMensagensFila();

            List<string> ds = new List<string>();
            if (mensagem.Length > 0)
            {
                string[] lista = mensagem.Split(';');
                foreach (string msg in lista)
                {
                    ds.Add(msg);
                }
                lblMensagemFila.Visible = false;
            }
            else
            {
                lblMensagemFila.Text = "Nao há mensagens na fila.";
                lblMensagemFila.Visible = true;
            }
            gridMensagemFila.DataSource = ds;
            gridMensagemFila.DataBind();
        }

        protected void btnInserirFila_Click(object sender, EventArgs e)
        {
            if (txtMensagem.Text.Length > 0)
            {
                MonitorServiceReference.MonitorServiceClient client = new MonitorServiceReference.MonitorServiceClient();
                client.inserirFila(txtMensagem.Text);
                lblMensagemFila.Text = "Mensagem inserida na fila com sucesso.";
                lblMensagemFila.Visible = true;
            }
        }
    }
}