package de.husst.pkm;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;


import jakarta.xml.bind.DatatypeConverter;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class GregorianCalenderAdapter extends XmlAdapter<String, GregorianCalendar> {
	private final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

	@Override
	public GregorianCalendar unmarshal(String xml) throws Exception {
		return (GregorianCalendar) DatatypeConverter.parseDateTime(xml);
	}

	@Override
	public String marshal(GregorianCalendar object) throws Exception {
		return dateFormat.format(object.getTime());
	}
}
