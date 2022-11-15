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
 * <p>Java-Klasse für XML-PVTarifmodul complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XML-PVTarifmodul"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://vdv/ka/pkm/2}XML-Tarifmodul"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="version" type="{http://vdv/ka/pkm/2}XML-Version-Part"/&gt;
 *         &lt;element name="herausgeber" type="{http://vdv/ka/pkm/2}XML-Organisation-Part"/&gt;
 *         &lt;element name="fachablauf" type="{http://vdv/ka/pkm/2}XML-PVFachablauf-Part"/&gt;
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
 *         &lt;element name="ausgangsdatenfamilie-pool" type="{http://vdv/ka/pkm/2}XML-Ausgangsdatenfamilie-Pool"/&gt;
 *         &lt;element name="organisation-pool" type="{http://vdv/ka/pkm/2}XML-Organisation-Pool"/&gt;
 *         &lt;element name="efmprodukt-pool" type="{http://vdv/ka/pkm/2}XML-EFMProdukt-Pool"/&gt;
 *         &lt;element name="tarifprodukt-pool" type="{http://vdv/ka/pkm/2}XML-Tarifprodukt-Pool"/&gt;
 *         &lt;element name="fremdprodukt-pool" type="{http://vdv/ka/pkm/2}XML-Fremdprodukt-Pool"/&gt;
 *         &lt;element name="produktgruppe-pool" type="{http://vdv/ka/pkm/2}XML-Produktgruppe-Pool"/&gt;
 *         &lt;element name="kontingentierung-pool" type="{http://vdv/ka/pkm/2}XML-Kontingentierung-Pool"/&gt;
 *         &lt;element name="nachfolgekriterium-pool" type="{http://vdv/ka/pkm/2}XML-Nachfolgekriterium-Pool"/&gt;
 *         &lt;element name="abhaengigkeitskriterium-pool" type="{http://vdv/ka/pkm/2}XML-Abhaengigkeitskriterium-Pool"/&gt;
 *         &lt;element name="identifikationsparameter-pool" type="{http://vdv/ka/pkm/2}XML-Identifikationsparameter-Pool"/&gt;
 *         &lt;element name="tarifpunkt-pool" type="{http://vdv/ka/pkm/2}XML-Tarifpunkt-Pool"/&gt;
 *         &lt;element name="tarifpunktgruppe-pool" type="{http://vdv/ka/pkm/2}XML-Tarifpunktgruppe-Pool"/&gt;
 *         &lt;element name="tarifpunktreferenz-pool" type="{http://vdv/ka/pkm/2}XML-Tarifpunktreferenz-Pool"/&gt;
 *         &lt;element name="zuordnungstyp-pool" type="{http://vdv/ka/pkm/2}XML-Zuordnungstyp-Pool"/&gt;
 *         &lt;element name="zuordnungsdaten-matrix" type="{http://vdv/ka/pkm/2}XML-Zuordnungsdaten-Matrix"/&gt;
 *         &lt;element name="zuordnungsausnahme-matrix" type="{http://vdv/ka/pkm/2}XML-Zuordnungsausnahme-Matrix"/&gt;
 *         &lt;element name="wegevariante-pool" type="{http://vdv/ka/pkm/2}XML-Wegevariante-Pool"/&gt;
 *         &lt;element name="bewertungstyp-pool" type="{http://vdv/ka/pkm/2}XML-Bewertungstyp-Pool"/&gt;
 *         &lt;element name="bewertungsdaten-pool" type="{http://vdv/ka/pkm/2}XML-Bewertungsdaten-Pool"/&gt;
 *         &lt;element name="bewertungsdaten-matrix" type="{http://vdv/ka/pkm/2}XML-Bewertungsdaten-Matrix"/&gt;
 *         &lt;element name="bewertungsausnahme-matrix" type="{http://vdv/ka/pkm/2}XML-Bewertungsausnahme-Matrix"/&gt;
 *         &lt;element name="linie-pool" type="{http://vdv/ka/pkm/2}XML-Linie-Pool"/&gt;
 *         &lt;element name="verkehrsmitteltyp-pool" type="{http://vdv/ka/pkm/2}XML-Verkehrsmitteltyp-Pool"/&gt;
 *         &lt;element name="verkehrsmittellinienbezug-pool" type="{http://vdv/ka/pkm/2}XML-Verkehrsmittellinienbezug-Pool"/&gt;
 *         &lt;element name="bezahlart-pool" type="{http://vdv/ka/pkm/2}XML-Bezahlart-Pool"/&gt;
 *         &lt;element name="waehrung-pool" type="{http://vdv/ka/pkm/2}XML-Waehrung-Pool"/&gt;
 *         &lt;element name="zahlungsintervall-pool" type="{http://vdv/ka/pkm/2}XML-Zahlungsintervall-Pool"/&gt;
 *         &lt;element name="mitnahmetyp-pool" type="{http://vdv/ka/pkm/2}XML-Mitnahmetyp-Pool"/&gt;
 *         &lt;element name="rabattmedientyp-pool" type="{http://vdv/ka/pkm/2}XML-Rabattmedientyp-Pool"/&gt;
 *         &lt;element name="modulkontext-pool" type="{http://vdv/ka/pkm/2}XML-Modulkontext-Pool"/&gt;
 *         &lt;element name="spezialbedingung-pool" type="{http://vdv/ka/pkm/2}XML-Spezialbedingung-Pool"/&gt;
 *         &lt;element name="tagesbedingung-pool" type="{http://vdv/ka/pkm/2}XML-Tagesbedingung-Pool"/&gt;
 *         &lt;element name="tageszeitbedingung-pool" type="{http://vdv/ka/pkm/2}XML-Tageszeitbedingung-Pool"/&gt;
 *         &lt;element name="zeitraumbedingung-pool" type="{http://vdv/ka/pkm/2}XML-Zeitraumbedingung-Pool"/&gt;
 *         &lt;element name="tarifpunktbedingung-pool" type="{http://vdv/ka/pkm/2}XML-Tarifpunktbedingung-Pool"/&gt;
 *         &lt;element name="bewertungsbedingung-pool" type="{http://vdv/ka/pkm/2}XML-Bewertungsbedingung-Pool"/&gt;
 *         &lt;element name="geosegmentbedingung-pool" type="{http://vdv/ka/pkm/2}XML-Geosegmentbedingung-Pool"/&gt;
 *         &lt;element name="verkehrsmittellinienbedingung-pool" type="{http://vdv/ka/pkm/2}XML-Verkehrsmittellinienbedingung-Pool"/&gt;
 *         &lt;element name="bezahlartbedingung-pool" type="{http://vdv/ka/pkm/2}XML-Bezahlartbedingung-Pool"/&gt;
 *         &lt;element name="zahlungsintervallbedingung-pool" type="{http://vdv/ka/pkm/2}XML-Zahlungsintervallbedingung-Pool"/&gt;
 *         &lt;element name="mitnahmebedingung-pool" type="{http://vdv/ka/pkm/2}XML-Mitnahmebedingung-Pool"/&gt;
 *         &lt;element name="rabattmedienbedingung-pool" type="{http://vdv/ka/pkm/2}XML-Rabattmedienbedingung-Pool"/&gt;
 *         &lt;element name="modulkontextbedingung-pool" type="{http://vdv/ka/pkm/2}XML-Modulkontextbedingung-Pool"/&gt;
 *         &lt;element name="bifainterpretation-pool" type="{http://vdv/ka/pkm/2}XML-BIFAInterpretation-Pool"/&gt;
 *         &lt;element name="nummerninterpretation-pool" type="{http://vdv/ka/pkm/2}XML-Nummerninterpretation-Pool"/&gt;
 *         &lt;element name="bitleisteninterpretation-pool" type="{http://vdv/ka/pkm/2}XML-Bitleisteninterpretation-Pool"/&gt;
 *         &lt;element name="raumnummerninterpretation-pool" type="{http://vdv/ka/pkm/2}XML-Raumnummerninterpretation-Pool"/&gt;
 *         &lt;element name="schluessel-pool" type="{http://vdv/ka/pkm/2}XML-Schluessel-Pool"/&gt;
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
@XmlType(name = "XML-PVTarifmodul")
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
public class XMLPVTarifmodul
    extends XMLTarifmodul
{


}
