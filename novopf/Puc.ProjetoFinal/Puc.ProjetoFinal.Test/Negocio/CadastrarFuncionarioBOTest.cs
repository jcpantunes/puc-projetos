using Xunit;
using Puc.ProjetoFinal.Negocio.Dominio;
using Puc.ProjetoFinal.Negocio.Negocio;

namespace Puc.ProjetoFinal.Test.Negocio
{
    public class CadastrarFuncionarioBOTest
    {
        private readonly CadastrarFuncionarioBO _funcionarioBO;

        private readonly int IDTESTE = 2;

        public CadastrarFuncionarioBOTest()
        {
            _funcionarioBO = new CadastrarFuncionarioBO();
        }

        [Fact]
        public void CadastrarFuncionarioTest()
        {
            Funcionario result = _funcionarioBO.RecuperarFuncionario(1);
            Assert.NotNull(result);

            result = new Funcionario();
            result.IdFuncionario = IDTESTE;
            result.Nome = "Teste de Unidade";
            result.Matricula = "1234";
            _funcionarioBO.IncluirFuncionario(result);
            Assert.NotNull(result);

            result = _funcionarioBO.RecuperarFuncionario(IDTESTE);
            Assert.NotNull(result);

            _funcionarioBO.RemoverFuncionario(result);
            result = _funcionarioBO.RecuperarFuncionario(IDTESTE);
            Assert.Null(result);

        }
    }
}