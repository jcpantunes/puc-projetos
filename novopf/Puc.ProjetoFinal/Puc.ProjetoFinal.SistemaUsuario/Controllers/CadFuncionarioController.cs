using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Puc.ProjetoFinal.SistemaUsuario.Models;
using Puc.ProjetoFinal.Negocio.Dominio;
using Puc.ProjetoFinal.Negocio.Negocio;
using Puc.ProjetoFinal.Negocio.Exception;
using Puc.ProjetoFinal.SistemaUsuario.Util;

namespace Puc.ProjetoFinal.SistemaUsuario.Controllers
{
    public class CadFuncionarioController : Controller
    {

        FuncionarioModel model;

        [HttpGet]
        public IActionResult Index()
        {
            try
            {
                Stopwatch stopWatch = Stopwatch.StartNew();
                model = new FuncionarioModel();
                model.ListaFuncionario = RecuperarListaFuncionario();
                stopWatch.Stop();
                TratarInformacao.TratarErroNegocio("ConsultaListaFuncionario:" + stopWatch.ElapsedMilliseconds);
                return View(model.ListaFuncionario);
            }
            catch (Exception e)
            {
                ViewData["Message"] = TratarInformacao.TratarExcecaoNaoTratada(e);
            }
            return View("../Home/Index");
        }

        private List<FuncionarioModel> RecuperarListaFuncionario()
        {
            List<FuncionarioModel> listaFuncionarios = new List<FuncionarioModel>();
            try
            {
                CadastrarFuncionarioBO funcionarioBO = new CadastrarFuncionarioBO();
                List<Funcionario> lista = funcionarioBO.RecuperarFuncionario();
                foreach(Funcionario f in lista)
                {
                    FuncionarioModel f1 = new FuncionarioModel(f);
                    listaFuncionarios.Add(f1);
                }
            }
            catch (Exception e)
            {
                ViewData["Message"] = TratarInformacao.TratarExcecaoNaoTratada(e);
            }
            return listaFuncionarios;
        }

        [HttpGet]
        public IActionResult Incluir()
        {
            model = new FuncionarioModel();
            return View("Cadastrar", model);
        }

        [HttpPost]
        public IActionResult Salvar(FuncionarioModel _model)
        {
            Funcionario funcionario = new Funcionario();
            funcionario.IdFuncionario = _model.IdFuncionario;
            funcionario.Nome = _model.Nome;
            funcionario.Matricula = _model.Matricula;
            _model.ListaFuncionario = new List<FuncionarioModel>();

            try
            {
                Stopwatch stopWatch = Stopwatch.StartNew();
                CadastrarFuncionarioBO funcionarioBO = new CadastrarFuncionarioBO();
                if (funcionario.IdFuncionario == 0)
                {
                    funcionarioBO.IncluirFuncionario(funcionario);
                }
                else
                {
                    funcionario.Matricula = null;
                    funcionarioBO.AtualizarFuncionario(funcionario);
                }
                _model.ListaFuncionario = RecuperarListaFuncionario();

                TratarInformacao.TratarErroNegocio("SalvarFuncionario:" + stopWatch.ElapsedMilliseconds);
                return View("Index", _model.ListaFuncionario);
            }
            catch (NegocioException e)
            {
                ViewData["Message"] = TratarInformacao.TratarErroNegocio(e.Message);
                return View("Cadastrar", _model);
            }
            catch (Exception e)
            {
                ViewData["Message"] = TratarInformacao.TratarExcecaoNaoTratada(e);
            }
            return View("../Home/Index");
        }

        [HttpGet]
        public IActionResult Retornar(FuncionarioModel _model)
        {
            try
            {
                _model.ListaFuncionario = RecuperarListaFuncionario();
            }
            catch (Exception e)
            {
                ViewData["Message"] = TratarInformacao.TratarExcecaoNaoTratada(e);
            }
            return View("../Home/Index");
        }

        [HttpGet]
        public IActionResult Editar(int? id)
        {
            if (id == null)
            {
                return NotFound();
            }
            try
            {
                CadastrarFuncionarioBO funcionarioBO = new CadastrarFuncionarioBO();
                Funcionario funcionario = funcionarioBO.RecuperarFuncionario((int) id);
                if (funcionario == null)
                {
                    return NotFound();
                }
                model = new FuncionarioModel(funcionario);
                return View("Cadastrar", model);
            }
            catch (NegocioException e)
            {
                ViewData["Message"] = TratarInformacao.TratarErroNegocio(e.Message);
            }
            catch (Exception e)
            {
                ViewData["Message"] = TratarInformacao.TratarExcecaoNaoTratada(e);
            }
            return View("../Home/Index");
        }

        [HttpGet]
        public IActionResult Remover(int? id)
        {
            if (id == null)
            {
                return NotFound();
            }

            try
            {
                CadastrarFuncionarioBO funcionarioBO = new CadastrarFuncionarioBO();
                Funcionario funcionario = funcionarioBO.RecuperarFuncionario((int) id);
                funcionarioBO.RemoverFuncionario(funcionario);
                model = new FuncionarioModel();
                model.ListaFuncionario = RecuperarListaFuncionario();
                return View("Index", model.ListaFuncionario);
            }
            catch (NegocioException e)
            {
                ViewData["Message"] = TratarInformacao.TratarErroNegocio(e.Message);
            }
            catch (Exception e)
            {
                ViewData["Message"] = TratarInformacao.TratarExcecaoNaoTratada(e);
            }
            return View("../Home/Index");
        }
    }
}
