using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.ComponentModel.DataAnnotations;

using System.IO;
using System.Text;
using System.Configuration;
using Microsoft.Extensions.Configuration;
using Microsoft.Extensions.Options;

using System.Runtime.Serialization;
using System.Runtime.Serialization.Json;

using System.Globalization;

using System.Net;
using System.Net.Http;
using System.Net.Http.Headers;
using System.Threading.Tasks;
using System.Linq;
using Newtonsoft.Json;
using Newtonsoft.Json.Linq;


namespace Puc.ProjetoFinal.ConsultaLog.Models
{
    [DataContract(Name="InformacaoModel")]
    public class LogModel
    {

        public LogModel()
        {
            this.Informacao = new Mensagem();
            ListaInformacao = new List<Mensagem>();
        }

        [DataMember(Name="idResposta")]
        public int IdResposta { get; set; }

        [DataMember(Name="informacao")]
        public Mensagem Informacao { get; set; }

        [DataMember(Name="listaInformacao")]
        public List<Mensagem> ListaInformacao { get; set; }
    }

    public class Mensagem
    {
        public Mensagem()
        {
            // this.JsonDate = @String.Format("{0:yyyy-MM-ddTHH:mm:ss}", DateTime.Now);
        }

        [DisplayName("Id")]
        [DataMember(Name="idInformacao")]
        public int IdInformacao { get; set; }
        
        [DisplayName("Nome Sistema")]
        [DataMember(Name="nomeSistema")]
        public string NomeSistema { get; set; }
        
        [DisplayName("Tipo Informação")]
        [DataMember(Name="tipoInformacao")]
        public string TipoInformacao { get; set; }
        
        [DisplayName("Ticket")]
        [DataMember(Name="ticket")]
        public string Ticket { get; set; }
        
        [DisplayName("Descricao")]
        [DataMember(Name="descricao")]
        public string Descricao { get; set; }

        [DataMember(Name="dtInformacao")]
        public string DtInformacao { get; set; }

        [DisplayName("Data")]     
        [IgnoreDataMember]
        public DateTime DataFormatada
        {
            get
            {
                return DateTime.ParseExact(DtInformacao.Substring(0,19), "yyyy-MM-ddTHH:mm:ss", CultureInfo.InvariantCulture);
            }
        }
        
        [DisplayName("Hash")]
        [DataMember(Name="hash")]
        public string Hash { get; set; }
    }
}
