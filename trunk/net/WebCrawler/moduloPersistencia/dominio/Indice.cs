using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace moduloPersistencia.dominio
{
    public class Indice : BaseBean
    {

        public string chave
        {
            get;
            set;
        }

        public string link
        {
            get;
            set;
        }

        public Indice()
        {
        }

        public Indice(int id, string chave, string link)
        {
            this.id = id;
            this.chave = chave;
            this.link = link;
        }
    }
}
