using System;

namespace Puc.ProjetoFinal.Negocio.Exception
{
    public class NegocioException : System.Exception
    {
        
        public NegocioException(string mensagem) : base (mensagem) { }

        public NegocioException(string mensagem, System.Exception inner) : base(mensagem                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                , inner) { }

    }
}