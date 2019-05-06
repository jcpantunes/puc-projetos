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
            this.IdFuncionario = _funcionario.IdFuncionario;
            this.Nome = _funcionario.Nome;
            this.Matricula = _funcionario.Matricula;
        }

        [DisplayName("ID")]
        public int IdFuncionario { get; set; }

        [DisplayName("Nome")]
        [StringLength(80, MinimumLength = 3, ErrorMessage = "O campo deve ter tamanho minimo de 3 e maximo de 80")]
        [Required]
        public string Nome { get; set; }

        [DisplayName("Matricula")]
        [StringLength(10, MinimumLength = 1, ErrorMessage = "O campo deve ter tamanho minimo de 1 e maximo de 10")]
        [Required]
        public string Matricula { get; set; }

        public List<FuncionarioModel> ListaFuncionario { get; set; }
        
    }
}