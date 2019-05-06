using System;
using System.IO;
using System.Threading;
using System.Security.Cryptography;
using System.Text;

using Puc.ProjetoFinal.Negocio.Util;
using Puc.ProjetoFinal.Mensageria;

namespace Puc.ProjetoFinal.ServicoProcessamento
{
    class Program
    {

        static void Main(string[] args)
        {
            Teste.Testar();

            // Console.Write ("Consumir quantas vezes (inrtervalo de 1 segundo): ");
            // int total = Convert.ToInt32(Console.ReadLine());

            // for (int contador = 0 ; contador < total ; contador++)
            // {
            //     Console.WriteLine("==> Thread " + contador);
            //     Consumidor.Consumir("localhost", "puc.projetofinal.apimonitoracao");
            //     Thread.Sleep(1000);
            // }
        }        
    }
}
