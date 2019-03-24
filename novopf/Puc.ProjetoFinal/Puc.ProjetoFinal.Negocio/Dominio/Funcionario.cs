using System;
using Microsoft.EntityFrameworkCore;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace Puc.ProjetoFinal.Negocio.Dominio
{
    [Table("Funcionario")]
    public class Funcionario
    {
        
        public Funcionario()
        {
            
        }

        [Key]
        [Column("idFuncionario")]
        public virtual int IdFuncionario { get; set; }

        [Column("nmFuncionario")]
        public virtual string Nome { get; set; }

        [Column("matFuncionario")]
        public virtual string Matricula { get; set; }
    }

}
