//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2022.02.14 um 02:39:27 PM CET 
//


package de.vdv.ka.pkm2;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für XML-Fachablauf-Part complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XML-Fachablauf-Part"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kontrollstart" type="{http://vdv/ka/pkm/2}XML-Ref11" minOccurs="0"/&gt;
 *         &lt;element name="erfassungsstart" type="{http://vdv/ka/pkm/2}XML-Ref11" minOccurs="0"/&gt;
 *         &lt;element name="anpassungsstart" type="{http://vdv/ka/pkm/2}XML-Ref11" minOccurs="0"/&gt;
 *         &lt;element name="darstellungsstart" type="{http://vdv/ka/pkm/2}XML-Ref11" minOccurs="0"/&gt;
 *         &lt;element name="produktermittlungsstart" type="{http://vdv/ka/pkm/2}XML-Ref11"/&gt;
 *         &lt;element name="transaktionsauswertungsstart" type="{http://vdv/ka/pkm/2}XML-Ref11" minOccurs="0"/&gt;
 *         &lt;element name="pruefungin" type="{http://vdv/ka/pkm/2}XML-Ref01" minOccurs="0"/&gt;
 *         &lt;element name="pruefungvor" type="{http://vdv/ka/pkm/2}XML-DurationValue" minOccurs="0"/&gt;
 *         &lt;element name="pruefungnach" type="{http://vdv/ka/pkm/2}XML-DurationValue" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XML-Fachablauf-Part", propOrder = {
    "kontrollstart",
    "erfassungsstart",
    "anpassungsstart",
    "darstellungsstart",
    "produktermittlungsstart",
    "transaktionsauswertungsstart",
    "pruefungin",
    "pruefungvor",
    "pruefungnach"
})
@XmlSeeAlso({
    XMLRNFachablaufPart.class,
    XMLPVFachablaufPart.class
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
public class XMLFachablaufPart {

    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRef11 kontrollstart;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRef11 erfassungsstart;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRef11 anpassungsstart;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRef11 darstellungsstart;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRef11 produktermittlungsstart;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRef11 transaktionsauswertungsstart;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRef01 pruefungin;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLDurationValue pruefungvor;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLDurationValue pruefungnach;

    /**
     * Ruft den Wert der kontrollstart-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRef11 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRef11 getKontrollstart() {
        return kontrollstart;
    }

    /**
     * Legt den Wert der kontrollstart-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRef11 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setKontrollstart(XMLRef11 value) {
        this.kontrollstart = value;
    }

    /**
     * Ruft den Wert der erfassungsstart-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRef11 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRef11 getErfassungsstart() {
        return erfassungsstart;
    }

    /**
     * Legt den Wert der erfassungsstart-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRef11 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setErfassungsstart(XMLRef11 value) {
        this.erfassungsstart = value;
    }

    /**
     * Ruft den Wert der anpassungsstart-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRef11 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRef11 getAnpassungsstart() {
        return anpassungsstart;
    }

    /**
     * Legt den Wert der anpassungsstart-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRef11 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setAnpassungsstart(XMLRef11 value) {
        this.anpassungsstart = value;
    }

    /**
     * Ruft den Wert der darstellungsstart-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRef11 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRef11 getDarstellungsstart() {
        return darstellungsstart;
    }

    /**
     * Legt den Wert der darstellungsstart-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRef11 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setDarstellungsstart(XMLRef11 value) {
        this.darstellungsstart = value;
    }

    /**
     * Ruft den Wert der produktermittlungsstart-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRef11 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRef11 getProduktermittlungsstart() {
        return produktermittlungsstart;
    }

    /**
     * Legt den Wert der produktermittlungsstart-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRef11 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setProduktermittlungsstart(XMLRef11 value) {
        this.produktermittlungsstart = value;
    }

    /**
     * Ruft den Wert der transaktionsauswertungsstart-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRef11 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRef11 getTransaktionsauswertungsstart() {
        return transaktionsauswertungsstart;
    }

    /**
     * Legt den Wert der transaktionsauswertungsstart-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRef11 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setTransaktionsauswertungsstart(XMLRef11 value) {
        this.transaktionsauswertungsstart = value;
    }

    /**
     * Ruft den Wert der pruefungin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRef01 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRef01 getPruefungin() {
        return pruefungin;
    }

    /**
     * Legt den Wert der pruefungin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRef01 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setPruefungin(XMLRef01 value) {
        this.pruefungin = value;
    }

    /**
     * Ruft den Wert der pruefungvor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLDurationValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLDurationValue getPruefungvor() {
        return pruefungvor;
    }

    /**
     * Legt den Wert der pruefungvor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLDurationValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setPruefungvor(XMLDurationValue value) {
        this.pruefungvor = value;
    }

    /**
     * Ruft den Wert der pruefungnach-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLDurationValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLDurationValue getPruefungnach() {
        return pruefungnach;
    }

    /**
     * Legt den Wert der pruefungnach-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLDurationValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setPruefungnach(XMLDurationValue value) {
        this.pruefungnach = value;
    }

}
