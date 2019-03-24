using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

using Puc.ProjetoFinal.Negocio.Dominio;
using Puc.ProjetoFinal.Negocio.Persistencia;

namespace Puc.ProjetoFinal.Negocio.Negocio
{
    public class CadastrarFuncionarioBO
    {

        public List<Funcionario> RecuperarFuncionario()
        {
            using (var db = new ApiContext())
            {
                return db.FuncionarioDAO
                    .ToList();
            }
        }

        public Funcionario RecuperarFuncionario(int idFuncionario)
        {
            using (var db = new ApiContext())
            {
                return db.FuncionarioDAO
                    .Where(b => b.IdFuncionario.Equals(idFuncionario))
                    .FirstOrDefault();
            }
        }
        
        public Funcionario RecuperarUltimoFuncionarioCadastrado()
        {
            using (var db = new ApiContext())
            {
                return db.FuncionarioDAO
                    .OrderByDescending(qt => qt.IdFuncionario)
                    .FirstOrDefault();
            }
        }

        public void IncluirFuncionario (Funcionario funcionario)
        {
            using (var db = new ApiContext())
            {
                db.Add(funcionario);
                db.SaveChanges();
            }
        }

        public void AtualizarFuncionario (Funcionario funcionario)
        {
            using (var db = new ApiContext())
            {
                db.Update(funcionario);
                db.SaveChanges();
            }
        }

        public void RemoverFuncionario (Funcionario funcionario)
        {
            using (var db = new ApiContext())
            {
                db.Remove(funcionario);
                db.SaveChanges();
            }
        }
    }
}

