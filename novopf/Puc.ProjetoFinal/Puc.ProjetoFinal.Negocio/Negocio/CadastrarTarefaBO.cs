using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

using Puc.ProjetoFinal.Negocio.Dominio;
using Puc.ProjetoFinal.Negocio.Persistencia;

namespace Puc.ProjetoFinal.Negocio.Negocio
{
    public class CadastrarTarefaBO
    {
        
        public List<Tarefa> RecuperarTarefa()
        {
            using (var db = new ApiContext())
            {
                return db.TarefaDAO
                    .ToList();
            }
        }

        public Tarefa RecuperarTarefa(int idTarefa)
        {
            using (var db = new ApiContext())
            {
                return db.TarefaDAO
                    .Where(b => b.IdTarefa.Equals(idTarefa))
                    .FirstOrDefault();
            }
        }
        
        public Tarefa RecuperarUltimoTarefaCadastrado()
        {
            using (var db = new ApiContext())
            {
                return db.TarefaDAO
                    .OrderByDescending(qt => qt.IdTarefa)
                    .FirstOrDefault();
            }
        }

        public void IncluirTarefa (Tarefa tarefa)
        {
            using (var db = new ApiContext())
            {
                db.Add(tarefa);
                db.SaveChanges();
            }
        }

        public void AtualizarTarefa (Tarefa tarefa)
        {
            using (var db = new ApiContext())
            {
                db.Update(tarefa);
                db.SaveChanges();
            }
        }

        public void RemoverTarefa (Tarefa tarefa)
        {
            using (var db = new ApiContext())
            {
                db.Remove(tarefa);
                db.SaveChanges();
            }
        }

    }
}