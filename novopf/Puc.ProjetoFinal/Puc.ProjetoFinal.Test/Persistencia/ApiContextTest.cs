using Xunit;
using Puc.ProjetoFinal.Negocio.Dominio;
using Puc.ProjetoFinal.Negocio.Persistencia;

namespace Puc.ProjetoFinal.Test.Persistencia
{
    public class ApiContextTest
    {
        private readonly ApiContext _apiContext;

        public ApiContextTest()
        {
            _apiContext = new ApiContext();
        }

        //[Fact]
        public void ConsultarFuncionarioTest()
        {
            Funcionario result = _apiContext.FuncionarioDAO.Find(1L);
            Assert.NotNull(result);
        }

        //[Fact]
        public void IncluirFuncionarioTest()
        {
            Funcionario result = new Funcionario();
            result.IdFuncionario = 2;
            result.Nome = "Teste de Unidade";
            result.Matricula = "1234";
            _apiContext.FuncionarioDAO.Add(result);
            _apiContext.SaveChanges();
            Assert.NotNull(result);

            _apiContext.Remove(result);
            _apiContext.SaveChanges();

            result = _apiContext.FuncionarioDAO.Find(2);
            Assert.Null(result);

        }

        //[Fact]
        public void ConsultarTarefaTest()
        {
            Tarefa result = _apiContext.TarefaDAO.Find(1L);
            Assert.NotNull(result);
        }
    }
}