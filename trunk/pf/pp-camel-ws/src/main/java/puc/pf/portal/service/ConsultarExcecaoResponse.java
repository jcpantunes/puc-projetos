
package puc.pf.portal.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consultarExcecaoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consultarExcecaoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://192.168.0.106:8080/jaxws/dominio/excecaocapturada}ExcecaoCapturada" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarExcecaoResponse", propOrder = {
    "excecaoCapturada"
})
public class ConsultarExcecaoResponse {

    @XmlElement(name = "ExcecaoCapturada", namespace = "http://192.168.0.106:8080/jaxws/dominio/excecaocapturada")
    protected ExcecaoCapturada excecaoCapturada;

    /**
     * Gets the value of the excecaoCapturada property.
     * 
     * @return
     *     possible object is
     *     {@link ExcecaoCapturada }
     *     
     */
    public ExcecaoCapturada getExcecaoCapturada() {
        return excecaoCapturada;
    }

    /**
     * Sets the value of the excecaoCapturada property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExcecaoCapturada }
     *     
     */
    public void setExcecaoCapturada(ExcecaoCapturada value) {
        this.excecaoCapturada = value;
    }

}
