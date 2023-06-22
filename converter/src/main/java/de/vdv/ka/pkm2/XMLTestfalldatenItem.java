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
 * <p>Java-Klasse für XML-Testfalldaten-Item complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XML-Testfalldaten-Item"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vdv/ka/pkm/2}XML-NrName-Item"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="status" type="{http://vdv/ka/pkm/2}XML-IntegerValue" minOccurs="0"/&gt;
 *         &lt;element name="bemerkung" type="{http://vdv/ka/pkm/2}XML-StringValue" minOccurs="0"/&gt;
 *         &lt;element name="eingabewert-matrix" type="{http://vdv/ka/pkm/2}XML-Testdaten-Matrix"/&gt;
 *         &lt;element name="ausgabewert-matrix" type="{http://vdv/ka/pkm/2}XML-Testdaten-Matrix" minOccurs="0"/&gt;
 *         &lt;element name="erwartungswert-matrix" type="{http://vdv/ka/pkm/2}XML-Testdaten-Matrix"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XML-Testfalldaten-Item", propOrder = {
    "status",
    "bemerkung",
    "eingabewertMatrix",
    "ausgabewertMatrix",
    "erwartungswertMatrix"
})
@XmlSeeAlso({
    XMLTestfallanfrageItem.class,
    XMLTestfallergebnisItem.class
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
public class XMLTestfalldatenItem
    extends XMLNrNameItem
{

    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLIntegerValue status;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLStringValue bemerkung;
    @XmlElement(name = "eingabewert-matrix", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLTestdatenMatrix eingabewertMatrix;
    @XmlElement(name = "ausgabewert-matrix")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLTestdatenMatrix ausgabewertMatrix;
    @XmlElement(name = "erwartungswert-matrix", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLTestdatenMatrix erwartungswertMatrix;

    /**
     * Ruft den Wert der status-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLIntegerValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLIntegerValue getStatus() {
        return status;
    }

    /**
     * Legt den Wert der status-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLIntegerValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setStatus(XMLIntegerValue value) {
        this.status = value;
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
     * Ruft den Wert der eingabewertMatrix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLTestdatenMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLTestdatenMatrix getEingabewertMatrix() {
        return eingabewertMatrix;
    }

    /**
     * Legt den Wert der eingabewertMatrix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLTestdatenMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setEingabewertMatrix(XMLTestdatenMatrix value) {
        this.eingabewertMatrix = value;
    }

    /**
     * Ruft den Wert der ausgabewertMatrix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLTestdatenMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLTestdatenMatrix getAusgabewertMatrix() {
        return ausgabewertMatrix;
    }

    /**
     * Legt den Wert der ausgabewertMatrix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLTestdatenMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setAusgabewertMatrix(XMLTestdatenMatrix value) {
        this.ausgabewertMatrix = value;
    }

    /**
     * Ruft den Wert der erwartungswertMatrix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLTestdatenMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLTestdatenMatrix getErwartungswertMatrix() {
        return erwartungswertMatrix;
    }

    /**
     * Legt den Wert der erwartungswertMatrix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLTestdatenMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setErwartungswertMatrix(XMLTestdatenMatrix value) {
        this.erwartungswertMatrix = value;
    }

}
