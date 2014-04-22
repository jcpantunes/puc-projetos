using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.ServiceModel.Web;
using System.Text;
using moduloPersistencia.dominio;
using moduloRastreador;

namespace moduloRastreadorWCF
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the class name "Service1" in code, svc and config file together.
    // NOTE: In order to launch WCF Test Client for testing this service, please select Service1.svc or Service1.svc.cs at the Solution Explorer and start debugging.
    public class RastreadorWS : IRastreadorWS
    {
        public void rastrear(int nivel)
        {
            Rastreador rastreador = new Rastreador();
            List<Link> listaNaoIndexada = rastreador.rastrearLink(nivel);

            foreach (Link linkRastreado in listaNaoIndexada)
            {
                MonitorServiceReference.MonitorServiceClient client = new MonitorServiceReference.MonitorServiceClient();
                client.inserirFila(linkRastreado.id.ToString());
            }
        }

        public void rastrearLink(string link, int nivel)
        {
            Rastreador rastreador = new Rastreador();
            List<Link> listaNaoIndexada = rastreador.rastrearLink(link, nivel);

            foreach (Link linkRastreado in listaNaoIndexada)
            {
                MonitorServiceReference.MonitorServiceClient client = new MonitorServiceReference.MonitorServiceClient();
                client.inserirFila(linkRastreado.id.ToString());
            }
        }
    }
}
