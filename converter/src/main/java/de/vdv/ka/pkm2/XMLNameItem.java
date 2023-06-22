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
 * <p>Java-Klasse für XML-Name-Item complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XML-Name-Item"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://vdv/ka/pkm/2}XML-StringValue"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XML-Name-Item", propOrder = {
    "name"
})
@XmlSeeAlso({
    XMLAusgangskontextItem.class,
    XMLSchrittItem.class,
    XMLVariableItem.class,
    XMLFunktionItem.class,
    XMLAusgangssequenzItem.class,
    XMLAusgangsdatenfamilieItem.class,
    XMLNachfolgekriteriumItem.class,
    XMLAbhaengigkeitskriteriumItem.class,
    XMLKontingentierungItem.class,
    XMLZuordnungstypItem.class,
    XMLBewertungstypItem.class,
    XMLBewertungsdatenItem.class,
    XMLSpezialbedingungItem.class,
    XMLTagesbedingungItem.class,
    XMLTageszeitbedingungItem.class,
    XMLZeitraumbedingungItem.class,
    XMLTarifpunktbedingungItem.class,
    XMLGeosegmentbedingungItem.class,
    XMLBewertungsbedingungItem.class,
    XMLVerkehrsmittellinienbezugItem.class,
    XMLMitnahmebedingungItem.class,
    XMLNameGruppeItem.class,
    XMLBIFAInterpretationItem.class,
    XMLBitleisteninterpretationItem.class,
    XMLRaumnummerninterpretationItem.class
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
public class XMLNameItem {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLStringValue name;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLStringValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLStringValue getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLStringValue }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setName(XMLStringValue value) {
        this.name = value;
    }

}
