using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Net;
using System.IO;
using moduloRastreador.util;
using moduloPersistencia.dominio;
using moduloPersistencia.persistencia;

namespace moduloRastreador
{
    class Program
    {
        // private static string arquivo_links = @"C:\Users\Julio\Documents\Visual Studio 2012\Projects\WebCrawler\moduloRastreador\links.txt";
        
        static void Main(string[] args)
        {
            LinkDAO dao = new LinkDAO();
            // dao.insert(new Link(0, "http://www.seminovosbh.com.br", "", "", Link.SITUACAO_URL_NAO_RASTREADA));
            
            List<Link> listaNaoRastreada = dao.listarPorSituacao(Link.SITUACAO_URL_NAO_RASTREADA);
            // foreach (string linha in File.ReadLines(arquivo_links))
            if (listaNaoRastreada.Count > 0)
            {
                foreach (Link link in listaNaoRastreada)
                {
                    ConsultarLink consultarLink = new ConsultarLink();
                    consultarLink.executarRastreamento(2, link.contexto, link.href);
                }
                dao.updateSituacao(listaNaoRastreada, Link.SITUACAO_URL_RASTREADA);
            }
            
            System.Console.WriteLine("PRESSIONE ENTER PARA FINALIZAR ....");
            System.Console.In.ReadLine();
        }
    }
}
