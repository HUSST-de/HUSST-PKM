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
 * <p>Java-Klasse für XML-Flaechenelement-Item complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XML-Flaechenelement-Item"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vdv/ka/pkm/2}XML-Ausgangstext-Item"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="geobezug" type="{http://vdv/ka/pkm/2}XML-Geobezug-Part"/&gt;
 *         &lt;element name="typ" type="{http://vdv/ka/pkm/2}XML-StringValue" minOccurs="0"/&gt;
 *         &lt;element name="ortsbezug" type="{http://vdv/ka/pkm/2}XML-StringValue" minOccurs="0"/&gt;
 *         &lt;element name="tarifpunkt" type="{http://vdv/ka/pkm/2}XML-RefSet1N" minOccurs="0"/&gt;
 *         &lt;element name="tarifpunktfolge-pool" type="{http://vdv/ka/pkm/2}XML-Tarifpunktfolge-Pool" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XML-Flaechenelement-Item", propOrder = {
    "geobezug",
    "typ",
    "ortsbezug",
    "tarifpunkt",
    "tarifpunktfolgePool"
})
@XmlSeeAlso({
    XMLTarifpunktItem.class,
    XMLTarifpunktreferenzItem.class,
    XMLWegevarianteItem.class,
    XMLTarifpunktadapterItem.class,
    XMLWegevariantenadapterItem.class
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
public class XMLFlaechenelementItem
    extends XMLAusgangstextItem
{

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLGeobezugPart geobezug;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLStringValue typ;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLStringValue ortsbezug;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRefSet1N tarifpunkt;
    @XmlElement(name = "tarifpunktfolge-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLTarifpunktfolgePool tarifpunktfolgePool;

    /**
     * Ruft den Wert der geobezug-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGeobezugPart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLGeobezugPart getGeobezug() {
        return geobezug;
    }

    /**
     * Legt den Wert der geobezug-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGeobezugPart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setGeobezug(XMLGeobezugPart value) {
        this.geobezug = value;
    }

    /**
     * Ruft den Wert der typ-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLStringValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLStringValue getTyp() {
        return typ;
    }

    /**
     * Legt den Wert der typ-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLStringValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setTyp(XMLStringValue value) {
        this.typ = value;
    }

    /**
     * Ruft den Wert der ortsbezug-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLStringValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLStringValue getOrtsbezug() {
        return ortsbezug;
    }

    /**
     * Legt den Wert der ortsbezug-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLStringValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setOrtsbezug(XMLStringValue value) {
        this.ortsbezug = value;
    }

    /**
     * Ruft den Wert der tarifpunkt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRefSet1N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRefSet1N getTarifpunkt() {
        return tarifpunkt;
    }

    /**
     * Legt den Wert der tarifpunkt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRefSet1N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setTarifpunkt(XMLRefSet1N value) {
        this.tarifpunkt = value;
    }

    /**
     * Ruft den Wert der tarifpunktfolgePool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLTarifpunktfolgePool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLTarifpunktfolgePool getTarifpunktfolgePool() {
        return tarifpunktfolgePool;
    }

    /**
     * Legt den Wert der tarifpunktfolgePool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLTarifpunktfolgePool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setTarifpunktfolgePool(XMLTarifpunktfolgePool value) {
        this.tarifpunktfolgePool = value;
    }

}
