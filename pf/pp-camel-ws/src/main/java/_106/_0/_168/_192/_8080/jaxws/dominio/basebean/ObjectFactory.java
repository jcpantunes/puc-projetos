
package _106._0._168._192._8080.jaxws.dominio.basebean;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import _106._0._168._192._8080.jaxws.BaseBeanDTO;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the _106._0._168._192._8080.jaxws.dominio.basebean package. 
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

    private final static QName _BaseBean_QNAME = new QName("http://192.168.0.106:8080/jaxws/dominio/basebean", "BaseBean");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: _106._0._168._192._8080.jaxws.dominio.basebean
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseBeanDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://192.168.0.106:8080/jaxws/dominio/basebean", name = "BaseBean")
    public JAXBElement<BaseBeanDTO> createBaseBean(BaseBeanDTO value) {
        return new JAXBElement<BaseBeanDTO>(_BaseBean_QNAME, BaseBeanDTO.class, null, value);
    }

}
