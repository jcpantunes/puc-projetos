using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace moduloPersistencia.dominio
{
    public class Link : BaseBean
    {
        public static string SITUACAO_URL_NAO_RASTREADA = "SNR";

        public static string SITUACAO_URL_RASTREADA = "SUR";

        public static string SITUACAO_URL_NAO_INDEXADA = "SNI";

        public static string SITUACAO_URL_INDEXADA = "SUI";

        public string contexto
        {
            get;
            set;
        }

        public string href
        {
            get;
            set;
        }

        public string conteudo
        {
            get;
            set;
        }

        public string situacao
        {
            get;
            set;
        }

        public Link()
        {
        }

        public Link(int id, string contexto, string href, string conteudo, string situacao)
        {
            this.id = id;
            this.contexto = contexto;
            this.href = href;
            this.conteudo = conteudo;
            this.situacao = situacao;
        }
    }
}
