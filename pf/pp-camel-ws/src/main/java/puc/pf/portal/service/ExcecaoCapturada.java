
package puc.pf.portal.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ExcecaoCapturada complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExcecaoCapturada">
 *   &lt;complexContent>
 *     &lt;extension base="{http://192.168.0.106:8080/jaxws}baseBeanDTO">
 *       &lt;sequence>
 *         &lt;element name="TipoExcecao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Stacktrace" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Ticket" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DataExcecao" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExcecaoCapturada", namespace = "http://192.168.0.106:8080/jaxws/dominio/excecaocapturada", propOrder = {
    "tipoExcecao",
    "stacktrace",
    "ticket",
    "dataExcecao"
})
public class ExcecaoCapturada
    extends BaseBeanDTO
{

    @XmlElement(name = "TipoExcecao", required = true, nillable = true)
    protected String tipoExcecao;
    @XmlElement(name = "Stacktrace", required = true, nillable = true)
    protected String stacktrace;
    @XmlElement(name = "Ticket", required = true, nillable = true)
    protected String ticket;
    @XmlElement(name = "DataExcecao", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataExcecao;

    /**
     * Gets the value of the tipoExcecao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoExcecao() {
        return tipoExcecao;
    }

    /**
     * Sets the value of the tipoExcecao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoExcecao(String value) {
        this.tipoExcecao = value;
    }

    /**
     * Gets the value of the stacktrace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStacktrace() {
        return stacktrace;
    }

    /**
     * Sets the value of the stacktrace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStacktrace(String value) {
        this.stacktrace = value;
    }

    /**
     * Gets the value of the ticket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicket() {
        return ticket;
    }

    /**
     * Sets the value of the ticket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicket(String value) {
        this.ticket = value;
    }

    /**
     * Gets the value of the dataExcecao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataExcecao() {
        return dataExcecao;
    }

    /**
     * Sets the value of the dataExcecao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataExcecao(XMLGregorianCalendar value) {
        this.dataExcecao = value;
    }

}
