using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Data;
using Npgsql;

namespace moduloPersistencia.persistencia
{
    public abstract class DAOUtil
    {
        static string serverName = "127.0.0.1";
        static string port = "5432";
        static string userName = "puc";
        static string password = "puc";
        static string databaseName = "webcrawler";
        NpgsqlConnection _conn = null;
        string connString = null;

        public DAOUtil() { }

        private NpgsqlConnection OpenConnection()
        {
            if (_conn == null)
            {
                connString = String.Format("Server={0};Port={1};User Id={2};Password={3};Database={4};",
                                                serverName, port, userName, password, databaseName);
                _conn = new NpgsqlConnection(connString);
            }
            if (_conn.State != ConnectionState.Open)
            {
                _conn.Open();
            }
            return _conn;
        }

        private void CloseConnection()
        {
            if (_conn != null && _conn.State == ConnectionState.Open)
            {
                _conn.Close();
            }
        }

        protected DataSet executarSelect(string sql)
        {
            OpenConnection();
            NpgsqlDataAdapter da = new NpgsqlDataAdapter(sql, _conn);
            DataSet ds = new DataSet();
            da.Fill(ds);
            CloseConnection();
            return ds;
        }

        protected void executarUpdate(string sql, params string[] parametros)
        {
            OpenConnection();
            NpgsqlCommand command = new NpgsqlCommand(sql, _conn);
            int i = 1;
            foreach (string parametro in parametros)
            {
                command.Parameters.AddWithValue("@param" + i, parametro);
                i++;
            }
            command.ExecuteNonQuery();
            CloseConnection();
        }

        protected void executarUpdateLista(string sql, List<string> parametros)
        {
            OpenConnection();
            NpgsqlCommand command = new NpgsqlCommand(sql, _conn);
            int i = 1;
            foreach (string parametro in parametros)
            {
                command.Parameters.AddWithValue("@param" + i, parametro);
                i++;
            }
            command.ExecuteNonQuery();
            CloseConnection();
        }
    }
}
