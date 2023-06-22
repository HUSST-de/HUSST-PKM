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
 * <p>Java-Klasse für XML-Kriterienzeitraum-Part complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XML-Kriterienzeitraum-Part"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="beginn" type="{http://vdv/ka/pkm/2}XML-DatetimeValue"/&gt;
 *         &lt;element name="ende" type="{http://vdv/ka/pkm/2}XML-DatetimeValue"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XML-Kriterienzeitraum-Part", propOrder = {
    "beginn",
    "ende"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
public class XMLKriterienzeitraumPart {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLDatetimeValue beginn;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLDatetimeValue ende;

    /**
     * Ruft den Wert der beginn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLDatetimeValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLDatetimeValue getBeginn() {
        return beginn;
    }

    /**
     * Legt den Wert der beginn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLDatetimeValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setBeginn(XMLDatetimeValue value) {
        this.beginn = value;
    }

    /**
     * Ruft den Wert der ende-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLDatetimeValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLDatetimeValue getEnde() {
        return ende;
    }

    /**
     * Legt den Wert der ende-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLDatetimeValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setEnde(XMLDatetimeValue value) {
        this.ende = value;
    }

}
