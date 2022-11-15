package de.husst.pkm.generator;

import java.sql.Connection;
import java.util.GregorianCalendar;

import de.husst.pkm.PoolKeyManager;
import de.vdv.ka.pkm2.ObjectFactory;
import de.vdv.ka.pkm2.XMLTarifmodul;
import de.vdv.ka.pkm2.XMLVersionPart;

public class VersionPartGenerator extends BaseGenerator {

	public VersionPartGenerator(ObjectFactory of) {
		super(of);
	}

	@Override
	public void process(XMLTarifmodul tarifmodul,PoolKeyManager poolKeyManager,Connection con) {
		System.out.println("generiere XMLVersionPart");
		XMLVersionPart versionPart = of.createXMLVersionPart();

		versionPart.setBearbeiter(makeXMLString("HUSST2PKM"));
		versionPart.setBemerkung(makeXMLString("Automatische Konvertierung aus HUSST-Daten"));
		versionPart.setExternNr(makeXMLInteger(0));
		versionPart.setFreigeber(makeXMLString("HUSST2PKM"));
		versionPart.setGueltigkeitsbeginn(of.createXMLDatetimeValue());
		versionPart.getGueltigkeitsbeginn().setValue(new GregorianCalendar(2022, 1, 1, 0, 0));
		versionPart.setInternNr(makeXMLInteger(0));
		versionPart.setModulnamenszusatz(of.createXMLStringValue());
		versionPart.setModulspezifikation(makeXMLString("1.6.0"));
		versionPart.setModulstatus(makeXMLInteger(1)); // Modulstatus_CODE, 0-undefiniert, 1-Entwurf, 2-Freigegeben
		versionPart.setSpeicherzeitpunkt(of.createXMLDatetimeValue());
		versionPart.getSpeicherzeitpunkt().setValue(new GregorianCalendar());

		tarifmodul.setVersion(versionPart);
	}

}
