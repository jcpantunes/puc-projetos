
package _106._0._168._192._8080.jaxws.dominio.excecaocapturada;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the _106._0._168._192._8080.jaxws.dominio.excecaocapturada package. 
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
    private final static QName _ExcecaoCapturada_QNAME = new QName("http://192.168.0.106:8080/jaxws/dominio/excecaocapturada", "ExcecaoCapturada");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: _106._0._168._192._8080.jaxws.dominio.excecaocapturada
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ExcecaoCapturada }
     * 
     */
    public ExcecaoCapturada createExcecaoCapturada() {
        return new ExcecaoCapturada();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ExcecaoCapturada }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://192.168.0.106:8080/jaxws/dominio/excecaocapturada", name = "ExcecaoCapturada")
    public JAXBElement<ExcecaoCapturada> createExcecaoCapturada(ExcecaoCapturada value) {
        return new JAXBElement<ExcecaoCapturada>(_ExcecaoCapturada_QNAME, ExcecaoCapturada.class, null, value);
    }

}
