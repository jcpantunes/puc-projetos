using System;
using System.Collections.Generic;
using System.Data;
using System.IO;
using System.Linq;
using System.Text;
using acn_trabalho_final.dominio;
using MySql.Data.MySqlClient;

namespace acn_trabalho_final.dao
{
    public class PessoaDAO : BaseDAO
    {
        public long TempoSelect { get; set; }
        public long TempoInsert { get; set; }

        public PessoaDAO()
        {
            TempoInsert = 0;
            TempoSelect = 0;
        }

        public List<Pessoa> ExecutarSelect(String sql)
        {
            List<Pessoa> ListaRetorno = new List<Pessoa>();
            try
            {
                TimeSpan TempoUnix = (DateTime.UtcNow - new DateTime(1970, 1, 1));
                long TempoInicial = (long)TempoUnix.TotalMilliseconds;

                DataSet ObjDs = new DataSet();

                MySqlCommand ObjCMD = Conexao.CreateCommand();
                ObjCMD.CommandText = sql;
                ObjDA.SelectCommand = ObjCMD;
                ObjDA.Fill(ObjDs);

                TempoUnix = (DateTime.UtcNow - new DateTime(1970, 1, 1));
                TempoSelect += (long)TempoUnix.TotalMilliseconds - TempoInicial;

                if (ObjDs != null && ObjDs.Tables.Count > 0 && ObjDs.Tables[0].Rows.Count > 0)
                {
                    for (int i = 0; i < ObjDs.Tables[0].Rows.Count; i++)
                    {
                        int IdPessoa = (int)ObjDs.Tables[0].Rows[i]["id"];
                        int CodigoPessoa = (int)ObjDs.Tables[0].Rows[i]["codigo"];
                        String NomePessoa = (String)ObjDs.Tables[0].Rows[i]["nome"].ToString();

                        Pessoa ObjPessoa = new Pessoa(IdPessoa, CodigoPessoa, NomePessoa);
                        ListaRetorno.Add(ObjPessoa);
                    }
                }
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
            FecharConexao();
            return ListaRetorno;
        }

        public List<Pessoa> RecuperarPessoas()
        {
            return this.ExecutarSelect("SELECT * FROM Pessoa order by codigo desc");
        }

        public Pessoa RecuperarPessoaPorId(int IdPessoa)
        {
            List<Pessoa> ListaPessoas = this.ExecutarSelect("SELECT * FROM Pessoa where id = " + IdPessoa);
            if (ListaPessoas.Count() > 0)
            {
                return (Pessoa)ListaPessoas.ElementAt<Pessoa>(0);
            }
            return null;
        }
﻿  
﻿        public void Salvar(Pessoa ObjPessoa)
        {
            MySqlCommand ObjCmd = Conexao.CreateCommand();

            if (ObjPessoa.Id != 0)
            {
                Pessoa ObjPessoaEncontrada = RecuperarPessoaPorId(ObjPessoa.Id);

                if (ObjPessoaEncontrada != null)
                {
                    ObjCmd.CommandText = "update Pessoa set codigo = @codigo, nome = @nome where id = @id";
                    ObjCmd.Parameters.AddWithValue("@codigo", ObjPessoaEncontrada.Codigo);
                    ObjCmd.Parameters.AddWithValue("@nome", ObjPessoaEncontrada.Nome);
                    ObjCmd.Parameters.AddWithValue("@id", ObjPessoaEncontrada.Id);
                }
            }
            else
            {
                ObjCmd.CommandText = "insert into Pessoa (codigo, nome) VALUES (@codigo, @nome)";
                ObjCmd.Parameters.AddWithValue("@codigo", ObjPessoa.Codigo);
                ObjCmd.Parameters.AddWithValue("@nome", ObjPessoa.Nome);
            }

            TimeSpan TempoUnix = (DateTime.UtcNow - new DateTime(1970, 1, 1));
            long TempoInicial = (long)TempoUnix.TotalMilliseconds;

            ObjCmd.ExecuteNonQuery();
            FecharConexao();

            TempoUnix = (DateTime.UtcNow - new DateTime(1970, 1, 1));
            TempoInsert += (long)TempoUnix.TotalMilliseconds - TempoInicial;
        }

         public void RemoverPessoa(int IdRemover)
         {
             MySqlCommand ObjCmd = Conexao.CreateCommand();

             ObjCmd.CommandText = "delete from Pessoa where id = @id";
             ObjCmd.Parameters.AddWithValue("@id", IdRemover);

             TimeSpan TempoUnix = (DateTime.UtcNow - new DateTime(1970, 1, 1));
             long TempoInicial = (long)TempoUnix.TotalMilliseconds;

             ObjCmd.ExecuteNonQuery();
             FecharConexao();

             TempoUnix = (DateTime.UtcNow - new DateTime(1970, 1, 1));
             TempoInsert += (long)TempoUnix.TotalMilliseconds - TempoInicial;
         }

         public void PreencherTabelaPessoas()
         {
             try
             {
                 MySqlCommand ObjCmd = Conexao.CreateCommand();
                 ObjCmd.CommandText = "DELETE FROM Pessoa";
                 ObjCmd.ExecuteNonQuery();
                 FecharConexao();

                 List<String> Linhas = Properties.Resources.pessoas.Split(new[] { Environment.NewLine }, StringSplitOptions.RemoveEmptyEntries).ToList<String>();﻿
                 foreach (String Linha in Linhas)
                 {
                     String[] ObjArray = Linha.Split(':');
                     String Codigo = ObjArray[0];
                     String Nome = ObjArray[1];
                     
                     Pessoa ObjPessoa = new Pessoa(0, Int32.Parse(Codigo), Nome);
                     Salvar(ObjPessoa);
                 }
             }
             catch (Exception e)
             {
                 Console.WriteLine(e.Message);
             }
         }
    }
}
