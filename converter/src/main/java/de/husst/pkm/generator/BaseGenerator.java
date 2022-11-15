package de.husst.pkm.generator;

import java.sql.Connection;

import de.husst.pkm.PoolKeyManager;
import de.vdv.ka.pkm2.ObjectFactory;
import de.vdv.ka.pkm2.XMLIntegerValue;
import de.vdv.ka.pkm2.XMLStringValue;
import de.vdv.ka.pkm2.XMLTarifmodul;

public abstract class BaseGenerator {

	protected ObjectFactory of;
	
	protected BaseGenerator(ObjectFactory of) {
		this.of=of;
	}
	
	public abstract void process(XMLTarifmodul tarifmodul,PoolKeyManager poolKeyManager,Connection con);
	
	protected XMLStringValue makeXMLString(String value) {
		XMLStringValue xmlStringValue = of.createXMLStringValue();
		xmlStringValue.setValue(value);
		return xmlStringValue;
	}

	protected XMLIntegerValue makeXMLInteger(int value) {
		XMLIntegerValue xmlIntegerValue = of.createXMLIntegerValue();
		xmlIntegerValue.setValue(value);
		return xmlIntegerValue;
	}
}
