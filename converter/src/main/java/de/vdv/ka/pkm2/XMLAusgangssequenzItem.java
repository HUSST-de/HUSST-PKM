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
 * <p>Java-Klasse für XML-Ausgangssequenz-Item complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XML-Ausgangssequenz-Item"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vdv/ka/pkm/2}XML-Name-Item"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sequenz-matrix" type="{http://vdv/ka/pkm/2}XML-Ausgangssequenz-Matrix"/&gt;
 *         &lt;element name="defaultoption" type="{http://vdv/ka/pkm/2}XML-Ref01" minOccurs="0"/&gt;
 *         &lt;element name="auswahloption" type="{http://vdv/ka/pkm/2}XML-RefList1N" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XML-Ausgangssequenz-Item", propOrder = {
    "sequenzMatrix",
    "defaultoption",
    "auswahloption"
})
@XmlSeeAlso({
    XMLAuswahldatenItem.class,
    XMLAusgangsdatenItem.class
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
public class XMLAusgangssequenzItem
    extends XMLNameItem
{

    @XmlElement(name = "sequenz-matrix", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLAusgangssequenzMatrix sequenzMatrix;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRef01 defaultoption;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRefList1N auswahloption;

    /**
     * Ruft den Wert der sequenzMatrix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLAusgangssequenzMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLAusgangssequenzMatrix getSequenzMatrix() {
        return sequenzMatrix;
    }

    /**
     * Legt den Wert der sequenzMatrix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLAusgangssequenzMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setSequenzMatrix(XMLAusgangssequenzMatrix value) {
        this.sequenzMatrix = value;
    }

    /**
     * Ruft den Wert der defaultoption-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRef01 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRef01 getDefaultoption() {
        return defaultoption;
    }

    /**
     * Legt den Wert der defaultoption-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRef01 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setDefaultoption(XMLRef01 value) {
        this.defaultoption = value;
    }

    /**
     * Ruft den Wert der auswahloption-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRefList1N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRefList1N getAuswahloption() {
        return auswahloption;
    }

    /**
     * Legt den Wert der auswahloption-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRefList1N }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setAuswahloption(XMLRefList1N value) {
        this.auswahloption = value;
    }

}
