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
 * <p>Java-Klasse für XML-Testdaten complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XML-Testdaten"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="zeitpunkt" type="{http://vdv/ka/pkm/2}XML-DatetimeValue"/&gt;
 *         &lt;element name="bemerkung" type="{http://vdv/ka/pkm/2}XML-StringValue"/&gt;
 *         &lt;element name="testfall-pool" type="{http://vdv/ka/pkm/2}XML-Testfalldaten-Pool"/&gt;
 *         &lt;element name="testmodul-pool" type="{http://vdv/ka/pkm/2}XML-Testmodul-Pool"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XML-Testdaten", propOrder = {
    "zeitpunkt",
    "bemerkung",
    "testfallPool",
    "testmodulPool"
})
@XmlSeeAlso({
    XMLTestanfrage.class,
    XMLTestergebnis.class
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
public class XMLTestdaten {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLDatetimeValue zeitpunkt;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLStringValue bemerkung;
    @XmlElement(name = "testfall-pool", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLTestfalldatenPool testfallPool;
    @XmlElement(name = "testmodul-pool", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLTestmodulPool testmodulPool;

    /**
     * Ruft den Wert der zeitpunkt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLDatetimeValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLDatetimeValue getZeitpunkt() {
        return zeitpunkt;
    }

    /**
     * Legt den Wert der zeitpunkt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLDatetimeValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setZeitpunkt(XMLDatetimeValue value) {
        this.zeitpunkt = value;
    }

    /**
     * Ruft den Wert der bemerkung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLStringValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLStringValue getBemerkung() {
        return bemerkung;
    }

    /**
     * Legt den Wert der bemerkung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLStringValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setBemerkung(XMLStringValue value) {
        this.bemerkung = value;
    }

    /**
     * Ruft den Wert der testfallPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLTestfalldatenPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLTestfalldatenPool getTestfallPool() {
        return testfallPool;
    }

    /**
     * Legt den Wert der testfallPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLTestfalldatenPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setTestfallPool(XMLTestfalldatenPool value) {
        this.testfallPool = value;
    }

    /**
     * Ruft den Wert der testmodulPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLTestmodulPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLTestmodulPool getTestmodulPool() {
        return testmodulPool;
    }

    /**
     * Legt den Wert der testmodulPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLTestmodulPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setTestmodulPool(XMLTestmodulPool value) {
        this.testmodulPool = value;
    }

}
