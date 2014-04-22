using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace moduloPersistencia.dominio
{
    public class Automovel : BaseBean
    {

        public string marca
        {
            get;
            set;
        }

        public string modelo
        {
            get;
            set;
        }

        public Automovel()
        {
        }

        public Automovel(int id, string marca, string modelo)
        {
            this.id = id;
            this.marca = marca;
            this.modelo = modelo;
        }
    }
}
