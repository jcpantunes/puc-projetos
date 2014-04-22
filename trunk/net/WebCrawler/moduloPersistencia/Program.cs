using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using moduloPersistencia.dominio;
using moduloPersistencia.persistencia;

namespace moduloPersistencia
{
    class Program
    {
        static void Main(string[] args)
        {
            Program prg = new Program();
            // prg.testarLink();
            // prg.testarAutomovel();
            // prg.testarIndice();
            prg.testarLog();
            
            Console.WriteLine("PRESSIONE ENTER PARA FINALIZAR ....");
            System.Console.In.ReadLine();
        }

        private void testarLog()
        {
            LogDAO dao = new LogDAO();
            
            dao.insert(new Log(0, "14/10/2013", "INFO", "Teste 1"));
            dao.insert(new Log(0, "15/10/2013", "INFO", "Teste 2"));

            List<Log> lista1 = dao.listarUltimos();
            for (int i = 0; i < lista1.Count; i++)
            {
                Console.WriteLine("1 => " + lista1.ElementAt(i).data + " | " + lista1.ElementAt(i).mensagem);
            }
        }

        private void testarIndice()
        {
            IndiceDAO dao = new IndiceDAO();
            List<Indice> lista = new List<Indice>();
            lista.Add(new Indice(0, "celta", "http://www.teste.com/celta"));
            lista.Add(new Indice(0, "ka", "http://www.teste.com/ka"));
            dao.insert(lista);

            List<Indice> lista1 = dao.listar();
            for (int i = 0; i < lista1.Count; i++)
            {
                Console.WriteLine("1 => " + lista1.ElementAt(i).chave + " | " + lista1.ElementAt(i).link);
            }
        }

        private void testarAutomovel()
        {
            AutomovelDAO dao = new AutomovelDAO();
            //dao.delete();
            //dao.insert(new Automovel(0, "Ford", "Ka"));
            //dao.insert(new Automovel(0, "Fiat", "Uno"));

            //List<Automovel> lista1 = dao.listar();
            //for (int i = 0; i < lista1.Count; i++)
            //{
            //    Console.WriteLine("1 => " + lista1.ElementAt(i).marca + " | " + lista1.ElementAt(i).modelo);
            //}

            //List<Automovel> lista2 = dao.listarPorMarca("Ford");
            //for (int i = 0; i < lista2.Count; i++)
            //{
            //    Console.WriteLine("2 => " + lista2.ElementAt(i).marca + " | " + lista2.ElementAt(i).modelo);
            //}

            //List<Automovel> lista3 = dao.listarPorMarca("Uno");
            //for (int i = 0; i < lista3.Count; i++)
            //{
            //    Console.WriteLine("3 => " + lista3.ElementAt(i).marca + " | " + lista3.ElementAt(i).modelo);
            //}

            //List<Automovel> lista4 = dao.listarPorMarcaModelo("Fiat", "Uno");
            //for (int i = 0; i < lista4.Count; i++)
            //{
            //    Console.WriteLine("4 => " + lista4.ElementAt(i).marca + " | " + lista4.ElementAt(i).modelo);
            //}
            string arquivo = @"C:\Users\Julio\Documents\Visual Studio 2012\Projects\WebCrawler\moduloPersistencia\automovel.txt";
            // string arquivo = @"C:\Users\05163217658\Documents\pessoal\puc\net\WebCrawler\moduloPersistencia\automovel.txt";
            dao.preencheTabela(arquivo);
        }

        private void testarLink()
        {
            LinkDAO dao = new LinkDAO();
            List<Link> lista = new List<Link>();
            lista.Add(new Link(882, "http://www.seminovosbh.com.br", "/parceiros", "", Link.SITUACAO_URL_RASTREADA));
            dao.updateSituacao(lista, Link.SITUACAO_URL_INDEXADA);
            // dao.delete();

            //int k = 2;
            //dao.insert(new Link(0, "http://www.teste.com", "/teste" + k, "texto" + k, Link.SITUACAO_URL_RASTREADA));

            // List<Link> lista = dao.listar();
            //List<Link> lista = dao.listarPorContexto("http://www.seminivosbh.com");
            //for (int i = 0; i < lista.Count; i++)
            //{
            //    Console.WriteLine(" => " + lista.ElementAt(i).contexto + " | " + lista.ElementAt(i).href);
            //}
            // dao.delete("http://www.seminivosbh.com");
        }
    }
}
