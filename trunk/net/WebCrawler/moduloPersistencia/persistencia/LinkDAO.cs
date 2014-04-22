using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Data;
using moduloPersistencia.dominio;

namespace moduloPersistencia.persistencia
{
    public class LinkDAO : DAOUtil
    {
        private string CAMPO_CONTEXTO = "contexto";
        private string CAMPO_HREF = "href";
        private string CAMPO_CONTEUDO = "conteudo";
        private string CAMPO_SITUACAO = "situacao";
        private string TABELA = " link ";
        private string FROM_TABELA = "from link";
        private string INTO_TABELA = "into link";

        public LinkDAO() { }

        private List<Link> recuperarLista(string strSql)
        {
            DataSet ds = this.executarSelect(strSql);
            List<Link> lista = new List<Link>();
            foreach (DataRow dr in ds.Tables[0].Rows)
            {
                int id = Convert.ToInt32(dr["id"].ToString());
                string contexto = dr[CAMPO_CONTEXTO].ToString();
                string href = dr[CAMPO_HREF].ToString();
                string conteudo = dr[CAMPO_CONTEUDO].ToString();
                string situacao = dr[CAMPO_SITUACAO].ToString();
                lista.Add(new Link(id, contexto, href, conteudo, situacao));
            }
            return lista;
        }

        public List<Link> listar() 
        {
            String strSql = "select * " + FROM_TABELA;
            return recuperarLista(strSql);
        }

        public Link listar(int id)
        {
            String strSql = "select * " + FROM_TABELA + " where id = " +id;
            List<Link> lista = recuperarLista(strSql);
            if (lista.Count > 0)
            {
                return lista.ElementAt(0);
            }
            return null;
        }

        public List<Link> listarPorContexto(string contexto)
        {
            String strSql = "select * " + FROM_TABELA + " where " + CAMPO_CONTEXTO + " = '" + contexto + "';";
            return recuperarLista(strSql);
        }

        public List<Link> listarPorSituacao(string situacao)
        {
            String strSql = "select * " + FROM_TABELA + " where " + CAMPO_SITUACAO + " = '" + situacao + "';";
            return recuperarLista(strSql);
        }

        public void insert(Link link)
        {
            string strSql = "insert " + INTO_TABELA + " (" + CAMPO_CONTEXTO +
                ", " + CAMPO_HREF + ", " + CAMPO_CONTEUDO + ", " + CAMPO_SITUACAO + ") values(@param1, @param2, @param3, @param4);";
            this.executarUpdate(strSql, link.contexto, link.href, link.conteudo, link.situacao);
        }

        private List<Link> verificarExistencia(List<Link> lista)
        {
            List<Link> novaLista = new List<Link>();
            if (lista.Count > 0) 
            {
                List<Link> listaPorContexto = listarPorContexto(lista.ElementAt(0).contexto);
                foreach (Link link in lista) 
                {
                    if (!listaPorContexto.Contains(link))
                    {
                        novaLista.Add(link);
                    }
                }
            }
            return novaLista;
        }

        public void insert(List<Link> lista)
        {
            List<Link> novaLista = verificarExistencia(lista);
            string strSql = "";
            List<string> parametros = new List<string>();
            int i = 1;
            foreach (Link link in novaLista)
            {
                strSql += "insert " + INTO_TABELA + " (" + CAMPO_CONTEXTO +
                    ", " + CAMPO_HREF + ", " + CAMPO_CONTEUDO + ", " + CAMPO_SITUACAO + ") values(@param" + i + ", @param" + (i + 1) +
                    ", @param" + (i + 2) + ", @param" + (i + 3) + ");";

                parametros.Add(link.contexto);
                parametros.Add(link.href);
                parametros.Add(link.conteudo);
                parametros.Add(link.situacao);

                i = i + 4;
            }
            this.executarUpdateLista(strSql, parametros);
        }

        public void updateSituacao(List<Link> lista, string situacao)
        {
            List<Link> novaLista = verificarExistencia(lista);
            string strSql = "";
            List<string> parametros = new List<string>();
            int i = 1;
            foreach (Link link in novaLista)
            {
                strSql += "update " + TABELA + " set " + CAMPO_SITUACAO + " = @param" + i + " where id = @param" + (i + 1) + "; ";
                parametros.Add(situacao);
                parametros.Add(""+link.id);
                i = i + 2;
            }
            this.executarUpdateLista(strSql, parametros);
        }

        public void delete()
        {
            string strSql = "delete " + FROM_TABELA;
            this.executarUpdate(strSql);
        }

        public void deletePorContexto(string contexto)
        {
            string strSql = "delete " + FROM_TABELA + " where " + CAMPO_CONTEXTO + " = @param1 and " 
                + CAMPO_SITUACAO + " = '" + Link.SITUACAO_URL_RASTREADA + "' ;";
            this.executarUpdate(strSql, contexto);
        }
    }
}
