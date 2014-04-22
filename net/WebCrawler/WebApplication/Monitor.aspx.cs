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
        protected void Page_Init(object sender, EventArgs e)
        {
            if (gridLog != null)
            {
                LogDAO dao = new LogDAO();
                List<Log> lista = dao.listarUltimos();
                gridLog.DataSource = LogWrapper.recuperarListaLogWrapper(lista);
                gridLog.DataBind();
            }
        }

        protected void btnIniciarMonitor_Click(object sender, EventArgs e)
        {
            MonitorServiceReference.MonitorServiceClient client = new MonitorServiceReference.MonitorServiceClient();
            lblMensagem.Text = client.iniciarMonitoramento();
            lblMensagem.Visible = true;
        }

        protected void btnPararMonitor_Click(object sender, EventArgs e)
        {
            MonitorServiceReference.MonitorServiceClient client = new MonitorServiceReference.MonitorServiceClient();
            lblMensagem.Text = client.pararMonitoramento();
            lblMensagem.Visible = true;
        }

        protected void btnListarLog_Click(object sender, EventArgs e)
        {
            LogDAO dao = new LogDAO();
            List<Log> lista = dao.listarUltimos();
            gridLog.DataSource = LogWrapper.recuperarListaLogWrapper(lista);
            gridLog.DataBind();

        }

        
    }
}