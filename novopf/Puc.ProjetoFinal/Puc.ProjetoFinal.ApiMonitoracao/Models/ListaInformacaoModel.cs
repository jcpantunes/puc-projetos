using System;
using System.Collections.Generic;

using Puc.ProjetoFinal.Negocio.Dominio;

namespace Puc.ProjetoFinal.ApiMonitoracao.Models
{
    public class ListaInformacaoModel
    {

        public const int ID_SUCESSO = 1;
        public const int ID_INFORMACAO_NAO_ENCONTRADA = 2;
        public const int ID_ERRO_NAO_TRATADO = 3;

        public ListaInformacaoModel()
        {
            this.IdResposta = 1;
            this.ListaInformacao = new List<Informacao>();
        }

        public int IdResposta { get; set; }

        public List<Informacao> ListaInformacao { get; set; }

    }
}
