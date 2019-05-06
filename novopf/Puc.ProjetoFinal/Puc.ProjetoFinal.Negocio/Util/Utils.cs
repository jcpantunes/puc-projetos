using System;
using System.IO;
using System.Linq;
using System.Security.Cryptography;
using System.Text;

using System.Net;
using System.Net.Http;
using System.Net.Http.Headers;
using System.Threading.Tasks;

using Puc.ProjetoFinal.Negocio.Dominio;

namespace Puc.ProjetoFinal.Negocio.Util
{
    public class Utils
    {

        public Utils()
        {

        }
        
        public static string GerarHash(string texto)
        {
            //Create a new instance of the UnicodeEncoding class to 
            //convert the string into an array of Unicode bytes.
            UnicodeEncoding ue = new UnicodeEncoding();

            //Convert the string into an array of bytes.
            byte[] messageBytes = ue.GetBytes(texto);

            //Create a new instance of the SHA1Managed class to create 
            //the hash value.
            SHA1Managed shHash = new SHA1Managed();

            //Create the hash value from the array of bytes.
            byte[] hashValue = shHash.ComputeHash(messageBytes);

            // Console.WriteLine(Convert.ToBase64String(hashValue) + Environment.NewLine);

            return Convert.ToBase64String(hashValue);
        }

        private static string RandomString(int tamanho)
        {
            Random random = new Random();   
            const string chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
            return new string(Enumerable.Repeat(chars, tamanho)
                .Select(s => s[random.Next(s.Length)]).ToArray());
        }

        public static string GerarTicket()
        {
            return Convert.ToString(DateTime.Now.Year) 
                + Convert.ToString(DateTime.Now.Month).PadLeft(2, '0') 
                + Convert.ToString(DateTime.Now.Day).PadLeft(2, '0')
                + Convert.ToString(DateTime.Now.Hour).PadLeft(2, '0')
                + Convert.ToString(DateTime.Now.Minute).PadLeft(2, '0')
                + Convert.ToString(DateTime.Now.Second).PadLeft(2, '0')
                + RandomString(8);
        }

        public static Informacao GerarInformacao(string sistema, string tipo, string descricao)
        {
            Informacao informacao = new Informacao();
            informacao.NomeSistema = sistema;
            informacao.TipoInformacao = tipo;
            informacao.Ticket = Utils.GerarTicket();
            informacao.Descricao = descricao;
            informacao.Hash = Utils.GerarHash(descricao);
            return informacao;
        }

    }
}
