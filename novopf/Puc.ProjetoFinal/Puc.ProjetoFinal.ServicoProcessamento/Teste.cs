using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using System.Configuration;
using Microsoft.Extensions.Configuration;
using Microsoft.Extensions.Options;

using System.Runtime.Serialization;
using System.Runtime.Serialization.Json;

using System.Globalization;

using Newtonsoft.Json;
using Newtonsoft.Json.Linq;

using RabbitMQ.Client;
using RabbitMQ.Client.Events;

using System.Threading.Tasks;
using System.Net.Http;
using System.Net.Http.Headers;

using Puc.ProjetoFinal.Negocio.Dominio;
using Puc.ProjetoFinal.Negocio.Negocio;
using Puc.ProjetoFinal.Negocio.Util;

using Puc.ProjetoFinal.Mensageria;

namespace Puc.ProjetoFinal.ServicoProcessamento
{
    public class Teste
    {

        public Teste()
        {

        }

        public static void Testar()
        {
            int opcao = 1;
            while (opcao != 9)
            {
                Console.WriteLine("1. Mensageria/Fila - Produzir");
                Console.WriteLine("2. Mensageria/Fila - Consumir");
                Console.WriteLine("3. WS Api Monitoracao - Consulta Serviço http://localhost:5000/api/cadinformacao/");
                Console.WriteLine("4. WS Api Monitoracao - Post Serviço http://localhost:5000/api/cadinformacao/");
                Console.Write("Opcao: ");
                string opUsuario = Console.ReadLine();
                if (opUsuario.Length == 0)
                {
                    opUsuario = "0";
                }
                opcao = Convert.ToInt32(opUsuario);

                if (opcao == 1)
                {
                    Console.Write("Indice: ");
                    string teste = Console.ReadLine();
                    Informacao mensagem = new Informacao();
                    mensagem.NomeSistema = "ApiMonitoracao";
                    mensagem.TipoInformacao = "Erro";
                    mensagem.Ticket = Utils.GerarTicket();
                    mensagem.Descricao = teste + "_at Microsoft.EntityFrameworkCore.Update.ReaderModificationCommandBatch.Execute(IRelationalConnection connection)";
                    string jsonString = Newtonsoft.Json.JsonConvert.SerializeObject(mensagem);
                    Produtor.Produzir("localhost", "puc.projetofinal.apimonitoracao", jsonString);
                }
                else if (opcao == 2)
                {
                    Consumidor.Consumir("localhost", "puc.projetofinal.apimonitoracao");
                }
                else if (opcao == 3)
                {
                    WSApiMonitoracao.ExecutarGet();
                }
                else if (opcao == 4)
                {
                    WSApiMonitoracao.ExecutarPost();
                }
            }
        }
    }
}
        