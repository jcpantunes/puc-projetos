using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using moduloPersistencia.util;

namespace moduloMonitorWCF.myqueue
{
    public class MyQueue
    {
        private Queue<string> fila;

        public static MyQueue instance;

        public MyQueue()
        {
            Logger.getInstance().log("Criando uma nova fila", Logger.INFO, true);
            fila = new Queue<string>();
        }

        public static MyQueue getInstance()
        {
            if (instance == null)
            {
                instance = new MyQueue();
            }
            return instance;
        }

        public void inserirFila(string mensagem)
        {
            if (mensagem.Length > 0)
            {
                Logger.getInstance().log("Enviando mensagem para fila: " + mensagem, Logger.INFO, true);
                fila.Enqueue(mensagem);
                logarElementosFila();
            }
        }

        public string lerProximaMensagem()
        {
            string mensagem = "";
            if (fila.Count > 0)
            {
                mensagem = fila.Dequeue(); 
                Logger.getInstance().log("Recuperando mensagem da fila: " + mensagem, Logger.INFO, true);
                logarElementosFila();
            }
            return mensagem;
        }

        public int tamanhoFila()
        {
            return fila.Count;
        }

        public string listarMensagemFila()
        {
            string log = "";
            if (instance.fila.Count > 0)
            {
                foreach (string msg in instance.fila)
                {
                    log += msg + ";";
                }
                log = log.Substring(0, log.Length - 1);
            }
            return log;
        }

        private void logarElementosFila()
        {
            string log = "Elementos da fila (" + instance.fila.Count + "): " + listarMensagemFila();
            Logger.getInstance().log(log, Logger.INFO);
        }
    }
}