
package ar.com.decidir.api.operation.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Operation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Operation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IDTRANSACCIONSITE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FECHA_ORIGINAL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MONTO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CUOTAS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NROTICKET" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ESTADO_DESCRI" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IDMOTIVO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MOTIVO_ADICIONAL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TITULAR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IDTIPODOC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NRODOC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TIPODOC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CODAUT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NROTARJ4" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MOTIVO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VALDOM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MAIL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IDSITE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IDESTADO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IDMEDIOPAGO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MEDIOPAGO_DESCRI" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SEXOTITULAR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CALLE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NROPUERTA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PARAMSITIO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FECHAVTOCUOTA1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Operation", propOrder = {
    "idtransaccionsite",
    "fechaoriginal",
    "monto",
    "cuotas",
    "nroticket",
    "estadodescri",
    "idmotivo",
    "motivoadicional",
    "titular",
    "idtipodoc",
    "nrodoc",
    "tipodoc",
    "codaut",
    "nrotarj4",
    "motivo",
    "valdom",
    "mail",
    "idsite",
    "idestado",
    "idmediopago",
    "mediopagodescri",
    "sexotitular",
    "calle",
    "nropuerta",
    "paramsitio",
    "fechavtocuota1"
})
public class Operation {

    @XmlElement(name = "IDTRANSACCIONSITE", required = true, nillable = true)
    protected String idtransaccionsite;
    @XmlElement(name = "FECHA_ORIGINAL", required = true, nillable = true)
    protected String fechaoriginal;
    @XmlElement(name = "MONTO", required = true, nillable = true)
    protected String monto;
    @XmlElement(name = "CUOTAS", required = true, nillable = true)
    protected String cuotas;
    @XmlElement(name = "NROTICKET", required = true, nillable = true)
    protected String nroticket;
    @XmlElement(name = "ESTADO_DESCRI", required = true, nillable = true)
    protected String estadodescri;
    @XmlElement(name = "IDMOTIVO", required = true, nillable = true)
    protected String idmotivo;
    @XmlElement(name = "MOTIVO_ADICIONAL", required = true, nillable = true)
    protected String motivoadicional;
    @XmlElement(name = "TITULAR", required = true, nillable = true)
    protected String titular;
    @XmlElement(name = "IDTIPODOC", required = true, nillable = true)
    protected String idtipodoc;
    @XmlElement(name = "NRODOC", required = true, nillable = true)
    protected String nrodoc;
    @XmlElement(name = "TIPODOC", required = true, nillable = true)
    protected String tipodoc;
    @XmlElement(name = "CODAUT", required = true, nillable = true)
    protected String codaut;
    @XmlElement(name = "NROTARJ4", required = true, nillable = true)
    protected String nrotarj4;
    @XmlElement(name = "MOTIVO", required = true, nillable = true)
    protected String motivo;
    @XmlElement(name = "VALDOM", required = true, nillable = true)
    protected String valdom;
    @XmlElement(name = "MAIL", required = true, nillable = true)
    protected String mail;
    @XmlElement(name = "IDSITE", required = true, nillable = true)
    protected String idsite;
    @XmlElement(name = "IDESTADO", required = true, nillable = true)
    protected String idestado;
    @XmlElement(name = "IDMEDIOPAGO", required = true, nillable = true)
    protected String idmediopago;
    @XmlElement(name = "MEDIOPAGO_DESCRI", required = true, nillable = true)
    protected String mediopagodescri;
    @XmlElement(name = "SEXOTITULAR", required = true, nillable = true)
    protected String sexotitular;
    @XmlElement(name = "CALLE", required = true, nillable = true)
    protected String calle;
    @XmlElement(name = "NROPUERTA", required = true, nillable = true)
    protected String nropuerta;
    @XmlElement(name = "PARAMSITIO", required = true, nillable = true)
    protected String paramsitio;
    @XmlElement(name = "FECHAVTOCUOTA1", required = true, nillable = true)
    protected String fechavtocuota1;

    /**
     * Gets the value of the idtransaccionsite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDTRANSACCIONSITE() {
        return idtransaccionsite;
    }

    /**
     * Sets the value of the idtransaccionsite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDTRANSACCIONSITE(String value) {
        this.idtransaccionsite = value;
    }

    /**
     * Gets the value of the fechaoriginal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFECHAORIGINAL() {
        return fechaoriginal;
    }

    /**
     * Sets the value of the fechaoriginal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFECHAORIGINAL(String value) {
        this.fechaoriginal = value;
    }

    /**
     * Gets the value of the monto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMONTO() {
        return monto;
    }

    /**
     * Sets the value of the monto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMONTO(String value) {
        this.monto = value;
    }

    /**
     * Gets the value of the cuotas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUOTAS() {
        return cuotas;
    }

    /**
     * Sets the value of the cuotas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUOTAS(String value) {
        this.cuotas = value;
    }

    /**
     * Gets the value of the nroticket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNROTICKET() {
        return nroticket;
    }

    /**
     * Sets the value of the nroticket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNROTICKET(String value) {
        this.nroticket = value;
    }

    /**
     * Gets the value of the estadodescri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESTADODESCRI() {
        return estadodescri;
    }

    /**
     * Sets the value of the estadodescri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESTADODESCRI(String value) {
        this.estadodescri = value;
    }

    /**
     * Gets the value of the idmotivo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDMOTIVO() {
        return idmotivo;
    }

    /**
     * Sets the value of the idmotivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDMOTIVO(String value) {
        this.idmotivo = value;
    }

    /**
     * Gets the value of the motivoadicional property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOTIVOADICIONAL() {
        return motivoadicional;
    }

    /**
     * Sets the value of the motivoadicional property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOTIVOADICIONAL(String value) {
        this.motivoadicional = value;
    }

    /**
     * Gets the value of the titular property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTITULAR() {
        return titular;
    }

    /**
     * Sets the value of the titular property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTITULAR(String value) {
        this.titular = value;
    }

    /**
     * Gets the value of the idtipodoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDTIPODOC() {
        return idtipodoc;
    }

    /**
     * Sets the value of the idtipodoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDTIPODOC(String value) {
        this.idtipodoc = value;
    }

    /**
     * Gets the value of the nrodoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNRODOC() {
        return nrodoc;
    }

    /**
     * Sets the value of the nrodoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNRODOC(String value) {
        this.nrodoc = value;
    }

    /**
     * Gets the value of the tipodoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPODOC() {
        return tipodoc;
    }

    /**
     * Sets the value of the tipodoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPODOC(String value) {
        this.tipodoc = value;
    }

    /**
     * Gets the value of the codaut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODAUT() {
        return codaut;
    }

    /**
     * Sets the value of the codaut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODAUT(String value) {
        this.codaut = value;
    }

    /**
     * Gets the value of the nrotarj4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNROTARJ4() {
        return nrotarj4;
    }

    /**
     * Sets the value of the nrotarj4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNROTARJ4(String value) {
        this.nrotarj4 = value;
    }

    /**
     * Gets the value of the motivo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOTIVO() {
        return motivo;
    }

    /**
     * Sets the value of the motivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOTIVO(String value) {
        this.motivo = value;
    }

    /**
     * Gets the value of the valdom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALDOM() {
        return valdom;
    }

    /**
     * Sets the value of the valdom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALDOM(String value) {
        this.valdom = value;
    }

    /**
     * Gets the value of the mail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAIL() {
        return mail;
    }

    /**
     * Sets the value of the mail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAIL(String value) {
        this.mail = value;
    }

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
     * Gets the value of the idestado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDESTADO() {
        return idestado;
    }

    /**
     * Sets the value of the idestado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDESTADO(String value) {
        this.idestado = value;
    }

    /**
     * Gets the value of the idmediopago property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDMEDIOPAGO() {
        return idmediopago;
    }

    /**
     * Sets the value of the idmediopago property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDMEDIOPAGO(String value) {
        this.idmediopago = value;
    }

    /**
     * Gets the value of the mediopagodescri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMEDIOPAGODESCRI() {
        return mediopagodescri;
    }

    /**
     * Sets the value of the mediopagodescri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMEDIOPAGODESCRI(String value) {
        this.mediopagodescri = value;
    }

    /**
     * Gets the value of the sexotitular property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEXOTITULAR() {
        return sexotitular;
    }

    /**
     * Sets the value of the sexotitular property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEXOTITULAR(String value) {
        this.sexotitular = value;
    }

    /**
     * Gets the value of the calle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCALLE() {
        return calle;
    }

    /**
     * Sets the value of the calle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCALLE(String value) {
        this.calle = value;
    }

    /**
     * Gets the value of the nropuerta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNROPUERTA() {
        return nropuerta;
    }

    /**
     * Sets the value of the nropuerta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNROPUERTA(String value) {
        this.nropuerta = value;
    }

    /**
     * Gets the value of the paramsitio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARAMSITIO() {
        return paramsitio;
    }

    /**
     * Sets the value of the paramsitio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARAMSITIO(String value) {
        this.paramsitio = value;
    }

    /**
     * Gets the value of the fechavtocuota1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFECHAVTOCUOTA1() {
        return fechavtocuota1;
    }

    /**
     * Sets the value of the fechavtocuota1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFECHAVTOCUOTA1(String value) {
        this.fechavtocuota1 = value;
    }

}
