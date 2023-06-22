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
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für XML-CommonFunction complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XML-CommonFunction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="bits" type="{http://vdv/ka/pkm/2}XML-BinaryValue"/&gt;
 *         &lt;element name="text" type="{http://vdv/ka/pkm/2}XML-StringValue"/&gt;
 *         &lt;element name="zahl" type="{http://vdv/ka/pkm/2}XML-IntegerValue"/&gt;
 *         &lt;element name="liste" type="{http://vdv/ka/pkm/2}XML-ArrayValue"/&gt;
 *         &lt;element name="datum" type="{http://vdv/ka/pkm/2}XML-DateValue"/&gt;
 *         &lt;element name="uhrzeit" type="{http://vdv/ka/pkm/2}XML-TimeValue"/&gt;
 *         &lt;element name="zeitpunkt" type="{http://vdv/ka/pkm/2}XML-DatetimeValue"/&gt;
 *         &lt;element name="zeitspanne" type="{http://vdv/ka/pkm/2}XML-DurationValue"/&gt;
 *         &lt;element name="ja" type="{http://vdv/ka/pkm/2}XML-TrueValue"/&gt;
 *         &lt;element name="nein" type="{http://vdv/ka/pkm/2}XML-FalseValue"/&gt;
 *         &lt;element name="ref" type="{http://vdv/ka/pkm/2}XML-ObjectValue"/&gt;
 *         &lt;element name="funktion" type="{http://vdv/ka/pkm/2}XML-FunctionValue"/&gt;
 *         &lt;element name="undefiniert" type="{http://vdv/ka/pkm/2}XML-VoidValue"/&gt;
 *         &lt;element name="param" type="{http://vdv/ka/pkm/2}XML-ParamFunction"/&gt;
 *         &lt;element name="aufruf" type="{http://vdv/ka/pkm/2}XML-CompositeFunction"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="ref" type="{http://vdv/ka/pkm/2}XML-Ref" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XML-CommonFunction", propOrder = {
    "bitsOrTextOrZahl"
})
@XmlSeeAlso({
    XMLCompositeFunction.class,
    XMLArrayValue.class
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
public class XMLCommonFunction {

    @XmlElements({
        @XmlElement(name = "bits", type = XMLBinaryValue.class),
        @XmlElement(name = "text", type = XMLStringValue.class),
        @XmlElement(name = "zahl", type = XMLIntegerValue.class),
        @XmlElement(name = "liste", type = XMLArrayValue.class),
        @XmlElement(name = "datum", type = XMLDateValue.class),
        @XmlElement(name = "uhrzeit", type = XMLTimeValue.class),
        @XmlElement(name = "zeitpunkt", type = XMLDatetimeValue.class),
        @XmlElement(name = "zeitspanne", type = XMLDurationValue.class),
        @XmlElement(name = "ja", type = XMLTrueValue.class),
        @XmlElement(name = "nein", type = XMLFalseValue.class),
        @XmlElement(name = "ref", type = XMLObjectValue.class),
        @XmlElement(name = "funktion", type = XMLFunctionValue.class),
        @XmlElement(name = "undefiniert", type = XMLVoidValue.class),
        @XmlElement(name = "param", type = XMLParamFunction.class),
        @XmlElement(name = "aufruf", type = XMLCompositeFunction.class)
    })
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected List<Object> bitsOrTextOrZahl;
    @XmlAttribute(name = "ref")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected Integer ref;

    /**
     * Gets the value of the bitsOrTextOrZahl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the bitsOrTextOrZahl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBitsOrTextOrZahl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLBinaryValue }
     * {@link XMLStringValue }
     * {@link XMLIntegerValue }
     * {@link XMLArrayValue }
     * {@link XMLDateValue }
     * {@link XMLTimeValue }
     * {@link XMLDatetimeValue }
     * {@link XMLDurationValue }
     * {@link XMLTrueValue }
     * {@link XMLFalseValue }
     * {@link XMLObjectValue }
     * {@link XMLFunctionValue }
     * {@link XMLVoidValue }
     * {@link XMLParamFunction }
     * {@link XMLCompositeFunction }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public List<Object> getBitsOrTextOrZahl() {
        if (bitsOrTextOrZahl == null) {
            bitsOrTextOrZahl = new ArrayList<Object>();
        }
        return this.bitsOrTextOrZahl;
    }

    /**
     * Ruft den Wert der ref-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public Integer getRef() {
        return ref;
    }

    /**
     * Legt den Wert der ref-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setRef(Integer value) {
        this.ref = value;
    }

}
