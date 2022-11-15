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
 * <p>Java-Klasse für XML-RNTarifmodul complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XML-RNTarifmodul"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://vdv/ka/pkm/2}XML-Tarifmodul"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="version" type="{http://vdv/ka/pkm/2}XML-Version-Part"/&gt;
 *         &lt;element name="herausgeber" type="{http://vdv/ka/pkm/2}XML-Organisation-Part"/&gt;
 *         &lt;element name="fachablauf" type="{http://vdv/ka/pkm/2}XML-RNFachablauf-Part"/&gt;
 *         &lt;element name="text-matrix" type="{http://vdv/ka/pkm/2}XML-Ausgangstext-Matrix"/&gt;
 *         &lt;element name="sprache-pool" type="{http://vdv/ka/pkm/2}XML-Sprache-Pool"/&gt;
 *         &lt;element name="eingangsschnittstelle-pool" type="{http://vdv/ka/pkm/2}XML-Eingangsschnittstelle-Pool"/&gt;
 *         &lt;element name="ausgangsschnittstelle-pool" type="{http://vdv/ka/pkm/2}XML-Ausgangsschnittstelle-Pool"/&gt;
 *         &lt;element name="ausgangskontext-pool" type="{http://vdv/ka/pkm/2}XML-Ausgangskontext-Pool"/&gt;
 *         &lt;element name="datentabelle-pool" type="{http://vdv/ka/pkm/2}XML-Datentabelle-Pool"/&gt;
 *         &lt;element name="schritt-pool" type="{http://vdv/ka/pkm/2}XML-Schritt-Pool"/&gt;
 *         &lt;element name="variable-pool" type="{http://vdv/ka/pkm/2}XML-Variable-Pool"/&gt;
 *         &lt;element name="funktion-pool" type="{http://vdv/ka/pkm/2}XML-Funktion-Pool"/&gt;
 *         &lt;element name="ausnahme-pool" type="{http://vdv/ka/pkm/2}XML-Ausnahme-Pool"/&gt;
 *         &lt;element name="auswahldaten-pool" type="{http://vdv/ka/pkm/2}XML-Auswahldaten-Pool"/&gt;
 *         &lt;element name="auswahloption-pool" type="{http://vdv/ka/pkm/2}XML-Auswahloption-Pool"/&gt;
 *         &lt;element name="ausgangsdaten-pool" type="{http://vdv/ka/pkm/2}XML-Ausgangsdaten-Pool"/&gt;
 *         &lt;element name="produktadapter-pool" type="{http://vdv/ka/pkm/2}XML-Produktadapter-Pool"/&gt;
 *         &lt;element name="identifikationsparameteradapter-pool" type="{http://vdv/ka/pkm/2}XML-Identifikationsparameteradapter-Pool"/&gt;
 *         &lt;element name="tarifpunktadapter-pool" type="{http://vdv/ka/pkm/2}XML-Tarifpunktadapter-Pool"/&gt;
 *         &lt;element name="tarifpunktreferenzadapter-pool" type="{http://vdv/ka/pkm/2}XML-Tarifpunktreferenzadapter-Pool"/&gt;
 *         &lt;element name="wegevariantenadapter-pool" type="{http://vdv/ka/pkm/2}XML-Wegevariantenadapter-Pool"/&gt;
 *         &lt;element name="linienadapter-pool" type="{http://vdv/ka/pkm/2}XML-Linienadapter-Pool"/&gt;
 *         &lt;element name="verkehrsmitteltypadapter-pool" type="{http://vdv/ka/pkm/2}XML-Verkehrsmitteltypadapter-Pool"/&gt;
 *         &lt;element name="bezahlartadapter-pool" type="{http://vdv/ka/pkm/2}XML-Bezahlartadapter-Pool"/&gt;
 *         &lt;element name="waehrungsadapter-pool" type="{http://vdv/ka/pkm/2}XML-Waehrungsadapter-Pool"/&gt;
 *         &lt;element name="zahlungsintervalladapter-pool" type="{http://vdv/ka/pkm/2}XML-Zahlungsintervalladapter-Pool"/&gt;
 *         &lt;element name="mitnahmetypadapter-pool" type="{http://vdv/ka/pkm/2}XML-Mitnahmetypadapter-Pool"/&gt;
 *         &lt;element name="rabattmedientypadapter-pool" type="{http://vdv/ka/pkm/2}XML-Rabattmedientypadapter-Pool"/&gt;
 *         &lt;element name="modulkontextadapter-pool" type="{http://vdv/ka/pkm/2}XML-Modulkontextadapter-Pool"/&gt;
 *         &lt;element name="nummerninterpretation-pool" type="{http://vdv/ka/pkm/2}XML-Nummerninterpretation-Pool"/&gt;
 *         &lt;element name="schluessel-pool" type="{http://vdv/ka/pkm/2}XML-Schluessel-Pool"/&gt;
 *         &lt;element name="tarifmodul-pool" type="{http://vdv/ka/pkm/2}XML-Tarifmodul-Pool"/&gt;
 *         &lt;element name="kommentar-pool" type="{http://vdv/ka/pkm/2}XML-Kommentar-Pool"/&gt;
 *         &lt;element name="signatur" type="{http://vdv/ka/pkm/2}XML-Signatur-Part"/&gt;
 *         &lt;element name="annotation" type="{http://vdv/ka/pkm/2}XML-Annotation-Part"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XML-RNTarifmodul")
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
public class XMLRNTarifmodul
    extends XMLTarifmodul
{


}
