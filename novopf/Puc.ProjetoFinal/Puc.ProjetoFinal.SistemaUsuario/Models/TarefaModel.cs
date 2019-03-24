using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.ComponentModel.DataAnnotations;
using Puc.ProjetoFinal.Negocio.Dominio;
using Puc.ProjetoFinal.Negocio.Negocio;

namespace Puc.ProjetoFinal.SistemaUsuario.Models
{
    public class TarefaModel
    {
        public TarefaModel()
        {
            this.DtTarefa = DateTime.Now;
            this.ListaTarefa = new List<TarefaModel>();
        }

        public TarefaModel(Tarefa _tarefa)
        {
            this.IdTarefa = _tarefa.IdTarefa;
            this.Titulo = _tarefa.Titulo;
            this.DtTarefa = _tarefa.DtTarefa;
            this.IdFuncionario = _tarefa.IdFuncionario;

            CadastrarFuncionarioBO funcionarioBO = new CadastrarFuncionarioBO();
            this.Funcionario = funcionarioBO.RecuperarFuncionario(tarefa.IdFuncionario);
        }

        [DisplayName("Id")]
        public int IdTarefa { get; set; }                                                      

        [DisplayName("Titulo")]
        [StringLength(100, MinimumLength = 5, ErrorMessage = "O campo deve ter tamanho minimo de 5 e maximo de 100")]
        [Required]
        public string Titulo { get; set; }

        [DisplayName("Data")]
        [Required]
        [DataType(DataType.Date)]
        public DateTime DtTarefa { get; set; }

        [DisplayName("Funcionario")]
        [Required]
        public int IdFuncionario { get; set; }

        public Funcionario Funcionario { get; set; }

        public List<TarefaModel> ListaTarefa { get; set; }
        
    }
}