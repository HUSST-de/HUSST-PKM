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
 * <p>Java-Klasse für XML-Raumnummerninterpretation-Item complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XML-Raumnummerninterpretation-Item"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vdv/ka/pkm/2}XML-Name-Item"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="raummodifikation-pool" type="{http://vdv/ka/pkm/2}XML-Raummodifikation-Pool"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XML-Raumnummerninterpretation-Item", propOrder = {
    "raummodifikationPool"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
public class XMLRaumnummerninterpretationItem
    extends XMLNameItem
{

    @XmlElement(name = "raummodifikation-pool", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRaummodifikationPool raummodifikationPool;

    /**
     * Ruft den Wert der raummodifikationPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRaummodifikationPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRaummodifikationPool getRaummodifikationPool() {
        return raummodifikationPool;
    }

    /**
     * Legt den Wert der raummodifikationPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRaummodifikationPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setRaummodifikationPool(XMLRaummodifikationPool value) {
        this.raummodifikationPool = value;
    }

}
