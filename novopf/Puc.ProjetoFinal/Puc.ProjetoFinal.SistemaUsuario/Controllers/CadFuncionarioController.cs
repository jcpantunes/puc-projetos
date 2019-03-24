using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Puc.ProjetoFinal.SistemaUsuario.Models;
using Puc.ProjetoFinal.Negocio.Dominio;
using Puc.ProjetoFinal.Negocio.Negocio;

namespace Puc.ProjetoFinal.SistemaUsuario.Controllers
{
    public class CadFuncionarioController : Controller
    {

        FuncionarioModel model;

        [HttpGet]
        public IActionResult Index()
        {
            // ViewData["Message"] = "Preencher os dados abaixo para cadastrar Funcionario";

            model = new FuncionarioModel();
            model.ListaFuncionario = new List<FuncionarioModel>();

            CadastrarFuncionarioBO funcionarioBO = new CadastrarFuncionarioBO();
            List<Funcionario> lista = funcionarioBO.RecuperarFuncionario();

            foreach(Funcionario f in lista)
            {
                FuncionarioModel f1 = new FuncionarioModel();
                f1.IdFuncionario = Convert.ToInt32(f.IdFuncionario);
                f1.Nome = f.Nome;
                f1.Matricula = f.Matricula;
                model.ListaFuncionario.Add(f1);
            }

            return View(model);
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

            CadastrarFuncionarioBO funcionarioBO = new CadastrarFuncionarioBO();
            if (funcionario.IdFuncionario == 0)
            {
                funcionarioBO.IncluirFuncionario(funcionario);
            }
            else
            {
                funcionarioBO.AtualizarFuncionario(funcionario);
            }

            List<Funcionario> lista = funcionarioBO.RecuperarFuncionario();
            foreach(Funcionario f in lista)
            {
                FuncionarioModel f1 = new FuncionarioModel();
                f1.IdFuncionario = Convert.ToInt32(f.IdFuncionario);
                f1.Nome = f.Nome;
                f1.Matricula = f.Matricula;
                _model.ListaFuncionario.Add(f1);
            }

            return View("Index", _model);
        }

        [HttpGet]
        public IActionResult Editar(int? id)
        {
            if (id == null)
            {
                return NotFound();
            }

            CadastrarFuncionarioBO funcionarioBO = new CadastrarFuncionarioBO();
            Funcionario funcionario = funcionarioBO.RecuperarFuncionario((int) id);
            model = new FuncionarioModel();
            model.IdFuncionario = (int) id;
            model.Nome = funcionario.Nome;
            model.Matricula = funcionario.Matricula;

            if (funcionario == null)
            {
                return NotFound();
            }

            return View("Cadastrar", model);
        }

        [HttpGet]
        public IActionResult Remover(int? id)
        {
            if (id == null)
            {
                return NotFound();
            }

            CadastrarFuncionarioBO funcionarioBO = new CadastrarFuncionarioBO();
            Funcionario funcionario = funcionarioBO.RecuperarFuncionario((int) id);
            funcionarioBO.RemoverFuncionario(funcionario);

            model = new FuncionarioModel();

            List<Funcionario> lista = funcionarioBO.RecuperarFuncionario();
            foreach(Funcionario f in lista)
            {
                FuncionarioModel f1 = new FuncionarioModel();
                f1.IdFuncionario = Convert.ToInt32(f.IdFuncionario);
                f1.Nome = f.Nome;
                f1.Matricula = f.Matricula;
                model.ListaFuncionario.Add(f1);
            }
            return View("Index", model);
        }


    }
}
