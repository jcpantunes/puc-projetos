using System;
using System.ComponentModel;
using System.ComponentModel.DataAnnotations;

namespace Puc.ProjetoFinal.ApiMonitoracao.Models
{
    public class MensagemModel
    {

        public MensagemModel()
        {

        }

        [Required]
        public string NomeSistema { get; set; }

        //Erro, Aviso, Info
        [Required]
        public string TipoInformacao { get; set; }

        [Required]
        public string Ticket { get; set; }

        [Required]
        public string Descricao { get; set; }

    }
}
