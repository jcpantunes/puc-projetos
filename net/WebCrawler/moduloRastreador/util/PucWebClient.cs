using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Net;

namespace moduloRastreador.util
{
    class PucWebClient : WebClient
    {
        public PucWebClient()
        {
            this.Proxy = new WebProxy();
            this.Credentials = new NetworkCredential("44123", "946831");
        }
    }
    
}
