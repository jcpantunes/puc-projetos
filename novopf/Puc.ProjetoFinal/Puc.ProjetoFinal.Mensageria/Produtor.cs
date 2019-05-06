using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using RabbitMQ.Client;
using RabbitMQ.Client.Events;


namespace Puc.ProjetoFinal.Mensageria
{
    public class Produtor
    {

        public Produtor()
        {

        }

        public static void Produzir(string _host, string _fila, string _mensagem)
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
                        
                        var body = Encoding.UTF8.GetBytes(_mensagem);

                        channel.BasicPublish(exchange: "",
                            routingKey: _fila,
                            basicProperties: null,
                            body: body);
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
