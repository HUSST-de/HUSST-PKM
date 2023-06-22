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
 * <p>Java-Klasse für XML-Fremdprodukt-Item complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XML-Fremdprodukt-Item"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vdv/ka/pkm/2}XML-Ausgangstext-Item"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tarifstand" type="{http://vdv/ka/pkm/2}XML-StringValue"/&gt;
 *         &lt;element name="pv" type="{http://vdv/ka/pkm/2}XML-Organisation-Part"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XML-Fremdprodukt-Item", propOrder = {
    "tarifstand",
    "pv"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
public class XMLFremdproduktItem
    extends XMLAusgangstextItem
{

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLStringValue tarifstand;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLOrganisationPart pv;

    /**
     * Ruft den Wert der tarifstand-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLStringValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLStringValue getTarifstand() {
        return tarifstand;
    }

    /**
     * Legt den Wert der tarifstand-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLStringValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setTarifstand(XMLStringValue value) {
        this.tarifstand = value;
    }

    /**
     * Ruft den Wert der pv-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLOrganisationPart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLOrganisationPart getPv() {
        return pv;
    }

    /**
     * Legt den Wert der pv-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLOrganisationPart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setPv(XMLOrganisationPart value) {
        this.pv = value;
    }

}
