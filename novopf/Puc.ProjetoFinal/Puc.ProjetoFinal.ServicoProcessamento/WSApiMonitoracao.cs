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

using System.Net;
using System.Net.Http;
using System.Net.Http.Headers;
using System.Threading.Tasks;
using System.Linq;
using Newtonsoft.Json;
using Newtonsoft.Json.Linq;


namespace Puc.ProjetoFinal.ServicoProcessamento
{
    public class WSApiMonitoracao
    {
        
        public static void ExecutarGet()
        {
            string uri = "http://localhost:5000/api/cadinformacao/";
            Console.Write("ID Log: ");
            string idLog = Console.ReadLine();
            if (idLog.Length == 0)
            {
                idLog = "1";
            }
            uri += idLog;

            WSApiMonitoracao api = new WSApiMonitoracao();
            api.ConsumirServico(uri);
        }

        public static async void ExecutarPost()
        {   
            try
            {
                using (var client = new HttpClient())
                {
                    Mensagem informacao = new Mensagem();
                    informacao.NomeSistema = "Teste";
                    informacao.TipoInformacao = "Aviso";
                    informacao.Ticket = DateTime.Now.Year.ToString().PadLeft(2, '0')
                        +  DateTime.Now.Month.ToString().PadLeft(2, '0')
                        + DateTime.Now.Day.ToString().PadLeft(2, '0') 
                        + DateTime.Now.Hour.ToString().PadLeft(2, '0') 
                        + DateTime.Now.Minute.ToString().PadLeft(2, '0') 
                        + DateTime.Now.Second.ToString().PadLeft(2, '0') + "ABCDEF";
                    informacao.Descricao = "Descricao Teste ...";
                    
                    client.BaseAddress = new Uri("http://localhost:5000/");
                    client.DefaultRequestHeaders.Accept.Clear();
                    client.DefaultRequestHeaders.Accept.Add(new MediaTypeWithQualityHeaderValue("application/json"));
                    // HttpResponseMessage response = await client.PostAsJsonAsync("api/CadInformacao", informacao);

                    var json = JsonConvert.SerializeObject(informacao);
                    var stringContent = new StringContent(json, Encoding.UTF8, "application/json");
                    HttpResponseMessage response = await client.PostAsync("api/CadInformacao", stringContent);

                    response.EnsureSuccessStatusCode();
                }
            }
            catch(Exception e)
            {
                Console.WriteLine(e.Message + "\n" + e.InnerException + "\n" + e.StackTrace);
            }
        }

        private void ConsumirServico(string uri)
        {   
            // ConsumoAssincronoString(uri).Wait();
            // TesteLog teste = await ConsumoAssincronoStream(uri);
            TesteLog teste = ConsumoSincronoStream(uri);

            Console.WriteLine("IdResposta: " + teste.IdResposta);
            Console.WriteLine("IdInformacao: " + teste.Informacao.IdInformacao );
            Console.WriteLine("Nome Sistema: " + teste.Informacao.NomeSistema);
            Console.WriteLine("Tipo Informacao: " + teste.Informacao.TipoInformacao);
            Console.WriteLine("Ticket: " + teste.Informacao.Ticket);
            Console.WriteLine("Descricao: " + teste.Informacao.Descricao);
            Console.WriteLine("Data: " + teste.Informacao.DtInformacao);
            Console.WriteLine("Hash: " + teste.Informacao.Hash + "\n\n");
        }

        private async Task ConsumoAssincronoString(string uri)
        {
            using (var client = new HttpClient())
            {
                client.BaseAddress = new Uri(uri);
                client.DefaultRequestHeaders.Accept.Clear();
                client.DefaultRequestHeaders.Accept.Add(new MediaTypeWithQualityHeaderValue("application/json"));
                Console.WriteLine("\n  Servico chamado: " + client.BaseAddress);
                var stringTask = await client.GetStringAsync(client.BaseAddress);
                Console.WriteLine(" Chamada finalizada");
                Console.Write(stringTask + "\n\n");
            }
        }

        private async Task<TesteLog> ConsumoAssincronoStream(string uri)
        {
            TesteLog teste = new TesteLog();
            using (var client = new HttpClient())
            {
                client.BaseAddress = new Uri(uri);
                client.DefaultRequestHeaders.Accept.Clear();
                client.DefaultRequestHeaders.Accept.Add(new MediaTypeWithQualityHeaderValue("application/json"));
                var serializer = new DataContractJsonSerializer(typeof(TesteLog));
                var streamTask = client.GetStreamAsync(uri);
                teste = serializer.ReadObject(await streamTask) as TesteLog;
            }
            return teste;
        }

        private TesteLog ConsumoSincronoStream(string uri)
        {
            TesteLog teste = new TesteLog();
            using (var client = new HttpClient())
            {
                client.BaseAddress = new Uri(uri);
                client.DefaultRequestHeaders.Accept.Clear();
                client.DefaultRequestHeaders.Accept.Add(new MediaTypeWithQualityHeaderValue("application/json"));
                var serializer = new DataContractJsonSerializer(typeof(TesteLog));
                HttpResponseMessage response = client.GetAsync(uri).Result;
                response.EnsureSuccessStatusCode();
                string conteudo = response.Content.ReadAsStringAsync().Result;
                teste = JsonConvert.DeserializeObject<TesteLog>(conteudo);
            }
            return teste;
        }
    }

    [DataContract(Name="InformacaoModel")]
    class TesteLog
    {
        public TesteLog()
        {
            this.Informacao = new Mensagem();
        }

        [DataMember(Name="idResposta")]
        public int IdResposta { get; set; }

        [DataMember(Name="informacao")]
        public Mensagem Informacao { get; set; }
    }

    [DataContract(Name="Informacao")]
    class Mensagem
    {
        [DataMember(Name="idInformacao")]
        public int IdInformacao { get; set; }
        
        [DataMember(Name="nomeSistema")]
        public string NomeSistema { get; set; }
        
        [DataMember(Name="tipoInformacao")]
        public string TipoInformacao { get; set; }
        
        [DataMember(Name="ticket")]
        public string Ticket { get; set; }
        
        [DataMember(Name="descricao")]
        public string Descricao { get; set; }
        
        [DataMember(Name="dtInformacao")]
        private string JsonDate { get; set; }

        [IgnoreDataMember]
        public DateTime DtInformacao
        {
            get
            {
                return DateTime.ParseExact(JsonDate.Substring(0,19), "yyyy-MM-ddTHH:mm:ss", CultureInfo.InvariantCulture);
            }
        }
        
        [DataMember(Name="hash")]
        public string Hash { get; set; }
    }
}
