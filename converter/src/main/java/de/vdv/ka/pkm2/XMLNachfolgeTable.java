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
 * <p>Java-Klasse für XML-Nachfolge-Table complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XML-Nachfolge-Table"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kriterium" type="{http://vdv/ka/pkm/2}XML-RefList0N"/&gt;
 *         &lt;element name="vorgaenger" type="{http://vdv/ka/pkm/2}XML-RefList0N"/&gt;
 *         &lt;element name="nachfolger" type="{http://vdv/ka/pkm/2}XML-RefList0N" minOccurs="0"/&gt;
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
@XmlType(name = "XML-Nachfolge-Table", propOrder = {
    "kriterium",
    "vorgaenger",
    "nachfolger",
    "ausnahme"
})
@XmlSeeAlso({
    XMLNachfolgedatenTable.class,
    XMLNachfolgeausnahmeTable.class
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
public class XMLNachfolgeTable {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRefList0N kriterium;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRefList0N vorgaenger;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRefList0N nachfolger;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRefList0N ausnahme;

    /**
     * Ruft den Wert der kriterium-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRefList0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRefList0N getKriterium() {
        return kriterium;
    }

    /**
     * Legt den Wert der kriterium-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRefList0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setKriterium(XMLRefList0N value) {
        this.kriterium = value;
    }

    /**
     * Ruft den Wert der vorgaenger-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRefList0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRefList0N getVorgaenger() {
        return vorgaenger;
    }

    /**
     * Legt den Wert der vorgaenger-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRefList0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setVorgaenger(XMLRefList0N value) {
        this.vorgaenger = value;
    }

    /**
     * Ruft den Wert der nachfolger-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRefList0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRefList0N getNachfolger() {
        return nachfolger;
    }

    /**
     * Legt den Wert der nachfolger-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRefList0N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setNachfolger(XMLRefList0N value) {
        this.nachfolger = value;
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
