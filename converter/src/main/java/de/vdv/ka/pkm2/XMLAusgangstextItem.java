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
 * <p>Java-Klasse für XML-Ausgangstext-Item complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XML-Ausgangstext-Item"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vdv/ka/pkm/2}XML-NrName-Item"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="text-matrix" type="{http://vdv/ka/pkm/2}XML-Ausgangstext-Matrix"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XML-Ausgangstext-Item", propOrder = {
    "textMatrix"
})
@XmlSeeAlso({
    XMLAusnahmeItem.class,
    XMLEigenproduktItem.class,
    XMLFremdproduktItem.class,
    XMLWaehrungItem.class,
    XMLLinieItem.class,
    XMLBezahlartItem.class,
    XMLZahlungsintervallItem.class,
    XMLMitnahmetypItem.class,
    XMLRabattmedientypItem.class,
    XMLNummerntextItem.class,
    XMLProduktadapterItem.class,
    XMLFlaechenelementItem.class,
    XMLLinienadapterItem.class,
    XMLVerkehrsmitteltypadapterItem.class,
    XMLBezahlartadapterItem.class,
    XMLWaehrungsadapterItem.class,
    XMLZahlungsintervalladapterItem.class,
    XMLMitnahmetypadapterItem.class,
    XMLRabattmedientypadapterItem.class,
    XMLIdentifikationsparameterwertItem.class
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
public class XMLAusgangstextItem
    extends XMLNrNameItem
{

    @XmlElement(name = "text-matrix", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLAusgangstextMatrix textMatrix;

    /**
     * Ruft den Wert der textMatrix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLAusgangstextMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLAusgangstextMatrix getTextMatrix() {
        return textMatrix;
    }

    /**
     * Legt den Wert der textMatrix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLAusgangstextMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setTextMatrix(XMLAusgangstextMatrix value) {
        this.textMatrix = value;
    }

}
