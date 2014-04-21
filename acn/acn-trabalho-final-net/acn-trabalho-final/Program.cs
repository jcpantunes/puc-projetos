using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using acn_trabalho_final.dao;
using acn_trabalho_final.dominio;
using acn_trabalho_final.negocio;

namespace acn_trabalho_final
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("");

            TimeSpan TempoUnix = (DateTime.UtcNow - new DateTime(1970, 1, 1));
            long TempoInicio = (long)TempoUnix.TotalMilliseconds;
                
            PessoaDAO ObjPessoaDAO = new PessoaDAO();
            Console.WriteLine("==============================================");
            Console.WriteLine(" => Inserindo registros do banco de dados .... ");
            ObjPessoaDAO.PreencherTabelaPessoas();
                
            Console.WriteLine("=============================================="); 
            Console.WriteLine(" => Recuperando registros do banco de dados .... ");
            List<Pessoa> lista = ObjPessoaDAO.RecuperarPessoas();

                
            Console.WriteLine("=============================================="); 
            Console.WriteLine(" => Ordenando registros ..... ");
                
            OrdenarSequenciaBC ordenarBC = new OrdenarSequenciaBC();
            ordenarBC.OrdenarListaPessoas(lista);

            TempoUnix = (DateTime.UtcNow - new DateTime(1970, 1, 1));
            long tempoTotal = (long)TempoUnix.TotalMilliseconds - TempoInicio;
        
            foreach (Pessoa ObjPessoa in lista) {
                Console.WriteLine(ObjPessoa.Codigo + " - " + ObjPessoa.Nome);
            }

            Console.WriteLine("=============================================="); 
            Console.WriteLine(" => Numero de registros considerados: " + lista.Count());
                
                
            Console.WriteLine("=============================================="); 
            Console.WriteLine(" => Tempo de Insert: " + ObjPessoaDAO.TempoInsert);
            Console.WriteLine(" => Tempo de Select: " + ObjPessoaDAO.TempoSelect);
            Console.WriteLine(" => Tempo de Processamento: " + ordenarBC.TempoOrdenacao);
            Console.WriteLine(" => Tempo Total: " + tempoTotal);
            Console.WriteLine("==============================================");

            Console.ReadLine();
        }
    }
}
