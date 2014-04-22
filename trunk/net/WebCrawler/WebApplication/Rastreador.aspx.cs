using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace WebApplication
{
    public partial class Rastreador : Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void btnRastreamento_Click(object sender, EventArgs e)
        {
            if (txtLinkRastreamento.Text.Length > 0)
            {
                string link = txtLinkRastreamento.Text;
                int nivel = int.Parse(cmbNivel.SelectedValue);

                RastreadorServiceReference.RastreadorWSClient client = new RastreadorServiceReference.RastreadorWSClient();
                client.rastrearLink(link, nivel);
                lblMensagemRastreamento.Text = "Rastreamento iniciado com sucesso.";
                lblMensagemRastreamento.Visible = true;
            }
        }
    }
}