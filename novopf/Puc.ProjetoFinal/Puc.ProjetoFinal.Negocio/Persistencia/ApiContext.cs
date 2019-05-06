using System;
using Microsoft.EntityFrameworkCore;
using Puc.ProjetoFinal.Negocio.Dominio;

namespace Puc.ProjetoFinal.Negocio.Persistencia
{
    public class ApiContext : DbContext
    {
        public ApiContext(DbContextOptions<ApiContext> options)
            : base(options)
        {
        }

        public ApiContext()
        {
        }

        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            optionsBuilder.UseNpgsql("Host=localhost;Port=5432;Username=postgres;Password=;Database=dbv_00001_puc_projetofinal;");
        }

        public virtual DbSet<Funcionario> FuncionarioDAO { get; set; }

        public virtual DbSet<Tarefa> TarefaDAO { get; set; }

        public virtual DbSet<Informacao> InformacaoDAO { get; set; }

    }
}
