using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using WebApplication.wrapper;
using moduloPersistencia.dominio;
using moduloPersistencia.persistencia;

namespace WebApplication
{
    public partial class Buscador : Page
    {
       
        protected void Button1_Click(object sender, EventArgs e)
        {
            if (txtPesquisar.Text.Length > 0)
            {
                IndiceDAO indiceDAO = new IndiceDAO();
                List<Indice> lista = indiceDAO.listarPorChave(txtPesquisar.Text);

                gridIndice.DataSource = IndiceWrapper.recuperarListaIndiceWrapper(lista);
                gridIndice.DataBind();
            }
        }

    }
}