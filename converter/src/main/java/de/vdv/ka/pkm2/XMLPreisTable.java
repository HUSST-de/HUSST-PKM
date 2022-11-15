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
 * <p>Java-Klasse für XML-Preis-Table complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XML-Preis-Table"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="waehrung" type="{http://vdv/ka/pkm/2}XML-RefList0N"/&gt;
 *         &lt;element name="bezahlartbedingung" type="{http://vdv/ka/pkm/2}XML-RefList0N"/&gt;
 *         &lt;element name="zahlungsintervallbedingung" type="{http://vdv/ka/pkm/2}XML-RefList0N"/&gt;
 *         &lt;element name="tagesbedingung" type="{http://vdv/ka/pkm/2}XML-RefList0N"/&gt;
 *         &lt;element name="tageszeitbedingung" type="{http://vdv/ka/pkm/2}XML-RefList0N"/&gt;
 *         &lt;element name="zeitraumbedingung" type="{http://vdv/ka/pkm/2}XML-RefList0N"/&gt;
 *         &lt;element name="tarifpunktbedingung" type="{http://vdv/ka/pkm/2}XML-RefList0N"/&gt;
 *         &lt;element name="bewertungsbedingung" type="{http://vdv/ka/pkm/2}XML-RefList0N"/&gt;
 *         &lt;element name="verkehrsmittellinienbedingung" type="{http://vdv/ka/pkm/2}XML-RefList0N"/&gt;
 *         &lt;element name="mitnahmebedingung" type="{http://vdv/ka/pkm/2}XML-RefList0N"/&gt;
 *         &lt;element name="rabattmedienbedingung" type="{http://vdv/ka/pkm/2}XML-RefList0N"/&gt;
 *         &lt;element name="modulkontextbedingung" type="{http://vdv/ka/pkm/2}XML-RefList0N"/&gt;
 *         &lt;element name="spezialbedingung" type="{http://vdv/ka/pkm/2}XML-RefList0N"/&gt;
 *         &lt;element name="daten-pool" type="{http://vdv/ka/pkm/2}XML-Preisdaten-Pool" minOccurs="0"/&gt;
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
@XmlType(name = "XML-Preis-Table", propOrder = {
    "waehrung",
    "bezahlartbedingung",
    "zahlungsintervallbedingung",
    "tagesbedingung",
    "tageszeitbedingung",
    "zeitraumbedingung",
    "tarifpunktbedingung",
    "bewertungsbedingung",
    "verkehrsmittellinienbedingung",
    "mitnahmebedingung",
    "rabattmedienbedingung",
    "modulkontextbedingung",
    "spezialbedingung",
    "datenPool",
    "ausnahme"
})
@XmlSeeAlso({
    XMLPreisdatenTable.class,
    XMLPreisausnahmeTable.class
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
public class XMLPreisTable {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRefList0N waehrung;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRefList0N bezahlartbedingung;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRefList0N zahlungsintervallbedingung;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRefList0N tagesbedingung;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRefList0N tageszeitbedingung;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRefList0N zeitraumbedingung;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRefList0N tarifpunktbedingung;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRefList0N bewertungsbedingung;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRefList0N verkehrsmittellinienbedingung;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRefList0N mitnahmebedingung;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRefList0N rabattmedienbedingung;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRefList0N modulkontextbedingung;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRefList0N spezialbedingung;
    @XmlElement(name = "daten-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLPreisdatenPool datenPool;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRefList0N ausnahme;

    /**
     * Ruft den Wert der waehrung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRefList0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRefList0N getWaehrung() {
        return waehrung;
    }

    /**
     * Legt den Wert der waehrung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRefList0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setWaehrung(XMLRefList0N value) {
        this.waehrung = value;
    }

    /**
     * Ruft den Wert der bezahlartbedingung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRefList0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRefList0N getBezahlartbedingung() {
        return bezahlartbedingung;
    }

    /**
     * Legt den Wert der bezahlartbedingung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRefList0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setBezahlartbedingung(XMLRefList0N value) {
        this.bezahlartbedingung = value;
    }

    /**
     * Ruft den Wert der zahlungsintervallbedingung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRefList0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRefList0N getZahlungsintervallbedingung() {
        return zahlungsintervallbedingung;
    }

    /**
     * Legt den Wert der zahlungsintervallbedingung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRefList0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setZahlungsintervallbedingung(XMLRefList0N value) {
        this.zahlungsintervallbedingung = value;
    }

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
     * Ruft den Wert der tageszeitbedingung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRefList0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRefList0N getTageszeitbedingung() {
        return tageszeitbedingung;
    }

    /**
     * Legt den Wert der tageszeitbedingung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRefList0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setTageszeitbedingung(XMLRefList0N value) {
        this.tageszeitbedingung = value;
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
     * Ruft den Wert der tarifpunktbedingung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRefList0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRefList0N getTarifpunktbedingung() {
        return tarifpunktbedingung;
    }

    /**
     * Legt den Wert der tarifpunktbedingung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRefList0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setTarifpunktbedingung(XMLRefList0N value) {
        this.tarifpunktbedingung = value;
    }

    /**
     * Ruft den Wert der bewertungsbedingung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRefList0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRefList0N getBewertungsbedingung() {
        return bewertungsbedingung;
    }

    /**
     * Legt den Wert der bewertungsbedingung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRefList0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setBewertungsbedingung(XMLRefList0N value) {
        this.bewertungsbedingung = value;
    }

    /**
     * Ruft den Wert der verkehrsmittellinienbedingung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRefList0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRefList0N getVerkehrsmittellinienbedingung() {
        return verkehrsmittellinienbedingung;
    }

    /**
     * Legt den Wert der verkehrsmittellinienbedingung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRefList0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setVerkehrsmittellinienbedingung(XMLRefList0N value) {
        this.verkehrsmittellinienbedingung = value;
    }

    /**
     * Ruft den Wert der mitnahmebedingung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRefList0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRefList0N getMitnahmebedingung() {
        return mitnahmebedingung;
    }

    /**
     * Legt den Wert der mitnahmebedingung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRefList0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setMitnahmebedingung(XMLRefList0N value) {
        this.mitnahmebedingung = value;
    }

    /**
     * Ruft den Wert der rabattmedienbedingung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRefList0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRefList0N getRabattmedienbedingung() {
        return rabattmedienbedingung;
    }

    /**
     * Legt den Wert der rabattmedienbedingung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRefList0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setRabattmedienbedingung(XMLRefList0N value) {
        this.rabattmedienbedingung = value;
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
     *     {@link XMLPreisdatenPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLPreisdatenPool getDatenPool() {
        return datenPool;
    }

    /**
     * Legt den Wert der datenPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLPreisdatenPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setDatenPool(XMLPreisdatenPool value) {
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
