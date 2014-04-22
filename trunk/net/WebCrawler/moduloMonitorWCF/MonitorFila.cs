using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using moduloPersistencia.util;
using moduloMonitorWCF.myqueue;
using System.Threading;
using System.Threading.Tasks;

namespace moduloMonitorWCF
{
    public class MonitorFila
    {
        public static MonitorFila instance = null;

        private int MAXIMO_FILA = 10;

        public bool Rodando
        {
            get;
            set;
        }

        public MonitorFila() 
        {
            Rodando = false;
        }

        public static MonitorFila getInstance()
        {
            if (instance == null)
            {
                instance = new MonitorFila();
            }
            return instance;
        }

        public string iniciarMonitoramento()
        {
            string resposta = "";
            if (Rodando == false)
            {
                resposta = "Iniciar Monitoramento da fila ...";
                Rodando = true;
                Thread thread = new Thread(monitorar);
                thread.Start();
            }
            else
            {
                resposta = "O monitor de filas ja em esta funcionamento ...";
            }
            Logger.getInstance().log(resposta, Logger.INFO, true);
            return resposta;
        }

        public string pararMonitoramento()
        {
            string resposta = "";
            if (Rodando == true)
            {
                resposta = "Parar Monitoramento da fila ...";
                Rodando = false;
            }
            else
            {
                resposta = "O monitor de filas nao esta em funcionamento ...";
            }
            Logger.getInstance().log(resposta, Logger.INFO, true);
            return resposta;
        }

        private void monitorar()
        {
            while (Rodando)
            {
                string mensagem = MyQueue.getInstance().lerProximaMensagem();
                if (mensagem != null && mensagem.Length > 0)
                {
                    int id = int.Parse(mensagem);
                    Logger.getInstance().log(" Enviando mensagem '" + id + "' para indexacao ...", Logger.INFO, true);

                    IndexadorServiceReference.IndexadorWSClient indexadorService = new IndexadorServiceReference.IndexadorWSClient();

                    string msgIndex = "";
                    if (MyQueue.getInstance().tamanhoFila() > MAXIMO_FILA)
                    {
                        msgIndex = indexadorService.indexarLink(id, true);
                    }
                    else
                    {
                        msgIndex = indexadorService.indexarLink(id, false);
                    }

                    Logger.getInstance().log(msgIndex, Logger.INFO, true);

                    if (MyQueue.getInstance().tamanhoFila() == 0)
                    {
                        Logger.getInstance().log("Fim da fila ...", Logger.INFO, true);
                    }
                }
                Thread.Sleep(3000);
            }
        }
    }
}