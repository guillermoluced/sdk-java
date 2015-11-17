
package ar.com.decidir.api.authorize.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="Security" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Session" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Merchant" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="URL_OK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="URL_ERROR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EncodingMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Payload" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
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
    "security",
    "session",
    "merchant",
    "urlok",
    "urlerror",
    "encodingMethod",
    "payload"
})
@XmlRootElement(name = "SendAuthorizeRequest")
public class SendAuthorizeRequest {

    @XmlElement(name = "Security", required = true)
    protected String security;
    @XmlElementRef(name = "Session", namespace = "http://api.decidir.com.ar", type = JAXBElement.class, required = false)
    protected JAXBElement<String> session;
    @XmlElement(name = "Merchant", required = true)
    protected String merchant;
    @XmlElementRef(name = "URL_OK", namespace = "http://api.decidir.com.ar", type = JAXBElement.class, required = false)
    protected JAXBElement<String> urlok;
    @XmlElementRef(name = "URL_ERROR", namespace = "http://api.decidir.com.ar", type = JAXBElement.class, required = false)
    protected JAXBElement<String> urlerror;
    @XmlElementRef(name = "EncodingMethod", namespace = "http://api.decidir.com.ar", type = JAXBElement.class, required = false)
    protected JAXBElement<String> encodingMethod;
    @XmlElementRef(name = "Payload", namespace = "http://api.decidir.com.ar", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> payload;

    /**
     * Gets the value of the security property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurity() {
        return security;
    }

    /**
     * Sets the value of the security property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurity(String value) {
        this.security = value;
    }

    /**
     * Gets the value of the session property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSession() {
        return session;
    }

    /**
     * Sets the value of the session property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSession(JAXBElement<String> value) {
        this.session = value;
    }

    /**
     * Gets the value of the merchant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchant() {
        return merchant;
    }

    /**
     * Sets the value of the merchant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchant(String value) {
        this.merchant = value;
    }

    /**
     * Gets the value of the urlok property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getURLOK() {
        return urlok;
    }

    /**
     * Sets the value of the urlok property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setURLOK(JAXBElement<String> value) {
        this.urlok = value;
    }

    /**
     * Gets the value of the urlerror property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getURLERROR() {
        return urlerror;
    }

    /**
     * Sets the value of the urlerror property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setURLERROR(JAXBElement<String> value) {
        this.urlerror = value;
    }

    /**
     * Gets the value of the encodingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEncodingMethod() {
        return encodingMethod;
    }

    /**
     * Sets the value of the encodingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEncodingMethod(JAXBElement<String> value) {
        this.encodingMethod = value;
    }

    /**
     * Gets the value of the payload property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getPayload() {
        return payload;
    }

    /**
     * Sets the value of the payload property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setPayload(JAXBElement<Object> value) {
        this.payload = value;
    }

}
