
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
 *         &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="StatusMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="URL_Request" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PublicRequestKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "statusCode",
    "statusMessage",
    "urlRequest",
    "requestKey",
    "publicRequestKey"
})
@XmlRootElement(name = "SendAuthorizeRequestResponse")
public class SendAuthorizeRequestResponse {

    @XmlElement(name = "StatusCode")
    protected int statusCode;
    @XmlElementRef(name = "StatusMessage", namespace = "http://api.decidir.com.ar", type = JAXBElement.class, required = false)
    protected JAXBElement<String> statusMessage;
    @XmlElementRef(name = "URL_Request", namespace = "http://api.decidir.com.ar", type = JAXBElement.class, required = false)
    protected JAXBElement<String> urlRequest;
    @XmlElementRef(name = "RequestKey", namespace = "http://api.decidir.com.ar", type = JAXBElement.class, required = false)
    protected JAXBElement<String> requestKey;
    @XmlElementRef(name = "PublicRequestKey", namespace = "http://api.decidir.com.ar", type = JAXBElement.class, required = false)
    protected JAXBElement<String> publicRequestKey;

    /**
     * Gets the value of the statusCode property.
     * 
     */
    public int getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     */
    public void setStatusCode(int value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the statusMessage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatusMessage() {
        return statusMessage;
    }

    /**
     * Sets the value of the statusMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatusMessage(JAXBElement<String> value) {
        this.statusMessage = value;
    }

    /**
     * Gets the value of the urlRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getURLRequest() {
        return urlRequest;
    }

    /**
     * Sets the value of the urlRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setURLRequest(JAXBElement<String> value) {
        this.urlRequest = value;
    }

    /**
     * Gets the value of the requestKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRequestKey() {
        return requestKey;
    }

    /**
     * Sets the value of the requestKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRequestKey(JAXBElement<String> value) {
        this.requestKey = value;
    }

    /**
     * Gets the value of the publicRequestKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPublicRequestKey() {
        return publicRequestKey;
    }

    /**
     * Sets the value of the publicRequestKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPublicRequestKey(JAXBElement<String> value) {
        this.publicRequestKey = value;
    }

}
