using System;
using System.Collections.Generic;
using System.Data;
using System.Linq;
using System.Text;
using MySql.Data.MySqlClient;

namespace acn_trabalho_final.dao
{
    public abstract class BaseDAO
    {
        private String ConnectionString = "Server=ec2-54-232-208-87.sa-east-1.compute.amazonaws.com;Port=3306;Database=puciec;Uid=root;Pwd=;";

        protected static MySqlDataAdapter ObjDA = null;

        // Singleton
        private static MySqlConnection ObjCN;
        public MySqlConnection Conexao
        {
            get
            {
                if (ObjCN == null)
                {
                    ObjCN = new MySqlConnection(ConnectionString);
                }

                if (ObjCN.State != ConnectionState.Open)
                {
                    ObjCN.Open();
                }

                ObjDA = new MySqlDataAdapter();
                return ObjCN;
            }
        }

        protected void FecharConexao()
        {
            try
            {
                if (ObjCN != null && ObjCN.State != ConnectionState.Closed)
                {
                    ObjCN.Close();
                }
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
        }
        
    }
}