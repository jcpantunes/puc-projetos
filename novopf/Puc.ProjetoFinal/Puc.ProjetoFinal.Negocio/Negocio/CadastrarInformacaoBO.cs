using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

using Puc.ProjetoFinal.Negocio.Dominio;
using Puc.ProjetoFinal.Negocio.Persistencia;
using Puc.ProjetoFinal.Negocio.Util;

namespace Puc.ProjetoFinal.Negocio.Negocio
{
    public class CadastrarInformacaoBO
    {

        public List<Informacao> RecuperarInformacao()
        {
            using (var db = new ApiContext())
            {
                return db.InformacaoDAO
                    .ToList();
            }
        }

        public Informacao RecuperarInformacao(int idInformacao)
        {
            using (var db = new ApiContext())
            {
                return db.InformacaoDAO
                    .Where(b => b.IdInformacao.Equals(idInformacao))
                    .FirstOrDefault();
            }
        }

        public List<Informacao> RecuperarUltimasInformacao(int quantidade)
        {
            using (var db = new ApiContext())
            {
                return db.InformacaoDAO
                    .OrderByDescending(i => i.IdInformacao)
                    .Take(quantidade)
                    .ToList();
            }
        }
        
        public Informacao RecuperarUltimaInformacaoCadastrado()
        {
            using (var db = new ApiContext())
            {
                return db.InformacaoDAO
                    .OrderByDescending(qt => qt.IdInformacao)
                    .FirstOrDefault();
            }
        }

        public void IncluirInformacao (Informacao informacao)
        {
            using (var db = new ApiContext())
            {
                db.Add(informacao);
                db.SaveChanges();
            }
        }

        public void AtualizarInformacao (Informacao informacao)
        {
            using (var db = new ApiContext())
            {
                db.Update(informacao);
                db.SaveChanges();
            }
        }

        public void RemoverInformacao (Informacao informacao)
        {
            using (var db = new ApiContext())
            {
                db.Remove(informacao);
                db.SaveChanges();
            }
        }
    }
}
