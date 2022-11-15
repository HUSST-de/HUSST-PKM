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
 * <p>Java-Klasse für XML-BIFAInterpretation-Item complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XML-BIFAInterpretation-Item"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vdv/ka/pkm/2}XML-Name-Item"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="abfahrtszeit" type="{http://vdv/ka/pkm/2}XML-Ref01"/&gt;
 *         &lt;element name="ankunftszeit" type="{http://vdv/ka/pkm/2}XML-Ref01"/&gt;
 *         &lt;element name="vontarifpunkt" type="{http://vdv/ka/pkm/2}XML-Ref01"/&gt;
 *         &lt;element name="nachtarifpunkt" type="{http://vdv/ka/pkm/2}XML-Ref01"/&gt;
 *         &lt;element name="uebertarifpunkte" type="{http://vdv/ka/pkm/2}XML-Ref01"/&gt;
 *         &lt;element name="ueberwegevariante" type="{http://vdv/ka/pkm/2}XML-Ref01"/&gt;
 *         &lt;element name="verkehrsmittellinienbezug" type="{http://vdv/ka/pkm/2}XML-Ref01"/&gt;
 *         &lt;element name="produktgrenzpunktdaten-table" type="{http://vdv/ka/pkm/2}XML-Produktgrenzpunktdaten-Table"/&gt;
 *         &lt;element name="produktgrenzpunktausnahme-table" type="{http://vdv/ka/pkm/2}XML-Produktgrenzpunktausnahme-Table"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XML-BIFAInterpretation-Item", propOrder = {
    "abfahrtszeit",
    "ankunftszeit",
    "vontarifpunkt",
    "nachtarifpunkt",
    "uebertarifpunkte",
    "ueberwegevariante",
    "verkehrsmittellinienbezug",
    "produktgrenzpunktdatenTable",
    "produktgrenzpunktausnahmeTable"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
public class XMLBIFAInterpretationItem
    extends XMLNameItem
{

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRef01 abfahrtszeit;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRef01 ankunftszeit;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRef01 vontarifpunkt;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRef01 nachtarifpunkt;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRef01 uebertarifpunkte;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRef01 ueberwegevariante;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRef01 verkehrsmittellinienbezug;
    @XmlElement(name = "produktgrenzpunktdaten-table", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLProduktgrenzpunktdatenTable produktgrenzpunktdatenTable;
    @XmlElement(name = "produktgrenzpunktausnahme-table", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLProduktgrenzpunktausnahmeTable produktgrenzpunktausnahmeTable;

    /**
     * Ruft den Wert der abfahrtszeit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRef01 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRef01 getAbfahrtszeit() {
        return abfahrtszeit;
    }

    /**
     * Legt den Wert der abfahrtszeit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRef01 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setAbfahrtszeit(XMLRef01 value) {
        this.abfahrtszeit = value;
    }

    /**
     * Ruft den Wert der ankunftszeit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRef01 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRef01 getAnkunftszeit() {
        return ankunftszeit;
    }

    /**
     * Legt den Wert der ankunftszeit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRef01 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setAnkunftszeit(XMLRef01 value) {
        this.ankunftszeit = value;
    }

    /**
     * Ruft den Wert der vontarifpunkt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRef01 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRef01 getVontarifpunkt() {
        return vontarifpunkt;
    }

    /**
     * Legt den Wert der vontarifpunkt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRef01 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setVontarifpunkt(XMLRef01 value) {
        this.vontarifpunkt = value;
    }

    /**
     * Ruft den Wert der nachtarifpunkt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRef01 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRef01 getNachtarifpunkt() {
        return nachtarifpunkt;
    }

    /**
     * Legt den Wert der nachtarifpunkt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRef01 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setNachtarifpunkt(XMLRef01 value) {
        this.nachtarifpunkt = value;
    }

    /**
     * Ruft den Wert der uebertarifpunkte-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRef01 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRef01 getUebertarifpunkte() {
        return uebertarifpunkte;
    }

    /**
     * Legt den Wert der uebertarifpunkte-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRef01 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setUebertarifpunkte(XMLRef01 value) {
        this.uebertarifpunkte = value;
    }

    /**
     * Ruft den Wert der ueberwegevariante-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRef01 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRef01 getUeberwegevariante() {
        return ueberwegevariante;
    }

    /**
     * Legt den Wert der ueberwegevariante-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRef01 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setUeberwegevariante(XMLRef01 value) {
        this.ueberwegevariante = value;
    }

    /**
     * Ruft den Wert der verkehrsmittellinienbezug-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRef01 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRef01 getVerkehrsmittellinienbezug() {
        return verkehrsmittellinienbezug;
    }

    /**
     * Legt den Wert der verkehrsmittellinienbezug-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRef01 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setVerkehrsmittellinienbezug(XMLRef01 value) {
        this.verkehrsmittellinienbezug = value;
    }

    /**
     * Ruft den Wert der produktgrenzpunktdatenTable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLProduktgrenzpunktdatenTable }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLProduktgrenzpunktdatenTable getProduktgrenzpunktdatenTable() {
        return produktgrenzpunktdatenTable;
    }

    /**
     * Legt den Wert der produktgrenzpunktdatenTable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLProduktgrenzpunktdatenTable }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setProduktgrenzpunktdatenTable(XMLProduktgrenzpunktdatenTable value) {
        this.produktgrenzpunktdatenTable = value;
    }

    /**
     * Ruft den Wert der produktgrenzpunktausnahmeTable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLProduktgrenzpunktausnahmeTable }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLProduktgrenzpunktausnahmeTable getProduktgrenzpunktausnahmeTable() {
        return produktgrenzpunktausnahmeTable;
    }

    /**
     * Legt den Wert der produktgrenzpunktausnahmeTable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLProduktgrenzpunktausnahmeTable }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setProduktgrenzpunktausnahmeTable(XMLProduktgrenzpunktausnahmeTable value) {
        this.produktgrenzpunktausnahmeTable = value;
    }

}
