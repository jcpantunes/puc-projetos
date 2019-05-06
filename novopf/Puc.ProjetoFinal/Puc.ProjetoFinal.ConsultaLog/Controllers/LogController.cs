using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Puc.ProjetoFinal.ConsultaLog.Models;

using System.Net;
using System.Net.Http;
using System.Net.Http.Headers;
using Newtonsoft.Json;

namespace Puc.ProjetoFinal.ConsultaLog.Controllers
{
    public class LogController: Controller
    {
        LogModel model;

        [HttpGet]
        public IActionResult Index()
        {
            try
            {
                model = new LogModel();
                model.ListaLog = RecuperarListaLog();
                return View(model.ListaLog);
            }
            catch (Exception e)
            {
                ViewData["Message"] = e.Message;
            }
            return View("../Home/Index");
        }

        // private static async Task<Informacao> LerInformacao()
        private async Task<List<LogModel>> RecuperarListaLog()
        {
            List<LogModel> listaLog = new List<LogModel>();

            //CadastrarFuncionarioBO funcionarioBO = new CadastrarFuncionarioBO();
            //List<Funcionario> lista = funcionarioBO.RecuperarFuncionario();
            //foreach(Funcionario f in lista)

            LogModel informacao = null;
            HttpClient client = new HttpClient();
            client.BaseAddress = new Uri("http://localhost:5000/api/cadinformacao/1");
            client.DefaultRequestHeaders.Accept.Clear();
            client.DefaultRequestHeaders.Accept.Add(new MediaTypeWithQualityHeaderValue("application/json"));
            HttpResponseMessage response = await client.GetAsync(client.BaseAddress);
            if (response.IsSuccessStatusCode)
            {
                informacao = await response.Content.ReadAsAsync<LogModel>();
                listaLog.Add(informacao);
            }

            // for (int i = 0 ; i < 3 ; i++)
            // {
            //     LogModel l1 = new LogModel();
            //     l1.IdInformacao = i;
            //     l1.NomeSistema = "Teste";
            //     l1.TipoInformacao = "Erro";
            //     l1.Ticket = i + "_AB123455";
            //     l1.Descricao = "Descricao Teste";
            //     l1.DtInformacao = DateTime.Now;
            //     l1.Hash = "123456";
            //     listaLog.Add(l1);
            // }

            return listaLog;
        }
        
        // private async Task<T> GetAsync<T>(Uri requestUrl)  
        // {  
        //     var response = await _httpClient.GetAsync(requestUrl, HttpCompletionOption.ResponseHeadersRead);  
        //     response.EnsureSuccessStatusCode();  
        //     var data = await response.Content.ReadAsStringAsync();  
        //     return JsonConvert.DeserializeObject<T>(data);  
        // }  

    }
}
