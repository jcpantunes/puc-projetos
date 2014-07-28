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

import org.apache.camel.builder.RouteBuilder;

// this static import is needed for older versions of Camel than 2.5
// import static org.apache.camel.language.simple.SimpleLanguage.simple;

/**
 * The Camel route
 *
 * @version 
 */
// START SNIPPET: e1
public class CopyOfCamelRoute extends RouteBuilder {

    // CXF webservice using code first approach
    private String uri = "cxf:/camel?serviceClass=" + CamelService.class.getName();

    @Override
    public void configure() throws Exception {
        from(uri)
            .to("log:input")
            // send the request to the route to handle the operation
            // the name of the operation is in that header
            .recipientList(simple("direct:${header.operationName}"));

        // recuperar aluno
//        from("direct:recuperarAlunoPorMatricula")
//            .process(new Processor() {
//                public void process(Exchange exchange) throws Exception {
//                    String matricula = exchange.getIn().getBody(String.class).toString();
//                    String xml = "<recuperarAlunoPorMatricula>" +
//                			"<arg0>" + matricula + "</arg0>" +
//                	"</recuperarAlunoPorMatricula>";
//                    exchange.getOut().setBody(xml);
//                }
//            })
//        	.to("spring-ws:http://localhost:8080/pp-cobol-mock-ws/myService?soapAction=http://pp.puc.org/recuperarAlunoPorMatricula")
//        	.process(new Processor() {
//                public void process(Exchange exchange) throws Exception {
//                    String resultado = exchange.getIn().getBody(String.class).toString();
//                    List<String[]> valores = XmlUtil.recuperarValor(resultado);
//                    for (String[] valor : valores) {
//                    	AlunoWSDTO dto = new AlunoWSDTO(valor[1], valor[2], valor[0]);
//                    	exchange.getOut().setBody(dto);
//                    }
//                    if(valores.size() == 0) {
//                    	exchange.getOut().setBody(new AlunoWSDTO("", "", ""));
//                    }
//                }
//            })
//        	.convertBodyTo(AlunoWSDTO.class);
//        
//        from("direct:recuperarNotaAluno")
//            .process(new Processor() {
//                public void process(Exchange exchange) throws Exception {
//                	Message mes = exchange.getIn();
//                	MessageContentsList lista = (MessageContentsList) mes.getBody();
//                	if (lista.size() == 2) {
//                		String matricula = lista.get(0).toString();
//                		String codigo = lista.get(1).toString();
//	                    String xml = "<recuperarNotaAluno>" +
//	                			"<arg0>" + matricula + "</arg0>" +
//	                			"<arg1>" + codigo + "</arg1>" +
//	                	"</recuperarNotaAluno>";
//	                    exchange.getOut().setBody(xml);
//                	}
//                }
//            })
//        	.to("spring-ws:http://localhost:8080/pp-cobol-mock-ws/myService?soapAction=http://pp.puc.org/recuperarNotaAluno")
//        	.process(new Processor() {
//                public void process(Exchange exchange) throws Exception {
//                    String resultado = exchange.getIn().getBody(String.class).toString();
//
//                    ListaNotaWSDTO lista = new ListaNotaWSDTO();
//                    List<String[]> valores = XmlUtil.recuperarValor(resultado);
//                    for (String[] valor : valores) {
//                    	NotaWSDTO dto = new NotaWSDTO(valor[0], valor[1], valor[2], valor[3]);
//                    	lista.getLista().add(dto);
//                    }
//                    if(lista.getLista().size() > 0) {
//                    	exchange.getOut().setBody(lista.getLista().get(0));
//                    } else {
//                    	exchange.getOut().setBody(new NotaWSDTO());
//                    }
//                }
//            });
//        
//        
//        from("direct:recuperarHistoricoAluno")
//	        .process(new Processor() {
//	            public void process(Exchange exchange) throws Exception {
//	                String matricula = exchange.getIn().getBody(String.class).toString();
//	                String xml = "<recuperarHistoricoAluno>" +
//	            			"<arg0>" + matricula + "</arg0>" +
//	            	"</recuperarHistoricoAluno>";
//	                exchange.getOut().setBody(xml);
//	            }
//	        })
//	    	.to("spring-ws:http://localhost:8080/pp-cobol-mock-ws/myService?soapAction=http://pp.puc.org/recuperarHistoricoAluno")
//	    	.process(new Processor() {
//	            public void process(Exchange exchange) throws Exception {
//	                String resultado = exchange.getIn().getBody(String.class).toString();
//	
//	                ListaNotaWSDTO lista = new ListaNotaWSDTO();
//	                List<String[]> valores = XmlUtil.recuperarValor(resultado);
//	                for (String[] valor : valores) {
//	                	NotaWSDTO dto = new NotaWSDTO(valor[0], valor[1], valor[2], valor[3]);
//	                	lista.getLista().add(dto);
//	                }
//	                exchange.getOut().setBody(lista);
//	            }
//	        });
//        
//        from("direct:solicitarTrancamento")
//        .process(new Processor() {
//            public void process(Exchange exchange) throws Exception {
//            	Message message = exchange.getIn();
//            	MessageContentsList lista = (MessageContentsList) message.getBody();
//            	if (lista.size() == 2) {
//            		String matricula = lista.get(0).toString();
//            		String codigoDisciplina = lista.get(1).toString();
//                    String xml = "<solicitarTrancamento>" +
//                			"<arg0>" + matricula + "</arg0>" +
//                			"<arg1>" + codigoDisciplina + "</arg1>" +
//                			"<arg2>" + message.getMessageId() + "</arg2>" +
//                	"</solicitarTrancamento>";
//                    exchange.getOut().setBody(xml);
//            	}
//            }
//        })
//    	.to("spring-ws:http://localhost:8080/pp-cobol-mock-ws/myService?soapAction=http://pp.puc.org/solicitarTrancamento")
//    	.process(new Processor() {
//            public void process(Exchange exchange) throws Exception {
//                String resultado = exchange.getIn().getBody(String.class).toString();
//            	
//                List<String[]> valores = XmlUtil.recuperarValor(resultado);
//                for (String[] valor : valores) {
//                	SolicitacaoTrancamentoMatriculaWSDTO dto = new SolicitacaoTrancamentoMatriculaWSDTO(valor[0], valor[1]);
//                	exchange.getOut().setBody(dto);
//                }
//                if (valores.size() == 0) {
//                	exchange.getOut().setBody(new SolicitacaoTrancamentoMatriculaWSDTO(Boolean.FALSE.toString(), ""));
//                }
//           }
//        });
//        
//        from("direct:confirmarSolicitacao")
//        .process(new Processor() {
//            public void process(Exchange exchange) throws Exception {
//            	// MessageContentsList lista = (MessageContentsList) exchange.getIn().getBody();
//        	    String xml = "<confirmarSolicitacao></confirmarSolicitacao>";
//                exchange.getOut().setBody(xml);
//            }
//        })
//    	.to("spring-ws:http://localhost:8080/pp-cobol-mock-ws/myService?soapAction=http://pp.puc.org/confirmarSolicitacao")
//    	.process(new Processor() {
//            public void process(Exchange exchange) throws Exception {
//                String resultado = exchange.getIn().getBody(String.class).toString();
//            	
//                ListaResultadoTrancamentoMatriculaWSDTO lista = new ListaResultadoTrancamentoMatriculaWSDTO();
//                List<String[]> valores = XmlUtil.recuperarValor(resultado);
//                for (String[] valor : valores) {
//                	ResultadoTrancamentoMatriculaWSDTO dto = new ResultadoTrancamentoMatriculaWSDTO(valor[1], valor[0]);
//                	lista.getLista().add(dto);
//                }
//                exchange.getOut().setBody(lista);
//           }
//        });
        	
    }
}

