using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.ServiceModel.Web;
using System.Text;

namespace moduloMonitorWCF
{
    /*
     * http://localhost:24002/MonitorService.svc 
    */

    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the interface name "IMonitorService" in both code and config file together.
    [ServiceContract]
    public interface IMonitorService
    {
        [OperationContract]
        string iniciarMonitoramento();

        [OperationContract]
        string pararMonitoramento();

        [OperationContract]
        void inserirFila(string mensagem);

        [OperationContract]
        string lerProximaMensagem();

        [OperationContract]
        string listarMensagensFila();
    }
}
