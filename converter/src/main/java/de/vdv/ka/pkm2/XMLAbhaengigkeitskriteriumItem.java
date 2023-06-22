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
 * <p>Java-Klasse für XML-Abhaengigkeitskriterium-Item complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XML-Abhaengigkeitskriterium-Item"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vdv/ka/pkm/2}XML-Name-Item"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="funktion" type="{http://vdv/ka/pkm/2}XML-Ref01"/&gt;
 *         &lt;element name="wirksamkeit" type="{http://vdv/ka/pkm/2}XML-Kriterienzeitraum-Part"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XML-Abhaengigkeitskriterium-Item", propOrder = {
    "funktion",
    "wirksamkeit"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
public class XMLAbhaengigkeitskriteriumItem
    extends XMLNameItem
{

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRef01 funktion;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLKriterienzeitraumPart wirksamkeit;

    /**
     * Ruft den Wert der funktion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRef01 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRef01 getFunktion() {
        return funktion;
    }

    /**
     * Legt den Wert der funktion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRef01 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setFunktion(XMLRef01 value) {
        this.funktion = value;
    }

    /**
     * Ruft den Wert der wirksamkeit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLKriterienzeitraumPart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLKriterienzeitraumPart getWirksamkeit() {
        return wirksamkeit;
    }

    /**
     * Legt den Wert der wirksamkeit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLKriterienzeitraumPart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setWirksamkeit(XMLKriterienzeitraumPart value) {
        this.wirksamkeit = value;
    }

}
