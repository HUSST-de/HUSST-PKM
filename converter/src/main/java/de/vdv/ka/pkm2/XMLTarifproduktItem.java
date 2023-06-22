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
 * <p>Java-Klasse für XML-Tarifprodukt-Item complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="XML-Tarifprodukt-Item"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://vdv/ka/pkm/2}XML-Eigenprodukt-Item"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="nr" type="{http://vdv/ka/pkm/2}XML-IntegerValue"/&gt;
 *           &lt;element name="name" type="{http://vdv/ka/pkm/2}XML-StringValue"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="text-matrix" type="{http://vdv/ka/pkm/2}XML-Ausgangstext-Matrix"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="rueckzahlungsdaten-table" type="{http://vdv/ka/pkm/2}XML-Rueckzahlungsdaten-Table"/&gt;
 *           &lt;element name="rueckzahlungsausnahme-table" type="{http://vdv/ka/pkm/2}XML-Rueckzahlungsausnahme-Table"/&gt;
 *           &lt;element name="ungueltigkeitszeitpunktsdaten-table" type="{http://vdv/ka/pkm/2}XML-Ungueltigkeitszeitpunktsdaten-Table"/&gt;
 *           &lt;element name="ungueltigkeitszeitpunktsausnahme-table" type="{http://vdv/ka/pkm/2}XML-Ungueltigkeitszeitpunktsausnahme-Table"/&gt;
 *           &lt;element name="preisdaten-table" type="{http://vdv/ka/pkm/2}XML-Preisdaten-Table"/&gt;
 *           &lt;element name="preisausnahme-table" type="{http://vdv/ka/pkm/2}XML-Preisausnahme-Table"/&gt;
 *           &lt;element name="gueltigkeitszeitrahmensdaten-table" type="{http://vdv/ka/pkm/2}XML-Gueltigkeitszeitrahmensdaten-Table"/&gt;
 *           &lt;element name="gueltigkeitszeitrahmensausnahme-table" type="{http://vdv/ka/pkm/2}XML-Gueltigkeitszeitrahmensausnahme-Table"/&gt;
 *           &lt;element name="nachfolgedaten-table" type="{http://vdv/ka/pkm/2}XML-Nachfolgedaten-Table"/&gt;
 *           &lt;element name="nachfolgeausnahme-table" type="{http://vdv/ka/pkm/2}XML-Nachfolgeausnahme-Table"/&gt;
 *           &lt;element name="efmprodukt" type="{http://vdv/ka/pkm/2}XML-Ref01"/&gt;
 *           &lt;element name="identifikation" type="{http://vdv/ka/pkm/2}XML-RefSet0N"/&gt;
 *           &lt;element name="kontingentierung" type="{http://vdv/ka/pkm/2}XML-Ref01"/&gt;
 *           &lt;element name="preisanpassung" type="{http://vdv/ka/pkm/2}XML-BooleanValue"/&gt;
 *           &lt;element name="extNr" type="{http://vdv/ka/pkm/2}XML-StringValue"/&gt;
 *           &lt;element name="kontrolle" type="{http://vdv/ka/pkm/2}XML-Produktdaten-Part" minOccurs="0"/&gt;
 *           &lt;element name="erfassung" type="{http://vdv/ka/pkm/2}XML-Produktdaten-Part" minOccurs="0"/&gt;
 *           &lt;element name="anpassung" type="{http://vdv/ka/pkm/2}XML-Produktdaten-Part" minOccurs="0"/&gt;
 *           &lt;element name="darstellung" type="{http://vdv/ka/pkm/2}XML-Produktdaten-Part" minOccurs="0"/&gt;
 *           &lt;element name="produktermittlung" type="{http://vdv/ka/pkm/2}XML-Produktdaten-Part" minOccurs="0"/&gt;
 *           &lt;element name="transaktionsauswertung" type="{http://vdv/ka/pkm/2}XML-Produktdaten-Part" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XML-Tarifprodukt-Item")
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v3.0.0", date = "2022-02-14T02:39:27+01:00")
public class XMLTarifproduktItem
    extends XMLEigenproduktItem
{


}
