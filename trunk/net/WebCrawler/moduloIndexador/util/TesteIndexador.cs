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

using Directory = Lucene.Net.Store.Directory;
using Version = Lucene.Net.Util.Version;

namespace moduloIndexador.util
{
    class TesteIndexador
    {
        private int MAX_RESULTADOS = 100;

        public void indexarTeste()
        {
            //Setup indexer
            Directory directory = FSDirectory.Open(new DirectoryInfo(Environment.CurrentDirectory + "\\LuceneIndex"));
            Analyzer analyzer = new StandardAnalyzer(Version.LUCENE_30);
            var writer = new IndexWriter(directory, analyzer, true, IndexWriter.MaxFieldLength.LIMITED);

            IndexReader red = IndexReader.Open(directory, true);
            int totDocs = red.MaxDoc;
            red.Dispose();

            //Add documents to the index
            string text = String.Empty;
            Console.WriteLine("Enter the text you want to add to the index:");
            Console.Write(">");
            int txts = totDocs;
            int j = 0;
            while ((text = Console.ReadLine()) != String.Empty)
            {
                AddTextToIndex(txts++, text, writer);
                j++;
                Console.Write(">");
            }


            writer.Optimize();
            //Close the writer
            // writer.Flush();
            writer.Dispose();

            Console.WriteLine(j + " lines added, " + txts + " documents total");

            //Setup searcher
            IndexSearcher searcher = new IndexSearcher(directory);
            QueryParser parser = new QueryParser(Version.LUCENE_30, "postBody", analyzer);

            Console.WriteLine("Enter the search string:");
            Console.Write(">");

            while ((text = Console.ReadLine()) != String.Empty)
            {
                Search(text, searcher, parser);
                Console.Write(">");
            }

            //Clean up everything
            searcher.Dispose();
            directory.Dispose();
        }

        private void Search(string text, IndexSearcher searcher, QueryParser parser)
        {
            //Supply conditions
            Query query = parser.Parse(text);

            Console.WriteLine("Searching for: " + query.ToString());
            TopDocs resultDocs = searcher.Search(query, MAX_RESULTADOS);
            Console.WriteLine("Results Found: " + resultDocs.TotalHits);

            var hits = resultDocs.ScoreDocs;
            int i = 0;
            foreach (var hit in hits)
            {
                var doc = searcher.Doc(hit.Doc);
                Console.WriteLine("=====> Result num {0}", i + 1);
                Console.WriteLine("--ID: {0}", doc.Get("id"));
                Console.WriteLine("--Text found: {0}" + Environment.NewLine, doc.Get("postBody"));
                i++;
                //var documentFromSearcher = indexSearch.Doc(hit.Doc);
                // Console.WriteLine(documentFromSearcher.Get("Make") + " " + documentFromSearcher.Get("Model"));
            }
        }

        private void AddTextToIndex(int txts, string text, IndexWriter writer)
        {
            Document doc = new Document();
            doc.Add(new Field("id", txts.ToString(), Field.Store.YES, Field.Index.NOT_ANALYZED));
            doc.Add(new Field("postBody", text, Field.Store.YES, Field.Index.ANALYZED));
            writer.AddDocument(doc);
        }
    }
}
