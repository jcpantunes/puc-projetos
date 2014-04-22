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
    

    public class IndiceDAO : DAOUtil
    {
        private string CAMPO_CHAVE = "chave";
        private string CAMPO_LINK = "link";
        private string FROM_TABELA = "from indice";
        private string INTO_TABELA = "into indice";


        public IndiceDAO() {}

        private List<Indice> recuperarLista(string strSql)
        {
            DataSet ds = this.executarSelect(strSql);
            List<Indice> lista = new List<Indice>();
            foreach (DataRow dr in ds.Tables[0].Rows)
            {
                int id = Convert.ToInt32(dr["id"].ToString());
                string marca = dr[CAMPO_CHAVE].ToString();
                string modelo = dr[CAMPO_LINK].ToString();
                lista.Add(new Indice(id, marca, modelo));
            }
            return lista;
        }

        public List<Indice> listar() 
        {
            String strSql = "select * " + FROM_TABELA;
            return recuperarLista(strSql);
        }

        public List<Indice> listarPorChave(string chave)
        {
            String strSql = "select * " + FROM_TABELA + " where upper(" + CAMPO_CHAVE + ") like upper('%" + chave + "%');";
            return recuperarLista(strSql);
        }

        public void insert(Indice indice)
        {
            string strSql = "insert " + INTO_TABELA + "(" + CAMPO_CHAVE +
                ", " + CAMPO_LINK + ") values(@param1, @param2);";
            this.executarUpdate(strSql, indice.chave, indice.link);
        }
        
        public void insert(List<Indice> lista)
        {
            string strSql = "";
            List<string> parametros = new List<string>();
            int i = 1;
            foreach (Indice indice in lista)
            {
                strSql += " insert " + INTO_TABELA + "(" + CAMPO_CHAVE +
                ", " + CAMPO_LINK + ") values(@param"+ i + ", @param"+ (i+1) + ");";
                parametros.Add(indice.chave);
                parametros.Add(indice.link);
                i = i + 2;
            }
            this.executarUpdateLista(strSql, parametros);
        }

        public void delete()
        {
            string strSql = "delete " + FROM_TABELA;
            this.executarUpdate(strSql);
        }

        public void delete(string chave, string link)
        {
            string strSql = "delete " + FROM_TABELA + " where " + CAMPO_CHAVE + " = @param1 and "
                + CAMPO_LINK + " = @param2;";
            this.executarUpdate(strSql, chave, link);
        }

        public void deletePorContexto(string contexto)
        {
            string strSql = "delete " + FROM_TABELA + " where " + CAMPO_LINK + " like '%" + contexto + "%' ;";
            this.executarUpdate(strSql);
        }

        public void deletePorLink(List<Link> listaLink)
        {
            string strSql = "";
            foreach (Link link in listaLink)
            {
                string url = link.contexto + link.href;
                strSql += "delete " + FROM_TABELA + " where " + CAMPO_LINK + " = '" + url + "' ; ";
            }
            this.executarUpdate(strSql);
        }

        
    }
}
