using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using moduloPersistencia.dominio;

namespace WebApplication.wrapper
{
    public class IndiceWrapper
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

        public IndiceWrapper()
        {
        }

        public IndiceWrapper(Indice indice)
        {
            this.chave = indice.chave;
            this.link = indice.link;
        }

        public static List<IndiceWrapper> recuperarListaIndiceWrapper(List<Indice> lista)
        {
            List<IndiceWrapper> resultado = new List<IndiceWrapper>();
            foreach (Indice indice in lista)
            {
                resultado.Add(new IndiceWrapper(indice));
            }
            return resultado;
        }
    }
}