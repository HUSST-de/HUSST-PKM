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
 * <p>Java-Klasse für XML-Bewertungsbedingung-Item complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XML-Bewertungsbedingung-Item"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vdv/ka/pkm/2}XML-Name-Item"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bewertungstyp" type="{http://vdv/ka/pkm/2}XML-Ref11"/&gt;
 *         &lt;element name="werte" type="{http://vdv/ka/pkm/2}XML-ArrayValue"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XML-Bewertungsbedingung-Item", propOrder = {
    "bewertungstyp",
    "werte"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
public class XMLBewertungsbedingungItem
    extends XMLNameItem
{

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRef11 bewertungstyp;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLArrayValue werte;

    /**
     * Ruft den Wert der bewertungstyp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRef11 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRef11 getBewertungstyp() {
        return bewertungstyp;
    }

    /**
     * Legt den Wert der bewertungstyp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRef11 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setBewertungstyp(XMLRef11 value) {
        this.bewertungstyp = value;
    }

    /**
     * Ruft den Wert der werte-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLArrayValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLArrayValue getWerte() {
        return werte;
    }

    /**
     * Legt den Wert der werte-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLArrayValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setWerte(XMLArrayValue value) {
        this.werte = value;
    }

}
