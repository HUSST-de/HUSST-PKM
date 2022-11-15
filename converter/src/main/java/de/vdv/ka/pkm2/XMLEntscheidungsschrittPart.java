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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für XML-Entscheidungsschritt-Part complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XML-Entscheidungsschritt-Part"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="funktion" type="{http://vdv/ka/pkm/2}XML-Ref11"/&gt;
 *         &lt;element name="ausnahme" type="{http://vdv/ka/pkm/2}XML-Ref01"/&gt;
 *         &lt;element name="janachfolger" type="{http://vdv/ka/pkm/2}XML-Ref11"/&gt;
 *         &lt;element name="neinnachfolger" type="{http://vdv/ka/pkm/2}XML-Ref11"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XML-Entscheidungsschritt-Part", propOrder = {
    "funktion",
    "ausnahme",
    "janachfolger",
    "neinnachfolger"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
public class XMLEntscheidungsschrittPart {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRef11 funktion;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRef01 ausnahme;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRef11 janachfolger;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRef11 neinnachfolger;

    /**
     * Ruft den Wert der funktion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRef11 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRef11 getFunktion() {
        return funktion;
    }

    /**
     * Legt den Wert der funktion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRef11 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setFunktion(XMLRef11 value) {
        this.funktion = value;
    }

    /**
     * Ruft den Wert der ausnahme-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRef01 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRef01 getAusnahme() {
        return ausnahme;
    }

    /**
     * Legt den Wert der ausnahme-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRef01 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setAusnahme(XMLRef01 value) {
        this.ausnahme = value;
    }

    /**
     * Ruft den Wert der janachfolger-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRef11 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRef11 getJanachfolger() {
        return janachfolger;
    }

    /**
     * Legt den Wert der janachfolger-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRef11 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setJanachfolger(XMLRef11 value) {
        this.janachfolger = value;
    }

    /**
     * Ruft den Wert der neinnachfolger-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRef11 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRef11 getNeinnachfolger() {
        return neinnachfolger;
    }

    /**
     * Legt den Wert der neinnachfolger-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRef11 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setNeinnachfolger(XMLRef11 value) {
        this.neinnachfolger = value;
    }

}
