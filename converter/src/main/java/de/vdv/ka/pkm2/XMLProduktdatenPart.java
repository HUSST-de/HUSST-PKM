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
 * <p>Java-Klasse für XML-Produktdaten-Part complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XML-Produktdaten-Part"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="funktion" type="{http://vdv/ka/pkm/2}XML-Ref01"/&gt;
 *         &lt;element name="modulkontext" type="{http://vdv/ka/pkm/2}XML-RefSet0N"/&gt;
 *         &lt;element name="unterstuetztab" type="{http://vdv/ka/pkm/2}XML-DateValue"/&gt;
 *         &lt;element name="ausgangsdaten-matrix" type="{http://vdv/ka/pkm/2}XML-Ausgangsdaten-Matrix"/&gt;
 *         &lt;element name="abhaengigkeitsdaten-table" type="{http://vdv/ka/pkm/2}XML-Abhaengigkeitsdaten-Table"/&gt;
 *         &lt;element name="abhaengigkeitsausnahme-table" type="{http://vdv/ka/pkm/2}XML-Abhaengigkeitsausnahme-Table"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XML-Produktdaten-Part", propOrder = {
    "funktion",
    "modulkontext",
    "unterstuetztab",
    "ausgangsdatenMatrix",
    "abhaengigkeitsdatenTable",
    "abhaengigkeitsausnahmeTable"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
public class XMLProduktdatenPart {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRef01 funktion;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRefSet0N modulkontext;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLDateValue unterstuetztab;
    @XmlElement(name = "ausgangsdaten-matrix", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLAusgangsdatenMatrix ausgangsdatenMatrix;
    @XmlElement(name = "abhaengigkeitsdaten-table", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLAbhaengigkeitsdatenTable abhaengigkeitsdatenTable;
    @XmlElement(name = "abhaengigkeitsausnahme-table", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLAbhaengigkeitsausnahmeTable abhaengigkeitsausnahmeTable;

    /**
     * Ruft den Wert der funktion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRef01 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRef01 getFunktion() {
        return funktion;
    }

    /**
     * Legt den Wert der funktion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRef01 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setFunktion(XMLRef01 value) {
        this.funktion = value;
    }

    /**
     * Ruft den Wert der modulkontext-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRefSet0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRefSet0N getModulkontext() {
        return modulkontext;
    }

    /**
     * Legt den Wert der modulkontext-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRefSet0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setModulkontext(XMLRefSet0N value) {
        this.modulkontext = value;
    }

    /**
     * Ruft den Wert der unterstuetztab-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLDateValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLDateValue getUnterstuetztab() {
        return unterstuetztab;
    }

    /**
     * Legt den Wert der unterstuetztab-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLDateValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setUnterstuetztab(XMLDateValue value) {
        this.unterstuetztab = value;
    }

    /**
     * Ruft den Wert der ausgangsdatenMatrix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLAusgangsdatenMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLAusgangsdatenMatrix getAusgangsdatenMatrix() {
        return ausgangsdatenMatrix;
    }

    /**
     * Legt den Wert der ausgangsdatenMatrix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLAusgangsdatenMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setAusgangsdatenMatrix(XMLAusgangsdatenMatrix value) {
        this.ausgangsdatenMatrix = value;
    }

    /**
     * Ruft den Wert der abhaengigkeitsdatenTable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLAbhaengigkeitsdatenTable }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLAbhaengigkeitsdatenTable getAbhaengigkeitsdatenTable() {
        return abhaengigkeitsdatenTable;
    }

    /**
     * Legt den Wert der abhaengigkeitsdatenTable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLAbhaengigkeitsdatenTable }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setAbhaengigkeitsdatenTable(XMLAbhaengigkeitsdatenTable value) {
        this.abhaengigkeitsdatenTable = value;
    }

    /**
     * Ruft den Wert der abhaengigkeitsausnahmeTable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLAbhaengigkeitsausnahmeTable }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLAbhaengigkeitsausnahmeTable getAbhaengigkeitsausnahmeTable() {
        return abhaengigkeitsausnahmeTable;
    }

    /**
     * Legt den Wert der abhaengigkeitsausnahmeTable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLAbhaengigkeitsausnahmeTable }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setAbhaengigkeitsausnahmeTable(XMLAbhaengigkeitsausnahmeTable value) {
        this.abhaengigkeitsausnahmeTable = value;
    }

}
