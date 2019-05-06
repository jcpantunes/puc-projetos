using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Microsoft.Extensions.Logging;
using System.IO;
using System.Text;
using System.Configuration;

using Puc.ProjetoFinal.ApiMonitoracao.Models;
using Puc.ProjetoFinal.Mensageria;
using Puc.ProjetoFinal.Negocio.Dominio;
using Puc.ProjetoFinal.Negocio.Negocio;
using Puc.ProjetoFinal.Negocio.Util;

namespace Puc.ProjetoFinal.ApiMonitoracao.Controllers
{

    //https://localhost:5001/swagger/index.html
    //https://localhost:5001/api/cadinformacao/1


    [Produces("application/json")]
    [Route("api/[controller]")]
    [ApiController]
    public class CadInformacaoController : ControllerBase
    {

        private readonly ILogger _logger;
        
        public CadInformacaoController(ILogger<CadInformacaoController> logger)
        {
            this._logger = logger;
        }

        // GET api/cadinformacao/5
        [HttpGet("{id}")]
        public ActionResult<InformacaoModel> ConsultarInformacao(int id)
        {
            InformacaoModel model = new InformacaoModel();
            _logger.LogInformation("Consulta Informacao por Id");
            try
            {
                CadastrarInformacaoBO cadinformacaoBO = new CadastrarInformacaoBO();
                Informacao informacao = cadinformacaoBO.RecuperarInformacao(id);
                if(informacao == null || informacao.IdInformacao == 0)
                {
                    model.IdResposta = InformacaoModel.ID_INFORMACAO_NAO_ENCONTRADA;
                }
                else
                {
                    model.IdResposta = InformacaoModel.ID_SUCESSO;
                    model.Informacao = informacao;
                }
            }
            catch(Exception e)
            {
                ProduzirMensagem(e.StackTrace);
            }
            return model;
        }

        // GET api/cadinformacao/consultarrecentes/10
        [HttpGet("ConsultarRecentes/{qtde}")]
        public ActionResult<ListaInformacaoModel> ConsultarInformacaoRecentes(int qtde)
        {
            ListaInformacaoModel model = new ListaInformacaoModel();
            _logger.LogInformation("Consulta Ultimas Informacoes Registradas");
            try
            {
                CadastrarInformacaoBO cadinformacaoBO = new CadastrarInformacaoBO();
                List<Informacao> lista = cadinformacaoBO.RecuperarUltimasInformacao(qtde);

                model.IdResposta = InformacaoModel.ID_SUCESSO;
                model.ListaInformacao = lista;

            }
            catch(Exception e)
            {
                ProduzirMensagem(e.StackTrace);
            }
            return model;
        }

        // POST api/cadinformacao
        [HttpPost]
        public void Post([FromBody] MensagemModel mensagem)
        {
            _logger.LogInformation("Post Nova Mensagem: " + mensagem.NomeSistema + "|" + mensagem.Ticket);
            try
            {            
                string jsonString = Newtonsoft.Json.JsonConvert.SerializeObject(mensagem);
                Produtor.Produzir("localhost", "puc.projetofinal.apimonitoracao", jsonString);
            }
            catch(Exception e)
            {
                ProduzirMensagem(e.StackTrace);
            }
        }

        private void ProduzirMensagem(string descricao)
        {
            MensagemModel mensagem = new MensagemModel();
            mensagem.NomeSistema = "ApiMonitoracao";
            mensagem.TipoInformacao = "Erro";
            mensagem.Ticket = Utils.GerarTicket();
            mensagem.Descricao = descricao;
            string jsonString = Newtonsoft.Json.JsonConvert.SerializeObject(mensagem);
            Produtor.Produzir("localhost", "puc.projetofinal.apimonitoracao", jsonString);
        }
        
    }
}
