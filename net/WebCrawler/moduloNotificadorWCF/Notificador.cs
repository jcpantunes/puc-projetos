using moduloPersistencia.dominio;
using moduloPersistencia.persistencia;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading;
using System.Web;

namespace moduloNotificadorWCF
{
    public class Notificador
    {
        public static Notificador instance = null;
        public static int tamanhoLog = 0;
        
        public static Notificador getInstance()
        {
            if (instance == null)
            {
                instance = new Notificador();
            }
            return instance;
        }

        public void iniciarNotificacao()
        {
            Thread thread = new Thread(notificar);
            thread.Start();
        }

        private void notificar()
        {
            while (true)
            {
                LogDAO logDAO = new LogDAO();
                List<Log> listaLog = logDAO.listar();

                tamanhoLog = listaLog.Count;

                //10 segundos
                Thread.Sleep(10000);
            }
        }
    }
}