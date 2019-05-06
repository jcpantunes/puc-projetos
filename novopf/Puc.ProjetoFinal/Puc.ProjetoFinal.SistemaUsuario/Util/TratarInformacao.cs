using System;
using System.Net;
using System.Net.Http;
using System.Net.Http.Headers;
using System.Threading.Tasks;
using System.Linq;
using Newtonsoft.Json;

using Puc.ProjetoFinal.Negocio.Dominio;
using Puc.ProjetoFinal.Negocio.Negocio;
using Puc.ProjetoFinal.Negocio.Util;

namespace Puc.ProjetoFinal.SistemaUsuario.Util
{
    public class TratarInformacao
    {

        public TratarInformacao()
        {

        }
        
        private static async void GravarInformacao(Informacao informacao)
        {
            HttpResponseMessage response = null;
            try
            {
                HttpClient client = new HttpClient();
                client.BaseAddress = new Uri("http://localhost:5000/");
                client.DefaultRequestHeaders.Accept.Clear();
                client.DefaultRequestHeaders.Accept.Add(new MediaTypeWithQualityHeaderValue("application/json"));

                response = await client.PostAsJsonAsync("api/CadInformacao", informacao);
                response.EnsureSuccessStatusCode();
            }
            catch(Exception e)
            {
                Console.WriteLine(e.Message + "\n" + e.InnerException + "\n" + e.StackTrace);
            }
            //return response.Headers.Location;
        }

        public static string TratarExcecaoNaoTratada(Exception e)
        {
            Informacao informacao = Utils.GerarInformacao("Sistema Usuario", "Erro", e.StackTrace);
            GravarInformacao(informacao);
            return "Foi identificado um possivel problema na aplicacao que já foi encaminhado para a equipe responsavel. Ticket " + informacao.Ticket;
        }

        public static string TratarErroNegocio(string mensagem)
        {
            Informacao informacao = Utils.GerarInformacao("Sistema Usuario", "Negocio", mensagem);
            GravarInformacao(informacao);
            return mensagem;
        }


    }
}