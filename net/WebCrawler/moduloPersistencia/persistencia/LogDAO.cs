using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Data;
using moduloPersistencia.dominio;

namespace moduloPersistencia.persistencia
{
    public class LogDAO : DAOUtil
    {
        private string CAMPO_DATA = "data";
        private string CAMPO_TIPO = "tipo";
        private string CAMPO_MENSAGEM = "mensagem";
        private string TABELA = " log ";
        private string FROM_TABELA = "from log";
        private string INTO_TABELA = "into log";

        public LogDAO() { }

        private List<Log> recuperarLista(string strSql)
        {
            DataSet ds = this.executarSelect(strSql);
            List<Log> lista = new List<Log>();
            foreach (DataRow dr in ds.Tables[0].Rows)
            {
                int id = Convert.ToInt32(dr["id"].ToString());
                string data = dr[CAMPO_DATA].ToString();
                string tipo = dr[CAMPO_TIPO].ToString();
                string mensagem = dr[CAMPO_MENSAGEM].ToString();
                lista.Add(new Log(id, data, tipo, mensagem));
            }
            return lista;
        }

        public List<Log> listar() 
        {
            String strSql = "select * " + FROM_TABELA;
            return recuperarLista(strSql);
        }

        public Log listar(int id)
        {
            String strSql = "select * " + FROM_TABELA + " where id = " +id;
            List<Log> lista = recuperarLista(strSql);
            if (lista.Count > 0)
            {
                return lista.ElementAt(0);
            }
            return null;
        }

        public List<Log> listarUltimos()
        {
            String strSql = "select * " + FROM_TABELA + " ORDER BY id DESC LIMIT 10;";
            return recuperarLista(strSql);
        }

        public void insert(Log log)
        {
            string strSql = "insert " + INTO_TABELA + " (" + CAMPO_DATA +
                ", " + CAMPO_TIPO + ", " + CAMPO_MENSAGEM + ") values(@param1, @param2, @param3);";
            this.executarUpdate(strSql, log.data, log.tipo, log.mensagem);
        }
    }
}
