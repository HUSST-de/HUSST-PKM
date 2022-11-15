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
 * <p>Java-Klasse für XML-Ungueltigkeitszeitpunkt-Table complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XML-Ungueltigkeitszeitpunkt-Table"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tagesbedingung" type="{http://vdv/ka/pkm/2}XML-RefList0N"/&gt;
 *         &lt;element name="zeitraumbedingung" type="{http://vdv/ka/pkm/2}XML-RefList0N"/&gt;
 *         &lt;element name="modulkontextbedingung" type="{http://vdv/ka/pkm/2}XML-RefList0N"/&gt;
 *         &lt;element name="spezialbedingung" type="{http://vdv/ka/pkm/2}XML-RefList0N"/&gt;
 *         &lt;element name="daten-pool" type="{http://vdv/ka/pkm/2}XML-Ungueltigkeitszeitpunktsdaten-Pool" minOccurs="0"/&gt;
 *         &lt;element name="ausnahme" type="{http://vdv/ka/pkm/2}XML-RefList0N" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XML-Ungueltigkeitszeitpunkt-Table", propOrder = {
    "tagesbedingung",
    "zeitraumbedingung",
    "modulkontextbedingung",
    "spezialbedingung",
    "datenPool",
    "ausnahme"
})
@XmlSeeAlso({
    XMLUngueltigkeitszeitpunktsdatenTable.class,
    XMLUngueltigkeitszeitpunktsausnahmeTable.class
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
public class XMLUngueltigkeitszeitpunktTable {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRefList0N tagesbedingung;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRefList0N zeitraumbedingung;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRefList0N modulkontextbedingung;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRefList0N spezialbedingung;
    @XmlElement(name = "daten-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLUngueltigkeitszeitpunktsdatenPool datenPool;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRefList0N ausnahme;

    /**
     * Ruft den Wert der tagesbedingung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRefList0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRefList0N getTagesbedingung() {
        return tagesbedingung;
    }

    /**
     * Legt den Wert der tagesbedingung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRefList0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setTagesbedingung(XMLRefList0N value) {
        this.tagesbedingung = value;
    }

    /**
     * Ruft den Wert der zeitraumbedingung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRefList0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRefList0N getZeitraumbedingung() {
        return zeitraumbedingung;
    }

    /**
     * Legt den Wert der zeitraumbedingung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRefList0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setZeitraumbedingung(XMLRefList0N value) {
        this.zeitraumbedingung = value;
    }

    /**
     * Ruft den Wert der modulkontextbedingung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRefList0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRefList0N getModulkontextbedingung() {
        return modulkontextbedingung;
    }

    /**
     * Legt den Wert der modulkontextbedingung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRefList0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setModulkontextbedingung(XMLRefList0N value) {
        this.modulkontextbedingung = value;
    }

    /**
     * Ruft den Wert der spezialbedingung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRefList0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRefList0N getSpezialbedingung() {
        return spezialbedingung;
    }

    /**
     * Legt den Wert der spezialbedingung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRefList0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setSpezialbedingung(XMLRefList0N value) {
        this.spezialbedingung = value;
    }

    /**
     * Ruft den Wert der datenPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLUngueltigkeitszeitpunktsdatenPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLUngueltigkeitszeitpunktsdatenPool getDatenPool() {
        return datenPool;
    }

    /**
     * Legt den Wert der datenPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLUngueltigkeitszeitpunktsdatenPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setDatenPool(XMLUngueltigkeitszeitpunktsdatenPool value) {
        this.datenPool = value;
    }

    /**
     * Ruft den Wert der ausnahme-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRefList0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRefList0N getAusnahme() {
        return ausnahme;
    }

    /**
     * Legt den Wert der ausnahme-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRefList0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setAusnahme(XMLRefList0N value) {
        this.ausnahme = value;
    }

}
