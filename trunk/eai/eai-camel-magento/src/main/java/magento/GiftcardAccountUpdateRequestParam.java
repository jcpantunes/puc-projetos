
package magento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="giftcardAccountId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="giftcardData" type="{urn:Magento}giftcardAccountEntityToUpdate"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sessionId",
    "giftcardAccountId",
    "giftcardData"
})
@XmlRootElement(name = "giftcardAccountUpdateRequestParam")
public class GiftcardAccountUpdateRequestParam {

    @XmlElement(required = true)
    protected String sessionId;
    @XmlElement(required = true)
    protected String giftcardAccountId;
    @XmlElement(required = true)
    protected GiftcardAccountEntityToUpdate giftcardData;

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the giftcardAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftcardAccountId() {
        return giftcardAccountId;
    }

    /**
     * Sets the value of the giftcardAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftcardAccountId(String value) {
        this.giftcardAccountId = value;
    }

    /**
     * Gets the value of the giftcardData property.
     * 
     * @return
     *     possible object is
     *     {@link GiftcardAccountEntityToUpdate }
     *     
     */
    public GiftcardAccountEntityToUpdate getGiftcardData() {
        return giftcardData;
    }

    /**
     * Sets the value of the giftcardData property.
     * 
     * @param value
     *     allowed object is
     *     {@link GiftcardAccountEntityToUpdate }
     *     
     */
    public void setGiftcardData(GiftcardAccountEntityToUpdate value) {
        this.giftcardData = value;
    }

}
