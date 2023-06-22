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
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für XML-Pool complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XML-Pool"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="key" use="required" type="{http://vdv/ka/pkm/2}XML-Ref" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XML-Pool")
@XmlSeeAlso({
    XMLTarifmodulPool.class,
    XMLEingangsschnittstellePool.class,
    XMLAusgangskontextPool.class,
    XMLSchrittPool.class,
    XMLFunktionPool.class,
    XMLAusgangssequenzPool.class,
    XMLDatentabellePool.class,
    XMLEigenproduktPool.class,
    XMLFremdproduktPool.class,
    XMLNachfolgekriteriumPool.class,
    XMLAbhaengigkeitskriteriumPool.class,
    XMLKontingentierungPool.class,
    XMLBewertungsdatenPool.class,
    XMLSpezialbedingungPool.class,
    XMLTagesbedingungPool.class,
    XMLTageszeitbedingungPool.class,
    XMLZeitraumbedingungPool.class,
    XMLTarifpunktbedingungPool.class,
    XMLGeosegmentbedingungPool.class,
    XMLBewertungsbedingungPool.class,
    XMLNamePool.class,
    XMLLiniePool.class,
    XMLMitnahmebedingungPool.class,
    XMLNameGruppePool.class,
    XMLBIFAInterpretationPool.class,
    XMLNummerninterpretationPool.class,
    XMLBitleisteninterpretationPool.class,
    XMLRaumnummerninterpretationPool.class,
    XMLRaummodifikationPool.class,
    XMLProduktadapterPool.class,
    XMLFlaechenelementPool.class,
    XMLIdentifikationsparameterPool.class,
    XMLAusgangstextPool.class,
    XMLNrNamePool.class
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
public class XMLPool {

    @XmlAttribute(name = "key", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected int key;

    /**
     * Ruft den Wert der key-Eigenschaft ab.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public int getKey() {
        return key;
    }

    /**
     * Legt den Wert der key-Eigenschaft fest.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setKey(int value) {
        this.key = value;
    }

}
