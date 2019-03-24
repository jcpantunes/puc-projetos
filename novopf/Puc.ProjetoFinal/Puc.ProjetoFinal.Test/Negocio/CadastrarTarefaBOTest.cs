using Xunit;
using System;
using Puc.ProjetoFinal.Negocio.Dominio;
using Puc.ProjetoFinal.Negocio.Negocio;

namespace Puc.ProjetoFinal.Test.Negocio
{
    public class CadastrarTarefaBOTest
    {
        private readonly CadastrarTarefaBO _tarefaBO;

        private readonly int IDTESTE = 2;

        public CadastrarTarefaBOTest()
        {
            _tarefaBO = new CadastrarTarefaBO();
        }

        [Fact]
        public void CadastrarTarefaTest()
        {
            Tarefa result = _tarefaBO.RecuperarTarefa(1);
            Assert.NotNull(result);

            result = new Tarefa();
            result.IdTarefa = IDTESTE;
            result.Titulo = "Implementar Testes de Unidade";
            result.DtTarefa = DateTime.Now;
            result.IdFuncionario = 1;
            _tarefaBO.IncluirTarefa(result);
            Assert.NotNull(result);

            result = _tarefaBO.RecuperarTarefa(IDTESTE);
            Assert.NotNull(result);

            _tarefaBO.RemoverTarefa(result);
            result = _tarefaBO.RecuperarTarefa(IDTESTE);
            Assert.Null(result);

        }
    }
}