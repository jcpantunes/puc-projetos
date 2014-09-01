
package _106._0._168._192._8080.jaxws.dominio.funcionario;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the _106._0._168._192._8080.jaxws.dominio.funcionario package. 
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

    private final static QName _Funcionario_QNAME = new QName("http://192.168.0.106:8080/jaxws/dominio/funcionario", "Funcionario");
    private final static QName _ListaFuncionario_QNAME = new QName("http://192.168.0.106:8080/jaxws/dominio/funcionario", "ListaFuncionario");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: _106._0._168._192._8080.jaxws.dominio.funcionario
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Funcionario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://192.168.0.106:8080/jaxws/dominio/funcionario", name = "Funcionario")
    public JAXBElement<Funcionario> createFuncionario(Funcionario value) {
        return new JAXBElement<Funcionario>(_Funcionario_QNAME, Funcionario.class, null, value);
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
