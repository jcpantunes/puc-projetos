using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.ServiceModel.Web;
using System.Text;

namespace moduloNotificadorWCF
{
    public class NotificadorService : INotificadorService
    {
        private static int valorAtual = 0;

        public bool notificarAtualizacao()
        {
            Notificador.getInstance().iniciarNotificacao();

            valorAtual = Notificador.tamanhoLog;

            if (Notificador.tamanhoLog != valorAtual)
            {
                return true;
            }
            else
            {
                return false;
            } 
        }
    }
}
