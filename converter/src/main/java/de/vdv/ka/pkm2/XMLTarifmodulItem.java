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
 * <p>Java-Klasse für XML-Tarifmodul-Item complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XML-Tarifmodul-Item"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vdv/ka/pkm/2}XML-Item"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tarifmodul" type="{http://vdv/ka/pkm/2}XML-PVTarifmodul"/&gt;
 *         &lt;element name="preisanpassung-matrix" type="{http://vdv/ka/pkm/2}XML-Preisanpassung-Matrix"/&gt;
 *         &lt;element name="modulkontextadapter-matrix" type="{http://vdv/ka/pkm/2}XML-Eingangsadapter-Matrix"/&gt;
 *         &lt;element name="produkteingangsadapter-matrix" type="{http://vdv/ka/pkm/2}XML-Eingangsadapter-Matrix"/&gt;
 *         &lt;element name="produktausgangsadapter-matrix" type="{http://vdv/ka/pkm/2}XML-Ausgangsadapter-Matrix"/&gt;
 *         &lt;element name="tarifpunkteingangsadapter-matrix" type="{http://vdv/ka/pkm/2}XML-Eingangsadapter-Matrix"/&gt;
 *         &lt;element name="tarifpunktausgangsadapter-matrix" type="{http://vdv/ka/pkm/2}XML-Ausgangsadapter-Matrix"/&gt;
 *         &lt;element name="tarifpunktreferenzeingangsadapter-matrix" type="{http://vdv/ka/pkm/2}XML-Eingangsadapter-Matrix"/&gt;
 *         &lt;element name="tarifpunktreferenzausgangsadapter-matrix" type="{http://vdv/ka/pkm/2}XML-Ausgangsadapter-Matrix"/&gt;
 *         &lt;element name="linieneingangsadapter-matrix" type="{http://vdv/ka/pkm/2}XML-Eingangsadapter-Matrix"/&gt;
 *         &lt;element name="linienausgangsadapter-matrix" type="{http://vdv/ka/pkm/2}XML-Ausgangsadapter-Matrix"/&gt;
 *         &lt;element name="verkehrsmitteltypeingangsadapter-matrix" type="{http://vdv/ka/pkm/2}XML-Eingangsadapter-Matrix"/&gt;
 *         &lt;element name="verkehrsmitteltypausgangsadapter-matrix" type="{http://vdv/ka/pkm/2}XML-Ausgangsadapter-Matrix"/&gt;
 *         &lt;element name="wegevarianteneingangsadapter-matrix" type="{http://vdv/ka/pkm/2}XML-Eingangsadapter-Matrix"/&gt;
 *         &lt;element name="wegevariantenausgangsadapter-matrix" type="{http://vdv/ka/pkm/2}XML-Ausgangsadapter-Matrix"/&gt;
 *         &lt;element name="bezahlarteingangsadapter-matrix" type="{http://vdv/ka/pkm/2}XML-Eingangsadapter-Matrix"/&gt;
 *         &lt;element name="bezahlartausgangsadapter-matrix" type="{http://vdv/ka/pkm/2}XML-Ausgangsadapter-Matrix"/&gt;
 *         &lt;element name="waehrungseingangsadapter-matrix" type="{http://vdv/ka/pkm/2}XML-Eingangsadapter-Matrix"/&gt;
 *         &lt;element name="waehrungsausgangsadapter-matrix" type="{http://vdv/ka/pkm/2}XML-Ausgangsadapter-Matrix"/&gt;
 *         &lt;element name="zahlungsintervalleingangsadapter-matrix" type="{http://vdv/ka/pkm/2}XML-Eingangsadapter-Matrix"/&gt;
 *         &lt;element name="zahlungsintervallausgangsadapter-matrix" type="{http://vdv/ka/pkm/2}XML-Ausgangsadapter-Matrix"/&gt;
 *         &lt;element name="mitnahmetypeingangsadapter-matrix" type="{http://vdv/ka/pkm/2}XML-Eingangsadapter-Matrix"/&gt;
 *         &lt;element name="mitnahmetypausgangsadapter-matrix" type="{http://vdv/ka/pkm/2}XML-Ausgangsadapter-Matrix"/&gt;
 *         &lt;element name="rabattmedientypeingangsadapter-matrix" type="{http://vdv/ka/pkm/2}XML-Eingangsadapter-Matrix"/&gt;
 *         &lt;element name="rabattmedientypausgangsadapter-matrix" type="{http://vdv/ka/pkm/2}XML-Ausgangsadapter-Matrix"/&gt;
 *         &lt;element name="identifikationsparameterwerteingangsadapter-matrix" type="{http://vdv/ka/pkm/2}XML-Eingangsadapter-Matrix"/&gt;
 *         &lt;element name="identifikationsparameterwertausgangsadapter-matrix" type="{http://vdv/ka/pkm/2}XML-Ausgangsadapter-Matrix"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XML-Tarifmodul-Item", propOrder = {
    "tarifmodul",
    "preisanpassungMatrix",
    "modulkontextadapterMatrix",
    "produkteingangsadapterMatrix",
    "produktausgangsadapterMatrix",
    "tarifpunkteingangsadapterMatrix",
    "tarifpunktausgangsadapterMatrix",
    "tarifpunktreferenzeingangsadapterMatrix",
    "tarifpunktreferenzausgangsadapterMatrix",
    "linieneingangsadapterMatrix",
    "linienausgangsadapterMatrix",
    "verkehrsmitteltypeingangsadapterMatrix",
    "verkehrsmitteltypausgangsadapterMatrix",
    "wegevarianteneingangsadapterMatrix",
    "wegevariantenausgangsadapterMatrix",
    "bezahlarteingangsadapterMatrix",
    "bezahlartausgangsadapterMatrix",
    "waehrungseingangsadapterMatrix",
    "waehrungsausgangsadapterMatrix",
    "zahlungsintervalleingangsadapterMatrix",
    "zahlungsintervallausgangsadapterMatrix",
    "mitnahmetypeingangsadapterMatrix",
    "mitnahmetypausgangsadapterMatrix",
    "rabattmedientypeingangsadapterMatrix",
    "rabattmedientypausgangsadapterMatrix",
    "identifikationsparameterwerteingangsadapterMatrix",
    "identifikationsparameterwertausgangsadapterMatrix"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
public class XMLTarifmodulItem
    extends XMLItem
{

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLPVTarifmodul tarifmodul;
    @XmlElement(name = "preisanpassung-matrix", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLPreisanpassungMatrix preisanpassungMatrix;
    @XmlElement(name = "modulkontextadapter-matrix", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLEingangsadapterMatrix modulkontextadapterMatrix;
    @XmlElement(name = "produkteingangsadapter-matrix", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLEingangsadapterMatrix produkteingangsadapterMatrix;
    @XmlElement(name = "produktausgangsadapter-matrix", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLAusgangsadapterMatrix produktausgangsadapterMatrix;
    @XmlElement(name = "tarifpunkteingangsadapter-matrix", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLEingangsadapterMatrix tarifpunkteingangsadapterMatrix;
    @XmlElement(name = "tarifpunktausgangsadapter-matrix", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLAusgangsadapterMatrix tarifpunktausgangsadapterMatrix;
    @XmlElement(name = "tarifpunktreferenzeingangsadapter-matrix", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLEingangsadapterMatrix tarifpunktreferenzeingangsadapterMatrix;
    @XmlElement(name = "tarifpunktreferenzausgangsadapter-matrix", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLAusgangsadapterMatrix tarifpunktreferenzausgangsadapterMatrix;
    @XmlElement(name = "linieneingangsadapter-matrix", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLEingangsadapterMatrix linieneingangsadapterMatrix;
    @XmlElement(name = "linienausgangsadapter-matrix", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLAusgangsadapterMatrix linienausgangsadapterMatrix;
    @XmlElement(name = "verkehrsmitteltypeingangsadapter-matrix", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLEingangsadapterMatrix verkehrsmitteltypeingangsadapterMatrix;
    @XmlElement(name = "verkehrsmitteltypausgangsadapter-matrix", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLAusgangsadapterMatrix verkehrsmitteltypausgangsadapterMatrix;
    @XmlElement(name = "wegevarianteneingangsadapter-matrix", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLEingangsadapterMatrix wegevarianteneingangsadapterMatrix;
    @XmlElement(name = "wegevariantenausgangsadapter-matrix", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLAusgangsadapterMatrix wegevariantenausgangsadapterMatrix;
    @XmlElement(name = "bezahlarteingangsadapter-matrix", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLEingangsadapterMatrix bezahlarteingangsadapterMatrix;
    @XmlElement(name = "bezahlartausgangsadapter-matrix", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLAusgangsadapterMatrix bezahlartausgangsadapterMatrix;
    @XmlElement(name = "waehrungseingangsadapter-matrix", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLEingangsadapterMatrix waehrungseingangsadapterMatrix;
    @XmlElement(name = "waehrungsausgangsadapter-matrix", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLAusgangsadapterMatrix waehrungsausgangsadapterMatrix;
    @XmlElement(name = "zahlungsintervalleingangsadapter-matrix", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLEingangsadapterMatrix zahlungsintervalleingangsadapterMatrix;
    @XmlElement(name = "zahlungsintervallausgangsadapter-matrix", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLAusgangsadapterMatrix zahlungsintervallausgangsadapterMatrix;
    @XmlElement(name = "mitnahmetypeingangsadapter-matrix", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLEingangsadapterMatrix mitnahmetypeingangsadapterMatrix;
    @XmlElement(name = "mitnahmetypausgangsadapter-matrix", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLAusgangsadapterMatrix mitnahmetypausgangsadapterMatrix;
    @XmlElement(name = "rabattmedientypeingangsadapter-matrix", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLEingangsadapterMatrix rabattmedientypeingangsadapterMatrix;
    @XmlElement(name = "rabattmedientypausgangsadapter-matrix", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLAusgangsadapterMatrix rabattmedientypausgangsadapterMatrix;
    @XmlElement(name = "identifikationsparameterwerteingangsadapter-matrix", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLEingangsadapterMatrix identifikationsparameterwerteingangsadapterMatrix;
    @XmlElement(name = "identifikationsparameterwertausgangsadapter-matrix", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLAusgangsadapterMatrix identifikationsparameterwertausgangsadapterMatrix;

    /**
     * Ruft den Wert der tarifmodul-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLPVTarifmodul }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLPVTarifmodul getTarifmodul() {
        return tarifmodul;
    }

    /**
     * Legt den Wert der tarifmodul-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLPVTarifmodul }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setTarifmodul(XMLPVTarifmodul value) {
        this.tarifmodul = value;
    }

    /**
     * Ruft den Wert der preisanpassungMatrix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLPreisanpassungMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLPreisanpassungMatrix getPreisanpassungMatrix() {
        return preisanpassungMatrix;
    }

    /**
     * Legt den Wert der preisanpassungMatrix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLPreisanpassungMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setPreisanpassungMatrix(XMLPreisanpassungMatrix value) {
        this.preisanpassungMatrix = value;
    }

    /**
     * Ruft den Wert der modulkontextadapterMatrix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLEingangsadapterMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLEingangsadapterMatrix getModulkontextadapterMatrix() {
        return modulkontextadapterMatrix;
    }

    /**
     * Legt den Wert der modulkontextadapterMatrix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLEingangsadapterMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setModulkontextadapterMatrix(XMLEingangsadapterMatrix value) {
        this.modulkontextadapterMatrix = value;
    }

    /**
     * Ruft den Wert der produkteingangsadapterMatrix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLEingangsadapterMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLEingangsadapterMatrix getProdukteingangsadapterMatrix() {
        return produkteingangsadapterMatrix;
    }

    /**
     * Legt den Wert der produkteingangsadapterMatrix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLEingangsadapterMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setProdukteingangsadapterMatrix(XMLEingangsadapterMatrix value) {
        this.produkteingangsadapterMatrix = value;
    }

    /**
     * Ruft den Wert der produktausgangsadapterMatrix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLAusgangsadapterMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLAusgangsadapterMatrix getProduktausgangsadapterMatrix() {
        return produktausgangsadapterMatrix;
    }

    /**
     * Legt den Wert der produktausgangsadapterMatrix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLAusgangsadapterMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setProduktausgangsadapterMatrix(XMLAusgangsadapterMatrix value) {
        this.produktausgangsadapterMatrix = value;
    }

    /**
     * Ruft den Wert der tarifpunkteingangsadapterMatrix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLEingangsadapterMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLEingangsadapterMatrix getTarifpunkteingangsadapterMatrix() {
        return tarifpunkteingangsadapterMatrix;
    }

    /**
     * Legt den Wert der tarifpunkteingangsadapterMatrix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLEingangsadapterMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setTarifpunkteingangsadapterMatrix(XMLEingangsadapterMatrix value) {
        this.tarifpunkteingangsadapterMatrix = value;
    }

    /**
     * Ruft den Wert der tarifpunktausgangsadapterMatrix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLAusgangsadapterMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLAusgangsadapterMatrix getTarifpunktausgangsadapterMatrix() {
        return tarifpunktausgangsadapterMatrix;
    }

    /**
     * Legt den Wert der tarifpunktausgangsadapterMatrix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLAusgangsadapterMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setTarifpunktausgangsadapterMatrix(XMLAusgangsadapterMatrix value) {
        this.tarifpunktausgangsadapterMatrix = value;
    }

    /**
     * Ruft den Wert der tarifpunktreferenzeingangsadapterMatrix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLEingangsadapterMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLEingangsadapterMatrix getTarifpunktreferenzeingangsadapterMatrix() {
        return tarifpunktreferenzeingangsadapterMatrix;
    }

    /**
     * Legt den Wert der tarifpunktreferenzeingangsadapterMatrix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLEingangsadapterMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setTarifpunktreferenzeingangsadapterMatrix(XMLEingangsadapterMatrix value) {
        this.tarifpunktreferenzeingangsadapterMatrix = value;
    }

    /**
     * Ruft den Wert der tarifpunktreferenzausgangsadapterMatrix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLAusgangsadapterMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLAusgangsadapterMatrix getTarifpunktreferenzausgangsadapterMatrix() {
        return tarifpunktreferenzausgangsadapterMatrix;
    }

    /**
     * Legt den Wert der tarifpunktreferenzausgangsadapterMatrix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLAusgangsadapterMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setTarifpunktreferenzausgangsadapterMatrix(XMLAusgangsadapterMatrix value) {
        this.tarifpunktreferenzausgangsadapterMatrix = value;
    }

    /**
     * Ruft den Wert der linieneingangsadapterMatrix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLEingangsadapterMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLEingangsadapterMatrix getLinieneingangsadapterMatrix() {
        return linieneingangsadapterMatrix;
    }

    /**
     * Legt den Wert der linieneingangsadapterMatrix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLEingangsadapterMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setLinieneingangsadapterMatrix(XMLEingangsadapterMatrix value) {
        this.linieneingangsadapterMatrix = value;
    }

    /**
     * Ruft den Wert der linienausgangsadapterMatrix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLAusgangsadapterMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLAusgangsadapterMatrix getLinienausgangsadapterMatrix() {
        return linienausgangsadapterMatrix;
    }

    /**
     * Legt den Wert der linienausgangsadapterMatrix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLAusgangsadapterMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setLinienausgangsadapterMatrix(XMLAusgangsadapterMatrix value) {
        this.linienausgangsadapterMatrix = value;
    }

    /**
     * Ruft den Wert der verkehrsmitteltypeingangsadapterMatrix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLEingangsadapterMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLEingangsadapterMatrix getVerkehrsmitteltypeingangsadapterMatrix() {
        return verkehrsmitteltypeingangsadapterMatrix;
    }

    /**
     * Legt den Wert der verkehrsmitteltypeingangsadapterMatrix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLEingangsadapterMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setVerkehrsmitteltypeingangsadapterMatrix(XMLEingangsadapterMatrix value) {
        this.verkehrsmitteltypeingangsadapterMatrix = value;
    }

    /**
     * Ruft den Wert der verkehrsmitteltypausgangsadapterMatrix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLAusgangsadapterMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLAusgangsadapterMatrix getVerkehrsmitteltypausgangsadapterMatrix() {
        return verkehrsmitteltypausgangsadapterMatrix;
    }

    /**
     * Legt den Wert der verkehrsmitteltypausgangsadapterMatrix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLAusgangsadapterMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setVerkehrsmitteltypausgangsadapterMatrix(XMLAusgangsadapterMatrix value) {
        this.verkehrsmitteltypausgangsadapterMatrix = value;
    }

    /**
     * Ruft den Wert der wegevarianteneingangsadapterMatrix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLEingangsadapterMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLEingangsadapterMatrix getWegevarianteneingangsadapterMatrix() {
        return wegevarianteneingangsadapterMatrix;
    }

    /**
     * Legt den Wert der wegevarianteneingangsadapterMatrix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLEingangsadapterMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setWegevarianteneingangsadapterMatrix(XMLEingangsadapterMatrix value) {
        this.wegevarianteneingangsadapterMatrix = value;
    }

    /**
     * Ruft den Wert der wegevariantenausgangsadapterMatrix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLAusgangsadapterMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLAusgangsadapterMatrix getWegevariantenausgangsadapterMatrix() {
        return wegevariantenausgangsadapterMatrix;
    }

    /**
     * Legt den Wert der wegevariantenausgangsadapterMatrix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLAusgangsadapterMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setWegevariantenausgangsadapterMatrix(XMLAusgangsadapterMatrix value) {
        this.wegevariantenausgangsadapterMatrix = value;
    }

    /**
     * Ruft den Wert der bezahlarteingangsadapterMatrix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLEingangsadapterMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLEingangsadapterMatrix getBezahlarteingangsadapterMatrix() {
        return bezahlarteingangsadapterMatrix;
    }

    /**
     * Legt den Wert der bezahlarteingangsadapterMatrix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLEingangsadapterMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setBezahlarteingangsadapterMatrix(XMLEingangsadapterMatrix value) {
        this.bezahlarteingangsadapterMatrix = value;
    }

    /**
     * Ruft den Wert der bezahlartausgangsadapterMatrix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLAusgangsadapterMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLAusgangsadapterMatrix getBezahlartausgangsadapterMatrix() {
        return bezahlartausgangsadapterMatrix;
    }

    /**
     * Legt den Wert der bezahlartausgangsadapterMatrix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLAusgangsadapterMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setBezahlartausgangsadapterMatrix(XMLAusgangsadapterMatrix value) {
        this.bezahlartausgangsadapterMatrix = value;
    }

    /**
     * Ruft den Wert der waehrungseingangsadapterMatrix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLEingangsadapterMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLEingangsadapterMatrix getWaehrungseingangsadapterMatrix() {
        return waehrungseingangsadapterMatrix;
    }

    /**
     * Legt den Wert der waehrungseingangsadapterMatrix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLEingangsadapterMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setWaehrungseingangsadapterMatrix(XMLEingangsadapterMatrix value) {
        this.waehrungseingangsadapterMatrix = value;
    }

    /**
     * Ruft den Wert der waehrungsausgangsadapterMatrix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLAusgangsadapterMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLAusgangsadapterMatrix getWaehrungsausgangsadapterMatrix() {
        return waehrungsausgangsadapterMatrix;
    }

    /**
     * Legt den Wert der waehrungsausgangsadapterMatrix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLAusgangsadapterMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setWaehrungsausgangsadapterMatrix(XMLAusgangsadapterMatrix value) {
        this.waehrungsausgangsadapterMatrix = value;
    }

    /**
     * Ruft den Wert der zahlungsintervalleingangsadapterMatrix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLEingangsadapterMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLEingangsadapterMatrix getZahlungsintervalleingangsadapterMatrix() {
        return zahlungsintervalleingangsadapterMatrix;
    }

    /**
     * Legt den Wert der zahlungsintervalleingangsadapterMatrix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLEingangsadapterMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setZahlungsintervalleingangsadapterMatrix(XMLEingangsadapterMatrix value) {
        this.zahlungsintervalleingangsadapterMatrix = value;
    }

    /**
     * Ruft den Wert der zahlungsintervallausgangsadapterMatrix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLAusgangsadapterMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLAusgangsadapterMatrix getZahlungsintervallausgangsadapterMatrix() {
        return zahlungsintervallausgangsadapterMatrix;
    }

    /**
     * Legt den Wert der zahlungsintervallausgangsadapterMatrix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLAusgangsadapterMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setZahlungsintervallausgangsadapterMatrix(XMLAusgangsadapterMatrix value) {
        this.zahlungsintervallausgangsadapterMatrix = value;
    }

    /**
     * Ruft den Wert der mitnahmetypeingangsadapterMatrix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLEingangsadapterMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLEingangsadapterMatrix getMitnahmetypeingangsadapterMatrix() {
        return mitnahmetypeingangsadapterMatrix;
    }

    /**
     * Legt den Wert der mitnahmetypeingangsadapterMatrix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLEingangsadapterMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setMitnahmetypeingangsadapterMatrix(XMLEingangsadapterMatrix value) {
        this.mitnahmetypeingangsadapterMatrix = value;
    }

    /**
     * Ruft den Wert der mitnahmetypausgangsadapterMatrix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLAusgangsadapterMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLAusgangsadapterMatrix getMitnahmetypausgangsadapterMatrix() {
        return mitnahmetypausgangsadapterMatrix;
    }

    /**
     * Legt den Wert der mitnahmetypausgangsadapterMatrix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLAusgangsadapterMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setMitnahmetypausgangsadapterMatrix(XMLAusgangsadapterMatrix value) {
        this.mitnahmetypausgangsadapterMatrix = value;
    }

    /**
     * Ruft den Wert der rabattmedientypeingangsadapterMatrix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLEingangsadapterMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLEingangsadapterMatrix getRabattmedientypeingangsadapterMatrix() {
        return rabattmedientypeingangsadapterMatrix;
    }

    /**
     * Legt den Wert der rabattmedientypeingangsadapterMatrix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLEingangsadapterMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setRabattmedientypeingangsadapterMatrix(XMLEingangsadapterMatrix value) {
        this.rabattmedientypeingangsadapterMatrix = value;
    }

    /**
     * Ruft den Wert der rabattmedientypausgangsadapterMatrix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLAusgangsadapterMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLAusgangsadapterMatrix getRabattmedientypausgangsadapterMatrix() {
        return rabattmedientypausgangsadapterMatrix;
    }

    /**
     * Legt den Wert der rabattmedientypausgangsadapterMatrix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLAusgangsadapterMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setRabattmedientypausgangsadapterMatrix(XMLAusgangsadapterMatrix value) {
        this.rabattmedientypausgangsadapterMatrix = value;
    }

    /**
     * Ruft den Wert der identifikationsparameterwerteingangsadapterMatrix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLEingangsadapterMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLEingangsadapterMatrix getIdentifikationsparameterwerteingangsadapterMatrix() {
        return identifikationsparameterwerteingangsadapterMatrix;
    }

    /**
     * Legt den Wert der identifikationsparameterwerteingangsadapterMatrix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLEingangsadapterMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setIdentifikationsparameterwerteingangsadapterMatrix(XMLEingangsadapterMatrix value) {
        this.identifikationsparameterwerteingangsadapterMatrix = value;
    }

    /**
     * Ruft den Wert der identifikationsparameterwertausgangsadapterMatrix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLAusgangsadapterMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLAusgangsadapterMatrix getIdentifikationsparameterwertausgangsadapterMatrix() {
        return identifikationsparameterwertausgangsadapterMatrix;
    }

    /**
     * Legt den Wert der identifikationsparameterwertausgangsadapterMatrix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLAusgangsadapterMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setIdentifikationsparameterwertausgangsadapterMatrix(XMLAusgangsadapterMatrix value) {
        this.identifikationsparameterwertausgangsadapterMatrix = value;
    }

}
