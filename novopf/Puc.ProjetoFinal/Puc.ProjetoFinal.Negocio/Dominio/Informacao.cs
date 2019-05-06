using System;
using Microsoft.EntityFrameworkCore;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace Puc.ProjetoFinal.Negocio.Dominio
{
    [Table("Informacao")]
    public class Informacao
    {
        
        public Informacao()
        {
            this.DtInformacao = DateTime.Now;
        }

        [Key]
        [Column("idInformacao")]
        public virtual int IdInformacao { get; set; }

        [Column("nmSistema")]
        public virtual string NomeSistema { get; set; }

        //Erro, Aviso, Info
        [Column("tpInformacao")]
        public virtual string TipoInformacao { get; set; }

        [Column("cdTicket")]
        public virtual string Ticket { get; set; }

        [Column("txDescricao")]
        public virtual string Descricao { get; set; }

        [Column("dtInformacao")]
        public virtual DateTime DtInformacao { get; set; }

        [Column("txHash")]
        public virtual string Hash { get; set; }

    }
}
