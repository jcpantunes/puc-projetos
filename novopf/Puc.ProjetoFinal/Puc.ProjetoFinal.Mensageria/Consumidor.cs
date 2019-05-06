using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using RabbitMQ.Client;
using RabbitMQ.Client.Events;

using Puc.ProjetoFinal.Negocio.Dominio;
using Puc.ProjetoFinal.Negocio.Negocio;
using Puc.ProjetoFinal.Negocio.Util;

namespace Puc.ProjetoFinal.Mensageria
{
    public class Consumidor
    {
        public Consumidor()
        {

        }

        public static void Consumir(string _host, string _fila)
        {
            var factory = new ConnectionFactory() { HostName = _host };

            try
            {
                using (var connection = factory.CreateConnection())
                {
                    using (var channel = connection.CreateModel())
                    {
                        channel.QueueDeclare(queue: _fila,
                            durable: false,
                            exclusive : false,
                            autoDelete: false,
                            arguments: null);
                        
                        var consumer = new EventingBasicConsumer(channel);
                        consumer.Received += (ModuleHandle, ea) =>
                        {
                            var body = ea.Body;
                            var mensagem = Encoding.UTF8.GetString(body);
                            Console.WriteLine("Mensagem consumida: " + mensagem);

                            Informacao informacao = Newtonsoft.Json.JsonConvert.DeserializeObject<Informacao>(mensagem);
                            informacao.Hash = Utils.GerarHash(informacao.Descricao);
                            CadastrarInformacaoBO cadInformacao = new CadastrarInformacaoBO();
                            cadInformacao.IncluirInformacao(informacao);
                            
                        };

                        channel.BasicConsume(queue: _fila,
                            autoAck: true,
                            consumer: consumer);

                        Console.WriteLine(" Press [enter] to exit.");
                        Console.ReadLine();
                    }
                }
            }
            catch(Exception e)
            {
                Console.WriteLine(e.Message + "\n" + e.InnerException);
            }
        }
    }
}
