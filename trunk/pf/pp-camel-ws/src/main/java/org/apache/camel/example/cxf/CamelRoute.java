/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.example.cxf;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;

import puc.pf.portal.service.IServicePortal;
import puc.pf.portal.service.Iserviceportal;
import _106._0._168._192._8080.jaxws.ConsultarExcecaoResponse;
import _106._0._168._192._8080.jaxws.ConsultarListaExcecaoResponse;
import _106._0._168._192._8080.jaxws.dominio.excecaocapturada.ExcecaoCapturada;

/**
 * The Camel route
 *
 * @version 
 */
// START SNIPPET: e1
public class CamelRoute extends RouteBuilder {

    // CXF webservice using code first approach
    private String uri = "cxf:/camel?serviceClass=" + CamelService.class.getName();

    @Override
    public void configure() throws Exception {
        from(uri)
            .to("log:input")
            // send the request to the route to handle the operation
            // the name of the operation is in that header
            .recipientList(simple("direct:${header.operationName}"));

        // recuperar excecao
        from("direct:consultarExcecaoActiveMQ")
            .process(new Processor() {
                public void process(Exchange exchange) throws Exception {
                    String id = exchange.getIn().getBody(String.class).toString();
                    IServicePortal service = new IServicePortal();
        			Iserviceportal port = service.getIServicePortalPort();
        			ExcecaoCapturada dto = port.consultarExcecao(Long.parseLong(id));
        			if (dto.getID() == null) {
        				dto = new ExcecaoCapturada();
        			}
        			exchange.getOut().setBody(dto);
                }
            })
            .to("activemq:listaConsultarExcecaoActiveMQ");
        
        from("activemq:listaConsultarExcecaoActiveMQ")
        	.to("direct:resultadoListaConsultarExcecaoActiveMQ")
        	.process(new Processor() {
        		public void process(Exchange exchange) throws Exception {
        			ExcecaoCapturada resultado = exchange.getIn().getBody(ExcecaoCapturada.class);
        			exchange.getOut().setBody(resultado);
        		}
        	})
        	.convertBodyTo(ConsultarExcecaoResponse.class);
        
        // recuperar excecao
        from("direct:consultarExcecao2")
            .process(new Processor() {
                public void process(Exchange exchange) throws Exception {
                    String id = exchange.getIn().getBody(String.class).toString();
                    IServicePortal service = new IServicePortal();
        			Iserviceportal port = service.getIServicePortalPort();
        			ExcecaoCapturada dto = port.consultarExcecao(Long.parseLong(id));
        			if (dto.getID() == null) {
        				dto = new ExcecaoCapturada();
        			}
        			exchange.getOut().setBody(dto);
                }
            })
        	.to("mock:resultadoConsultarExcecao2")
        	.process(new Processor() {
        		public void process(Exchange exchange) throws Exception {
        			ExcecaoCapturada dto = exchange.getIn().getBody(ExcecaoCapturada.class);
        			ConsultarExcecaoResponse resposta = new ConsultarExcecaoResponse();
        			resposta.setExcecaoCapturada(dto);
        			exchange.getOut().setBody(resposta);
        		}
        	})
        	.convertBodyTo(ConsultarExcecaoResponse.class);
        
     // recuperar excecao
        from("direct:consultarListaExcecao2")
            .process(new Processor() {
                public void process(Exchange exchange) throws Exception {
                    IServicePortal service = new IServicePortal();
        			Iserviceportal port = service.getIServicePortalPort();
        			List<ExcecaoCapturada> lista = port.consultarListaExcecao();
        			if (lista == null) {
        				lista = new ArrayList<ExcecaoCapturada>();
        			}
        			exchange.getOut().setBody(lista);
                }
            })
        	.to("mock:resultadoConsultarListaExcecao2")
        	.process(new Processor() {
        		public void process(Exchange exchange) throws Exception {
        			@SuppressWarnings("unchecked")
					List<ExcecaoCapturada> lista = exchange.getIn().getBody(List.class);
        			ConsultarListaExcecaoResponse resposta = new ConsultarListaExcecaoResponse();
        			resposta.getListaExcecaoCapturada().addAll(lista);
        			exchange.getOut().setBody(resposta);
        		}
        	})
        	.convertBodyTo(ConsultarListaExcecaoResponse.class);

    }
}

