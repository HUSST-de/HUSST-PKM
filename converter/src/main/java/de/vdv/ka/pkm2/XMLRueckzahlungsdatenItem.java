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
 * <p>Java-Klasse für XML-Rueckzahlungsdaten-Item complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XML-Rueckzahlungsdaten-Item"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="betrag" type="{http://vdv/ka/pkm/2}XML-Preisdaten-Item"/&gt;
 *         &lt;element name="gebuehr" type="{http://vdv/ka/pkm/2}XML-Preisdaten-Item"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XML-Rueckzahlungsdaten-Item", propOrder = {
    "betrag",
    "gebuehr"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
public class XMLRueckzahlungsdatenItem {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLPreisdatenItem betrag;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLPreisdatenItem gebuehr;

    /**
     * Ruft den Wert der betrag-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLPreisdatenItem }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLPreisdatenItem getBetrag() {
        return betrag;
    }

    /**
     * Legt den Wert der betrag-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLPreisdatenItem }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setBetrag(XMLPreisdatenItem value) {
        this.betrag = value;
    }

    /**
     * Ruft den Wert der gebuehr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLPreisdatenItem }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLPreisdatenItem getGebuehr() {
        return gebuehr;
    }

    /**
     * Legt den Wert der gebuehr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLPreisdatenItem }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setGebuehr(XMLPreisdatenItem value) {
        this.gebuehr = value;
    }

}
