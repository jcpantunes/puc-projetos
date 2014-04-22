using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.ServiceModel.Web;
using System.Text;
using moduloIndexador;

namespace moduloIndexadorWCF
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the class name "Service1" in code, svc and config file together.
    public class IndexadorWS : IIndexadorWS
    {
        /// Realiza a busca do link no banco de dados e indexa somente o link.
        /// <param name="identificador">identificador do link a ser recuperado do banco de dados</param>
        public string indexarLink(int identificador, bool novoAgente)
        {
            Indexador indexador = new Indexador(identificador);
            if (novoAgente)
            {
                return indexador.indexarLinkNovoAgente();
            }
            else
            {
                return indexador.indexarLink();
            }
        }
    }
}
