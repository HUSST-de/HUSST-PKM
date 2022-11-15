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
 * <p>Java-Klasse für XML-Schritt-Item complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XML-Schritt-Item"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vdv/ka/pkm/2}XML-Name-Item"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="ausgang" type="{http://vdv/ka/pkm/2}XML-Ausgangsschritt-Part"/&gt;
 *         &lt;element name="auswahl" type="{http://vdv/ka/pkm/2}XML-Auswahlschritt-Part"/&gt;
 *         &lt;element name="berechnung" type="{http://vdv/ka/pkm/2}XML-Berechnungsschritt-Part"/&gt;
 *         &lt;element name="entscheidung" type="{http://vdv/ka/pkm/2}XML-Entscheidungsschritt-Part"/&gt;
 *         &lt;element name="parallelisierung" type="{http://vdv/ka/pkm/2}XML-Parallelisierungsschritt-Part"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XML-Schritt-Item", propOrder = {
    "ausgang",
    "auswahl",
    "berechnung",
    "entscheidung",
    "parallelisierung"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
public class XMLSchrittItem
    extends XMLNameItem
{

    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLAusgangsschrittPart ausgang;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLAuswahlschrittPart auswahl;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLBerechnungsschrittPart berechnung;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLEntscheidungsschrittPart entscheidung;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLParallelisierungsschrittPart parallelisierung;

    /**
     * Ruft den Wert der ausgang-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLAusgangsschrittPart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLAusgangsschrittPart getAusgang() {
        return ausgang;
    }

    /**
     * Legt den Wert der ausgang-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLAusgangsschrittPart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setAusgang(XMLAusgangsschrittPart value) {
        this.ausgang = value;
    }

    /**
     * Ruft den Wert der auswahl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLAuswahlschrittPart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLAuswahlschrittPart getAuswahl() {
        return auswahl;
    }

    /**
     * Legt den Wert der auswahl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLAuswahlschrittPart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setAuswahl(XMLAuswahlschrittPart value) {
        this.auswahl = value;
    }

    /**
     * Ruft den Wert der berechnung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLBerechnungsschrittPart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLBerechnungsschrittPart getBerechnung() {
        return berechnung;
    }

    /**
     * Legt den Wert der berechnung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLBerechnungsschrittPart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setBerechnung(XMLBerechnungsschrittPart value) {
        this.berechnung = value;
    }

    /**
     * Ruft den Wert der entscheidung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLEntscheidungsschrittPart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLEntscheidungsschrittPart getEntscheidung() {
        return entscheidung;
    }

    /**
     * Legt den Wert der entscheidung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLEntscheidungsschrittPart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setEntscheidung(XMLEntscheidungsschrittPart value) {
        this.entscheidung = value;
    }

    /**
     * Ruft den Wert der parallelisierung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLParallelisierungsschrittPart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLParallelisierungsschrittPart getParallelisierung() {
        return parallelisierung;
    }

    /**
     * Legt den Wert der parallelisierung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLParallelisierungsschrittPart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setParallelisierung(XMLParallelisierungsschrittPart value) {
        this.parallelisierung = value;
    }

}
