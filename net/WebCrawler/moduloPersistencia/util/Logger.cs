using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using moduloPersistencia.persistencia;
using moduloPersistencia.dominio;

namespace moduloPersistencia.util
{
    public class Logger
    {
        // string file = Environment.CurrentDirectory + "\\webcrawler.log";
        string file = @"C:\\Temp\\webcrawler.log";

        public static string INFO = "INFO"; 
        
        public static string ERRO = "ERRO";

        public static string WARN = "WARN";

        public static Logger instance;

        public Logger()
        {
        }

        public static Logger getInstance()
        {
            if (instance == null)
            {
                instance = new Logger();
            }
            return instance;
        }

        public void log(string mensagem, string tipo)
        {
            persistirLogArquivo(mensagem, tipo);
        }

        public void log(string mensagem, string tipo, bool persistir)
        {
            persistirLogArquivo(mensagem, tipo);
            LogDAO dao = new LogDAO();
            dao.insert(new Log(0, DateTime.Now.ToString(), tipo, mensagem));
        }

        private void persistirLogArquivo(string mensagem, string tipo)
        {
            string log = DateTime.Now.ToString() + " " + tipo + " " + mensagem;
            StreamWriter sw = new StreamWriter(file, true);
            // System.IO.File.AppendAllText(file, log);
            sw.WriteLine(log);
            sw.Close();
        }
    }
}
