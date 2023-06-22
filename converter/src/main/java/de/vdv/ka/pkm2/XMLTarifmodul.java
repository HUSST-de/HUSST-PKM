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
 * <p>Java-Klasse für XML-Tarifmodul complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XML-Tarifmodul"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="version" type="{http://vdv/ka/pkm/2}XML-Version-Part"/&gt;
 *         &lt;element name="herausgeber" type="{http://vdv/ka/pkm/2}XML-Organisation-Part"/&gt;
 *         &lt;element name="fachablauf" type="{http://vdv/ka/pkm/2}XML-Fachablauf-Part"/&gt;
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
 *         &lt;element name="ausgangsdatenfamilie-pool" type="{http://vdv/ka/pkm/2}XML-Ausgangsdatenfamilie-Pool" minOccurs="0"/&gt;
 *         &lt;element name="organisation-pool" type="{http://vdv/ka/pkm/2}XML-Organisation-Pool" minOccurs="0"/&gt;
 *         &lt;element name="efmprodukt-pool" type="{http://vdv/ka/pkm/2}XML-EFMProdukt-Pool" minOccurs="0"/&gt;
 *         &lt;element name="tarifprodukt-pool" type="{http://vdv/ka/pkm/2}XML-Tarifprodukt-Pool" minOccurs="0"/&gt;
 *         &lt;element name="fremdprodukt-pool" type="{http://vdv/ka/pkm/2}XML-Fremdprodukt-Pool" minOccurs="0"/&gt;
 *         &lt;element name="produktadapter-pool" type="{http://vdv/ka/pkm/2}XML-Produktadapter-Pool" minOccurs="0"/&gt;
 *         &lt;element name="produktgruppe-pool" type="{http://vdv/ka/pkm/2}XML-Produktgruppe-Pool" minOccurs="0"/&gt;
 *         &lt;element name="kontingentierung-pool" type="{http://vdv/ka/pkm/2}XML-Kontingentierung-Pool" minOccurs="0"/&gt;
 *         &lt;element name="nachfolgekriterium-pool" type="{http://vdv/ka/pkm/2}XML-Nachfolgekriterium-Pool" minOccurs="0"/&gt;
 *         &lt;element name="abhaengigkeitskriterium-pool" type="{http://vdv/ka/pkm/2}XML-Abhaengigkeitskriterium-Pool" minOccurs="0"/&gt;
 *         &lt;element name="identifikationsparameter-pool" type="{http://vdv/ka/pkm/2}XML-Identifikationsparameter-Pool" minOccurs="0"/&gt;
 *         &lt;element name="identifikationsparameteradapter-pool" type="{http://vdv/ka/pkm/2}XML-Identifikationsparameteradapter-Pool" minOccurs="0"/&gt;
 *         &lt;element name="tarifpunkt-pool" type="{http://vdv/ka/pkm/2}XML-Tarifpunkt-Pool" minOccurs="0"/&gt;
 *         &lt;element name="tarifpunktadapter-pool" type="{http://vdv/ka/pkm/2}XML-Tarifpunktadapter-Pool" minOccurs="0"/&gt;
 *         &lt;element name="tarifpunktgruppe-pool" type="{http://vdv/ka/pkm/2}XML-Tarifpunktgruppe-Pool" minOccurs="0"/&gt;
 *         &lt;element name="tarifpunktreferenz-pool" type="{http://vdv/ka/pkm/2}XML-Tarifpunktreferenz-Pool" minOccurs="0"/&gt;
 *         &lt;element name="tarifpunktreferenzadapter-pool" type="{http://vdv/ka/pkm/2}XML-Tarifpunktreferenzadapter-Pool" minOccurs="0"/&gt;
 *         &lt;element name="zuordnungstyp-pool" type="{http://vdv/ka/pkm/2}XML-Zuordnungstyp-Pool" minOccurs="0"/&gt;
 *         &lt;element name="zuordnungsdaten-matrix" type="{http://vdv/ka/pkm/2}XML-Zuordnungsdaten-Matrix" minOccurs="0"/&gt;
 *         &lt;element name="zuordnungsausnahme-matrix" type="{http://vdv/ka/pkm/2}XML-Zuordnungsausnahme-Matrix" minOccurs="0"/&gt;
 *         &lt;element name="wegevariante-pool" type="{http://vdv/ka/pkm/2}XML-Wegevariante-Pool" minOccurs="0"/&gt;
 *         &lt;element name="wegevariantenadapter-pool" type="{http://vdv/ka/pkm/2}XML-Wegevariantenadapter-Pool" minOccurs="0"/&gt;
 *         &lt;element name="bewertungstyp-pool" type="{http://vdv/ka/pkm/2}XML-Bewertungstyp-Pool" minOccurs="0"/&gt;
 *         &lt;element name="bewertungsdaten-pool" type="{http://vdv/ka/pkm/2}XML-Bewertungsdaten-Pool" minOccurs="0"/&gt;
 *         &lt;element name="bewertungsdaten-matrix" type="{http://vdv/ka/pkm/2}XML-Bewertungsdaten-Matrix" minOccurs="0"/&gt;
 *         &lt;element name="bewertungsausnahme-matrix" type="{http://vdv/ka/pkm/2}XML-Bewertungsausnahme-Matrix" minOccurs="0"/&gt;
 *         &lt;element name="linie-pool" type="{http://vdv/ka/pkm/2}XML-Linie-Pool" minOccurs="0"/&gt;
 *         &lt;element name="linienadapter-pool" type="{http://vdv/ka/pkm/2}XML-Linienadapter-Pool" minOccurs="0"/&gt;
 *         &lt;element name="verkehrsmitteltyp-pool" type="{http://vdv/ka/pkm/2}XML-Verkehrsmitteltyp-Pool" minOccurs="0"/&gt;
 *         &lt;element name="verkehrsmitteltypadapter-pool" type="{http://vdv/ka/pkm/2}XML-Verkehrsmitteltypadapter-Pool" minOccurs="0"/&gt;
 *         &lt;element name="verkehrsmittellinienbezug-pool" type="{http://vdv/ka/pkm/2}XML-Verkehrsmittellinienbezug-Pool" minOccurs="0"/&gt;
 *         &lt;element name="bezahlart-pool" type="{http://vdv/ka/pkm/2}XML-Bezahlart-Pool" minOccurs="0"/&gt;
 *         &lt;element name="bezahlartadapter-pool" type="{http://vdv/ka/pkm/2}XML-Bezahlartadapter-Pool" minOccurs="0"/&gt;
 *         &lt;element name="waehrung-pool" type="{http://vdv/ka/pkm/2}XML-Waehrung-Pool" minOccurs="0"/&gt;
 *         &lt;element name="waehrungsadapter-pool" type="{http://vdv/ka/pkm/2}XML-Waehrungsadapter-Pool" minOccurs="0"/&gt;
 *         &lt;element name="zahlungsintervall-pool" type="{http://vdv/ka/pkm/2}XML-Zahlungsintervall-Pool" minOccurs="0"/&gt;
 *         &lt;element name="zahlungsintervalladapter-pool" type="{http://vdv/ka/pkm/2}XML-Zahlungsintervalladapter-Pool" minOccurs="0"/&gt;
 *         &lt;element name="mitnahmetyp-pool" type="{http://vdv/ka/pkm/2}XML-Mitnahmetyp-Pool" minOccurs="0"/&gt;
 *         &lt;element name="mitnahmetypadapter-pool" type="{http://vdv/ka/pkm/2}XML-Mitnahmetypadapter-Pool" minOccurs="0"/&gt;
 *         &lt;element name="rabattmedientyp-pool" type="{http://vdv/ka/pkm/2}XML-Rabattmedientyp-Pool" minOccurs="0"/&gt;
 *         &lt;element name="rabattmedientypadapter-pool" type="{http://vdv/ka/pkm/2}XML-Rabattmedientypadapter-Pool" minOccurs="0"/&gt;
 *         &lt;element name="modulkontext-pool" type="{http://vdv/ka/pkm/2}XML-Modulkontext-Pool" minOccurs="0"/&gt;
 *         &lt;element name="modulkontextadapter-pool" type="{http://vdv/ka/pkm/2}XML-Modulkontextadapter-Pool" minOccurs="0"/&gt;
 *         &lt;element name="spezialbedingung-pool" type="{http://vdv/ka/pkm/2}XML-Spezialbedingung-Pool" minOccurs="0"/&gt;
 *         &lt;element name="tagesbedingung-pool" type="{http://vdv/ka/pkm/2}XML-Tagesbedingung-Pool" minOccurs="0"/&gt;
 *         &lt;element name="tageszeitbedingung-pool" type="{http://vdv/ka/pkm/2}XML-Tageszeitbedingung-Pool" minOccurs="0"/&gt;
 *         &lt;element name="zeitraumbedingung-pool" type="{http://vdv/ka/pkm/2}XML-Zeitraumbedingung-Pool" minOccurs="0"/&gt;
 *         &lt;element name="tarifpunktbedingung-pool" type="{http://vdv/ka/pkm/2}XML-Tarifpunktbedingung-Pool" minOccurs="0"/&gt;
 *         &lt;element name="bewertungsbedingung-pool" type="{http://vdv/ka/pkm/2}XML-Bewertungsbedingung-Pool" minOccurs="0"/&gt;
 *         &lt;element name="geosegmentbedingung-pool" type="{http://vdv/ka/pkm/2}XML-Geosegmentbedingung-Pool" minOccurs="0"/&gt;
 *         &lt;element name="verkehrsmittellinienbedingung-pool" type="{http://vdv/ka/pkm/2}XML-Verkehrsmittellinienbedingung-Pool" minOccurs="0"/&gt;
 *         &lt;element name="bezahlartbedingung-pool" type="{http://vdv/ka/pkm/2}XML-Bezahlartbedingung-Pool" minOccurs="0"/&gt;
 *         &lt;element name="zahlungsintervallbedingung-pool" type="{http://vdv/ka/pkm/2}XML-Zahlungsintervallbedingung-Pool" minOccurs="0"/&gt;
 *         &lt;element name="mitnahmebedingung-pool" type="{http://vdv/ka/pkm/2}XML-Mitnahmebedingung-Pool" minOccurs="0"/&gt;
 *         &lt;element name="rabattmedienbedingung-pool" type="{http://vdv/ka/pkm/2}XML-Rabattmedienbedingung-Pool" minOccurs="0"/&gt;
 *         &lt;element name="modulkontextbedingung-pool" type="{http://vdv/ka/pkm/2}XML-Modulkontextbedingung-Pool" minOccurs="0"/&gt;
 *         &lt;element name="bifainterpretation-pool" type="{http://vdv/ka/pkm/2}XML-BIFAInterpretation-Pool" minOccurs="0"/&gt;
 *         &lt;element name="nummerninterpretation-pool" type="{http://vdv/ka/pkm/2}XML-Nummerninterpretation-Pool"/&gt;
 *         &lt;element name="bitleisteninterpretation-pool" type="{http://vdv/ka/pkm/2}XML-Bitleisteninterpretation-Pool" minOccurs="0"/&gt;
 *         &lt;element name="raumnummerninterpretation-pool" type="{http://vdv/ka/pkm/2}XML-Raumnummerninterpretation-Pool" minOccurs="0"/&gt;
 *         &lt;element name="schluessel-pool" type="{http://vdv/ka/pkm/2}XML-Schluessel-Pool"/&gt;
 *         &lt;element name="tarifmodul-pool" type="{http://vdv/ka/pkm/2}XML-Tarifmodul-Pool" minOccurs="0"/&gt;
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
@XmlType(name = "XML-Tarifmodul", propOrder = {
    "version",
    "herausgeber",
    "fachablauf",
    "textMatrix",
    "sprachePool",
    "eingangsschnittstellePool",
    "ausgangsschnittstellePool",
    "ausgangskontextPool",
    "datentabellePool",
    "schrittPool",
    "variablePool",
    "funktionPool",
    "ausnahmePool",
    "auswahldatenPool",
    "auswahloptionPool",
    "ausgangsdatenPool",
    "ausgangsdatenfamiliePool",
    "organisationPool",
    "efmproduktPool",
    "tarifproduktPool",
    "fremdproduktPool",
    "produktadapterPool",
    "produktgruppePool",
    "kontingentierungPool",
    "nachfolgekriteriumPool",
    "abhaengigkeitskriteriumPool",
    "identifikationsparameterPool",
    "identifikationsparameteradapterPool",
    "tarifpunktPool",
    "tarifpunktadapterPool",
    "tarifpunktgruppePool",
    "tarifpunktreferenzPool",
    "tarifpunktreferenzadapterPool",
    "zuordnungstypPool",
    "zuordnungsdatenMatrix",
    "zuordnungsausnahmeMatrix",
    "wegevariantePool",
    "wegevariantenadapterPool",
    "bewertungstypPool",
    "bewertungsdatenPool",
    "bewertungsdatenMatrix",
    "bewertungsausnahmeMatrix",
    "liniePool",
    "linienadapterPool",
    "verkehrsmitteltypPool",
    "verkehrsmitteltypadapterPool",
    "verkehrsmittellinienbezugPool",
    "bezahlartPool",
    "bezahlartadapterPool",
    "waehrungPool",
    "waehrungsadapterPool",
    "zahlungsintervallPool",
    "zahlungsintervalladapterPool",
    "mitnahmetypPool",
    "mitnahmetypadapterPool",
    "rabattmedientypPool",
    "rabattmedientypadapterPool",
    "modulkontextPool",
    "modulkontextadapterPool",
    "spezialbedingungPool",
    "tagesbedingungPool",
    "tageszeitbedingungPool",
    "zeitraumbedingungPool",
    "tarifpunktbedingungPool",
    "bewertungsbedingungPool",
    "geosegmentbedingungPool",
    "verkehrsmittellinienbedingungPool",
    "bezahlartbedingungPool",
    "zahlungsintervallbedingungPool",
    "mitnahmebedingungPool",
    "rabattmedienbedingungPool",
    "modulkontextbedingungPool",
    "bifainterpretationPool",
    "nummerninterpretationPool",
    "bitleisteninterpretationPool",
    "raumnummerninterpretationPool",
    "schluesselPool",
    "tarifmodulPool",
    "kommentarPool",
    "signatur",
    "annotation"
})
@XmlSeeAlso({
    XMLRNTarifmodul.class,
    XMLPVTarifmodul.class
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
public class XMLTarifmodul {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLVersionPart version;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLOrganisationPart herausgeber;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLFachablaufPart fachablauf;
    @XmlElement(name = "text-matrix", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLAusgangstextMatrix textMatrix;
    @XmlElement(name = "sprache-pool", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLSprachePool sprachePool;
    @XmlElement(name = "eingangsschnittstelle-pool", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLEingangsschnittstellePool eingangsschnittstellePool;
    @XmlElement(name = "ausgangsschnittstelle-pool", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLAusgangsschnittstellePool ausgangsschnittstellePool;
    @XmlElement(name = "ausgangskontext-pool", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLAusgangskontextPool ausgangskontextPool;
    @XmlElement(name = "datentabelle-pool", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLDatentabellePool datentabellePool;
    @XmlElement(name = "schritt-pool", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLSchrittPool schrittPool;
    @XmlElement(name = "variable-pool", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLVariablePool variablePool;
    @XmlElement(name = "funktion-pool", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLFunktionPool funktionPool;
    @XmlElement(name = "ausnahme-pool", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLAusnahmePool ausnahmePool;
    @XmlElement(name = "auswahldaten-pool", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLAuswahldatenPool auswahldatenPool;
    @XmlElement(name = "auswahloption-pool", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLAuswahloptionPool auswahloptionPool;
    @XmlElement(name = "ausgangsdaten-pool", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLAusgangsdatenPool ausgangsdatenPool;
    @XmlElement(name = "ausgangsdatenfamilie-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLAusgangsdatenfamiliePool ausgangsdatenfamiliePool;
    @XmlElement(name = "organisation-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLOrganisationPool organisationPool;
    @XmlElement(name = "efmprodukt-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLEFMProduktPool efmproduktPool;
    @XmlElement(name = "tarifprodukt-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLTarifproduktPool tarifproduktPool;
    @XmlElement(name = "fremdprodukt-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLFremdproduktPool fremdproduktPool;
    @XmlElement(name = "produktadapter-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLProduktadapterPool produktadapterPool;
    @XmlElement(name = "produktgruppe-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLProduktgruppePool produktgruppePool;
    @XmlElement(name = "kontingentierung-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLKontingentierungPool kontingentierungPool;
    @XmlElement(name = "nachfolgekriterium-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLNachfolgekriteriumPool nachfolgekriteriumPool;
    @XmlElement(name = "abhaengigkeitskriterium-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLAbhaengigkeitskriteriumPool abhaengigkeitskriteriumPool;
    @XmlElement(name = "identifikationsparameter-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLIdentifikationsparameterPool identifikationsparameterPool;
    @XmlElement(name = "identifikationsparameteradapter-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLIdentifikationsparameteradapterPool identifikationsparameteradapterPool;
    @XmlElement(name = "tarifpunkt-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLTarifpunktPool tarifpunktPool;
    @XmlElement(name = "tarifpunktadapter-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLTarifpunktadapterPool tarifpunktadapterPool;
    @XmlElement(name = "tarifpunktgruppe-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLTarifpunktgruppePool tarifpunktgruppePool;
    @XmlElement(name = "tarifpunktreferenz-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLTarifpunktreferenzPool tarifpunktreferenzPool;
    @XmlElement(name = "tarifpunktreferenzadapter-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLTarifpunktreferenzadapterPool tarifpunktreferenzadapterPool;
    @XmlElement(name = "zuordnungstyp-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLZuordnungstypPool zuordnungstypPool;
    @XmlElement(name = "zuordnungsdaten-matrix")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLZuordnungsdatenMatrix zuordnungsdatenMatrix;
    @XmlElement(name = "zuordnungsausnahme-matrix")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLZuordnungsausnahmeMatrix zuordnungsausnahmeMatrix;
    @XmlElement(name = "wegevariante-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLWegevariantePool wegevariantePool;
    @XmlElement(name = "wegevariantenadapter-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLWegevariantenadapterPool wegevariantenadapterPool;
    @XmlElement(name = "bewertungstyp-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLBewertungstypPool bewertungstypPool;
    @XmlElement(name = "bewertungsdaten-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLBewertungsdatenPool bewertungsdatenPool;
    @XmlElement(name = "bewertungsdaten-matrix")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLBewertungsdatenMatrix bewertungsdatenMatrix;
    @XmlElement(name = "bewertungsausnahme-matrix")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLBewertungsausnahmeMatrix bewertungsausnahmeMatrix;
    @XmlElement(name = "linie-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLLiniePool liniePool;
    @XmlElement(name = "linienadapter-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLLinienadapterPool linienadapterPool;
    @XmlElement(name = "verkehrsmitteltyp-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLVerkehrsmitteltypPool verkehrsmitteltypPool;
    @XmlElement(name = "verkehrsmitteltypadapter-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLVerkehrsmitteltypadapterPool verkehrsmitteltypadapterPool;
    @XmlElement(name = "verkehrsmittellinienbezug-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLVerkehrsmittellinienbezugPool verkehrsmittellinienbezugPool;
    @XmlElement(name = "bezahlart-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLBezahlartPool bezahlartPool;
    @XmlElement(name = "bezahlartadapter-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLBezahlartadapterPool bezahlartadapterPool;
    @XmlElement(name = "waehrung-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLWaehrungPool waehrungPool;
    @XmlElement(name = "waehrungsadapter-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLWaehrungsadapterPool waehrungsadapterPool;
    @XmlElement(name = "zahlungsintervall-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLZahlungsintervallPool zahlungsintervallPool;
    @XmlElement(name = "zahlungsintervalladapter-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLZahlungsintervalladapterPool zahlungsintervalladapterPool;
    @XmlElement(name = "mitnahmetyp-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLMitnahmetypPool mitnahmetypPool;
    @XmlElement(name = "mitnahmetypadapter-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLMitnahmetypadapterPool mitnahmetypadapterPool;
    @XmlElement(name = "rabattmedientyp-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRabattmedientypPool rabattmedientypPool;
    @XmlElement(name = "rabattmedientypadapter-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRabattmedientypadapterPool rabattmedientypadapterPool;
    @XmlElement(name = "modulkontext-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLModulkontextPool modulkontextPool;
    @XmlElement(name = "modulkontextadapter-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLModulkontextadapterPool modulkontextadapterPool;
    @XmlElement(name = "spezialbedingung-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLSpezialbedingungPool spezialbedingungPool;
    @XmlElement(name = "tagesbedingung-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLTagesbedingungPool tagesbedingungPool;
    @XmlElement(name = "tageszeitbedingung-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLTageszeitbedingungPool tageszeitbedingungPool;
    @XmlElement(name = "zeitraumbedingung-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLZeitraumbedingungPool zeitraumbedingungPool;
    @XmlElement(name = "tarifpunktbedingung-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLTarifpunktbedingungPool tarifpunktbedingungPool;
    @XmlElement(name = "bewertungsbedingung-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLBewertungsbedingungPool bewertungsbedingungPool;
    @XmlElement(name = "geosegmentbedingung-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLGeosegmentbedingungPool geosegmentbedingungPool;
    @XmlElement(name = "verkehrsmittellinienbedingung-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLVerkehrsmittellinienbedingungPool verkehrsmittellinienbedingungPool;
    @XmlElement(name = "bezahlartbedingung-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLBezahlartbedingungPool bezahlartbedingungPool;
    @XmlElement(name = "zahlungsintervallbedingung-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLZahlungsintervallbedingungPool zahlungsintervallbedingungPool;
    @XmlElement(name = "mitnahmebedingung-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLMitnahmebedingungPool mitnahmebedingungPool;
    @XmlElement(name = "rabattmedienbedingung-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRabattmedienbedingungPool rabattmedienbedingungPool;
    @XmlElement(name = "modulkontextbedingung-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLModulkontextbedingungPool modulkontextbedingungPool;
    @XmlElement(name = "bifainterpretation-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLBIFAInterpretationPool bifainterpretationPool;
    @XmlElement(name = "nummerninterpretation-pool", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLNummerninterpretationPool nummerninterpretationPool;
    @XmlElement(name = "bitleisteninterpretation-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLBitleisteninterpretationPool bitleisteninterpretationPool;
    @XmlElement(name = "raumnummerninterpretation-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLRaumnummerninterpretationPool raumnummerninterpretationPool;
    @XmlElement(name = "schluessel-pool", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLSchluesselPool schluesselPool;
    @XmlElement(name = "tarifmodul-pool")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLTarifmodulPool tarifmodulPool;
    @XmlElement(name = "kommentar-pool", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLKommentarPool kommentarPool;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLSignaturPart signatur;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    protected XMLAnnotationPart annotation;

    /**
     * Ruft den Wert der version-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLVersionPart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLVersionPart getVersion() {
        return version;
    }

    /**
     * Legt den Wert der version-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLVersionPart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setVersion(XMLVersionPart value) {
        this.version = value;
    }

    /**
     * Ruft den Wert der herausgeber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLOrganisationPart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLOrganisationPart getHerausgeber() {
        return herausgeber;
    }

    /**
     * Legt den Wert der herausgeber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLOrganisationPart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setHerausgeber(XMLOrganisationPart value) {
        this.herausgeber = value;
    }

    /**
     * Ruft den Wert der fachablauf-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLFachablaufPart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLFachablaufPart getFachablauf() {
        return fachablauf;
    }

    /**
     * Legt den Wert der fachablauf-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLFachablaufPart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setFachablauf(XMLFachablaufPart value) {
        this.fachablauf = value;
    }

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

    /**
     * Ruft den Wert der sprachePool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLSprachePool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLSprachePool getSprachePool() {
        return sprachePool;
    }

    /**
     * Legt den Wert der sprachePool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLSprachePool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setSprachePool(XMLSprachePool value) {
        this.sprachePool = value;
    }

    /**
     * Ruft den Wert der eingangsschnittstellePool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLEingangsschnittstellePool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLEingangsschnittstellePool getEingangsschnittstellePool() {
        return eingangsschnittstellePool;
    }

    /**
     * Legt den Wert der eingangsschnittstellePool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLEingangsschnittstellePool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setEingangsschnittstellePool(XMLEingangsschnittstellePool value) {
        this.eingangsschnittstellePool = value;
    }

    /**
     * Ruft den Wert der ausgangsschnittstellePool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLAusgangsschnittstellePool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLAusgangsschnittstellePool getAusgangsschnittstellePool() {
        return ausgangsschnittstellePool;
    }

    /**
     * Legt den Wert der ausgangsschnittstellePool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLAusgangsschnittstellePool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setAusgangsschnittstellePool(XMLAusgangsschnittstellePool value) {
        this.ausgangsschnittstellePool = value;
    }

    /**
     * Ruft den Wert der ausgangskontextPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLAusgangskontextPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLAusgangskontextPool getAusgangskontextPool() {
        return ausgangskontextPool;
    }

    /**
     * Legt den Wert der ausgangskontextPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLAusgangskontextPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setAusgangskontextPool(XMLAusgangskontextPool value) {
        this.ausgangskontextPool = value;
    }

    /**
     * Ruft den Wert der datentabellePool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLDatentabellePool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLDatentabellePool getDatentabellePool() {
        return datentabellePool;
    }

    /**
     * Legt den Wert der datentabellePool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLDatentabellePool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setDatentabellePool(XMLDatentabellePool value) {
        this.datentabellePool = value;
    }

    /**
     * Ruft den Wert der schrittPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLSchrittPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLSchrittPool getSchrittPool() {
        return schrittPool;
    }

    /**
     * Legt den Wert der schrittPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLSchrittPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setSchrittPool(XMLSchrittPool value) {
        this.schrittPool = value;
    }

    /**
     * Ruft den Wert der variablePool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLVariablePool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLVariablePool getVariablePool() {
        return variablePool;
    }

    /**
     * Legt den Wert der variablePool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLVariablePool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setVariablePool(XMLVariablePool value) {
        this.variablePool = value;
    }

    /**
     * Ruft den Wert der funktionPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLFunktionPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLFunktionPool getFunktionPool() {
        return funktionPool;
    }

    /**
     * Legt den Wert der funktionPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLFunktionPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setFunktionPool(XMLFunktionPool value) {
        this.funktionPool = value;
    }

    /**
     * Ruft den Wert der ausnahmePool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLAusnahmePool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLAusnahmePool getAusnahmePool() {
        return ausnahmePool;
    }

    /**
     * Legt den Wert der ausnahmePool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLAusnahmePool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setAusnahmePool(XMLAusnahmePool value) {
        this.ausnahmePool = value;
    }

    /**
     * Ruft den Wert der auswahldatenPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLAuswahldatenPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLAuswahldatenPool getAuswahldatenPool() {
        return auswahldatenPool;
    }

    /**
     * Legt den Wert der auswahldatenPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLAuswahldatenPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setAuswahldatenPool(XMLAuswahldatenPool value) {
        this.auswahldatenPool = value;
    }

    /**
     * Ruft den Wert der auswahloptionPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLAuswahloptionPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLAuswahloptionPool getAuswahloptionPool() {
        return auswahloptionPool;
    }

    /**
     * Legt den Wert der auswahloptionPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLAuswahloptionPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setAuswahloptionPool(XMLAuswahloptionPool value) {
        this.auswahloptionPool = value;
    }

    /**
     * Ruft den Wert der ausgangsdatenPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLAusgangsdatenPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLAusgangsdatenPool getAusgangsdatenPool() {
        return ausgangsdatenPool;
    }

    /**
     * Legt den Wert der ausgangsdatenPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLAusgangsdatenPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setAusgangsdatenPool(XMLAusgangsdatenPool value) {
        this.ausgangsdatenPool = value;
    }

    /**
     * Ruft den Wert der ausgangsdatenfamiliePool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLAusgangsdatenfamiliePool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLAusgangsdatenfamiliePool getAusgangsdatenfamiliePool() {
        return ausgangsdatenfamiliePool;
    }

    /**
     * Legt den Wert der ausgangsdatenfamiliePool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLAusgangsdatenfamiliePool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setAusgangsdatenfamiliePool(XMLAusgangsdatenfamiliePool value) {
        this.ausgangsdatenfamiliePool = value;
    }

    /**
     * Ruft den Wert der organisationPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLOrganisationPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLOrganisationPool getOrganisationPool() {
        return organisationPool;
    }

    /**
     * Legt den Wert der organisationPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLOrganisationPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setOrganisationPool(XMLOrganisationPool value) {
        this.organisationPool = value;
    }

    /**
     * Ruft den Wert der efmproduktPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLEFMProduktPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLEFMProduktPool getEfmproduktPool() {
        return efmproduktPool;
    }

    /**
     * Legt den Wert der efmproduktPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLEFMProduktPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setEfmproduktPool(XMLEFMProduktPool value) {
        this.efmproduktPool = value;
    }

    /**
     * Ruft den Wert der tarifproduktPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLTarifproduktPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLTarifproduktPool getTarifproduktPool() {
        return tarifproduktPool;
    }

    /**
     * Legt den Wert der tarifproduktPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLTarifproduktPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setTarifproduktPool(XMLTarifproduktPool value) {
        this.tarifproduktPool = value;
    }

    /**
     * Ruft den Wert der fremdproduktPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLFremdproduktPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLFremdproduktPool getFremdproduktPool() {
        return fremdproduktPool;
    }

    /**
     * Legt den Wert der fremdproduktPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLFremdproduktPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setFremdproduktPool(XMLFremdproduktPool value) {
        this.fremdproduktPool = value;
    }

    /**
     * Ruft den Wert der produktadapterPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLProduktadapterPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLProduktadapterPool getProduktadapterPool() {
        return produktadapterPool;
    }

    /**
     * Legt den Wert der produktadapterPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLProduktadapterPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setProduktadapterPool(XMLProduktadapterPool value) {
        this.produktadapterPool = value;
    }

    /**
     * Ruft den Wert der produktgruppePool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLProduktgruppePool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLProduktgruppePool getProduktgruppePool() {
        return produktgruppePool;
    }

    /**
     * Legt den Wert der produktgruppePool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLProduktgruppePool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setProduktgruppePool(XMLProduktgruppePool value) {
        this.produktgruppePool = value;
    }

    /**
     * Ruft den Wert der kontingentierungPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLKontingentierungPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLKontingentierungPool getKontingentierungPool() {
        return kontingentierungPool;
    }

    /**
     * Legt den Wert der kontingentierungPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLKontingentierungPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setKontingentierungPool(XMLKontingentierungPool value) {
        this.kontingentierungPool = value;
    }

    /**
     * Ruft den Wert der nachfolgekriteriumPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLNachfolgekriteriumPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLNachfolgekriteriumPool getNachfolgekriteriumPool() {
        return nachfolgekriteriumPool;
    }

    /**
     * Legt den Wert der nachfolgekriteriumPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLNachfolgekriteriumPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setNachfolgekriteriumPool(XMLNachfolgekriteriumPool value) {
        this.nachfolgekriteriumPool = value;
    }

    /**
     * Ruft den Wert der abhaengigkeitskriteriumPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLAbhaengigkeitskriteriumPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLAbhaengigkeitskriteriumPool getAbhaengigkeitskriteriumPool() {
        return abhaengigkeitskriteriumPool;
    }

    /**
     * Legt den Wert der abhaengigkeitskriteriumPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLAbhaengigkeitskriteriumPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setAbhaengigkeitskriteriumPool(XMLAbhaengigkeitskriteriumPool value) {
        this.abhaengigkeitskriteriumPool = value;
    }

    /**
     * Ruft den Wert der identifikationsparameterPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLIdentifikationsparameterPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLIdentifikationsparameterPool getIdentifikationsparameterPool() {
        return identifikationsparameterPool;
    }

    /**
     * Legt den Wert der identifikationsparameterPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLIdentifikationsparameterPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setIdentifikationsparameterPool(XMLIdentifikationsparameterPool value) {
        this.identifikationsparameterPool = value;
    }

    /**
     * Ruft den Wert der identifikationsparameteradapterPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLIdentifikationsparameteradapterPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLIdentifikationsparameteradapterPool getIdentifikationsparameteradapterPool() {
        return identifikationsparameteradapterPool;
    }

    /**
     * Legt den Wert der identifikationsparameteradapterPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLIdentifikationsparameteradapterPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setIdentifikationsparameteradapterPool(XMLIdentifikationsparameteradapterPool value) {
        this.identifikationsparameteradapterPool = value;
    }

    /**
     * Ruft den Wert der tarifpunktPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLTarifpunktPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLTarifpunktPool getTarifpunktPool() {
        return tarifpunktPool;
    }

    /**
     * Legt den Wert der tarifpunktPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLTarifpunktPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setTarifpunktPool(XMLTarifpunktPool value) {
        this.tarifpunktPool = value;
    }

    /**
     * Ruft den Wert der tarifpunktadapterPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLTarifpunktadapterPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLTarifpunktadapterPool getTarifpunktadapterPool() {
        return tarifpunktadapterPool;
    }

    /**
     * Legt den Wert der tarifpunktadapterPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLTarifpunktadapterPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setTarifpunktadapterPool(XMLTarifpunktadapterPool value) {
        this.tarifpunktadapterPool = value;
    }

    /**
     * Ruft den Wert der tarifpunktgruppePool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLTarifpunktgruppePool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLTarifpunktgruppePool getTarifpunktgruppePool() {
        return tarifpunktgruppePool;
    }

    /**
     * Legt den Wert der tarifpunktgruppePool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLTarifpunktgruppePool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setTarifpunktgruppePool(XMLTarifpunktgruppePool value) {
        this.tarifpunktgruppePool = value;
    }

    /**
     * Ruft den Wert der tarifpunktreferenzPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLTarifpunktreferenzPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLTarifpunktreferenzPool getTarifpunktreferenzPool() {
        return tarifpunktreferenzPool;
    }

    /**
     * Legt den Wert der tarifpunktreferenzPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLTarifpunktreferenzPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setTarifpunktreferenzPool(XMLTarifpunktreferenzPool value) {
        this.tarifpunktreferenzPool = value;
    }

    /**
     * Ruft den Wert der tarifpunktreferenzadapterPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLTarifpunktreferenzadapterPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLTarifpunktreferenzadapterPool getTarifpunktreferenzadapterPool() {
        return tarifpunktreferenzadapterPool;
    }

    /**
     * Legt den Wert der tarifpunktreferenzadapterPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLTarifpunktreferenzadapterPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setTarifpunktreferenzadapterPool(XMLTarifpunktreferenzadapterPool value) {
        this.tarifpunktreferenzadapterPool = value;
    }

    /**
     * Ruft den Wert der zuordnungstypPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLZuordnungstypPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLZuordnungstypPool getZuordnungstypPool() {
        return zuordnungstypPool;
    }

    /**
     * Legt den Wert der zuordnungstypPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLZuordnungstypPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setZuordnungstypPool(XMLZuordnungstypPool value) {
        this.zuordnungstypPool = value;
    }

    /**
     * Ruft den Wert der zuordnungsdatenMatrix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLZuordnungsdatenMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLZuordnungsdatenMatrix getZuordnungsdatenMatrix() {
        return zuordnungsdatenMatrix;
    }

    /**
     * Legt den Wert der zuordnungsdatenMatrix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLZuordnungsdatenMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setZuordnungsdatenMatrix(XMLZuordnungsdatenMatrix value) {
        this.zuordnungsdatenMatrix = value;
    }

    /**
     * Ruft den Wert der zuordnungsausnahmeMatrix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLZuordnungsausnahmeMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLZuordnungsausnahmeMatrix getZuordnungsausnahmeMatrix() {
        return zuordnungsausnahmeMatrix;
    }

    /**
     * Legt den Wert der zuordnungsausnahmeMatrix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLZuordnungsausnahmeMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setZuordnungsausnahmeMatrix(XMLZuordnungsausnahmeMatrix value) {
        this.zuordnungsausnahmeMatrix = value;
    }

    /**
     * Ruft den Wert der wegevariantePool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLWegevariantePool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLWegevariantePool getWegevariantePool() {
        return wegevariantePool;
    }

    /**
     * Legt den Wert der wegevariantePool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLWegevariantePool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setWegevariantePool(XMLWegevariantePool value) {
        this.wegevariantePool = value;
    }

    /**
     * Ruft den Wert der wegevariantenadapterPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLWegevariantenadapterPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLWegevariantenadapterPool getWegevariantenadapterPool() {
        return wegevariantenadapterPool;
    }

    /**
     * Legt den Wert der wegevariantenadapterPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLWegevariantenadapterPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setWegevariantenadapterPool(XMLWegevariantenadapterPool value) {
        this.wegevariantenadapterPool = value;
    }

    /**
     * Ruft den Wert der bewertungstypPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLBewertungstypPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLBewertungstypPool getBewertungstypPool() {
        return bewertungstypPool;
    }

    /**
     * Legt den Wert der bewertungstypPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLBewertungstypPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setBewertungstypPool(XMLBewertungstypPool value) {
        this.bewertungstypPool = value;
    }

    /**
     * Ruft den Wert der bewertungsdatenPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLBewertungsdatenPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLBewertungsdatenPool getBewertungsdatenPool() {
        return bewertungsdatenPool;
    }

    /**
     * Legt den Wert der bewertungsdatenPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLBewertungsdatenPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setBewertungsdatenPool(XMLBewertungsdatenPool value) {
        this.bewertungsdatenPool = value;
    }

    /**
     * Ruft den Wert der bewertungsdatenMatrix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLBewertungsdatenMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLBewertungsdatenMatrix getBewertungsdatenMatrix() {
        return bewertungsdatenMatrix;
    }

    /**
     * Legt den Wert der bewertungsdatenMatrix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLBewertungsdatenMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setBewertungsdatenMatrix(XMLBewertungsdatenMatrix value) {
        this.bewertungsdatenMatrix = value;
    }

    /**
     * Ruft den Wert der bewertungsausnahmeMatrix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLBewertungsausnahmeMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLBewertungsausnahmeMatrix getBewertungsausnahmeMatrix() {
        return bewertungsausnahmeMatrix;
    }

    /**
     * Legt den Wert der bewertungsausnahmeMatrix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLBewertungsausnahmeMatrix }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setBewertungsausnahmeMatrix(XMLBewertungsausnahmeMatrix value) {
        this.bewertungsausnahmeMatrix = value;
    }

    /**
     * Ruft den Wert der liniePool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLLiniePool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLLiniePool getLiniePool() {
        return liniePool;
    }

    /**
     * Legt den Wert der liniePool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLLiniePool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setLiniePool(XMLLiniePool value) {
        this.liniePool = value;
    }

    /**
     * Ruft den Wert der linienadapterPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLLinienadapterPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLLinienadapterPool getLinienadapterPool() {
        return linienadapterPool;
    }

    /**
     * Legt den Wert der linienadapterPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLLinienadapterPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setLinienadapterPool(XMLLinienadapterPool value) {
        this.linienadapterPool = value;
    }

    /**
     * Ruft den Wert der verkehrsmitteltypPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLVerkehrsmitteltypPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLVerkehrsmitteltypPool getVerkehrsmitteltypPool() {
        return verkehrsmitteltypPool;
    }

    /**
     * Legt den Wert der verkehrsmitteltypPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLVerkehrsmitteltypPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setVerkehrsmitteltypPool(XMLVerkehrsmitteltypPool value) {
        this.verkehrsmitteltypPool = value;
    }

    /**
     * Ruft den Wert der verkehrsmitteltypadapterPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLVerkehrsmitteltypadapterPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLVerkehrsmitteltypadapterPool getVerkehrsmitteltypadapterPool() {
        return verkehrsmitteltypadapterPool;
    }

    /**
     * Legt den Wert der verkehrsmitteltypadapterPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLVerkehrsmitteltypadapterPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setVerkehrsmitteltypadapterPool(XMLVerkehrsmitteltypadapterPool value) {
        this.verkehrsmitteltypadapterPool = value;
    }

    /**
     * Ruft den Wert der verkehrsmittellinienbezugPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLVerkehrsmittellinienbezugPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLVerkehrsmittellinienbezugPool getVerkehrsmittellinienbezugPool() {
        return verkehrsmittellinienbezugPool;
    }

    /**
     * Legt den Wert der verkehrsmittellinienbezugPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLVerkehrsmittellinienbezugPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setVerkehrsmittellinienbezugPool(XMLVerkehrsmittellinienbezugPool value) {
        this.verkehrsmittellinienbezugPool = value;
    }

    /**
     * Ruft den Wert der bezahlartPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLBezahlartPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLBezahlartPool getBezahlartPool() {
        return bezahlartPool;
    }

    /**
     * Legt den Wert der bezahlartPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLBezahlartPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setBezahlartPool(XMLBezahlartPool value) {
        this.bezahlartPool = value;
    }

    /**
     * Ruft den Wert der bezahlartadapterPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLBezahlartadapterPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLBezahlartadapterPool getBezahlartadapterPool() {
        return bezahlartadapterPool;
    }

    /**
     * Legt den Wert der bezahlartadapterPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLBezahlartadapterPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setBezahlartadapterPool(XMLBezahlartadapterPool value) {
        this.bezahlartadapterPool = value;
    }

    /**
     * Ruft den Wert der waehrungPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLWaehrungPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLWaehrungPool getWaehrungPool() {
        return waehrungPool;
    }

    /**
     * Legt den Wert der waehrungPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLWaehrungPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setWaehrungPool(XMLWaehrungPool value) {
        this.waehrungPool = value;
    }

    /**
     * Ruft den Wert der waehrungsadapterPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLWaehrungsadapterPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLWaehrungsadapterPool getWaehrungsadapterPool() {
        return waehrungsadapterPool;
    }

    /**
     * Legt den Wert der waehrungsadapterPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLWaehrungsadapterPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setWaehrungsadapterPool(XMLWaehrungsadapterPool value) {
        this.waehrungsadapterPool = value;
    }

    /**
     * Ruft den Wert der zahlungsintervallPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLZahlungsintervallPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLZahlungsintervallPool getZahlungsintervallPool() {
        return zahlungsintervallPool;
    }

    /**
     * Legt den Wert der zahlungsintervallPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLZahlungsintervallPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setZahlungsintervallPool(XMLZahlungsintervallPool value) {
        this.zahlungsintervallPool = value;
    }

    /**
     * Ruft den Wert der zahlungsintervalladapterPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLZahlungsintervalladapterPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLZahlungsintervalladapterPool getZahlungsintervalladapterPool() {
        return zahlungsintervalladapterPool;
    }

    /**
     * Legt den Wert der zahlungsintervalladapterPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLZahlungsintervalladapterPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setZahlungsintervalladapterPool(XMLZahlungsintervalladapterPool value) {
        this.zahlungsintervalladapterPool = value;
    }

    /**
     * Ruft den Wert der mitnahmetypPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLMitnahmetypPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLMitnahmetypPool getMitnahmetypPool() {
        return mitnahmetypPool;
    }

    /**
     * Legt den Wert der mitnahmetypPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLMitnahmetypPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setMitnahmetypPool(XMLMitnahmetypPool value) {
        this.mitnahmetypPool = value;
    }

    /**
     * Ruft den Wert der mitnahmetypadapterPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLMitnahmetypadapterPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLMitnahmetypadapterPool getMitnahmetypadapterPool() {
        return mitnahmetypadapterPool;
    }

    /**
     * Legt den Wert der mitnahmetypadapterPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLMitnahmetypadapterPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setMitnahmetypadapterPool(XMLMitnahmetypadapterPool value) {
        this.mitnahmetypadapterPool = value;
    }

    /**
     * Ruft den Wert der rabattmedientypPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRabattmedientypPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRabattmedientypPool getRabattmedientypPool() {
        return rabattmedientypPool;
    }

    /**
     * Legt den Wert der rabattmedientypPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRabattmedientypPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setRabattmedientypPool(XMLRabattmedientypPool value) {
        this.rabattmedientypPool = value;
    }

    /**
     * Ruft den Wert der rabattmedientypadapterPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRabattmedientypadapterPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRabattmedientypadapterPool getRabattmedientypadapterPool() {
        return rabattmedientypadapterPool;
    }

    /**
     * Legt den Wert der rabattmedientypadapterPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRabattmedientypadapterPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setRabattmedientypadapterPool(XMLRabattmedientypadapterPool value) {
        this.rabattmedientypadapterPool = value;
    }

    /**
     * Ruft den Wert der modulkontextPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLModulkontextPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLModulkontextPool getModulkontextPool() {
        return modulkontextPool;
    }

    /**
     * Legt den Wert der modulkontextPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLModulkontextPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setModulkontextPool(XMLModulkontextPool value) {
        this.modulkontextPool = value;
    }

    /**
     * Ruft den Wert der modulkontextadapterPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLModulkontextadapterPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLModulkontextadapterPool getModulkontextadapterPool() {
        return modulkontextadapterPool;
    }

    /**
     * Legt den Wert der modulkontextadapterPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLModulkontextadapterPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setModulkontextadapterPool(XMLModulkontextadapterPool value) {
        this.modulkontextadapterPool = value;
    }

    /**
     * Ruft den Wert der spezialbedingungPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLSpezialbedingungPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLSpezialbedingungPool getSpezialbedingungPool() {
        return spezialbedingungPool;
    }

    /**
     * Legt den Wert der spezialbedingungPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLSpezialbedingungPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setSpezialbedingungPool(XMLSpezialbedingungPool value) {
        this.spezialbedingungPool = value;
    }

    /**
     * Ruft den Wert der tagesbedingungPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLTagesbedingungPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLTagesbedingungPool getTagesbedingungPool() {
        return tagesbedingungPool;
    }

    /**
     * Legt den Wert der tagesbedingungPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLTagesbedingungPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setTagesbedingungPool(XMLTagesbedingungPool value) {
        this.tagesbedingungPool = value;
    }

    /**
     * Ruft den Wert der tageszeitbedingungPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLTageszeitbedingungPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLTageszeitbedingungPool getTageszeitbedingungPool() {
        return tageszeitbedingungPool;
    }

    /**
     * Legt den Wert der tageszeitbedingungPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLTageszeitbedingungPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setTageszeitbedingungPool(XMLTageszeitbedingungPool value) {
        this.tageszeitbedingungPool = value;
    }

    /**
     * Ruft den Wert der zeitraumbedingungPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLZeitraumbedingungPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLZeitraumbedingungPool getZeitraumbedingungPool() {
        return zeitraumbedingungPool;
    }

    /**
     * Legt den Wert der zeitraumbedingungPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLZeitraumbedingungPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setZeitraumbedingungPool(XMLZeitraumbedingungPool value) {
        this.zeitraumbedingungPool = value;
    }

    /**
     * Ruft den Wert der tarifpunktbedingungPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLTarifpunktbedingungPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLTarifpunktbedingungPool getTarifpunktbedingungPool() {
        return tarifpunktbedingungPool;
    }

    /**
     * Legt den Wert der tarifpunktbedingungPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLTarifpunktbedingungPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setTarifpunktbedingungPool(XMLTarifpunktbedingungPool value) {
        this.tarifpunktbedingungPool = value;
    }

    /**
     * Ruft den Wert der bewertungsbedingungPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLBewertungsbedingungPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLBewertungsbedingungPool getBewertungsbedingungPool() {
        return bewertungsbedingungPool;
    }

    /**
     * Legt den Wert der bewertungsbedingungPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLBewertungsbedingungPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setBewertungsbedingungPool(XMLBewertungsbedingungPool value) {
        this.bewertungsbedingungPool = value;
    }

    /**
     * Ruft den Wert der geosegmentbedingungPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGeosegmentbedingungPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLGeosegmentbedingungPool getGeosegmentbedingungPool() {
        return geosegmentbedingungPool;
    }

    /**
     * Legt den Wert der geosegmentbedingungPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGeosegmentbedingungPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setGeosegmentbedingungPool(XMLGeosegmentbedingungPool value) {
        this.geosegmentbedingungPool = value;
    }

    /**
     * Ruft den Wert der verkehrsmittellinienbedingungPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLVerkehrsmittellinienbedingungPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLVerkehrsmittellinienbedingungPool getVerkehrsmittellinienbedingungPool() {
        return verkehrsmittellinienbedingungPool;
    }

    /**
     * Legt den Wert der verkehrsmittellinienbedingungPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLVerkehrsmittellinienbedingungPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setVerkehrsmittellinienbedingungPool(XMLVerkehrsmittellinienbedingungPool value) {
        this.verkehrsmittellinienbedingungPool = value;
    }

    /**
     * Ruft den Wert der bezahlartbedingungPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLBezahlartbedingungPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLBezahlartbedingungPool getBezahlartbedingungPool() {
        return bezahlartbedingungPool;
    }

    /**
     * Legt den Wert der bezahlartbedingungPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLBezahlartbedingungPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setBezahlartbedingungPool(XMLBezahlartbedingungPool value) {
        this.bezahlartbedingungPool = value;
    }

    /**
     * Ruft den Wert der zahlungsintervallbedingungPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLZahlungsintervallbedingungPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLZahlungsintervallbedingungPool getZahlungsintervallbedingungPool() {
        return zahlungsintervallbedingungPool;
    }

    /**
     * Legt den Wert der zahlungsintervallbedingungPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLZahlungsintervallbedingungPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setZahlungsintervallbedingungPool(XMLZahlungsintervallbedingungPool value) {
        this.zahlungsintervallbedingungPool = value;
    }

    /**
     * Ruft den Wert der mitnahmebedingungPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLMitnahmebedingungPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLMitnahmebedingungPool getMitnahmebedingungPool() {
        return mitnahmebedingungPool;
    }

    /**
     * Legt den Wert der mitnahmebedingungPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLMitnahmebedingungPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setMitnahmebedingungPool(XMLMitnahmebedingungPool value) {
        this.mitnahmebedingungPool = value;
    }

    /**
     * Ruft den Wert der rabattmedienbedingungPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRabattmedienbedingungPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRabattmedienbedingungPool getRabattmedienbedingungPool() {
        return rabattmedienbedingungPool;
    }

    /**
     * Legt den Wert der rabattmedienbedingungPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRabattmedienbedingungPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setRabattmedienbedingungPool(XMLRabattmedienbedingungPool value) {
        this.rabattmedienbedingungPool = value;
    }

    /**
     * Ruft den Wert der modulkontextbedingungPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLModulkontextbedingungPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLModulkontextbedingungPool getModulkontextbedingungPool() {
        return modulkontextbedingungPool;
    }

    /**
     * Legt den Wert der modulkontextbedingungPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLModulkontextbedingungPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setModulkontextbedingungPool(XMLModulkontextbedingungPool value) {
        this.modulkontextbedingungPool = value;
    }

    /**
     * Ruft den Wert der bifainterpretationPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLBIFAInterpretationPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLBIFAInterpretationPool getBifainterpretationPool() {
        return bifainterpretationPool;
    }

    /**
     * Legt den Wert der bifainterpretationPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLBIFAInterpretationPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setBifainterpretationPool(XMLBIFAInterpretationPool value) {
        this.bifainterpretationPool = value;
    }

    /**
     * Ruft den Wert der nummerninterpretationPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLNummerninterpretationPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLNummerninterpretationPool getNummerninterpretationPool() {
        return nummerninterpretationPool;
    }

    /**
     * Legt den Wert der nummerninterpretationPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLNummerninterpretationPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setNummerninterpretationPool(XMLNummerninterpretationPool value) {
        this.nummerninterpretationPool = value;
    }

    /**
     * Ruft den Wert der bitleisteninterpretationPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLBitleisteninterpretationPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLBitleisteninterpretationPool getBitleisteninterpretationPool() {
        return bitleisteninterpretationPool;
    }

    /**
     * Legt den Wert der bitleisteninterpretationPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLBitleisteninterpretationPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setBitleisteninterpretationPool(XMLBitleisteninterpretationPool value) {
        this.bitleisteninterpretationPool = value;
    }

    /**
     * Ruft den Wert der raumnummerninterpretationPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLRaumnummerninterpretationPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLRaumnummerninterpretationPool getRaumnummerninterpretationPool() {
        return raumnummerninterpretationPool;
    }

    /**
     * Legt den Wert der raumnummerninterpretationPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLRaumnummerninterpretationPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setRaumnummerninterpretationPool(XMLRaumnummerninterpretationPool value) {
        this.raumnummerninterpretationPool = value;
    }

    /**
     * Ruft den Wert der schluesselPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLSchluesselPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLSchluesselPool getSchluesselPool() {
        return schluesselPool;
    }

    /**
     * Legt den Wert der schluesselPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLSchluesselPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setSchluesselPool(XMLSchluesselPool value) {
        this.schluesselPool = value;
    }

    /**
     * Ruft den Wert der tarifmodulPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLTarifmodulPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLTarifmodulPool getTarifmodulPool() {
        return tarifmodulPool;
    }

    /**
     * Legt den Wert der tarifmodulPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLTarifmodulPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setTarifmodulPool(XMLTarifmodulPool value) {
        this.tarifmodulPool = value;
    }

    /**
     * Ruft den Wert der kommentarPool-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLKommentarPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLKommentarPool getKommentarPool() {
        return kommentarPool;
    }

    /**
     * Legt den Wert der kommentarPool-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLKommentarPool }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setKommentarPool(XMLKommentarPool value) {
        this.kommentarPool = value;
    }

    /**
     * Ruft den Wert der signatur-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLSignaturPart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLSignaturPart getSignatur() {
        return signatur;
    }

    /**
     * Legt den Wert der signatur-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLSignaturPart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setSignatur(XMLSignaturPart value) {
        this.signatur = value;
    }

    /**
     * Ruft den Wert der annotation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLAnnotationPart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public XMLAnnotationPart getAnnotation() {
        return annotation;
    }

    /**
     * Legt den Wert der annotation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLAnnotationPart }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
    public void setAnnotation(XMLAnnotationPart value) {
        this.annotation = value;
    }

}
