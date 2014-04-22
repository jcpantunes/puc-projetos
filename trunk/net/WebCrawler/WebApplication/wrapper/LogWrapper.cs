using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using moduloPersistencia.dominio;

namespace WebApplication.wrapper
{
    public class LogWrapper
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

        public LogWrapper()
        {
        }

        public LogWrapper(Log log)
        {
            this.data = log.data;
            this.tipo = log.tipo;
            this.mensagem = log.mensagem;
        }

        public static List<LogWrapper> recuperarListaLogWrapper(List<Log> lista)
        {
            List<LogWrapper> resultado = new List<LogWrapper>();
            foreach (Log objeto in lista)
            {
                resultado.Add(new LogWrapper(objeto));
            }
            return resultado;
        }
    }
}