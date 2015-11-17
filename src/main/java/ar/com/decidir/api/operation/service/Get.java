
package ar.com.decidir.api.operation.service;

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
 *         &lt;element name="IDSITE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IDTRANSACTIONSIT" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "idsite",
    "idtransactionsit"
})
@XmlRootElement(name = "Get")
public class Get {

    @XmlElement(name = "IDSITE", required = true, nillable = true)
    protected String idsite;
    @XmlElement(name = "IDTRANSACTIONSIT", required = true, nillable = true)
    protected String idtransactionsit;

    /**
     * Gets the value of the idsite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDSITE() {
        return idsite;
    }

    /**
     * Sets the value of the idsite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDSITE(String value) {
        this.idsite = value;
    }

    /**
     * Gets the value of the idtransactionsit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDTRANSACTIONSIT() {
        return idtransactionsit;
    }

    /**
     * Sets the value of the idtransactionsit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDTRANSACTIONSIT(String value) {
        this.idtransactionsit = value;
    }

}
