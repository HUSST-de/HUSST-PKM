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
 * <p>Java-Klasse für XML-Identifikationsparameter-Item complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XML-Identifikationsparameter-Item"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vdv/ka/pkm/2}XML-NrName-Item"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wert-pool" type="{http://vdv/ka/pkm/2}XML-Identifikationsparameterwert-Pool"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XML-Identifikationsparameter-Item", propOrder = {
    "wertPool"
})
@XmlSeeAlso({
    XMLIdentifikationsparameteradapterItem.class
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
public class XMLIdentifikationsparameterItem
    extends XMLNrNameItem
{

    @XmlElement(name = "wert-pool", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLIdentifikationsparameterwertPool wertPool;

    /**
     * Ruft den Wert der wertPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLIdentifikationsparameterwertPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLIdentifikationsparameterwertPool getWertPool() {
        return wertPool;
    }

    /**
     * Legt den Wert der wertPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLIdentifikationsparameterwertPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setWertPool(XMLIdentifikationsparameterwertPool value) {
        this.wertPool = value;
    }

}