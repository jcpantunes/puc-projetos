using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace acn_trabalho_final.dominio
{
    public class Pessoa
    {
        public int Codigo { get; set; }
        public String Nome { get; set; }
        public int Id { get; set; }

        public Pessoa() { }
        public Pessoa(int Id, int Codigo, String Nome) {
            this.Id = Id;
            this.Codigo = Codigo;
            this.Nome = Nome;
        }
    }
}
