
package puc.pf.portal.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the puc.pf.portal.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ListaExcecaoCapturada_QNAME = new QName("http://192.168.0.106:8080/jaxws/dominio/excecaocapturada", "ListaExcecaoCapturada");
    private final static QName _BaseBean_QNAME = new QName("http://192.168.0.106:8080/jaxws/dominio/basebean", "BaseBean");
    private final static QName _ConsultarExcecaoResponse_QNAME = new QName("http://192.168.0.106:8080/jaxws", "consultarExcecaoResponse");
    private final static QName _ConsultarFuncionario_QNAME = new QName("http://192.168.0.106:8080/jaxws", "consultarFuncionario");
    private final static QName _ConsultarFuncionarioResponse_QNAME = new QName("http://192.168.0.106:8080/jaxws", "consultarFuncionarioResponse");
    private final static QName _ConsultarExcecao_QNAME = new QName("http://192.168.0.106:8080/jaxws", "consultarExcecao");
    private final static QName _ConsultarListaFuncionarioResponse_QNAME = new QName("http://192.168.0.106:8080/jaxws", "consultarListaFuncionarioResponse");
    private final static QName _Funcionario_QNAME = new QName("http://192.168.0.106:8080/jaxws/dominio/funcionario", "Funcionario");
    private final static QName _ExcecaoCapturada_QNAME = new QName("http://192.168.0.106:8080/jaxws/dominio/excecaocapturada", "ExcecaoCapturada");
    private final static QName _ConsultarListaExcecaoResponse_QNAME = new QName("http://192.168.0.106:8080/jaxws", "consultarListaExcecaoResponse");
    private final static QName _ConsultarListaExcecao_QNAME = new QName("http://192.168.0.106:8080/jaxws", "consultarListaExcecao");
    private final static QName _ConsultarListaFuncionario_QNAME = new QName("http://192.168.0.106:8080/jaxws", "consultarListaFuncionario");
    private final static QName _ListaFuncionario_QNAME = new QName("http://192.168.0.106:8080/jaxws/dominio/funcionario", "ListaFuncionario");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: puc.pf.portal.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Funcionario }
     * 
     */
    public Funcionario createFuncionario() {
        return new Funcionario();
    }

    /**
     * Create an instance of {@link ConsultarListaFuncionarioResponse }
     * 
     */
    public ConsultarListaFuncionarioResponse createConsultarListaFuncionarioResponse() {
        return new ConsultarListaFuncionarioResponse();
    }

    /**
     * Create an instance of {@link ConsultarListaExcecao }
     * 
     */
    public ConsultarListaExcecao createConsultarListaExcecao() {
        return new ConsultarListaExcecao();
    }

    /**
     * Create an instance of {@link ConsultarListaExcecaoResponse }
     * 
     */
    public ConsultarListaExcecaoResponse createConsultarListaExcecaoResponse() {
        return new ConsultarListaExcecaoResponse();
    }

    /**
     * Create an instance of {@link ConsultarExcecaoResponse }
     * 
     */
    public ConsultarExcecaoResponse createConsultarExcecaoResponse() {
        return new ConsultarExcecaoResponse();
    }

    /**
     * Create an instance of {@link ExcecaoCapturada }
     * 
     */
    public ExcecaoCapturada createExcecaoCapturada() {
        return new ExcecaoCapturada();
    }

    /**
     * Create an instance of {@link ConsultarExcecao }
     * 
     */
    public ConsultarExcecao createConsultarExcecao() {
        return new ConsultarExcecao();
    }

    /**
     * Create an instance of {@link ConsultarListaFuncionario }
     * 
     */
    public ConsultarListaFuncionario createConsultarListaFuncionario() {
        return new ConsultarListaFuncionario();
    }

    /**
     * Create an instance of {@link BaseBeanDTO }
     * 
     */
    public BaseBeanDTO createBaseBeanDTO() {
        return new BaseBeanDTO();
    }

    /**
     * Create an instance of {@link ConsultarFuncionarioResponse }
     * 
     */
    public ConsultarFuncionarioResponse createConsultarFuncionarioResponse() {
        return new ConsultarFuncionarioResponse();
    }

    /**
     * Create an instance of {@link ConsultarFuncionario }
     * 
     */
    public ConsultarFuncionario createConsultarFuncionario() {
        return new ConsultarFuncionario();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExcecaoCapturada }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://192.168.0.106:8080/jaxws/dominio/excecaocapturada", name = "ListaExcecaoCapturada")
    public JAXBElement<ExcecaoCapturada> createListaExcecaoCapturada(ExcecaoCapturada value) {
        return new JAXBElement<ExcecaoCapturada>(_ListaExcecaoCapturada_QNAME, ExcecaoCapturada.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseBeanDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://192.168.0.106:8080/jaxws/dominio/basebean", name = "BaseBean")
    public JAXBElement<BaseBeanDTO> createBaseBean(BaseBeanDTO value) {
        return new JAXBElement<BaseBeanDTO>(_BaseBean_QNAME, BaseBeanDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarExcecaoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://192.168.0.106:8080/jaxws", name = "consultarExcecaoResponse")
    public JAXBElement<ConsultarExcecaoResponse> createConsultarExcecaoResponse(ConsultarExcecaoResponse value) {
        return new JAXBElement<ConsultarExcecaoResponse>(_ConsultarExcecaoResponse_QNAME, ConsultarExcecaoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarFuncionario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://192.168.0.106:8080/jaxws", name = "consultarFuncionario")
    public JAXBElement<ConsultarFuncionario> createConsultarFuncionario(ConsultarFuncionario value) {
        return new JAXBElement<ConsultarFuncionario>(_ConsultarFuncionario_QNAME, ConsultarFuncionario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarFuncionarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://192.168.0.106:8080/jaxws", name = "consultarFuncionarioResponse")
    public JAXBElement<ConsultarFuncionarioResponse> createConsultarFuncionarioResponse(ConsultarFuncionarioResponse value) {
        return new JAXBElement<ConsultarFuncionarioResponse>(_ConsultarFuncionarioResponse_QNAME, ConsultarFuncionarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarExcecao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://192.168.0.106:8080/jaxws", name = "consultarExcecao")
    public JAXBElement<ConsultarExcecao> createConsultarExcecao(ConsultarExcecao value) {
        return new JAXBElement<ConsultarExcecao>(_ConsultarExcecao_QNAME, ConsultarExcecao.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarListaFuncionarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://192.168.0.106:8080/jaxws", name = "consultarListaFuncionarioResponse")
    public JAXBElement<ConsultarListaFuncionarioResponse> createConsultarListaFuncionarioResponse(ConsultarListaFuncionarioResponse value) {
        return new JAXBElement<ConsultarListaFuncionarioResponse>(_ConsultarListaFuncionarioResponse_QNAME, ConsultarListaFuncionarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Funcionario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://192.168.0.106:8080/jaxws/dominio/funcionario", name = "Funcionario")
    public JAXBElement<Funcionario> createFuncionario(Funcionario value) {
        return new JAXBElement<Funcionario>(_Funcionario_QNAME, Funcionario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExcecaoCapturada }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://192.168.0.106:8080/jaxws/dominio/excecaocapturada", name = "ExcecaoCapturada")
    public JAXBElement<ExcecaoCapturada> createExcecaoCapturada(ExcecaoCapturada value) {
        return new JAXBElement<ExcecaoCapturada>(_ExcecaoCapturada_QNAME, ExcecaoCapturada.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarListaExcecaoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://192.168.0.106:8080/jaxws", name = "consultarListaExcecaoResponse")
    public JAXBElement<ConsultarListaExcecaoResponse> createConsultarListaExcecaoResponse(ConsultarListaExcecaoResponse value) {
        return new JAXBElement<ConsultarListaExcecaoResponse>(_ConsultarListaExcecaoResponse_QNAME, ConsultarListaExcecaoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarListaExcecao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://192.168.0.106:8080/jaxws", name = "consultarListaExcecao")
    public JAXBElement<ConsultarListaExcecao> createConsultarListaExcecao(ConsultarListaExcecao value) {
        return new JAXBElement<ConsultarListaExcecao>(_ConsultarListaExcecao_QNAME, ConsultarListaExcecao.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarListaFuncionario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://192.168.0.106:8080/jaxws", name = "consultarListaFuncionario")
    public JAXBElement<ConsultarListaFuncionario> createConsultarListaFuncionario(ConsultarListaFuncionario value) {
        return new JAXBElement<ConsultarListaFuncionario>(_ConsultarListaFuncionario_QNAME, ConsultarListaFuncionario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Funcionario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://192.168.0.106:8080/jaxws/dominio/funcionario", name = "ListaFuncionario")
    public JAXBElement<Funcionario> createListaFuncionario(Funcionario value) {
        return new JAXBElement<Funcionario>(_ListaFuncionario_QNAME, Funcionario.class, null, value);
    }

}
