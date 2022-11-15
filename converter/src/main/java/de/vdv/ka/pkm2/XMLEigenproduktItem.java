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
 * <p>Java-Klasse für XML-Eigenprodukt-Item complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XML-Eigenprodukt-Item"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vdv/ka/pkm/2}XML-Ausgangstext-Item"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rueckzahlungsdaten-table" type="{http://vdv/ka/pkm/2}XML-Rueckzahlungsdaten-Table"/&gt;
 *         &lt;element name="rueckzahlungsausnahme-table" type="{http://vdv/ka/pkm/2}XML-Rueckzahlungsausnahme-Table"/&gt;
 *         &lt;element name="ungueltigkeitszeitpunktsdaten-table" type="{http://vdv/ka/pkm/2}XML-Ungueltigkeitszeitpunktsdaten-Table"/&gt;
 *         &lt;element name="ungueltigkeitszeitpunktsausnahme-table" type="{http://vdv/ka/pkm/2}XML-Ungueltigkeitszeitpunktsausnahme-Table"/&gt;
 *         &lt;element name="preisdaten-table" type="{http://vdv/ka/pkm/2}XML-Preisdaten-Table" minOccurs="0"/&gt;
 *         &lt;element name="preisausnahme-table" type="{http://vdv/ka/pkm/2}XML-Preisausnahme-Table" minOccurs="0"/&gt;
 *         &lt;element name="gueltigkeitszeitrahmensdaten-table" type="{http://vdv/ka/pkm/2}XML-Gueltigkeitszeitrahmensdaten-Table" minOccurs="0"/&gt;
 *         &lt;element name="gueltigkeitszeitrahmensausnahme-table" type="{http://vdv/ka/pkm/2}XML-Gueltigkeitszeitrahmensausnahme-Table" minOccurs="0"/&gt;
 *         &lt;element name="nachfolgedaten-table" type="{http://vdv/ka/pkm/2}XML-Nachfolgedaten-Table" minOccurs="0"/&gt;
 *         &lt;element name="nachfolgeausnahme-table" type="{http://vdv/ka/pkm/2}XML-Nachfolgeausnahme-Table" minOccurs="0"/&gt;
 *         &lt;element name="efmprodukt" type="{http://vdv/ka/pkm/2}XML-Ref01" minOccurs="0"/&gt;
 *         &lt;element name="identifikation" type="{http://vdv/ka/pkm/2}XML-RefSet0N" minOccurs="0"/&gt;
 *         &lt;element name="kontingentierung" type="{http://vdv/ka/pkm/2}XML-Ref01" minOccurs="0"/&gt;
 *         &lt;element name="preisanpassung" type="{http://vdv/ka/pkm/2}XML-BooleanValue" minOccurs="0"/&gt;
 *         &lt;element name="extNr" type="{http://vdv/ka/pkm/2}XML-StringValue" minOccurs="0"/&gt;
 *         &lt;element name="schluessel" type="{http://vdv/ka/pkm/2}XML-PVSchluessel-Part" minOccurs="0"/&gt;
 *         &lt;element name="kontrolle" type="{http://vdv/ka/pkm/2}XML-Produktdaten-Part" minOccurs="0"/&gt;
 *         &lt;element name="erfassung" type="{http://vdv/ka/pkm/2}XML-Produktdaten-Part" minOccurs="0"/&gt;
 *         &lt;element name="anpassung" type="{http://vdv/ka/pkm/2}XML-Produktdaten-Part" minOccurs="0"/&gt;
 *         &lt;element name="darstellung" type="{http://vdv/ka/pkm/2}XML-Produktdaten-Part" minOccurs="0"/&gt;
 *         &lt;element name="produktermittlung" type="{http://vdv/ka/pkm/2}XML-Produktdaten-Part" minOccurs="0"/&gt;
 *         &lt;element name="transaktionsauswertung" type="{http://vdv/ka/pkm/2}XML-Produktdaten-Part" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XML-Eigenprodukt-Item", propOrder = {
    "rueckzahlungsdatenTable",
    "rueckzahlungsausnahmeTable",
    "ungueltigkeitszeitpunktsdatenTable",
    "ungueltigkeitszeitpunktsausnahmeTable",
    "preisdatenTable",
    "preisausnahmeTable",
    "gueltigkeitszeitrahmensdatenTable",
    "gueltigkeitszeitrahmensausnahmeTable",
    "nachfolgedatenTable",
    "nachfolgeausnahmeTable",
    "efmprodukt",
    "identifikation",
    "kontingentierung",
    "preisanpassung",
    "extNr",
    "schluessel",
    "kontrolle",
    "erfassung",
    "anpassung",
    "darstellung",
    "produktermittlung",
    "transaktionsauswertung"
})
@XmlSeeAlso({
    XMLEFMProduktItem.class,
    XMLTarifproduktItem.class
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
public class XMLEigenproduktItem
    extends XMLAusgangstextItem
{

    @XmlElement(name = "rueckzahlungsdaten-table", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRueckzahlungsdatenTable rueckzahlungsdatenTable;
    @XmlElement(name = "rueckzahlungsausnahme-table", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRueckzahlungsausnahmeTable rueckzahlungsausnahmeTable;
    @XmlElement(name = "ungueltigkeitszeitpunktsdaten-table", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLUngueltigkeitszeitpunktsdatenTable ungueltigkeitszeitpunktsdatenTable;
    @XmlElement(name = "ungueltigkeitszeitpunktsausnahme-table", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLUngueltigkeitszeitpunktsausnahmeTable ungueltigkeitszeitpunktsausnahmeTable;
    @XmlElement(name = "preisdaten-table")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLPreisdatenTable preisdatenTable;
    @XmlElement(name = "preisausnahme-table")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLPreisausnahmeTable preisausnahmeTable;
    @XmlElement(name = "gueltigkeitszeitrahmensdaten-table")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLGueltigkeitszeitrahmensdatenTable gueltigkeitszeitrahmensdatenTable;
    @XmlElement(name = "gueltigkeitszeitrahmensausnahme-table")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLGueltigkeitszeitrahmensausnahmeTable gueltigkeitszeitrahmensausnahmeTable;
    @XmlElement(name = "nachfolgedaten-table")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLNachfolgedatenTable nachfolgedatenTable;
    @XmlElement(name = "nachfolgeausnahme-table")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLNachfolgeausnahmeTable nachfolgeausnahmeTable;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRef01 efmprodukt;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRefSet0N identifikation;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRef01 kontingentierung;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLBooleanValue preisanpassung;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLStringValue extNr;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLPVSchluesselPart schluessel;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLProduktdatenPart kontrolle;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLProduktdatenPart erfassung;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLProduktdatenPart anpassung;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLProduktdatenPart darstellung;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLProduktdatenPart produktermittlung;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLProduktdatenPart transaktionsauswertung;

    /**
     * Ruft den Wert der rueckzahlungsdatenTable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRueckzahlungsdatenTable }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRueckzahlungsdatenTable getRueckzahlungsdatenTable() {
        return rueckzahlungsdatenTable;
    }

    /**
     * Legt den Wert der rueckzahlungsdatenTable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRueckzahlungsdatenTable }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setRueckzahlungsdatenTable(XMLRueckzahlungsdatenTable value) {
        this.rueckzahlungsdatenTable = value;
    }

    /**
     * Ruft den Wert der rueckzahlungsausnahmeTable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRueckzahlungsausnahmeTable }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRueckzahlungsausnahmeTable getRueckzahlungsausnahmeTable() {
        return rueckzahlungsausnahmeTable;
    }

    /**
     * Legt den Wert der rueckzahlungsausnahmeTable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRueckzahlungsausnahmeTable }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setRueckzahlungsausnahmeTable(XMLRueckzahlungsausnahmeTable value) {
        this.rueckzahlungsausnahmeTable = value;
    }

    /**
     * Ruft den Wert der ungueltigkeitszeitpunktsdatenTable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLUngueltigkeitszeitpunktsdatenTable }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLUngueltigkeitszeitpunktsdatenTable getUngueltigkeitszeitpunktsdatenTable() {
        return ungueltigkeitszeitpunktsdatenTable;
    }

    /**
     * Legt den Wert der ungueltigkeitszeitpunktsdatenTable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLUngueltigkeitszeitpunktsdatenTable }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setUngueltigkeitszeitpunktsdatenTable(XMLUngueltigkeitszeitpunktsdatenTable value) {
        this.ungueltigkeitszeitpunktsdatenTable = value;
    }

    /**
     * Ruft den Wert der ungueltigkeitszeitpunktsausnahmeTable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLUngueltigkeitszeitpunktsausnahmeTable }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLUngueltigkeitszeitpunktsausnahmeTable getUngueltigkeitszeitpunktsausnahmeTable() {
        return ungueltigkeitszeitpunktsausnahmeTable;
    }

    /**
     * Legt den Wert der ungueltigkeitszeitpunktsausnahmeTable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLUngueltigkeitszeitpunktsausnahmeTable }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setUngueltigkeitszeitpunktsausnahmeTable(XMLUngueltigkeitszeitpunktsausnahmeTable value) {
        this.ungueltigkeitszeitpunktsausnahmeTable = value;
    }

    /**
     * Ruft den Wert der preisdatenTable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLPreisdatenTable }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLPreisdatenTable getPreisdatenTable() {
        return preisdatenTable;
    }

    /**
     * Legt den Wert der preisdatenTable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLPreisdatenTable }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setPreisdatenTable(XMLPreisdatenTable value) {
        this.preisdatenTable = value;
    }

    /**
     * Ruft den Wert der preisausnahmeTable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLPreisausnahmeTable }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLPreisausnahmeTable getPreisausnahmeTable() {
        return preisausnahmeTable;
    }

    /**
     * Legt den Wert der preisausnahmeTable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLPreisausnahmeTable }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setPreisausnahmeTable(XMLPreisausnahmeTable value) {
        this.preisausnahmeTable = value;
    }

    /**
     * Ruft den Wert der gueltigkeitszeitrahmensdatenTable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGueltigkeitszeitrahmensdatenTable }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLGueltigkeitszeitrahmensdatenTable getGueltigkeitszeitrahmensdatenTable() {
        return gueltigkeitszeitrahmensdatenTable;
    }

    /**
     * Legt den Wert der gueltigkeitszeitrahmensdatenTable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGueltigkeitszeitrahmensdatenTable }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setGueltigkeitszeitrahmensdatenTable(XMLGueltigkeitszeitrahmensdatenTable value) {
        this.gueltigkeitszeitrahmensdatenTable = value;
    }

    /**
     * Ruft den Wert der gueltigkeitszeitrahmensausnahmeTable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGueltigkeitszeitrahmensausnahmeTable }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLGueltigkeitszeitrahmensausnahmeTable getGueltigkeitszeitrahmensausnahmeTable() {
        return gueltigkeitszeitrahmensausnahmeTable;
    }

    /**
     * Legt den Wert der gueltigkeitszeitrahmensausnahmeTable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGueltigkeitszeitrahmensausnahmeTable }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setGueltigkeitszeitrahmensausnahmeTable(XMLGueltigkeitszeitrahmensausnahmeTable value) {
        this.gueltigkeitszeitrahmensausnahmeTable = value;
    }

    /**
     * Ruft den Wert der nachfolgedatenTable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLNachfolgedatenTable }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLNachfolgedatenTable getNachfolgedatenTable() {
        return nachfolgedatenTable;
    }

    /**
     * Legt den Wert der nachfolgedatenTable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLNachfolgedatenTable }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setNachfolgedatenTable(XMLNachfolgedatenTable value) {
        this.nachfolgedatenTable = value;
    }

    /**
     * Ruft den Wert der nachfolgeausnahmeTable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLNachfolgeausnahmeTable }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLNachfolgeausnahmeTable getNachfolgeausnahmeTable() {
        return nachfolgeausnahmeTable;
    }

    /**
     * Legt den Wert der nachfolgeausnahmeTable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLNachfolgeausnahmeTable }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setNachfolgeausnahmeTable(XMLNachfolgeausnahmeTable value) {
        this.nachfolgeausnahmeTable = value;
    }

    /**
     * Ruft den Wert der efmprodukt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRef01 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRef01 getEfmprodukt() {
        return efmprodukt;
    }

    /**
     * Legt den Wert der efmprodukt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRef01 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setEfmprodukt(XMLRef01 value) {
        this.efmprodukt = value;
    }

    /**
     * Ruft den Wert der identifikation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRefSet0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRefSet0N getIdentifikation() {
        return identifikation;
    }

    /**
     * Legt den Wert der identifikation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRefSet0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setIdentifikation(XMLRefSet0N value) {
        this.identifikation = value;
    }

    /**
     * Ruft den Wert der kontingentierung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRef01 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRef01 getKontingentierung() {
        return kontingentierung;
    }

    /**
     * Legt den Wert der kontingentierung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRef01 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setKontingentierung(XMLRef01 value) {
        this.kontingentierung = value;
    }

    /**
     * Ruft den Wert der preisanpassung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLBooleanValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLBooleanValue getPreisanpassung() {
        return preisanpassung;
    }

    /**
     * Legt den Wert der preisanpassung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLBooleanValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setPreisanpassung(XMLBooleanValue value) {
        this.preisanpassung = value;
    }

    /**
     * Ruft den Wert der extNr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLStringValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLStringValue getExtNr() {
        return extNr;
    }

    /**
     * Legt den Wert der extNr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLStringValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setExtNr(XMLStringValue value) {
        this.extNr = value;
    }

    /**
     * Ruft den Wert der schluessel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLPVSchluesselPart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLPVSchluesselPart getSchluessel() {
        return schluessel;
    }

    /**
     * Legt den Wert der schluessel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLPVSchluesselPart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setSchluessel(XMLPVSchluesselPart value) {
        this.schluessel = value;
    }

    /**
     * Ruft den Wert der kontrolle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLProduktdatenPart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLProduktdatenPart getKontrolle() {
        return kontrolle;
    }

    /**
     * Legt den Wert der kontrolle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLProduktdatenPart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setKontrolle(XMLProduktdatenPart value) {
        this.kontrolle = value;
    }

    /**
     * Ruft den Wert der erfassung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLProduktdatenPart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLProduktdatenPart getErfassung() {
        return erfassung;
    }

    /**
     * Legt den Wert der erfassung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLProduktdatenPart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setErfassung(XMLProduktdatenPart value) {
        this.erfassung = value;
    }

    /**
     * Ruft den Wert der anpassung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLProduktdatenPart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLProduktdatenPart getAnpassung() {
        return anpassung;
    }

    /**
     * Legt den Wert der anpassung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLProduktdatenPart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setAnpassung(XMLProduktdatenPart value) {
        this.anpassung = value;
    }

    /**
     * Ruft den Wert der darstellung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLProduktdatenPart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLProduktdatenPart getDarstellung() {
        return darstellung;
    }

    /**
     * Legt den Wert der darstellung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLProduktdatenPart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setDarstellung(XMLProduktdatenPart value) {
        this.darstellung = value;
    }

    /**
     * Ruft den Wert der produktermittlung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLProduktdatenPart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLProduktdatenPart getProduktermittlung() {
        return produktermittlung;
    }

    /**
     * Legt den Wert der produktermittlung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLProduktdatenPart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setProduktermittlung(XMLProduktdatenPart value) {
        this.produktermittlung = value;
    }

    /**
     * Ruft den Wert der transaktionsauswertung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLProduktdatenPart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLProduktdatenPart getTransaktionsauswertung() {
        return transaktionsauswertung;
    }

    /**
     * Legt den Wert der transaktionsauswertung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLProduktdatenPart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setTransaktionsauswertung(XMLProduktdatenPart value) {
        this.transaktionsauswertung = value;
    }

}
