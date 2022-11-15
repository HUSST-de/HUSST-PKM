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
 * <p>Java-Klasse für XML-Datentabelle-Item complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XML-Datentabelle-Item"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vdv/ka/pkm/2}XML-NrName-Item"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="datensatzkey" type="{http://vdv/ka/pkm/2}XML-ArrayValue"/&gt;
 *         &lt;element name="datensatzvalue" type="{http://vdv/ka/pkm/2}XML-ArrayValue"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XML-Datentabelle-Item", propOrder = {
    "datensatzkey",
    "datensatzvalue"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
public class XMLDatentabelleItem
    extends XMLNrNameItem
{

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLArrayValue datensatzkey;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLArrayValue datensatzvalue;

    /**
     * Ruft den Wert der datensatzkey-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLArrayValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLArrayValue getDatensatzkey() {
        return datensatzkey;
    }

    /**
     * Legt den Wert der datensatzkey-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLArrayValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setDatensatzkey(XMLArrayValue value) {
        this.datensatzkey = value;
    }

    /**
     * Ruft den Wert der datensatzvalue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLArrayValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLArrayValue getDatensatzvalue() {
        return datensatzvalue;
    }

    /**
     * Legt den Wert der datensatzvalue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLArrayValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setDatensatzvalue(XMLArrayValue value) {
        this.datensatzvalue = value;
    }

}
