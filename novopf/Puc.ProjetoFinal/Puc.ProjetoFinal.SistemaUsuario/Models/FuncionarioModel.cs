using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.ComponentModel.DataAnnotations;
using Puc.ProjetoFinal.Negocio.Dominio;

namespace Puc.ProjetoFinal.SistemaUsuario.Models
{
    public class FuncionarioModel
    {

        public FuncionarioModel()
        {
            this.ListaFuncionario = new List<FuncionarioModel>();
        }

        public FuncionarioModel(Funcionario _funcionario)
        {
            
        }
        public int IdFuncionario { get; set; }

        public string Nome { get; set; }

        public string Matricula { get; set; }

        public List<FuncionarioModel> ListaFuncionario { get; set; }
        
    }
}