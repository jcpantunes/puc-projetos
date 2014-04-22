using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using moduloPersistencia.dominio;
using moduloPersistencia.persistencia;
using moduloPersistencia.util;
using moduloRastreador.util;

namespace moduloRastreador
{
    public class Rastreador
    {
        public Rastreador() { }

        public List<Link> rastrearLink(int nivel)
        {
            Logger.getInstance().log("Rastreando links do banco de dados", Logger.INFO, true);
            return rastrearListaLinks(nivel);
        }

        public List<Link> rastrearLink(String link, int nivel)
        {
            Logger.getInstance().log("Rastreando link: " + link, Logger.INFO, true);
            LinkDAO dao = new LinkDAO();
            dao.insert(new Link(0, link, "", "", Link.SITUACAO_URL_NAO_RASTREADA));
            return rastrearListaLinks(nivel);
        }

        private List<Link> rastrearListaLinks(int nivel)
        {
            LinkDAO dao = new LinkDAO();
            List<Link> listaNaoRastreada = dao.listarPorSituacao(Link.SITUACAO_URL_NAO_RASTREADA);
            Logger.getInstance().log("Numero de links Nao Rastreandos retornados : " + listaNaoRastreada.Count, Logger.INFO, true);
            if (listaNaoRastreada.Count > 0)
            {
                foreach (Link linkNaoRastreado in listaNaoRastreada)
                {
                    ConsultarLink consultarLink = new ConsultarLink();
                    consultarLink.executarRastreamento(nivel, linkNaoRastreado.contexto, linkNaoRastreado.href);
                }
                dao.updateSituacao(listaNaoRastreada, Link.SITUACAO_URL_RASTREADA);
            }
            List<Link> listaNaoIndexada = dao.listarPorSituacao(Link.SITUACAO_URL_NAO_INDEXADA);
            return listaNaoIndexada;
        }
    }
}
