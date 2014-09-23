
package puc.pf.portal.service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "iserviceportal", targetNamespace = "http://192.168.0.106:8080/jaxws")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Iserviceportal {


    /**
     * 
     * @param arg0
     * @return
     *     returns puc.pf.portal.service.Excecao
     */
    @WebMethod(action = "http://192.168.0.106:8080/jaxws/consultarExcecao")
    @WebResult(name = "ExcecaoCapturada", targetNamespace = "http://192.168.0.106:8080/jaxws/dominio/excecao")
    @RequestWrapper(localName = "consultarExcecao", targetNamespace = "http://192.168.0.106:8080/jaxws", className = "puc.pf.portal.service.ConsultarExcecao")
    @ResponseWrapper(localName = "consultarExcecaoResponse", targetNamespace = "http://192.168.0.106:8080/jaxws", className = "puc.pf.portal.service.ConsultarExcecaoResponse")
    public Excecao consultarExcecao(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0);

    /**
     * 
     * @return
     *     returns java.util.List<puc.pf.portal.service.Excecao>
     */
    @WebMethod(action = "http://192.168.0.106:8080/jaxws/consultarListaExcecao")
    @WebResult(name = "ListaExcecaoCapturada", targetNamespace = "http://192.168.0.106:8080/jaxws/dominio/excecao")
    @RequestWrapper(localName = "consultarListaExcecao", targetNamespace = "http://192.168.0.106:8080/jaxws", className = "puc.pf.portal.service.ConsultarListaExcecao")
    @ResponseWrapper(localName = "consultarListaExcecaoResponse", targetNamespace = "http://192.168.0.106:8080/jaxws", className = "puc.pf.portal.service.ConsultarListaExcecaoResponse")
    public List<Excecao> consultarListaExcecao();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<puc.pf.portal.service.Excecao>
     */
    @WebMethod(action = "http://192.168.0.106:8080/jaxws/consultarListaExcecaoMaiorId")
    @WebResult(name = "ListaExcecaoCapturadaMaiorId", targetNamespace = "http://192.168.0.106:8080/jaxws/dominio/excecao")
    @RequestWrapper(localName = "consultarListaExcecaoMaiorId", targetNamespace = "http://192.168.0.106:8080/jaxws", className = "puc.pf.portal.service.ConsultarListaExcecaoMaiorId")
    @ResponseWrapper(localName = "consultarListaExcecaoMaiorIdResponse", targetNamespace = "http://192.168.0.106:8080/jaxws", className = "puc.pf.portal.service.ConsultarListaExcecaoMaiorIdResponse")
    public List<Excecao> consultarListaExcecaoMaiorId(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns puc.pf.portal.service.Funcionario
     */
    @WebMethod(action = "http://192.168.0.106:8080/jaxws/consultarFuncionario")
    @WebResult(name = "Funcionario", targetNamespace = "http://192.168.0.106:8080/jaxws/dominio/funcionario")
    @RequestWrapper(localName = "consultarFuncionario", targetNamespace = "http://192.168.0.106:8080/jaxws", className = "puc.pf.portal.service.ConsultarFuncionario")
    @ResponseWrapper(localName = "consultarFuncionarioResponse", targetNamespace = "http://192.168.0.106:8080/jaxws", className = "puc.pf.portal.service.ConsultarFuncionarioResponse")
    public Funcionario consultarFuncionario(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0);

    /**
     * 
     * @return
     *     returns java.util.List<puc.pf.portal.service.Funcionario>
     */
    @WebMethod(action = "http://192.168.0.106:8080/jaxws/consultarListaFuncionario")
    @WebResult(name = "ListaFuncionario", targetNamespace = "http://192.168.0.106:8080/jaxws/dominio/funcionario")
    @RequestWrapper(localName = "consultarListaFuncionario", targetNamespace = "http://192.168.0.106:8080/jaxws", className = "puc.pf.portal.service.ConsultarListaFuncionario")
    @ResponseWrapper(localName = "consultarListaFuncionarioResponse", targetNamespace = "http://192.168.0.106:8080/jaxws", className = "puc.pf.portal.service.ConsultarListaFuncionarioResponse")
    public List<Funcionario> consultarListaFuncionario();

}
