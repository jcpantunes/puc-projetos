using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.ServiceModel.Web;
using System.Text;
using System.Diagnostics;
using moduloMonitorWCF.myqueue;
using moduloPersistencia.util;

namespace moduloMonitorWCF
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the class name "MonitorService" in code, svc and config file together.
    // NOTE: In order to launch WCF Test Client for testing this service, please select MonitorService.svc or MonitorService.svc.cs at the Solution Explorer and start debugging.
    public class MonitorService : IMonitorService
    {
        public string iniciarMonitoramento()
        {
            return MonitorFila.getInstance().iniciarMonitoramento();
        }

        public string pararMonitoramento()
        {
            return MonitorFila.getInstance().pararMonitoramento();
        }

        public void inserirFila(string mensagem)
        {
            MyQueue.getInstance().inserirFila(mensagem);
        }

        public string lerProximaMensagem()
        {
            return MyQueue.getInstance().lerProximaMensagem();
        }

        public string listarMensagensFila()
        {
            return MyQueue.getInstance().listarMensagemFila();
        }
    }
}
