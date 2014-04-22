using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace moduloPersistencia.dominio
{
    public class Log : BaseBean
    {
        public string data
        {
            get;
            set;
        }

        public string tipo
        {
            get;
            set;
        }

        public string mensagem
        {
            get;
            set;
        }

        public Log()
        {
        }

        public Log(int id, string data, string tipo, string mensagem)
        {
            this.id = id;
            this.data = data;
            this.tipo = tipo;
            this.mensagem = mensagem;
        }
    }
}
