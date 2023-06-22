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
 * <p>Java-Klasse für XML-Produktgrenzpunkt-Table complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XML-Produktgrenzpunkt-Table"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vorherproduktgruppe" type="{http://vdv/ka/pkm/2}XML-RefList0N"/&gt;
 *         &lt;element name="vorhertagesbedingung" type="{http://vdv/ka/pkm/2}XML-RefList0N"/&gt;
 *         &lt;element name="vorhertageszeitbedingung" type="{http://vdv/ka/pkm/2}XML-RefList0N"/&gt;
 *         &lt;element name="vorhertarifpunktbedingung" type="{http://vdv/ka/pkm/2}XML-RefList0N"/&gt;
 *         &lt;element name="vorherbewertungsbedingung" type="{http://vdv/ka/pkm/2}XML-RefList0N"/&gt;
 *         &lt;element name="vorherverkehrsmittellinienbedingung" type="{http://vdv/ka/pkm/2}XML-RefList0N"/&gt;
 *         &lt;element name="nachherproduktgruppe" type="{http://vdv/ka/pkm/2}XML-RefList0N"/&gt;
 *         &lt;element name="nachhertagesbedingung" type="{http://vdv/ka/pkm/2}XML-RefList0N"/&gt;
 *         &lt;element name="nachhertageszeitbedingung" type="{http://vdv/ka/pkm/2}XML-RefList0N"/&gt;
 *         &lt;element name="nachhertarifpunktbedingung" type="{http://vdv/ka/pkm/2}XML-RefList0N"/&gt;
 *         &lt;element name="nachherbewertungsbedingung" type="{http://vdv/ka/pkm/2}XML-RefList0N"/&gt;
 *         &lt;element name="nachherverkehrsmittellinienbedingung" type="{http://vdv/ka/pkm/2}XML-RefList0N"/&gt;
 *         &lt;element name="spezialbedingung" type="{http://vdv/ka/pkm/2}XML-RefList0N"/&gt;
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
@XmlType(name = "XML-Produktgrenzpunkt-Table", propOrder = {
    "vorherproduktgruppe",
    "vorhertagesbedingung",
    "vorhertageszeitbedingung",
    "vorhertarifpunktbedingung",
    "vorherbewertungsbedingung",
    "vorherverkehrsmittellinienbedingung",
    "nachherproduktgruppe",
    "nachhertagesbedingung",
    "nachhertageszeitbedingung",
    "nachhertarifpunktbedingung",
    "nachherbewertungsbedingung",
    "nachherverkehrsmittellinienbedingung",
    "spezialbedingung",
    "ausnahme"
})
@XmlSeeAlso({
    XMLProduktgrenzpunktdatenTable.class,
    XMLProduktgrenzpunktausnahmeTable.class
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
public class XMLProduktgrenzpunktTable {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRefList0N vorherproduktgruppe;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRefList0N vorhertagesbedingung;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRefList0N vorhertageszeitbedingung;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRefList0N vorhertarifpunktbedingung;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRefList0N vorherbewertungsbedingung;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRefList0N vorherverkehrsmittellinienbedingung;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRefList0N nachherproduktgruppe;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRefList0N nachhertagesbedingung;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRefList0N nachhertageszeitbedingung;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRefList0N nachhertarifpunktbedingung;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRefList0N nachherbewertungsbedingung;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRefList0N nachherverkehrsmittellinienbedingung;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRefList0N spezialbedingung;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRefList0N ausnahme;

    /**
     * Ruft den Wert der vorherproduktgruppe-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRefList0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRefList0N getVorherproduktgruppe() {
        return vorherproduktgruppe;
    }

    /**
     * Legt den Wert der vorherproduktgruppe-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRefList0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setVorherproduktgruppe(XMLRefList0N value) {
        this.vorherproduktgruppe = value;
    }

    /**
     * Ruft den Wert der vorhertagesbedingung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRefList0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRefList0N getVorhertagesbedingung() {
        return vorhertagesbedingung;
    }

    /**
     * Legt den Wert der vorhertagesbedingung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRefList0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setVorhertagesbedingung(XMLRefList0N value) {
        this.vorhertagesbedingung = value;
    }

    /**
     * Ruft den Wert der vorhertageszeitbedingung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRefList0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRefList0N getVorhertageszeitbedingung() {
        return vorhertageszeitbedingung;
    }

    /**
     * Legt den Wert der vorhertageszeitbedingung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRefList0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setVorhertageszeitbedingung(XMLRefList0N value) {
        this.vorhertageszeitbedingung = value;
    }

    /**
     * Ruft den Wert der vorhertarifpunktbedingung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRefList0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRefList0N getVorhertarifpunktbedingung() {
        return vorhertarifpunktbedingung;
    }

    /**
     * Legt den Wert der vorhertarifpunktbedingung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRefList0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setVorhertarifpunktbedingung(XMLRefList0N value) {
        this.vorhertarifpunktbedingung = value;
    }

    /**
     * Ruft den Wert der vorherbewertungsbedingung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRefList0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRefList0N getVorherbewertungsbedingung() {
        return vorherbewertungsbedingung;
    }

    /**
     * Legt den Wert der vorherbewertungsbedingung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRefList0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setVorherbewertungsbedingung(XMLRefList0N value) {
        this.vorherbewertungsbedingung = value;
    }

    /**
     * Ruft den Wert der vorherverkehrsmittellinienbedingung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRefList0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRefList0N getVorherverkehrsmittellinienbedingung() {
        return vorherverkehrsmittellinienbedingung;
    }

    /**
     * Legt den Wert der vorherverkehrsmittellinienbedingung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRefList0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setVorherverkehrsmittellinienbedingung(XMLRefList0N value) {
        this.vorherverkehrsmittellinienbedingung = value;
    }

    /**
     * Ruft den Wert der nachherproduktgruppe-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRefList0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRefList0N getNachherproduktgruppe() {
        return nachherproduktgruppe;
    }

    /**
     * Legt den Wert der nachherproduktgruppe-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRefList0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setNachherproduktgruppe(XMLRefList0N value) {
        this.nachherproduktgruppe = value;
    }

    /**
     * Ruft den Wert der nachhertagesbedingung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRefList0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRefList0N getNachhertagesbedingung() {
        return nachhertagesbedingung;
    }

    /**
     * Legt den Wert der nachhertagesbedingung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRefList0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setNachhertagesbedingung(XMLRefList0N value) {
        this.nachhertagesbedingung = value;
    }

    /**
     * Ruft den Wert der nachhertageszeitbedingung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRefList0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRefList0N getNachhertageszeitbedingung() {
        return nachhertageszeitbedingung;
    }

    /**
     * Legt den Wert der nachhertageszeitbedingung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRefList0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setNachhertageszeitbedingung(XMLRefList0N value) {
        this.nachhertageszeitbedingung = value;
    }

    /**
     * Ruft den Wert der nachhertarifpunktbedingung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRefList0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRefList0N getNachhertarifpunktbedingung() {
        return nachhertarifpunktbedingung;
    }

    /**
     * Legt den Wert der nachhertarifpunktbedingung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRefList0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setNachhertarifpunktbedingung(XMLRefList0N value) {
        this.nachhertarifpunktbedingung = value;
    }

    /**
     * Ruft den Wert der nachherbewertungsbedingung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRefList0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRefList0N getNachherbewertungsbedingung() {
        return nachherbewertungsbedingung;
    }

    /**
     * Legt den Wert der nachherbewertungsbedingung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRefList0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setNachherbewertungsbedingung(XMLRefList0N value) {
        this.nachherbewertungsbedingung = value;
    }

    /**
     * Ruft den Wert der nachherverkehrsmittellinienbedingung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRefList0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRefList0N getNachherverkehrsmittellinienbedingung() {
        return nachherverkehrsmittellinienbedingung;
    }

    /**
     * Legt den Wert der nachherverkehrsmittellinienbedingung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRefList0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setNachherverkehrsmittellinienbedingung(XMLRefList0N value) {
        this.nachherverkehrsmittellinienbedingung = value;
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
