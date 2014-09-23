
package puc.pf.portal.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consultarListaExcecaoMaiorIdResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consultarListaExcecaoMaiorIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://192.168.0.106:8080/jaxws/dominio/excecao}ListaExcecaoCapturadaMaiorId" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarListaExcecaoMaiorIdResponse", propOrder = {
    "listaExcecaoCapturadaMaiorId"
})
public class ConsultarListaExcecaoMaiorIdResponse {

    @XmlElement(name = "ListaExcecaoCapturadaMaiorId", namespace = "http://192.168.0.106:8080/jaxws/dominio/excecao")
    protected List<Excecao> listaExcecaoCapturadaMaiorId;

    /**
     * Gets the value of the listaExcecaoCapturadaMaiorId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaExcecaoCapturadaMaiorId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaExcecaoCapturadaMaiorId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Excecao }
     * 
     * 
     */
    public List<Excecao> getListaExcecaoCapturadaMaiorId() {
        if (listaExcecaoCapturadaMaiorId == null) {
            listaExcecaoCapturadaMaiorId = new ArrayList<Excecao>();
        }
        return this.listaExcecaoCapturadaMaiorId;
    }

}
