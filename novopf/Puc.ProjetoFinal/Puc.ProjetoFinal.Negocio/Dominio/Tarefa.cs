using System;
using Microsoft.EntityFrameworkCore;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace Puc.ProjetoFinal.Negocio.Dominio
{
    [Table("Tarefa")]
    public class Tarefa
    {   
        
        public Tarefa()
        {
            
        }

        [Key]
        [Column("idTarefa")]
        public virtual int IdTarefa { get; set; }                                                      

        [Column("titulo")]
        public virtual string Titulo { get; set; }

        [Column("dtTarefa")]
        public virtual DateTime DtTarefa { get; set; }

        [Column("idFuncionario")]
        public virtual int IdFuncionario { get; set; }

    }
}
