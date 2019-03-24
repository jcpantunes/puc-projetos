using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.Rendering;
using Puc.ProjetoFinal.SistemaUsuario.Models;
using Puc.ProjetoFinal.Negocio.Dominio;
using Puc.ProjetoFinal.Negocio.Negocio;

namespace Puc.ProjetoFinal.SistemaUsuario.Controllers
{
    public class CadTarefaController : Controller
    {

        TarefaModel model;

        public IActionResult Index()
        {
            // ViewData["Message"] = "Preencher os dados abaixo para cadastrar Tarefa";
            model = new TarefaModel();
            model.ListaTarefa = RecuperarListaTarefas();
            return View(model.ListaTarefa);
        }

        private List<TarefaModel> RecuperarListaTarefas()
        {
            List<TarefaModel> listaTarefas = new List<TarefaModel>();

            CadastrarTarefaBO tarefaBO = new CadastrarTarefaBO();
            List<Tarefa> lista = tarefaBO.RecuperarTarefa();

            foreach(Tarefa t in lista)
            {
                TarefaModel tarefa = new TarefaModel(t);
                listaTarefas.Add(tarefa);
            }
            return listaTarefas;
        }

        public List<SelectListItem> RecuperarViewbagListaFuncionario()
        {
            CadastrarFuncionarioBO funcionarioBO = new CadastrarFuncionarioBO();
            return funcionarioBO.RecuperarFuncionario().Select(c => new SelectListItem()
                                                   { Text= c.Nome, Value=Convert.ToString(c.IdFuncionario)}).ToList();
        }

        [HttpGet]
        public IActionResult Incluir()
        {
            model = new TarefaModel();
            ViewBag.ListaFuncionarios = RecuperarViewbagListaFuncionario();
            return View("Cadastrar", model);
        }

        [HttpPost]
        public IActionResult Salvar(TarefaModel _model)
        {
            Tarefa tarefa = new Tarefa();
            tarefa.IdTarefa = _model.IdTarefa;
            tarefa.Titulo = _model.Titulo;
            tarefa.DtTarefa = _model.DtTarefa;
            tarefa.IdFuncionario = _model.IdFuncionario;

            CadastrarTarefaBO tarefaBO = new CadastrarTarefaBO();
            if (tarefa.IdTarefa == 0)
            {
                tarefaBO.IncluirTarefa(tarefa);
            }
            else
            {
                tarefaBO.AtualizarTarefa(tarefa);
            }

            _model.ListaTarefa = RecuperarListaTarefas();
            return View("Index", _model.ListaTarefa);
        }

        [HttpGet]
        public IActionResult Retornar(TarefaModel _model)
        {
            _model.ListaTarefa = RecuperarListaTarefas();
            return View("Index", _model.ListaTarefa);
        }

        [HttpGet]
        public IActionResult Editar(int? id)
        {
            if (id == null)
            {
                return NotFound();
            }

            CadastrarTarefaBO tarefaBO = new CadastrarTarefaBO();
            Tarefa tarefa = tarefaBO.RecuperarTarefa((int) id);
            if (tarefa == null)
            {
                return NotFound();
            }
            model = new TarefaModel(tarefa);
            ViewBag.ListaFuncionarios = RecuperarViewbagListaFuncionario();
            return View("Cadastrar", model);
        }

        [HttpGet]
        public IActionResult Remover(int? id)
        {
            if (id == null)
            {
                return NotFound();
            }

            CadastrarTarefaBO tarefaBO = new CadastrarTarefaBO();
            Tarefa tarefa = tarefaBO.RecuperarTarefa((int) id);
            tarefaBO.RemoverTarefa(tarefa);

            model = new TarefaModel();
            model.ListaTarefa = RecuperarListaTarefas();
            return View("Index", model.ListaTarefa);
        }

        
    }
}