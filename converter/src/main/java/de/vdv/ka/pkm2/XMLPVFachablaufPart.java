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
 * <p>Java-Klasse für XML-PVFachablauf-Part complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XML-PVFachablauf-Part"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://vdv/ka/pkm/2}XML-Fachablauf-Part"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kontrollstart" type="{http://vdv/ka/pkm/2}XML-Ref11"/&gt;
 *         &lt;element name="erfassungsstart" type="{http://vdv/ka/pkm/2}XML-Ref11"/&gt;
 *         &lt;element name="anpassungsstart" type="{http://vdv/ka/pkm/2}XML-Ref11"/&gt;
 *         &lt;element name="darstellungsstart" type="{http://vdv/ka/pkm/2}XML-Ref11"/&gt;
 *         &lt;element name="produktermittlungsstart" type="{http://vdv/ka/pkm/2}XML-Ref11"/&gt;
 *         &lt;element name="transaktionsauswertungsstart" type="{http://vdv/ka/pkm/2}XML-Ref11"/&gt;
 *         &lt;element name="pruefungin" type="{http://vdv/ka/pkm/2}XML-Ref01"/&gt;
 *         &lt;element name="pruefungvor" type="{http://vdv/ka/pkm/2}XML-DurationValue"/&gt;
 *         &lt;element name="pruefungnach" type="{http://vdv/ka/pkm/2}XML-DurationValue"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XML-PVFachablauf-Part")
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
public class XMLPVFachablaufPart
    extends XMLFachablaufPart
{


}
