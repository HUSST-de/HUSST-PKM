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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für XML-FunctionValue complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XML-FunctionValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://vdv/ka/pkm/2}XML-CompositeFunction"&gt;
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
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XML-FunctionValue")
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
public class XMLFunctionValue
    extends XMLCompositeFunction
{


}
