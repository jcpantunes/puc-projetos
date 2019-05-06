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

                    }
                }
            }
            catch(Exception e)
            {
                Console.WriteLine(e.Message + "\n" + e.InnerException);
            }
        }

        /* public static void Consumir(string _host, string _fila)
        {
            var factory = new ConnectionFactory() 
            { 
                HostName = _host
                //UserName = UserName,
                //Password = Password
            };

            try
            {
                using (var connection = factory.CreateConnection())
                {
                    using (var channel = connection.CreateModel())
                    {
                        // accept only one unack-ed message at a time
                        // uint prefetchSize, ushort prefetchCount, bool global
                        channel.BasicQos(0, 1, false);
                        MessageReceiver messageReceiver = new MessageReceiver(channel);
                        channel.BasicConsume(_fila, false, messageReceiver);
                        //Console.ReadLine();
                    }
                }
            }
            catch(Exception e)
            {
                Console.WriteLine(e.Message + "\n" + e.InnerException);
            }
        }*/
    }


    public class MessageReceiver : DefaultBasicConsumer
    {
        private readonly IModel _channel;

        public MessageReceiver(IModel channel)
        {
            _channel = channel;
        }

        public override void HandleBasicDeliver(string consumerTag, ulong deliveryTag, bool redelivered, string exchange, string routingKey, IBasicProperties properties, byte[] body)
        {
            Console.WriteLine($"Consuming Message");
            Console.WriteLine(string.Concat("Message received from the exchange ", exchange));
            Console.WriteLine(string.Concat("Consumer tag: ", consumerTag));
            Console.WriteLine(string.Concat("Delivery tag: ", deliveryTag));
            Console.WriteLine(string.Concat("Routing tag: ", routingKey));
            Console.WriteLine(string.Concat("Message: ", Encoding.UTF8.GetString(body)));
            _channel.BasicAck(deliveryTag, false);
        }
    }
}
