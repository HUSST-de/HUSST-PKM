//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2022.02.14 um 02:39:27 PM CET 
//


package de.vdv.ka.pkm2;

import java.util.ArrayList;
import java.util.List;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für XML-Zuordnungstyp-Entry complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XML-Zuordnungstyp-Entry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bezug" type="{http://vdv/ka/pkm/2}XML-Zuordnungsbezug-Entry" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ref" use="required" type="{http://vdv/ka/pkm/2}XML-Ref" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XML-Zuordnungstyp-Entry", propOrder = {
    "bezug"
})
@XmlSeeAlso({
    XMLZuordnungsdatentypEntry.class,
    XMLZuordnungsausnahmetypEntry.class
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
public class XMLZuordnungstypEntry {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected List<XMLZuordnungsbezugEntry> bezug;
    @XmlAttribute(name = "ref", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected int ref;

    /**
     * Gets the value of the bezug property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the bezug property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBezug().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLZuordnungsbezugEntry }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public List<XMLZuordnungsbezugEntry> getBezug() {
        if (bezug == null) {
            bezug = new ArrayList<XMLZuordnungsbezugEntry>();
        }
        return this.bezug;
    }

    /**
     * Ruft den Wert der ref-Eigenschaft ab.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public int getRef() {
        return ref;
    }

    /**
     * Legt den Wert der ref-Eigenschaft fest.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setRef(int value) {
        this.ref = value;
    }

}