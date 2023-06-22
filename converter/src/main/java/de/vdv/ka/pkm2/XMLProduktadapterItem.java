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
 * <p>Java-Klasse für XML-Produktadapter-Item complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XML-Produktadapter-Item"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vdv/ka/pkm/2}XML-Ausgangstext-Item"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="schluessel" type="{http://vdv/ka/pkm/2}XML-RNSchluessel-Part"/&gt;
 *         &lt;element name="kontrollkontext" type="{http://vdv/ka/pkm/2}XML-RefSet0N"/&gt;
 *         &lt;element name="erfassungskontext" type="{http://vdv/ka/pkm/2}XML-RefSet0N"/&gt;
 *         &lt;element name="anpassungskontext" type="{http://vdv/ka/pkm/2}XML-RefSet0N"/&gt;
 *         &lt;element name="darstellungskontext" type="{http://vdv/ka/pkm/2}XML-RefSet0N"/&gt;
 *         &lt;element name="produktermittlungskontext" type="{http://vdv/ka/pkm/2}XML-RefSet0N"/&gt;
 *         &lt;element name="transaktionsauswertungskontext" type="{http://vdv/ka/pkm/2}XML-RefSet0N"/&gt;
 *         &lt;element name="kvpProduktNr" type="{http://vdv/ka/pkm/2}XML-StringValue"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XML-Produktadapter-Item", propOrder = {
    "schluessel",
    "kontrollkontext",
    "erfassungskontext",
    "anpassungskontext",
    "darstellungskontext",
    "produktermittlungskontext",
    "transaktionsauswertungskontext",
    "kvpProduktNr"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
public class XMLProduktadapterItem
    extends XMLAusgangstextItem
{

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRNSchluesselPart schluessel;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRefSet0N kontrollkontext;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRefSet0N erfassungskontext;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRefSet0N anpassungskontext;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRefSet0N darstellungskontext;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRefSet0N produktermittlungskontext;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRefSet0N transaktionsauswertungskontext;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLStringValue kvpProduktNr;

    /**
     * Ruft den Wert der schluessel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRNSchluesselPart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRNSchluesselPart getSchluessel() {
        return schluessel;
    }

    /**
     * Legt den Wert der schluessel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRNSchluesselPart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setSchluessel(XMLRNSchluesselPart value) {
        this.schluessel = value;
    }

    /**
     * Ruft den Wert der kontrollkontext-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRefSet0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRefSet0N getKontrollkontext() {
        return kontrollkontext;
    }

    /**
     * Legt den Wert der kontrollkontext-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRefSet0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setKontrollkontext(XMLRefSet0N value) {
        this.kontrollkontext = value;
    }

    /**
     * Ruft den Wert der erfassungskontext-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRefSet0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRefSet0N getErfassungskontext() {
        return erfassungskontext;
    }

    /**
     * Legt den Wert der erfassungskontext-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRefSet0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setErfassungskontext(XMLRefSet0N value) {
        this.erfassungskontext = value;
    }

    /**
     * Ruft den Wert der anpassungskontext-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRefSet0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRefSet0N getAnpassungskontext() {
        return anpassungskontext;
    }

    /**
     * Legt den Wert der anpassungskontext-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRefSet0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setAnpassungskontext(XMLRefSet0N value) {
        this.anpassungskontext = value;
    }

    /**
     * Ruft den Wert der darstellungskontext-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRefSet0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRefSet0N getDarstellungskontext() {
        return darstellungskontext;
    }

    /**
     * Legt den Wert der darstellungskontext-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRefSet0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setDarstellungskontext(XMLRefSet0N value) {
        this.darstellungskontext = value;
    }

    /**
     * Ruft den Wert der produktermittlungskontext-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRefSet0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRefSet0N getProduktermittlungskontext() {
        return produktermittlungskontext;
    }

    /**
     * Legt den Wert der produktermittlungskontext-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRefSet0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setProduktermittlungskontext(XMLRefSet0N value) {
        this.produktermittlungskontext = value;
    }

    /**
     * Ruft den Wert der transaktionsauswertungskontext-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRefSet0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRefSet0N getTransaktionsauswertungskontext() {
        return transaktionsauswertungskontext;
    }

    /**
     * Legt den Wert der transaktionsauswertungskontext-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRefSet0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setTransaktionsauswertungskontext(XMLRefSet0N value) {
        this.transaktionsauswertungskontext = value;
    }

    /**
     * Ruft den Wert der kvpProduktNr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLStringValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLStringValue getKvpProduktNr() {
        return kvpProduktNr;
    }

    /**
     * Legt den Wert der kvpProduktNr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLStringValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setKvpProduktNr(XMLStringValue value) {
        this.kvpProduktNr = value;
    }

}
