using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Data;
using System.Net;
using System.IO;
using moduloPersistencia.dominio;

namespace moduloPersistencia.persistencia
{
    

    public class AutomovelDAO : DAOUtil
    {
        private string CAMPO_MARCA = "marca";
        private string CAMPO_MODELO = "modelo";
        private string FROM_TABELA = "from automovel";
        private string INTO_TABELA = "into automovel";


        public AutomovelDAO() {}

        private List<Automovel> recuperarLista(string strSql)
        {
            DataSet ds = this.executarSelect(strSql);
            List<Automovel> lista = new List<Automovel>();
            foreach (DataRow dr in ds.Tables[0].Rows)
            {
                int id = Convert.ToInt32(dr["id"].ToString());
                string marca = dr[CAMPO_MARCA].ToString();
                string modelo = dr[CAMPO_MODELO].ToString();
                lista.Add(new Automovel(id, marca, modelo));
            }
            return lista;
        }

        public List<Automovel> listar() 
        {
            String strSql = "select * " + FROM_TABELA;
            return recuperarLista(strSql);
        }

        public List<Automovel> listarPorMarca(string marca)
        {
            String strSql = "select * " + FROM_TABELA + " where " + CAMPO_MARCA + " = '" + marca + "';";
            return recuperarLista(strSql);
        }

        public List<Automovel> listarPorModelo(string modelo)
        {
            String strSql = "select * " + FROM_TABELA + " where " + CAMPO_MODELO + " = '" + modelo + "';";
            return recuperarLista(strSql);
        }

        public List<Automovel> listarPorMarcaModelo(string marca, string modelo)
        {
            String strSql = "select * " + FROM_TABELA + " where " + CAMPO_MARCA + " = '" + marca + "' and " + CAMPO_MODELO + " = '" + modelo + "';";
            return recuperarLista(strSql);
        }

        public void insert(Automovel Automovel)
        {
            string strSql = "insert " + INTO_TABELA + "(" + CAMPO_MARCA +
                ", " + CAMPO_MODELO + ") values(@param1, @param2);";
            this.executarUpdate(strSql, Automovel.marca, Automovel.modelo);
        }

        public void delete()
        {
            string strSql = "delete " + FROM_TABELA;
            this.executarUpdate(strSql);
        }

        public void delete(string marca)
        {
            string strSql = "delete " + FROM_TABELA + " where " + CAMPO_MARCA + "= @param1;";
            this.executarUpdate(strSql, marca);
        }

        public void preencheTabela(string arquivo)
        {
            this.delete();
            foreach (string linha in File.ReadLines(arquivo))
            {
                String[] vetor = linha.Split(';');
                if(vetor.Length > 0)
                {
                    string marca = vetor[0];
                    string modelo = vetor[1];
                    this.insert(new Automovel(0, marca, modelo));
                }
            }
        }
    }
}
