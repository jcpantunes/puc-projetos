using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using moduloIndexador.util;
using moduloPersistencia.dominio;
using moduloPersistencia.persistencia;
using System.Threading;
using System.Threading.Tasks;
using moduloPersistencia.util;

namespace moduloIndexador
{
    public class Indexador
    {
        private int identificador = 0;

        public Indexador(int identificador)
        {
            this.identificador = identificador;
        }

        /// Realiza a busca de todos os links que estao com a situacao de Nao Indexado e indexa a lista de links.
        public string indexarListaLink()
        {
            LinkDAO linkDao = new LinkDAO();
            List<Link> listaLink = linkDao.listarPorSituacao(Link.SITUACAO_URL_NAO_INDEXADA);
            if (listaLink.Count > 0)
            {
                IndexadorLink indexador = new IndexadorLink();
                indexador.indexar(listaLink);
            }

            return "Links indexados com sucesso!";
        }

        /// Realiza a busca do link no banco de dados e indexa somente o link.
        /// <param name="id">identificador do link a ser recuperado do banco de dados</param>
        public string indexarLink()
        {
            indexarLinkSolicitado();
            return "Link " + this.identificador + " indexado com sucesso!";
        }

        /// Cria um novo agente e Realiza a busca do link no banco de dados e indexa somente o link.
        /// <param name="id">identificador do link a ser recuperado do banco de dados</param>
        public string indexarLinkNovoAgente()
        {
            Logger.getInstance().log("Novo Agente de indexacao solicitado ....", Logger.INFO, true);

            Thread thread = new Thread(indexarLinkSolicitado);
            thread.Start();
            return "Link " + this.identificador + " indexado com sucesso!";
        }

        /// Realiza a busca do link no banco de dados e indexa somente o link.
        /// <param name="id">identificador do link a ser recuperado do banco de dados</param>
        private void indexarLinkSolicitado()
        {
            LinkDAO linkDAO = new LinkDAO();
            Link link = linkDAO.listar(this.identificador);
            if (link != null)
            {
                List<Link> listaLink = new List<Link>();
                listaLink.Add(link);

                IndexadorLink indexador = new IndexadorLink();
                indexador.indexar(listaLink);
            }
        }
    }
}
