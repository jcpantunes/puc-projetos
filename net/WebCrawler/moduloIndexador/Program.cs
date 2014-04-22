using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;
using moduloPersistencia.dominio;
using moduloPersistencia.persistencia;
using moduloIndexador.util;

namespace moduloIndexador
{
    class Program
    {
        static void Main(string[] args)
        {
            // TesteIndexador teste = new TesteIndexador();
            // teste.indexarTeste();

            //MyQueue.ControleQueue controleQueue = new MyQueue.ControleQueue();
            //while (true)
            //{
            //    var msg = controleQueue.ReadNextMensage();
            //    if (msg != null)
            //    {
            //        int id = int.Parse(msg);
            //        IndexIdgNow(id);
            //    }
            //    Thread.Sleep(500);
            //}


            IndexadorLink indexador = new IndexadorLink();

            LinkDAO linkDao = new LinkDAO();
            List<Link> listaLink = linkDao.listarPorSituacao(Link.SITUACAO_URL_NAO_INDEXADA);
            if (listaLink.Count > 0)
            {
                indexador.indexar(listaLink);
            }

            Console.WriteLine("PRESSIONE ENTER PARA FINALIZAR ....");
            System.Console.In.ReadLine();
        }
    }
}
