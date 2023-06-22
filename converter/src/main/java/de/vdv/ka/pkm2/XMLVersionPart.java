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
 * <p>Java-Klasse für XML-Version-Part complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XML-Version-Part"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gueltigkeitsbeginn" type="{http://vdv/ka/pkm/2}XML-DatetimeValue"/&gt;
 *         &lt;element name="externNr" type="{http://vdv/ka/pkm/2}XML-IntegerValue"/&gt;
 *         &lt;element name="internNr" type="{http://vdv/ka/pkm/2}XML-IntegerValue"/&gt;
 *         &lt;element name="modulstatus" type="{http://vdv/ka/pkm/2}XML-IntegerValue"/&gt;
 *         &lt;element name="modulspezifikation" type="{http://vdv/ka/pkm/2}XML-StringValue"/&gt;
 *         &lt;element name="modulnamenszusatz" type="{http://vdv/ka/pkm/2}XML-StringValue"/&gt;
 *         &lt;element name="speicherzeitpunkt" type="{http://vdv/ka/pkm/2}XML-DatetimeValue"/&gt;
 *         &lt;element name="bearbeiter" type="{http://vdv/ka/pkm/2}XML-StringValue"/&gt;
 *         &lt;element name="freigeber" type="{http://vdv/ka/pkm/2}XML-StringValue"/&gt;
 *         &lt;element name="bemerkung" type="{http://vdv/ka/pkm/2}XML-StringValue"/&gt;
 *         &lt;element name="vorgaengerversion" type="{http://vdv/ka/pkm/2}XML-Version-Part" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XML-Version-Part", propOrder = {
    "gueltigkeitsbeginn",
    "externNr",
    "internNr",
    "modulstatus",
    "modulspezifikation",
    "modulnamenszusatz",
    "speicherzeitpunkt",
    "bearbeiter",
    "freigeber",
    "bemerkung",
    "vorgaengerversion"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
public class XMLVersionPart {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLDatetimeValue gueltigkeitsbeginn;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLIntegerValue externNr;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLIntegerValue internNr;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLIntegerValue modulstatus;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLStringValue modulspezifikation;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLStringValue modulnamenszusatz;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLDatetimeValue speicherzeitpunkt;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLStringValue bearbeiter;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLStringValue freigeber;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLStringValue bemerkung;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLVersionPart vorgaengerversion;

    /**
     * Ruft den Wert der gueltigkeitsbeginn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLDatetimeValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLDatetimeValue getGueltigkeitsbeginn() {
        return gueltigkeitsbeginn;
    }

    /**
     * Legt den Wert der gueltigkeitsbeginn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLDatetimeValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setGueltigkeitsbeginn(XMLDatetimeValue value) {
        this.gueltigkeitsbeginn = value;
    }

    /**
     * Ruft den Wert der externNr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLIntegerValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLIntegerValue getExternNr() {
        return externNr;
    }

    /**
     * Legt den Wert der externNr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLIntegerValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setExternNr(XMLIntegerValue value) {
        this.externNr = value;
    }

    /**
     * Ruft den Wert der internNr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLIntegerValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLIntegerValue getInternNr() {
        return internNr;
    }

    /**
     * Legt den Wert der internNr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLIntegerValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setInternNr(XMLIntegerValue value) {
        this.internNr = value;
    }

    /**
     * Ruft den Wert der modulstatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLIntegerValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLIntegerValue getModulstatus() {
        return modulstatus;
    }

    /**
     * Legt den Wert der modulstatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLIntegerValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setModulstatus(XMLIntegerValue value) {
        this.modulstatus = value;
    }

    /**
     * Ruft den Wert der modulspezifikation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLStringValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLStringValue getModulspezifikation() {
        return modulspezifikation;
    }

    /**
     * Legt den Wert der modulspezifikation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLStringValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setModulspezifikation(XMLStringValue value) {
        this.modulspezifikation = value;
    }

    /**
     * Ruft den Wert der modulnamenszusatz-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLStringValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLStringValue getModulnamenszusatz() {
        return modulnamenszusatz;
    }

    /**
     * Legt den Wert der modulnamenszusatz-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLStringValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setModulnamenszusatz(XMLStringValue value) {
        this.modulnamenszusatz = value;
    }

    /**
     * Ruft den Wert der speicherzeitpunkt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLDatetimeValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLDatetimeValue getSpeicherzeitpunkt() {
        return speicherzeitpunkt;
    }

    /**
     * Legt den Wert der speicherzeitpunkt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLDatetimeValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setSpeicherzeitpunkt(XMLDatetimeValue value) {
        this.speicherzeitpunkt = value;
    }

    /**
     * Ruft den Wert der bearbeiter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLStringValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLStringValue getBearbeiter() {
        return bearbeiter;
    }

    /**
     * Legt den Wert der bearbeiter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLStringValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setBearbeiter(XMLStringValue value) {
        this.bearbeiter = value;
    }

    /**
     * Ruft den Wert der freigeber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLStringValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLStringValue getFreigeber() {
        return freigeber;
    }

    /**
     * Legt den Wert der freigeber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLStringValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setFreigeber(XMLStringValue value) {
        this.freigeber = value;
    }

    /**
     * Ruft den Wert der bemerkung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLStringValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLStringValue getBemerkung() {
        return bemerkung;
    }

    /**
     * Legt den Wert der bemerkung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLStringValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setBemerkung(XMLStringValue value) {
        this.bemerkung = value;
    }

    /**
     * Ruft den Wert der vorgaengerversion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLVersionPart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLVersionPart getVorgaengerversion() {
        return vorgaengerversion;
    }

    /**
     * Legt den Wert der vorgaengerversion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLVersionPart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setVorgaengerversion(XMLVersionPart value) {
        this.vorgaengerversion = value;
    }

}
