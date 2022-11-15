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
 * <p>Java-Klasse für XML-Zeitrahmensgrenze-Part complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XML-Zeitrahmensgrenze-Part"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="zeitspanne" type="{http://vdv/ka/pkm/2}XML-DurationValue"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="uhrzeit" type="{http://vdv/ka/pkm/2}XML-TimeValue"/&gt;
 *           &lt;element name="unbestimmt" type="{http://vdv/ka/pkm/2}XML-VoidValue"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XML-Zeitrahmensgrenze-Part", propOrder = {
    "zeitspanne",
    "uhrzeit",
    "unbestimmt"
})
@XmlSeeAlso({
    XMLZeitraumsgrenzePart.class
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
public class XMLZeitrahmensgrenzePart {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLDurationValue zeitspanne;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLTimeValue uhrzeit;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLVoidValue unbestimmt;

    /**
     * Ruft den Wert der zeitspanne-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLDurationValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLDurationValue getZeitspanne() {
        return zeitspanne;
    }

    /**
     * Legt den Wert der zeitspanne-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLDurationValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setZeitspanne(XMLDurationValue value) {
        this.zeitspanne = value;
    }

    /**
     * Ruft den Wert der uhrzeit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLTimeValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLTimeValue getUhrzeit() {
        return uhrzeit;
    }

    /**
     * Legt den Wert der uhrzeit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLTimeValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setUhrzeit(XMLTimeValue value) {
        this.uhrzeit = value;
    }

    /**
     * Ruft den Wert der unbestimmt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLVoidValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLVoidValue getUnbestimmt() {
        return unbestimmt;
    }

    /**
     * Legt den Wert der unbestimmt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLVoidValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setUnbestimmt(XMLVoidValue value) {
        this.unbestimmt = value;
    }

}
