using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Net;
using moduloPersistencia.dominio;
using moduloPersistencia.persistencia;
using moduloPersistencia.util;

namespace moduloRastreador.util
{
    class ConsultarLink
    {
        // private int NIVEL = 2;
        
        public string executarRastreamento(int nivelMaximo, string webContext, string pagina)
        {
            WebClient client = new WebClient();
            // PucWebClient client = new PucWebClient();

            LinkDAO dao = new LinkDAO();
            List<Link> lista = dao.listarPorContexto(webContext);
            if (lista.Count > 0)
            {
                dao.deletePorContexto(webContext);
            }
            List<Link> listaLink = new List<Link>();
            recuperarLinksRecursivo(listaLink, client, nivelMaximo, webContext, pagina, 0);
            if (listaLink.Count > 0)
            {
                dao.insert(listaLink);
            }
            return "";
        }

        private void recuperarLinksRecursivo(List<Link> listaLink, WebClient client, int nivelMaximo, String webContext, string pagina, int nivelAtual)
        {
            try
            {
                string conteudo = client.DownloadString(webContext + pagina);
                if (conteudo != null)
                {
                    // System.Console.WriteLine(webContext + pagina);
                    Logger.getInstance().log("Link rastreado: " + webContext + pagina, Logger.INFO, true);
                    listaLink.Add(new Link(0, webContext, pagina, conteudo, Link.SITUACAO_URL_NAO_INDEXADA));

                    // Escrever toda a pagina no arquivo - SERA REALIZADO PELO INDEXADOR
                    /*string nomeArquivoPorLink = "pagina_" + contador + ".txt";
                    contador = contador + 1;
                    System.IO.File.WriteAllText(path + nomeArquivoPorLink, resultado);*/

                    if ((nivelAtual + 1) < nivelMaximo)
                    {
                        foreach (LinkItem item in LinkFinder.Find(conteudo))
                        {
                            if (!String.IsNullOrEmpty(item.Href) && !item.Href.StartsWith("http")
                                && !item.Href.StartsWith("javascript:window") && !item.Href.StartsWith("javascript:")
                                && item.Href.Length > 1 && !contemLink(listaLink, webContext, item.Href))
                            {
                                recuperarLinksRecursivo(listaLink, client, nivelMaximo, webContext, item.Href, nivelAtual + 1);
                            }
                        }
                    }
                }
            }
            catch (Exception e)
            {
                Logger.getInstance().log("Erro ao tentar rastrear Link: " + webContext + pagina + ": " + e.Message, Logger.ERRO);
            }
        }

        private bool contemLink(List<Link> listaLink, String webContext, string href)
        {
            foreach (Link link in listaLink)
            {
                if (link.contexto.Equals(webContext, StringComparison.CurrentCultureIgnoreCase)
                    && link.href.Equals(href, StringComparison.CurrentCultureIgnoreCase))
                {
                    return true;
                }
            }
            return false;
        }
    }
}
