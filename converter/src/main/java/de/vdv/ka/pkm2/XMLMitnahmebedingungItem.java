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
 * <p>Java-Klasse für XML-Mitnahmebedingung-Item complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XML-Mitnahmebedingung-Item"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vdv/ka/pkm/2}XML-Name-Item"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="anzahl-matrix" type="{http://vdv/ka/pkm/2}XML-Mitnahmeanzahl-Matrix"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XML-Mitnahmebedingung-Item", propOrder = {
    "anzahlMatrix"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
public class XMLMitnahmebedingungItem
    extends XMLNameItem
{

    @XmlElement(name = "anzahl-matrix", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLMitnahmeanzahlMatrix anzahlMatrix;

    /**
     * Ruft den Wert der anzahlMatrix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLMitnahmeanzahlMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLMitnahmeanzahlMatrix getAnzahlMatrix() {
        return anzahlMatrix;
    }

    /**
     * Legt den Wert der anzahlMatrix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLMitnahmeanzahlMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setAnzahlMatrix(XMLMitnahmeanzahlMatrix value) {
        this.anzahlMatrix = value;
    }

}
