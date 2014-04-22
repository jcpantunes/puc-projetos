using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.IO;
using Lucene.Net.Analysis;
using Lucene.Net.Analysis.Standard;
using Lucene.Net.Documents;
using Lucene.Net.Index;
using Lucene.Net.Store;
using Lucene.Net.QueryParsers;
using Lucene.Net.Search;
using moduloPersistencia.dominio;
using moduloPersistencia.persistencia;
using moduloPersistencia.util;
using Directory = Lucene.Net.Store.Directory;
using Version = Lucene.Net.Util.Version;

namespace moduloIndexador.util
{
    class IndexadorLink
    {
        private string CAMPO_ID = "id";
        private string CAMPO_CONTEUDO = "conteudo";
        private string CAMPO_LINK = "link";

        public IndexadorLink() {}

        public void indexar(List<Link> listaLink)
        {
            try
            {
                AutomovelDAO automovelDao = new AutomovelDAO();
                List<Automovel> listaAutomovel = automovelDao.listar();

                if (listaLink.Count > 0 && listaAutomovel.Count > 0)
                {
                    IndiceDAO indiceDAO = new IndiceDAO();
                    indiceDAO.deletePorLink(listaLink);
                    
                    List<Indice> listaIndice = indexarLista(listaLink, listaAutomovel);
                    indiceDAO.insert(listaIndice);

                    LinkDAO linkDAO = new LinkDAO();
                    linkDAO.updateSituacao(listaLink, Link.SITUACAO_URL_INDEXADA);
                }
            }
            catch (Exception e) 
            {
                Logger.getInstance().log(e.Message, Logger.ERRO, true);
            }
        }

        public List<Indice> indexarLista(List<Link> listaLink, List<Automovel> listaAutomovel)
        {
            //Inicializar indexador
            Directory directory = FSDirectory.Open(new DirectoryInfo(Environment.CurrentDirectory + "\\LuceneIndex"));
            Analyzer analyzer = new StandardAnalyzer(Version.LUCENE_30);
            var writer = new IndexWriter(directory, analyzer, true, IndexWriter.MaxFieldLength.LIMITED);

            //IndexReader indexReader = IndexReader.Open(directory, true);
            //int totDocs = red.MaxDoc;
            //indexReader.Dispose();

            //Adicionar paginas para serem indexadas
            int numeroPagina = 0;
            foreach (Link link in listaLink)
            {
                adicionarPaginaParaIndexar(numeroPagina, link, writer);
                numeroPagina++;
            }

            writer.Optimize();
            writer.Dispose();

            //Configurar Pesquisador
            IndexSearcher searcher = new IndexSearcher(directory);
            QueryParser parser = new QueryParser(Version.LUCENE_30, CAMPO_CONTEUDO, analyzer);

            List<Indice> listaIndice = new List<Indice>();
            foreach(Automovel auto in listaAutomovel)
            {
                listaIndice.AddRange(pesquisar(auto, numeroPagina, searcher, parser));
            }

            //Fechar buffers utilizados
            searcher.Dispose();
            directory.Dispose();

            return listaIndice;
        }

        private void adicionarPaginaParaIndexar(int numeroPagina, Link link, IndexWriter writer)
        {
            Document doc = new Document();
            doc.Add(new Field(CAMPO_ID, numeroPagina.ToString(), Field.Store.YES, Field.Index.NOT_ANALYZED));
            doc.Add(new Field(CAMPO_CONTEUDO, link.conteudo, Field.Store.YES, Field.Index.ANALYZED));
            doc.Add(new Field(CAMPO_LINK, link.contexto + link.href, Field.Store.YES, Field.Index.NOT_ANALYZED));
            writer.AddDocument(doc);
        }

        private List<Indice> pesquisar(Automovel auto, int numeroMaximoPaginas, IndexSearcher searcher, QueryParser parser)
        {
            // Fornece condicoes de indexacao
            Query query = parser.Parse(auto.modelo);

            // Recuperar documentos indexados
            //Console.WriteLine("Searching for: " + query.ToString());
            TopDocs resultDocs = searcher.Search(query, numeroMaximoPaginas);
            // Console.WriteLine("Results Found: " + resultDocs.TotalHits);

            // cria os indices encontrados considerando as chaves
            var hits = resultDocs.ScoreDocs;
            List<Indice> lista = new List<Indice>();
            //int i = 0;
            foreach (var hit in hits)
            {
                var doc = searcher.Doc(hit.Doc);
                // Console.WriteLine("=====> Result num {0}", i + 1);
                // Console.WriteLine("--ID: {0}", doc.Get("id"));
                // Console.WriteLine("--Text found: {0}" + Environment.NewLine, doc.Get("postBody"));
                // i++;
                lista.Add(new Indice(0, auto.marca + " " + auto.modelo, doc.Get(CAMPO_LINK)));
            }
            return lista;
        }
    }
}
