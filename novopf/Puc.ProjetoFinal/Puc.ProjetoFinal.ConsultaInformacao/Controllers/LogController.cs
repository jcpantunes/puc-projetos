using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Puc.ProjetoFinal.ConsultaLog.Models;

using System.Runtime.Serialization;
using System.Runtime.Serialization.Json;

using System.Globalization;

using System.Net;
using System.Net.Http;
using System.Net.Http.Headers;
using Newtonsoft.Json;
using Newtonsoft.Json.Linq;

namespace Puc.ProjetoFinal.ConsultaLog.Controllers
{
    public class LogController: Controller
    {
        //LogModel model;

        string uri = "http://localhost:5000/api/cadinformacao/";

        [HttpGet]
        public IActionResult Index()
        {
            return View(new LogModel());
        }

        [HttpPost]
        public IActionResult Pesquisar(string IdInformacao, string Ticket)
        {
            LogModel logModel = new LogModel();
            try
            {
                if (IdInformacao != null && IdInformacao.Length > 0)
                {
                    uri += IdInformacao;
                    logModel.ListaInformacao.Add(ConsumirSincrono(uri).Informacao);
                }
                else if (Ticket != null && Ticket.Length > 0)
                {
                    uri += "ticket/" + Ticket;
                    logModel.ListaInformacao.Add(ConsumirSincrono(uri).Informacao);
                }
                else
                {
                    ViewData["Message"] = "Informacao nao encontrada.";
                }
            }
            catch (Exception e)
            {
                ViewData["Message"] = e.Message;
            }
            return View("Index", logModel);
        }

        [HttpGet]
        public IActionResult Detalhe(int id)
        {
            try
            {
                if (id > 0)
                {
                    uri += id;
                    LogModel model = ConsumirSincrono(uri);
                    return View(model);
                }
                else
                {
                    ViewData["Message"] = "Informacao nao encontrada.";
                }
            }
            catch (Exception e)
            {
                ViewData["Message"] = e.Message;
            }
            return View("Index", new LogModel());
        }

        [HttpPost]
        public IActionResult Listar()
        {
            try
            {
                uri += "consultarrecentes/10";
                LogModel logModel = ConsumirSincrono(uri);
                if (logModel.ListaInformacao.Count > 0)
                {
                    return View("Index", logModel);
                }
                else
                {
                    ViewData["Message"] = "Informacao nao encontrada.";
                }
            }
            catch (Exception e)
            {
                ViewData["Message"] = e.Message;
            }
            return View("Index", new LogModel());
        }

        private LogModel ConsumirSincrono(string uri)
        {
            LogModel model = new LogModel();
            using (var client = new HttpClient())
            {
                client.BaseAddress = new Uri(uri);
                client.DefaultRequestHeaders.Accept.Clear();
                client.DefaultRequestHeaders.Accept.Add(new MediaTypeWithQualityHeaderValue("application/json"));
                // var serializer = new DataContractJsonSerializer(typeof(LogModel));
                HttpResponseMessage response = client.GetAsync(uri).Result;
                response.EnsureSuccessStatusCode();
                string conteudo = response.Content.ReadAsStringAsync().Result;
                model = JsonConvert.DeserializeObject<LogModel>(conteudo);
            }
            return model;
        }

    }
}
