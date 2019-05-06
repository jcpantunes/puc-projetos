using Puc.ProjetoFinal.Negocio.Dominio;

namespace Puc.ProjetoFinal.ApiMonitoracao.Models
{
    public class InformacaoModel
    {

        public const int ID_SUCESSO = 1;
        public const int ID_INFORMACAO_NAO_ENCONTRADA = 2;
        public const int ID_ERRO_NAO_TRATADO = 3;

        public InformacaoModel()
        {
            this.IdResposta = 2;
            this.Informacao = new Informacao();
        }

        public int IdResposta { get; set; }

        public Informacao Informacao { get; set; }

    }
}