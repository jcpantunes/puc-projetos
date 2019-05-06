using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.ComponentModel.DataAnnotations;

namespace Puc.ProjetoFinal.ConsultaLog.Models
{
    public class LogModel
    {

        public LogModel()
        {
            this.ListaLog = new List<LogModel>();
        }

        [DisplayName("Id")]
        public virtual int IdInformacao { get; set; }

        [DisplayName("Nome Sistema")]
        public virtual string NomeSistema { get; set; }

        //Erro, Aviso, Info
        [DisplayName("Tipo Informacao")]
        public virtual string TipoInformacao { get; set; }

        [DisplayName("Ticket")]
        public virtual string Ticket { get; set; }

        [DisplayName("Descricao")]
        public virtual string Descricao { get; set; }

        [DisplayName("Data")]
        public virtual DateTime DtInformacao { get; set; }

        [DisplayName("Hash")]
        public virtual string Hash { get; set; }

        public List<LogModel> ListaLog { get; set; }
        
    }
}