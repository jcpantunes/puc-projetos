using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using acn_trabalho_final.dominio;

namespace acn_trabalho_final.negocio
{
    public class OrdenarSequenciaBC
    {
        public long TempoOrdenacao { get; set; }
        private void SortByBolha(Int32[] Sequencia)
        {
            int Temp;
            bool HouveTroca;
            do
            {
                HouveTroca = false;
                for (int i = 0; i < Sequencia.Length - 1; i++)
                {
                    if (Sequencia[i] > Sequencia[i + 1])
                    {
                        Temp = Sequencia[i];
                        Sequencia[i] = Sequencia[i + 1];
                        Sequencia[i + 1] = Temp;
                        HouveTroca = true;
                    }
                }
            } while (HouveTroca);
        }
        
        public void OrdenarListaPessoas(List<Pessoa> ListaPessoas)
        {
            TimeSpan TempoUnix = (DateTime.UtcNow - new DateTime(1970, 1, 1));
            long TempoInicial = (long)TempoUnix.TotalMilliseconds;
            int Contador = 1;
            
            do
            {
                for (int i = 0; i < ListaPessoas.Count() - 1; i++)
                {
                    if (ListaPessoas[i].Codigo > ListaPessoas[i + 1].Codigo)
                    {
                        Pessoa PessoaTemp1 = ListaPessoas[i];
                        Pessoa PessoaTemp2 = ListaPessoas[i + 1];
                        
                        ListaPessoas.RemoveAt(i);
                        ListaPessoas.Insert(i, PessoaTemp2);
                        
                        ListaPessoas.RemoveAt(i + 1);
                        ListaPessoas.Insert(i + 1, PessoaTemp1);
                    }
                }
                
                Contador++;
            } while (Contador < ListaPessoas.Count());

            TempoUnix = (DateTime.UtcNow - new DateTime(1970, 1, 1));
            TempoOrdenacao = (long)TempoUnix.TotalMilliseconds - TempoInicial;
        }
    }
}