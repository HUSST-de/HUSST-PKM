package de.husst.pkm;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

import de.husst.pkm.PoolKeyManager.POOL;
import de.husst.pkm.generator.VersionPartGenerator;
import de.vdv.ka.pkm2.*;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

/**
 *
 * @author OES
 */
public class H2PConverter {

	ObjectFactory of = null;
	Connection con = null;
	PoolKeyManager poolKeyManagerPV = null;
	PoolKeyManager poolKeyManagerRN = null;
	XMLPVTarifmodul pvTm = null;
	XMLRNTarifmodul rnTm = null;
	DatatypeFactory datatypeFactory = DatatypeFactory.newDefaultInstance();

	// generators
	VersionPartGenerator versionPartGenerator = null;
	
	public H2PConverter() {
		of = new ObjectFactory();
		poolKeyManagerPV = new PoolKeyManager();
		poolKeyManagerRN = new PoolKeyManager();
		pvTm = of.createXMLPVTarifmodul();
		rnTm = of.createXMLRNTarifmodul();

		versionPartGenerator = new VersionPartGenerator(of);
	}

	public void generatePKM(File pathToHusstDatabase, File pathToPKMfiles)
			throws JAXBException, ClassNotFoundException, SQLException, IOException, Exception {

		Class.forName("org.sqlite.JDBC");
		con = DriverManager.getConnection("jdbc:sqlite:" + pathToHusstDatabase.getAbsolutePath());

		generatePvTm();
		generateRnTm();

		XMLTarifmodulItem tarifmodulItem = of.createXMLTarifmodulItem();
		rnTm.getTarifmodulPool().getItem().add(tarifmodulItem);
		tarifmodulItem.setTarifmodul(pvTm);

		// write rn Module file
		JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		JAXBElement<XMLRNTarifmodul> xmlRnPm = of.createRntm(rnTm);
		jaxbMarshaller.marshal(xmlRnPm,
				new FileWriter(new File(pathToPKMfiles.getAbsolutePath(), buildRnTmFilename())));

		// write pv Module file
		JAXBElement<XMLPVTarifmodul> xmlPvPm = of.createPvtm(pvTm);
		jaxbMarshaller.marshal(xmlPvPm,
				new FileWriter(new File(pathToPKMfiles.getAbsolutePath(), buildPvTmFilename())));

	}

	private void generateRnTm() {
		// RN Tarifmodul
		rnTm = of.createXMLRNTarifmodul();
		versionPartGenerator.process(rnTm, poolKeyManagerRN, con);
		rnTm.setHerausgeber(of.createXMLOrganisationPart());
		rnTm.setFachablauf(of.createXMLFachablaufPart());
		rnTm.setTextMatrix(of.createXMLAusgangstextMatrix());
		rnTm.setSprachePool(of.createXMLSprachePool());
		rnTm.setEingangsschnittstellePool(of.createXMLEingangsschnittstellePool());
		rnTm.setAusgangsschnittstellePool(of.createXMLAusgangsschnittstellePool());
		rnTm.setAusgangskontextPool(of.createXMLAusgangskontextPool());
		rnTm.setDatentabellePool(of.createXMLDatentabellePool());
		rnTm.setSchrittPool(of.createXMLSchrittPool());
		rnTm.setVariablePool(of.createXMLVariablePool());
		rnTm.setFunktionPool(of.createXMLFunktionPool());
		rnTm.setAusnahmePool(of.createXMLAusnahmePool());
		rnTm.setAuswahldatenPool(of.createXMLAuswahldatenPool());
		rnTm.setAuswahloptionPool(of.createXMLAuswahloptionPool());
		rnTm.setAusgangsdatenPool(of.createXMLAusgangsdatenPool());
		rnTm.setProduktadapterPool(of.createXMLProduktadapterPool());
		rnTm.setIdentifikationsparameteradapterPool(of.createXMLIdentifikationsparameteradapterPool());
		rnTm.setTarifpunktadapterPool(of.createXMLTarifpunktadapterPool());
		rnTm.setTarifpunktreferenzadapterPool(of.createXMLTarifpunktreferenzadapterPool());
		rnTm.setWegevariantenadapterPool(of.createXMLWegevariantenadapterPool());
		rnTm.setLinienadapterPool(of.createXMLLinienadapterPool());
		rnTm.setVerkehrsmitteltypadapterPool(of.createXMLVerkehrsmitteltypadapterPool());
		rnTm.setBezahlartadapterPool(of.createXMLBezahlartadapterPool());
		rnTm.setWaehrungsadapterPool(of.createXMLWaehrungsadapterPool());
		rnTm.setZahlungsintervalladapterPool(of.createXMLZahlungsintervalladapterPool());
		rnTm.setMitnahmetypadapterPool(of.createXMLMitnahmetypadapterPool());
		rnTm.setRabattmedientypadapterPool(of.createXMLRabattmedientypadapterPool());
		rnTm.setModulkontextadapterPool(of.createXMLModulkontextadapterPool());
		rnTm.setNummerninterpretationPool(of.createXMLNummerninterpretationPool());
		rnTm.setSchluesselPool(of.createXMLSchluesselPool());
		rnTm.setTarifmodulPool(of.createXMLTarifmodulPool());
		rnTm.setKommentarPool(of.createXMLKommentarPool());
		rnTm.setSignatur(of.createXMLSignaturPart());
		rnTm.setAnnotation(of.createXMLAnnotationPart());
	}

	private void generatePvTm() throws DatatypeConfigurationException, Exception, SQLException, ParseException {
		// PV Tarifmodul
		versionPartGenerator.process(pvTm, poolKeyManagerPV, con);
		pvTm.setHerausgeber(generateXMLOrganisationPart());
		pvTm.setFachablauf(generateXMLFachablaufPart());
		pvTm.setTextMatrix(generateXMLAusgangstextMatrix());
		pvTm.setSprachePool(generateXMLSprachePool());
		pvTm.setEingangsschnittstellePool(generateXMLEingangsschnittstellePool());
		pvTm.setAusgangsschnittstellePool(generateXMLAusgangsschnittstellePool());
		pvTm.setAusgangskontextPool(generateXMLAusgangskontextPool());
		pvTm.setDatentabellePool(generateXMLDatentabellePool());
		pvTm.setSchrittPool(generateXMLSchrittPool());
		pvTm.setVariablePool(generateXMLVariablePart());
		pvTm.setFunktionPool(generateXMLFunktionPool());
		pvTm.setAusnahmePool(generateXMLAusnahmePool());
		pvTm.setAuswahldatenPool(generateXMLAuswahldatenPool());
		pvTm.setAuswahloptionPool(generateXMLAuswahloptionPool());
		pvTm.setAusgangsdatenPool(generateXMLAusgangsdatenPool());
		pvTm.setAusgangsdatenfamiliePool(generateXMLAusgangsdatenfamiliePool());
		pvTm.setOrganisationPool(generateXMLOrganisationPool());
		pvTm.setBewertungstypPool(generateXMLBewertungstypPool());
		pvTm.setBewertungsbedingungPool(generateXMLBewertungsbedingungPool());
		pvTm.setWaehrungPool(generateXMLWaehrungPool());
		pvTm.setIdentifikationsparameterPool(generateXMLIdentifikationsparameterPool());
		pvTm.setEfmproduktPool(generateXMLEfmProduktPool());
		pvTm.setTarifproduktPool(generateXMLTarifproduktPool());
		pvTm.setFremdproduktPool(generateXMLFremdproduktPool());
		pvTm.setProduktgruppePool(generateXMLProduktgruppePool());
		pvTm.setKontingentierungPool(generateXMLKontigentierungPool());
		pvTm.setNachfolgekriteriumPool(generateXMLNachfolgekriteriumPool());
		pvTm.setAbhaengigkeitskriteriumPool(generateXMLAbhaengigkeitskriteriumPool());
		pvTm.setTarifpunktPool(generateXMLTarifpunktPool());
		pvTm.setTarifpunktgruppePool(generateXMLTarifpunktgruppePool());
		pvTm.setTarifpunktreferenzPool(generateXMLTarifpunktreferenzPool());
		pvTm.setVerkehrsmittellinienbezugPool(generateXMLVerkehrmittellinienbezugPool());
		pvTm.setZuordnungstypPool(generateXMLZuordnungstypPool());
		pvTm.setZuordnungsdatenMatrix(generateXMLZuordnungsdatenMatrix());
		pvTm.setZuordnungsausnahmeMatrix(generateXMLZuordnungsausnahmeMatrix());
		pvTm.setWegevariantePool(generateXMLWegevariantenPool());
		pvTm.setBewertungsdatenPool(generateXMLBewertungsdatenPool());
		pvTm.setBewertungsdatenMatrix(generateXMLBewertungsdatenMatrix());
		generateXMLDatentabelleRelationsmapping();
		pvTm.setBewertungsausnahmeMatrix(generateXMLBewertungsausnahmeMatrix());
		pvTm.setLiniePool(generateXMLLiniePool());
		pvTm.setVerkehrsmitteltypPool(generateXMLVerkehrsmitteltypPool());
		pvTm.setBezahlartPool(generateXMLBezahlartPool());
		pvTm.setZahlungsintervallPool(generateXMLZahlungsintervallPool());
		pvTm.setZahlungsintervallbedingungPool(generateXMLZahlungsintervallbedingungPool());
		pvTm.setMitnahmetypPool(generateXMLMitnahmetypPool());
		pvTm.setRabattmedientypPool(generateXMLRabattmedientypPool());
		pvTm.setModulkontextPool(generateXMLModulkontextPool());
		pvTm.setSpezialbedingungPool(generateXMLSpezialbedingungPool());
		pvTm.setTagesbedingungPool(generateXMLTagesbedingungPool());
		pvTm.setTageszeitbedingungPool(generateXMLTageszeitbedingungPool());
		pvTm.setZeitraumbedingungPool(generateXMLZeitraumbedingungPool());
		pvTm.setTarifpunktbedingungPool(generateXMLTarifpunktbedingungPool());
		pvTm.setGeosegmentbedingungPool(generateXMLGeosegmentbedingungPool());
		pvTm.setVerkehrsmittellinienbedingungPool(generateXMLVerkehsrmittellinienbedingungPool());
		pvTm.setBezahlartbedingungPool(generateXMLBezahlartbedingungPool());
		pvTm.setZahlungsintervallbedingungPool(generateXMLZahlungsintervallbedingungPool());
		pvTm.setMitnahmebedingungPool(generateXMLMitnahmebedingungPool());
		pvTm.setRabattmedienbedingungPool(generateXMLRabattmedienbedingungPool());
		pvTm.setModulkontextbedingungPool(generateXMLModulkontextbedingungPool());
		pvTm.setBifainterpretationPool(generateXMLBIFAInterpretationPool());
		pvTm.setNummerninterpretationPool(generateXMLNummerninterpretationPool());
		pvTm.setBitleisteninterpretationPool(generateXMLBitleisteninterpretationPool());
		pvTm.setRaumnummerninterpretationPool(generateXMLRaumnummerninterpretationPool());
		pvTm.setSchluesselPool(generateXMLSchluesselPool());
		pvTm.setKommentarPool(generateXMLKommentarPool());
		pvTm.setSignatur(generateXMLSignaturePart());
		pvTm.setAnnotation(generateXMLAnnotationPart());

	}

	private void generateXMLDatentabelleRelationsmapping() throws SQLException {
		XMLDatentabelleItem mappingRelationen = pvTm.getDatentabellePool().getItem().stream()
				.filter(dti -> dti.getNr()
						.getValue() == H2PConstants.DATENTABELLE_RELCODES_START_ZIEL_AUF_TP_START_ZIEL_VIATEXT)
				.findFirst().get();

		try (ResultSet rsRelationen = con.createStatement().executeQuery(
				"select r.ID_Relation,ID_RelcodeStart,ID_RelcodeZiel,tr.ID_TarifpunktStart, tr.ID_TarifpunktZiel,r.ID_Via,tr.ViabezeichnungDruck,ps.Bezeichnung,ps.BezeichnungKurz,tr.ID_Tarifart "
						+ "from Relationen r " + "	inner join Relationszuordnungen rz "
						+ "	inner join Teilrelationen tr " + "	inner join Preisstufen ps "
						+ "	on r.ID_Relation=rz.ID_Relation and rz.ID_Teilrelation=tr.ID_Teilrelation and tr.ID_Preisstufe=ps.ID_Preisstufe "
						+ "where r.ID_Zeitraum=1 "
						+ "order by r.ID_RelcodeStart, r.ID_RelcodeZiel,ID_TarifpunktStart,tr.ID_Tarifpunktziel")) {
			int lastRelcodeStart = 0;
			int lastRelcodeZiel = 0;
			XMLArrayValue key = null;
			XMLArrayValue value = null;
			while (rsRelationen.next()) {

				int relcodeStart = H2PConstants.ID_RELCODE_OFFSET + rsRelationen.getInt("ID_RelcodeStart");
				int relcodeZiel = H2PConstants.ID_RELCODE_OFFSET + rsRelationen.getInt("ID_RelcodeZiel");

				if (lastRelcodeStart != relcodeStart || lastRelcodeZiel != relcodeZiel) {
					key = of.createXMLArrayValue();
					value = of.createXMLArrayValue();
					mappingRelationen.getDatensatzkey().getBitsOrTextOrZahl().add(key);
					mappingRelationen.getDatensatzvalue().getBitsOrTextOrZahl().add(value);
					key.getBitsOrTextOrZahl().add(makeXMLInteger(relcodeStart));
					key.getBitsOrTextOrZahl().add(makeXMLInteger(relcodeZiel));
					poolKeyManagerPV.consumeItemKey(rsRelationen.getInt("ID_Relation")); // dummy, wird nie benutzt
					lastRelcodeStart = relcodeStart;
					lastRelcodeZiel = relcodeZiel;
				}
				XMLArrayValue valueArray = of.createXMLArrayValue();
				valueArray.getBitsOrTextOrZahl().add(makeXMLInteger(rsRelationen.getInt("ID_TarifpunktStart")));
				valueArray.getBitsOrTextOrZahl().add(makeXMLInteger(rsRelationen.getInt("ID_TarifpunktZiel")));
				valueArray.getBitsOrTextOrZahl().add(makeXMLInteger(rsRelationen.getInt("ID_Via")));
				valueArray.getBitsOrTextOrZahl().add(makeXMLString(rsRelationen.getString("Bezeichnung")));
				valueArray.getBitsOrTextOrZahl().add(makeXMLString(rsRelationen.getString("BezeichnungKurz")));
				value.getBitsOrTextOrZahl().add(valueArray);

			}
		}
	}

	private String buildPvTmFilename() {
		return "PVTM_0_G220101_0000_E0_0_1.6_Husst Demotarif.xml";
	}

	private String buildRnTmFilename() {
		return "RNTM_0_G220101_0000_E0_0_1.6_Husst Demotarif.xml";
	}

	private XMLAnnotationPart generateXMLAnnotationPart() {
		System.out.println("generiere XMLAnnotationPart");
		XMLAnnotationPart annotationPart = of.createXMLAnnotationPart();
		return annotationPart;
	}

	private XMLSignaturPart generateXMLSignaturePart() {
		System.out.println("generiere XMLSignaturePart");
		XMLSignaturPart signaturePart = of.createXMLSignaturPart();

		return signaturePart;
	}

	private XMLKommentarPool generateXMLKommentarPool() {
		System.out.println("generiere XMLKommentarPool");
		XMLKommentarPool kommentarPool = of.createXMLKommentarPool();

		return kommentarPool;
	}

	private XMLBIFAInterpretationPool generateXMLBIFAInterpretationPool() {
		System.out.println("generiere XMLBIFAInterpretationPool");
		XMLBIFAInterpretationPool BIFAInterpretationPool = of.createXMLBIFAInterpretationPool();
		BIFAInterpretationPool.setKey(poolKeyManagerPV.nextPool(POOL.BIFA_INTERPRETATION));

		return BIFAInterpretationPool;
	}

	private XMLGeosegmentbedingungPool generateXMLGeosegmentbedingungPool() {
		System.out.println("generiere XMLGeosegmentbedingungPool");
		XMLGeosegmentbedingungPool geosegmentbedingungPool = of.createXMLGeosegmentbedingungPool();
		geosegmentbedingungPool.setKey(poolKeyManagerPV.nextPool(POOL.GEOSEGMENTBEDINGUNG));

		return geosegmentbedingungPool;
	}

	private XMLOrganisationPool generateXMLOrganisationPool() throws SQLException {
		System.out.println("generiere XMLOrganisationPool");
		XMLOrganisationPool organisationPool = of.createXMLOrganisationPool();

		// TODO: Es gibt pro PV_Tarifmodul genau eine Organisation
		try (ResultSet rsOrganisationPool = con.createStatement()
				.executeQuery("select * from Tarifgebiete where ID_Zeitraum=1")) {
			while (rsOrganisationPool.next()) {
				XMLOrganisationItem organisationItem = of.createXMLOrganisationItem();

				organisationItem.setAnforderung(of.createXMLErgaenzungsanforderungPool());
				organisationItem.getAnforderung().getNr().add(makeXMLInteger(1)); // Ergaenzunganforderung_CODE (1-
																					// keine Ergänzung notwendig)
				organisationItem.setName(makeXMLString("TG " + rsOrganisationPool.getString("Bezeichnung")));
				organisationItem.setNr(makeXMLInteger(rsOrganisationPool.getInt("ID_Tarifgebiet")));

				organisationPool.getItem().add(organisationItem);
				poolKeyManagerPV.consumeItemKey(rsOrganisationPool.getInt("ID_Tarifgebiet"));
			}
		}

		return organisationPool;
	}

	private XMLAusgangsdatenPool generateXMLAusgangsdatenPool() throws Exception {
		System.out.println("generiere XMLAusgangsdatenPool");
		XMLAusgangsdatenPool ausgangsdatenPool = of.createXMLAusgangsdatenPool();
		ausgangsdatenPool.setKey(poolKeyManagerPV.nextPool(POOL.AUSGANGSDATEN));

		XMLAusgangssequenzItem ADStartTarifpunktAnzeige = of.createXMLAusgangssequenzItem();
		ADStartTarifpunktAnzeige.setName(makeXMLString("AD-StartTarifpunktAnzeige"));
		ADStartTarifpunktAnzeige.setSequenzMatrix(of.createXMLAusgangssequenzMatrix());
		XMLAusgangssequenzEntry ADStartTarifpunktAnzeigeSeqEntry = of.createXMLAusgangssequenzEntry();
		ADStartTarifpunktAnzeige.getSequenzMatrix().getSequenz().add(ADStartTarifpunktAnzeigeSeqEntry);
		ADStartTarifpunktAnzeigeSeqEntry.setRef(poolKeyManagerPV.getXMLRefByPoolId(POOL.AUSGANGSKONTEXT,
				H2PConstants.POOL_ID_AUSGANGSKONTEXT_TARIFPUNKT_BEZEICHNUNG));
		ADStartTarifpunktAnzeigeSeqEntry.getRefOrText().add(makeXMLString("wandleStartTarifpunktToAnzeigeDaten"));
		ausgangsdatenPool.getItem().add(ADStartTarifpunktAnzeige);
		poolKeyManagerPV.consumeItemKey(1);

		XMLAusgangssequenzItem ADZielTarifpunktAnzeige = of.createXMLAusgangssequenzItem();
		ADZielTarifpunktAnzeige.setName(makeXMLString("AD-ZielTarifpunktAnzeige"));
		ADZielTarifpunktAnzeige.setSequenzMatrix(of.createXMLAusgangssequenzMatrix());
		XMLAusgangssequenzEntry ADZielTarifpunktAnzeigeSeqEntry = of.createXMLAusgangssequenzEntry();
		ADZielTarifpunktAnzeige.getSequenzMatrix().getSequenz().add(ADZielTarifpunktAnzeigeSeqEntry);
		ADZielTarifpunktAnzeigeSeqEntry.setRef(poolKeyManagerPV.getXMLRefByPoolId(POOL.AUSGANGSKONTEXT,
				H2PConstants.POOL_ID_AUSGANGSKONTEXT_TARIFPUNKT_BEZEICHNUNG));
		ADZielTarifpunktAnzeigeSeqEntry.getRefOrText().add(makeXMLString("wandleZieltarifpunltToAnzeigeDaten"));
		ausgangsdatenPool.getItem().add(ADZielTarifpunktAnzeige);
		poolKeyManagerPV.consumeItemKey(2);

		XMLAusgangssequenzItem ADVerkaufsSortengrupperelationAnzeige = of.createXMLAusgangssequenzItem();
		ADVerkaufsSortengrupperelationAnzeige.setName(makeXMLString("AD-VerkaufsSortengrupperelationAnzeige"));
		ADVerkaufsSortengrupperelationAnzeige.setSequenzMatrix(of.createXMLAusgangssequenzMatrix());
		XMLAusgangssequenzEntry ADVerkaufsSortengrupperelationAnzeigeSeqEntry = of.createXMLAusgangssequenzEntry();
		ADVerkaufsSortengrupperelationAnzeige.getSequenzMatrix().getSequenz()
				.add(ADVerkaufsSortengrupperelationAnzeigeSeqEntry);
		ADVerkaufsSortengrupperelationAnzeigeSeqEntry.setRef(poolKeyManagerPV.getXMLRefByPoolId(POOL.AUSGANGSKONTEXT,
				H2PConstants.POOL_ID_AUSGANGSKONTEXT_SORTE_BEZEICHNUNG));
		ADVerkaufsSortengrupperelationAnzeigeSeqEntry.getRefOrText().add(makeXMLString("TODO"));
		ausgangsdatenPool.getItem().add(ADVerkaufsSortengrupperelationAnzeige);
		poolKeyManagerPV.consumeItemKey(3);

		XMLAusgangssequenzItem ADViaAuswahlAnzeige = of.createXMLAusgangssequenzItem();
		ADViaAuswahlAnzeige.setName(makeXMLString("AD-ViaAuswahlAnzeige"));
		ADViaAuswahlAnzeige.setSequenzMatrix(of.createXMLAusgangssequenzMatrix());
		XMLAusgangssequenzEntry ADViaAuswahlAnzeigeSeqEntry = of.createXMLAusgangssequenzEntry();
		ADViaAuswahlAnzeige.getSequenzMatrix().getSequenz().add(ADViaAuswahlAnzeigeSeqEntry);
		ADViaAuswahlAnzeigeSeqEntry.setRef(poolKeyManagerPV.getXMLRefByPoolId(POOL.AUSGANGSKONTEXT,
				H2PConstants.POOL_ID_AUSGANGSKONTEXT_VIA_BEZEICHNUNG));
		ADViaAuswahlAnzeigeSeqEntry.getRefOrText().add(makeXMLString("TODO"));
		ausgangsdatenPool.getItem().add(ADViaAuswahlAnzeige);
		poolKeyManagerPV.consumeItemKey(4);

		return ausgangsdatenPool;
	}

	private XMLAuswahloptionPool generateXMLAuswahloptionPool() {
		System.out.println("generiere XMLAuswahloptionPool");
		XMLAuswahloptionPool auswahloptionPool = of.createXMLAuswahloptionPool();
		auswahloptionPool.setKey(poolKeyManagerPV.nextPool(POOL.AUSWAHLOPTION));

		return auswahloptionPool;
	}

	private XMLSchrittPool generateXMLSchrittPool() {
		System.out.println("generiere XMLSchrittPool");
		XMLSchrittPool schrittPool = of.createXMLSchrittPool();
		schrittPool.setKey(poolKeyManagerPV.nextPool(POOL.SCHRITT));
		return schrittPool;
	}

	private XMLAusgangsschnittstellePool generateXMLAusgangsschnittstellePool() {
		System.out.println("generiere XMLAusgangsschnittstellePool");
		XMLAusgangsschnittstellePool ausgangsschnittstellePool = of.createXMLAusgangsschnittstellePool();
		ausgangsschnittstellePool.setKey(poolKeyManagerPV.nextPool(POOL.AUSGANGSSCHNITTSTELLE));

		// INFO: Die Key Zählung erfolgt erst über alle ausgangsschnittstellen und dann
		// über alle Paramter der Schnittstellen
		// Es müssen also erst alle Schnittstellen definiert werden danach(!) erst die
		// jeweiligen Parameter-Pools
		XMLAusgangsschnittstelleItem ausgangsschnittstelleItem = of.createXMLAusgangsschnittstelleItem();
		ausgangsschnittstelleItem.setNr(makeXMLInteger(1));
		ausgangsschnittstelleItem.setName(makeXMLString("ASST-HUSST Endgerät (Standard)"));
		ausgangsschnittstellePool.getItem().add(ausgangsschnittstelleItem);
		poolKeyManagerPV.consumeItemKey(1);

		// Parameterpool für ausgangsschnittstelle
		XMLAusgangsparameterPool ausgangsparameterPool = of.createXMLAusgangsparameterPool();
		ausgangsparameterPool.setKey(poolKeyManagerPV.nextPool(POOL.AUSGANGSPARAMETER));
		ausgangsschnittstelleItem.setParameterPool(ausgangsparameterPool);

		ausgangsparameterPool.getItem().add(makeXMLAusgangsparamterItem(
				H2PConstants.POOL_ID_AUSGANGSPARAMETER_SORTE_BEZEICHNUNG, "AP-HUSST-Sorte-Bezeichnung"));
		poolKeyManagerPV.consumeItemKey(H2PConstants.POOL_ID_AUSGANGSPARAMETER_SORTE_BEZEICHNUNG);

		ausgangsparameterPool.getItem().add(makeXMLAusgangsparamterItem(
				H2PConstants.POOL_ID_AUSGANGSPARAMETER_SORTE_BEZEICHNUNG_KURZ, "AP-HUSST-Sorte-BezeichnungKurz"));
		poolKeyManagerPV.consumeItemKey(H2PConstants.POOL_ID_AUSGANGSPARAMETER_SORTE_BEZEICHNUNG_KURZ);

		ausgangsparameterPool.getItem()
				.add(makeXMLAusgangsparamterItem(H2PConstants.POOL_ID_AUSGANGSPARAMETER_TARIFPUNKT_START_BEZEICHNUNG,
						"AP-HUSST-Tarifpunkt-Start-Bezeichnung"));
		poolKeyManagerPV.consumeItemKey(H2PConstants.POOL_ID_AUSGANGSPARAMETER_TARIFPUNKT_START_BEZEICHNUNG);

		ausgangsparameterPool.getItem()
				.add(makeXMLAusgangsparamterItem(
						H2PConstants.POOL_ID_AUSGANGSPARAMETER_TARIFPUNKT_START_BEZEICHNUNG_DRUCK,
						"AP-HUSST-Tarifpunkt-Start-BezeichnungDruck"));
		poolKeyManagerPV.consumeItemKey(H2PConstants.POOL_ID_AUSGANGSPARAMETER_TARIFPUNKT_START_BEZEICHNUNG_DRUCK);

		ausgangsparameterPool.getItem()
				.add(makeXMLAusgangsparamterItem(H2PConstants.POOL_ID_AUSGANGSPARAMETER_ORTSPUNKT_START_BEZEICHNUNG,
						"AP-HUSST-Ortspunkt-Start-Bezeichnung"));
		poolKeyManagerPV.consumeItemKey(H2PConstants.POOL_ID_AUSGANGSPARAMETER_ORTSPUNKT_START_BEZEICHNUNG);

		ausgangsparameterPool.getItem()
				.add(makeXMLAusgangsparamterItem(
						H2PConstants.POOL_ID_AUSGANGSPARAMETER_ORTSPUNKT_START_BEZEICHNUNG_KURZ,
						"AP-HUSST-Ortspunkt-Start-BezeichnungKurz"));
		poolKeyManagerPV.consumeItemKey(H2PConstants.POOL_ID_AUSGANGSPARAMETER_ORTSPUNKT_START_BEZEICHNUNG_KURZ);

		ausgangsparameterPool.getItem()
				.add(makeXMLAusgangsparamterItem(
						H2PConstants.POOL_ID_AUSGANGSPARAMETER_ORTSPUNKT_START_BEZEICHNUNG_DRUCK,
						"AP-HUSST-Ortspunkt-Start-BezeichnungDruck"));
		poolKeyManagerPV.consumeItemKey(H2PConstants.POOL_ID_AUSGANGSPARAMETER_ORTSPUNKT_START_BEZEICHNUNG_DRUCK);

		ausgangsparameterPool.getItem()
				.add(makeXMLAusgangsparamterItem(H2PConstants.POOL_ID_AUSGANGSPARAMETER_TARIFPUNKT_ZIEL_BEZEICHNUNG,
						"AP-HUSST-Tarifpunkt-Ziel-Bezeichnung"));
		poolKeyManagerPV.consumeItemKey(H2PConstants.POOL_ID_AUSGANGSPARAMETER_TARIFPUNKT_ZIEL_BEZEICHNUNG);

		ausgangsparameterPool.getItem()
				.add(makeXMLAusgangsparamterItem(
						H2PConstants.POOL_ID_AUSGANGSPARAMETER_TARIFPUNKT_ZIEL_BEZEICHNUNG_DRUCK,
						"AP-HUSST-Tarifpunkt-Ziel-BezeichnungDruck"));
		poolKeyManagerPV.consumeItemKey(H2PConstants.POOL_ID_AUSGANGSPARAMETER_TARIFPUNKT_ZIEL_BEZEICHNUNG_DRUCK);

		ausgangsparameterPool.getItem()
				.add(makeXMLAusgangsparamterItem(H2PConstants.POOL_ID_AUSGANGSPARAMETER_ORTSPUNKT_ZIEL_BEZEICHNUNG,
						"AP-HUSST-Ortspunkt-Ziel-Bezeichnung"));
		poolKeyManagerPV.consumeItemKey(H2PConstants.POOL_ID_AUSGANGSPARAMETER_ORTSPUNKT_ZIEL_BEZEICHNUNG);

		ausgangsparameterPool.getItem()
				.add(makeXMLAusgangsparamterItem(H2PConstants.POOL_ID_AUSGANGSPARAMETER_ORTSPUNKT_ZIEL_BEZEICHNUNG_KURZ,
						"AP-HUSST-Ortspunkt-Ziel-BezeichnungKurz"));
		poolKeyManagerPV.consumeItemKey(H2PConstants.POOL_ID_AUSGANGSPARAMETER_ORTSPUNKT_ZIEL_BEZEICHNUNG_KURZ);

		ausgangsparameterPool.getItem()
				.add(makeXMLAusgangsparamterItem(
						H2PConstants.POOL_ID_AUSGANGSPARAMETER_ORTSPUNKT_ZIEL_BEZEICHNUNG_DRUCK,
						"AP-HUSST-Ortspunkt-Ziel-BezeichnungDruck"));
		poolKeyManagerPV.consumeItemKey(H2PConstants.POOL_ID_AUSGANGSPARAMETER_ORTSPUNKT_ZIEL_BEZEICHNUNG_DRUCK);

		ausgangsparameterPool.getItem().add(makeXMLAusgangsparamterItem(
				H2PConstants.POOL_ID_AUSGANGSPARAMETER_VIA_BEZEICHNUNG, "AP-HUSST-Via-Bezeichnung"));
		poolKeyManagerPV.consumeItemKey(H2PConstants.POOL_ID_AUSGANGSPARAMETER_VIA_BEZEICHNUNG);

		ausgangsparameterPool.getItem().add(makeXMLAusgangsparamterItem(
				H2PConstants.POOL_ID_AUSGANGSPARAMETER_VIA_BEZEICHNUNG_DRUCK, "AP-HUSST-Via-BezeichnungDruck"));
		poolKeyManagerPV.consumeItemKey(H2PConstants.POOL_ID_AUSGANGSPARAMETER_VIA_BEZEICHNUNG_DRUCK);

		ausgangsparameterPool.getItem().add(makeXMLAusgangsparamterItem(
				H2PConstants.POOL_ID_AUSGANGSPARAMETER_VIA_BEZEICHNUNG_DRUCK, "AP-HUSST-Ticket-Sortedrucktext"));
		poolKeyManagerPV.consumeItemKey(H2PConstants.POOL_ID_AUSGANGSPARAMETER_TICKET_SORTEDRUCKTEXT);

		ausgangsparameterPool.getItem().add(makeXMLAusgangsparamterItem(
				H2PConstants.POOL_ID_AUSGANGSPARAMETER_VIA_BEZEICHNUNG_DRUCK, "AP-HUSST-Ticket-Preis"));
		poolKeyManagerPV.consumeItemKey(H2PConstants.POOL_ID_AUSGANGSPARAMETER_TICKET_PREIS);

		ausgangsparameterPool.getItem().add(makeXMLAusgangsparamterItem(
				H2PConstants.POOL_ID_AUSGANGSPARAMETER_VIA_BEZEICHNUNG_DRUCK, "AP-HUSST-Ticket-PreisMwSt"));
		poolKeyManagerPV.consumeItemKey(H2PConstants.POOL_ID_AUSGANGSPARAMETER_TICKET_PREISMWST);

		ausgangsparameterPool.getItem().add(makeXMLAusgangsparamterItem(
				H2PConstants.POOL_ID_AUSGANGSPARAMETER_VIA_BEZEICHNUNG_DRUCK, "AP-HUSST-Ticket-Preisstufedrucktext"));
		poolKeyManagerPV.consumeItemKey(H2PConstants.POOL_ID_AUSGANGSPARAMETER_TICKET_PREISSTUFENDRUCKTEXT);

		ausgangsparameterPool.getItem()
				.add(makeXMLAusgangsparamterItem(H2PConstants.POOL_ID_AUSGANGSPARAMETER_VIA_BEZEICHNUNG_DRUCK,
						"AP-HUSST-Ticket-Gueltigkeitsbeginndrucktext"));
		poolKeyManagerPV.consumeItemKey(H2PConstants.POOL_ID_AUSGANGSPARAMETER_TICKET_GUELTIKEITSBEGINNDRUCKTEXT);

		ausgangsparameterPool.getItem()
				.add(makeXMLAusgangsparamterItem(H2PConstants.POOL_ID_AUSGANGSPARAMETER_VIA_BEZEICHNUNG_DRUCK,
						"AP-HUSST-Ticket-Gueltigkeitsendedrucktext"));
		poolKeyManagerPV.consumeItemKey(H2PConstants.POOL_ID_AUSGANGSPARAMETER_TICKET_GUELTIGKEITSENDEDRUCKTEXT);

		ausgangsparameterPool.getItem()
				.add(makeXMLAusgangsparamterItem(H2PConstants.POOL_ID_AUSGANGSPARAMETER_VIA_BEZEICHNUNG_DRUCK,
						"AP-HUSST-Ticket-StartTarifpunktdrucktext"));
		poolKeyManagerPV.consumeItemKey(H2PConstants.POOL_ID_AUSGANGSPARAMETER_TICKET_STARTTARIFPUNKTDRUCKTEXT);

		ausgangsparameterPool.getItem()
				.add(makeXMLAusgangsparamterItem(H2PConstants.POOL_ID_AUSGANGSPARAMETER_VIA_BEZEICHNUNG_DRUCK,
						"AP-HUSST-Ticket-ZielTarifpunktdrucktext"));
		poolKeyManagerPV.consumeItemKey(H2PConstants.POOL_ID_AUSGANGSPARAMETER_TICKET_ZIELTARIFPUNKTDRUCKTEXT);

		ausgangsparameterPool.getItem().add(makeXMLAusgangsparamterItem(
				H2PConstants.POOL_ID_AUSGANGSPARAMETER_VIA_BEZEICHNUNG_DRUCK, "AP-HUSST-Ticket-Viadrucktext"));
		poolKeyManagerPV.consumeItemKey(H2PConstants.POOL_ID_AUSGANGSPARAMETER_TICKET_VIADRUCKTEXT);

		return ausgangsschnittstellePool;
	}

	private XMLAusgangsparameterItem makeXMLAusgangsparamterItem(int nr, String name) {
		XMLAusgangsparameterItem api = of.createXMLAusgangsparameterItem();
		api.setNr(makeXMLInteger(nr));
		api.setName(makeXMLString(name));
		return api;
	}

	private XMLEingangsschnittstellePool generateXMLEingangsschnittstellePool() {
		System.out.println("generiere XMLEingangsschnittstellePool");
		XMLEingangsschnittstellePool eingangsschnittstellePool = of.createXMLEingangsschnittstellePool();
		eingangsschnittstellePool.setKey(poolKeyManagerPV.nextPool(POOL.EINGANGSSCHNITTSTELLE));

		// Schnittstellen
		XMLEingangsschnittstelleItem eingangsschnittstelleItemHusstStartZielFlach = of
				.createXMLEingangsschnittstelleItem();
		eingangsschnittstelleItemHusstStartZielFlach.setNr(makeXMLInteger(1));
		eingangsschnittstelleItemHusstStartZielFlach.setName(makeXMLString("HusstStartZielFlach"));
		eingangsschnittstellePool.getItem().add(eingangsschnittstelleItemHusstStartZielFlach);
		poolKeyManagerPV.consumeItemKey(1);

		// Parameterpools, das spezielle pool key handling in der ausgangsschnittstelle
		// beschreiben
		XMLEingangsparameterPool epPoolHusstStartZielFlachVerkaufsStandortTyp = of.createXMLEingangsparameterPool();
		epPoolHusstStartZielFlachVerkaufsStandortTyp.setKey(poolKeyManagerPV.nextPool(POOL.EINGANGSPARAMETER));
		eingangsschnittstelleItemHusstStartZielFlach.setParameterPool(epPoolHusstStartZielFlachVerkaufsStandortTyp);

		XMLEingangsparameterItem epiVerkaufsStandortTyp = of.createXMLEingangsparameterItem();
		epiVerkaufsStandortTyp.setNr(makeXMLInteger(1));
		epiVerkaufsStandortTyp.setName(makeXMLString("VerkaufsStandortTyp"));
		epPoolHusstStartZielFlachVerkaufsStandortTyp.getItem().add(epiVerkaufsStandortTyp);
		poolKeyManagerPV.consumeItemKey(1);

		XMLEingangsparameterItem epiVerkaufsStandortSchluessel = of.createXMLEingangsparameterItem();
		epiVerkaufsStandortSchluessel.setNr(makeXMLInteger(2));
		epiVerkaufsStandortSchluessel.setName(makeXMLString("VerkaufsStandortSchluessel"));
		epPoolHusstStartZielFlachVerkaufsStandortTyp.getItem().add(epiVerkaufsStandortSchluessel);
		poolKeyManagerPV.consumeItemKey(2);

		XMLEingangsparameterItem epiRelationStartTarifpunktIndex = of.createXMLEingangsparameterItem();
		epiRelationStartTarifpunktIndex.setNr(makeXMLInteger(3));
		epiRelationStartTarifpunktIndex.setName(makeXMLString("EP.RelationStartTarifpunktIndex"));
		epPoolHusstStartZielFlachVerkaufsStandortTyp.getItem().add(epiRelationStartTarifpunktIndex);
		poolKeyManagerPV.consumeItemKey(3);

		XMLEingangsparameterItem epiRelationZielTarifpunktIndex = of.createXMLEingangsparameterItem();
		epiRelationZielTarifpunktIndex.setNr(makeXMLInteger(4));
		epiRelationZielTarifpunktIndex.setName(makeXMLString("EP.RelationZielTarifpunktIndex"));
		epPoolHusstStartZielFlachVerkaufsStandortTyp.getItem().add(epiRelationZielTarifpunktIndex);
		poolKeyManagerPV.consumeItemKey(4);

		XMLEingangsparameterItem epiRelationViaIndex = of.createXMLEingangsparameterItem();
		epiRelationViaIndex.setNr(makeXMLInteger(5));
		epiRelationViaIndex.setName(makeXMLString("EP.RelationViaIndex"));
		epPoolHusstStartZielFlachVerkaufsStandortTyp.getItem().add(epiRelationViaIndex);
		poolKeyManagerPV.consumeItemKey(5);

		XMLEingangsparameterItem epiVerkaufsSortengruppeRelationIndex = of.createXMLEingangsparameterItem();
		epiVerkaufsSortengruppeRelationIndex.setNr(makeXMLInteger(6));
		epiVerkaufsSortengruppeRelationIndex.setName(makeXMLString("EP.VerkaufsSortengruppeRelationIndex"));
		epPoolHusstStartZielFlachVerkaufsStandortTyp.getItem().add(epiVerkaufsSortengruppeRelationIndex);
		poolKeyManagerPV.consumeItemKey(6);

		return eingangsschnittstellePool;
	}

	private XMLFachablaufPart generateXMLFachablaufPart() {
		System.out.println("generiere XMLFachablaufPart");
		XMLFachablaufPart fachablaufPart = of.createXMLFachablaufPart();
		fachablaufPart.setKontrollstart(of.createXMLRef11());
		fachablaufPart.setErfassungsstart(of.createXMLRef11());
		fachablaufPart.setAnpassungsstart(of.createXMLRef11());
		fachablaufPart.setDarstellungsstart(of.createXMLRef11());
		fachablaufPart.setProduktermittlungsstart(of.createXMLRef11());
		fachablaufPart.setTransaktionsauswertungsstart(of.createXMLRef11());
		fachablaufPart.setPruefungin(of.createXMLRef01());
		fachablaufPart.setPruefungvor(of.createXMLDurationValue());
		fachablaufPart.getPruefungvor().setValue(datatypeFactory.newDuration("P1Y"));
		fachablaufPart.setPruefungnach(of.createXMLDurationValue());
		fachablaufPart.getPruefungnach().setValue(datatypeFactory.newDuration("P1Y"));

		return fachablaufPart;
	}

	private XMLDatentabellePool generateXMLDatentabellePool() {
		System.out.println("generiere XMLDatentabellePool");
		XMLDatentabellePool datentabellePool = of.createXMLDatentabellePool();
		datentabellePool.setKey(poolKeyManagerPV.nextPool(POOL.DATENTABELLE));

		// Sorte Externe Nr auf Tarifprodukt-Nr
		XMLDatentabelleItem datentabelleSorteAufTarifproduktNr = of.createXMLDatentabelleItem();
		datentabelleSorteAufTarifproduktNr
				.setNr(makeXMLInteger(H2PConstants.DATENTABELLE_NR_SORTE_REFEXTERN_TO_PKM_TARIFPRODUKT_NR));
		datentabelleSorteAufTarifproduktNr.setName(makeXMLString("HUSST-Sorte-ReferenzExtern-zu-PKMTarifproduktNr"));
		datentabelleSorteAufTarifproduktNr.setDatensatzkey(of.createXMLArrayValue());
		datentabelleSorteAufTarifproduktNr.setDatensatzvalue(of.createXMLArrayValue());
		datentabellePool.getItem().add(datentabelleSorteAufTarifproduktNr);
		poolKeyManagerPV.consumeItemKey(H2PConstants.DATENTABELLE_NR_SORTE_REFEXTERN_TO_PKM_TARIFPRODUKT_NR);

		// Ortspunkt Externe Nr auf Tarifpunkt-Nr,Bediengebiet
		XMLDatentabelleItem datentabelleOrtspunktRefExternAufTpUndBG = of.createXMLDatentabelleItem();
		datentabelleOrtspunktRefExternAufTpUndBG
				.setNr(makeXMLInteger(H2PConstants.DATENTABELLE_NR_ORTSPUNKT_REFEXTERN_TO_PKM_TARIFPUNKT_NR));
		datentabelleOrtspunktRefExternAufTpUndBG
				.setName(makeXMLString("HUSST-Ortspunkt-ReferenzExtern-zu-PKMTarifpunktNr-Bediengebiet"));
		datentabelleOrtspunktRefExternAufTpUndBG.setDatensatzkey(of.createXMLArrayValue());
		datentabelleOrtspunktRefExternAufTpUndBG.setDatensatzvalue(of.createXMLArrayValue());
		datentabellePool.getItem().add(datentabelleOrtspunktRefExternAufTpUndBG);
		poolKeyManagerPV.consumeItemKey(H2PConstants.DATENTABELLE_NR_ORTSPUNKT_REFEXTERN_TO_PKM_TARIFPUNKT_NR);

		// IBIS Code Nr auf Tarifpunkt-Nr,Bediengebiet
		XMLDatentabelleItem datentabelleOrtspunktIbisCodeAufTpUndBG = of.createXMLDatentabelleItem();
		datentabelleOrtspunktIbisCodeAufTpUndBG
				.setNr(makeXMLInteger(H2PConstants.DATENTABELLE_NR_ORTSPUNKT_IBISCODE_TO_PKM_TARIFPUNKT_NR));
		datentabelleOrtspunktIbisCodeAufTpUndBG
				.setName(makeXMLString("HUSST-Ortspunkt-IBISCode-zu-PKMTarifpunktNr-Bediengebiet"));
		datentabelleOrtspunktIbisCodeAufTpUndBG.setDatensatzkey(of.createXMLArrayValue());
		datentabelleOrtspunktIbisCodeAufTpUndBG.setDatensatzvalue(of.createXMLArrayValue());
		datentabellePool.getItem().add(datentabelleOrtspunktIbisCodeAufTpUndBG);
		poolKeyManagerPV.consumeItemKey(H2PConstants.DATENTABELLE_NR_ORTSPUNKT_IBISCODE_TO_PKM_TARIFPUNKT_NR);

		// Ortspunkt Typ ud Nr auf Tarifpunkt-Nr,Bediengebiet
		XMLDatentabelleItem datentabelleOrtspunktTypNrAufTpUndBG = of.createXMLDatentabelleItem();
		datentabelleOrtspunktTypNrAufTpUndBG
				.setNr(makeXMLInteger(H2PConstants.DATENTABELLE_NR_ORTSPUNKT_TYP_NR_TO_PKM_TARIFPUNKT_NR));
		datentabelleOrtspunktTypNrAufTpUndBG
				.setName(makeXMLString("HUSST-Ortspunkt-Typ-Nr-zu-PKMTarifpunktNr-Bediengebiet"));
		datentabelleOrtspunktTypNrAufTpUndBG.setDatensatzkey(of.createXMLArrayValue());
		datentabelleOrtspunktTypNrAufTpUndBG.setDatensatzvalue(of.createXMLArrayValue());
		datentabellePool.getItem().add(datentabelleOrtspunktTypNrAufTpUndBG);
		poolKeyManagerPV.consumeItemKey(H2PConstants.DATENTABELLE_NR_ORTSPUNKT_TYP_NR_TO_PKM_TARIFPUNKT_NR);

		// OTPTyp,Bediengebiet auf Tarifrelevanterpunkt
		XMLDatentabelleItem datentabelleOTPTypBGAufTarifrelevanterpunkt = of.createXMLDatentabelleItem();
		datentabelleOTPTypBGAufTarifrelevanterpunkt
				.setNr(makeXMLInteger(H2PConstants.DATENTABELLE_OTPTYP_BEDIENGEBIET_TO_TARIFRELEVANTERPUNKT));
		datentabelleOTPTypBGAufTarifrelevanterpunkt
				.setName(makeXMLString("HUSST-OTPTyp-Bediengebiet-zu-Tarifrelevanterpunkt"));
		datentabelleOTPTypBGAufTarifrelevanterpunkt.setDatensatzkey(of.createXMLArrayValue());
		datentabelleOTPTypBGAufTarifrelevanterpunkt.setDatensatzvalue(of.createXMLArrayValue());
		datentabellePool.getItem().add(datentabelleOTPTypBGAufTarifrelevanterpunkt);
		poolKeyManagerPV.consumeItemKey(H2PConstants.DATENTABELLE_OTPTYP_BEDIENGEBIET_TO_TARIFRELEVANTERPUNKT);

		// RelCodeStart,RelCodeZiel auf TarifpunktStart,TarifpunktZiel,Wegevariante
		// (später)
		// HUSST kennt keine Ueber-Tarifpunkte, nur Viatexte. Für jeden Viatext wird
		// eine Wegevariante erstellt
		XMLDatentabelleItem datentabelleRelCodesStartZielAufTpStartZiel = of.createXMLDatentabelleItem();
		datentabelleRelCodesStartZielAufTpStartZiel
				.setNr(makeXMLInteger(H2PConstants.DATENTABELLE_RELCODES_START_ZIEL_AUF_TP_START_ZIEL_VIATEXT));
		datentabelleRelCodesStartZielAufTpStartZiel
				.setName(makeXMLString("HUSST-Relcode-Start-Ziel-auf-Tarifpunkte-Start-Ziel-Viatext"));
		datentabelleRelCodesStartZielAufTpStartZiel.setDatensatzkey(of.createXMLArrayValue());
		datentabelleRelCodesStartZielAufTpStartZiel.setDatensatzvalue(of.createXMLArrayValue());
		datentabellePool.getItem().add(datentabelleRelCodesStartZielAufTpStartZiel);
		poolKeyManagerPV.consumeItemKey(H2PConstants.DATENTABELLE_RELCODES_START_ZIEL_AUF_TP_START_ZIEL_VIATEXT);

		return datentabellePool;
	}

	private XMLAusgangskontextPool generateXMLAusgangskontextPool() throws Exception {
		System.out.println("generiere XMLAusgangskontextPool");
		XMLAusgangskontextPool ausgangskontextPool = of.createXMLAusgangskontextPool();
		ausgangskontextPool.setKey(poolKeyManagerPV.nextPool(POOL.AUSGANGSKONTEXT));

		XMLAusgangskontextItem akiSorteBezeichnung = makeXMLAusgangskontexItem("AK-HUSST-Sorte-Bezeichnung",
				H2PConstants.POOL_ID_AUSGANGSKONTEXT_SORTE_BEZEICHNUNG);
		akiSorteBezeichnung.getParameter().getRef().add(poolKeyManagerPV.getXMLRefByPoolId(POOL.AUSGANGSPARAMETER,
				H2PConstants.POOL_ID_AUSGANGSPARAMETER_SORTE_BEZEICHNUNG));
		ausgangskontextPool.getItem().add(akiSorteBezeichnung);
		poolKeyManagerPV.consumeItemKey(H2PConstants.POOL_ID_AUSGANGSKONTEXT_SORTE_BEZEICHNUNG);

		XMLAusgangskontextItem akiSorteBezeichnungKurz = makeXMLAusgangskontexItem("AK-HUSST-Sorte-BezeichnungKurz",
				H2PConstants.POOL_ID_AUSGANGSKONTEXT_SORTE_BEZEICHNUNG_KURZ);
		akiSorteBezeichnungKurz.getParameter().getRef().add(poolKeyManagerPV.getXMLRefByPoolId(POOL.AUSGANGSPARAMETER,
				H2PConstants.POOL_ID_AUSGANGSPARAMETER_SORTE_BEZEICHNUNG_KURZ));
		ausgangskontextPool.getItem().add(akiSorteBezeichnungKurz);
		poolKeyManagerPV.consumeItemKey(H2PConstants.POOL_ID_AUSGANGSKONTEXT_SORTE_BEZEICHNUNG_KURZ);

		XMLAusgangskontextItem akiTpBezeichung = makeXMLAusgangskontexItem("AK-HUSST-Tarifpunkt-Bezeichnung",
				H2PConstants.POOL_ID_AUSGANGSKONTEXT_TARIFPUNKT_BEZEICHNUNG);
		ausgangskontextPool.getItem().add(akiTpBezeichung);
		akiTpBezeichung.getParameter().getRef().add(poolKeyManagerPV.getXMLRefByPoolId(POOL.AUSGANGSPARAMETER,
				H2PConstants.POOL_ID_AUSGANGSPARAMETER_TARIFPUNKT_START_BEZEICHNUNG));
		akiTpBezeichung.getParameter().getRef().add(poolKeyManagerPV.getXMLRefByPoolId(POOL.AUSGANGSPARAMETER,
				H2PConstants.POOL_ID_AUSGANGSPARAMETER_TARIFPUNKT_ZIEL_BEZEICHNUNG));
		poolKeyManagerPV.consumeItemKey(H2PConstants.POOL_ID_AUSGANGSKONTEXT_TARIFPUNKT_BEZEICHNUNG);

		XMLAusgangskontextItem akiTpBezeichnungDruck = makeXMLAusgangskontexItem("AK-HUSST-Tarifpunkt-BezeichnungDruck",
				H2PConstants.POOL_ID_AUSGANGSKONTEXT_TARIFPUNKT_BEZEICHNUNG_DRUCK);
		ausgangskontextPool.getItem().add(akiTpBezeichnungDruck);
		akiTpBezeichnungDruck.getParameter().getRef().add(poolKeyManagerPV.getXMLRefByPoolId(POOL.AUSGANGSPARAMETER,
				H2PConstants.POOL_ID_AUSGANGSPARAMETER_TARIFPUNKT_START_BEZEICHNUNG_DRUCK));
		akiTpBezeichnungDruck.getParameter().getRef().add(poolKeyManagerPV.getXMLRefByPoolId(POOL.AUSGANGSPARAMETER,
				H2PConstants.POOL_ID_AUSGANGSPARAMETER_TARIFPUNKT_ZIEL_BEZEICHNUNG_DRUCK));
		poolKeyManagerPV.consumeItemKey(H2PConstants.POOL_ID_AUSGANGSKONTEXT_TARIFPUNKT_BEZEICHNUNG_DRUCK);

		XMLAusgangskontextItem akiOtpBezeichnung = makeXMLAusgangskontexItem("AK-HUSST-Ortspunkt-Bezeichnung",
				H2PConstants.POOL_ID_AUSGANGSKONTEXT_ORTSPUNKT_BEZEICHNUNG);
		akiOtpBezeichnung.getParameter().getRef().add(poolKeyManagerPV.getXMLRefByPoolId(POOL.AUSGANGSPARAMETER,
				H2PConstants.POOL_ID_AUSGANGSPARAMETER_ORTSPUNKT_START_BEZEICHNUNG));
		akiOtpBezeichnung.getParameter().getRef().add(poolKeyManagerPV.getXMLRefByPoolId(POOL.AUSGANGSPARAMETER,
				H2PConstants.POOL_ID_AUSGANGSPARAMETER_ORTSPUNKT_ZIEL_BEZEICHNUNG));
		ausgangskontextPool.getItem().add(akiOtpBezeichnung);
		poolKeyManagerPV.consumeItemKey(H2PConstants.POOL_ID_AUSGANGSKONTEXT_ORTSPUNKT_BEZEICHNUNG);

		XMLAusgangskontextItem akiOtpBezeichnungKurz = makeXMLAusgangskontexItem("AK-HUSST-Ortspunkt-BezeichnungKurz",
				H2PConstants.POOL_ID_AUSGANGSKONTEXT_ORTSPUNKT_BEZEICHNUNG_KURZ);
		akiOtpBezeichnungKurz.getParameter().getRef().add(poolKeyManagerPV.getXMLRefByPoolId(POOL.AUSGANGSPARAMETER,
				H2PConstants.POOL_ID_AUSGANGSPARAMETER_ORTSPUNKT_START_BEZEICHNUNG_KURZ));
		akiOtpBezeichnungKurz.getParameter().getRef().add(poolKeyManagerPV.getXMLRefByPoolId(POOL.AUSGANGSPARAMETER,
				H2PConstants.POOL_ID_AUSGANGSPARAMETER_ORTSPUNKT_ZIEL_BEZEICHNUNG_KURZ));
		ausgangskontextPool.getItem().add(akiOtpBezeichnungKurz);
		poolKeyManagerPV.consumeItemKey(H2PConstants.POOL_ID_AUSGANGSKONTEXT_ORTSPUNKT_BEZEICHNUNG_KURZ);

		XMLAusgangskontextItem akiOtpBezeichnungDruck = makeXMLAusgangskontexItem("AK-HUSST-Ortspunkt-BezeichnungDruck",
				H2PConstants.POOL_ID_AUSGANGSKONTEXT_ORTSPUNKT_BEZEICHNUNG_DRUCK);
		akiOtpBezeichnungDruck.getParameter().getRef().add(poolKeyManagerPV.getXMLRefByPoolId(POOL.AUSGANGSPARAMETER,
				H2PConstants.POOL_ID_AUSGANGSPARAMETER_ORTSPUNKT_START_BEZEICHNUNG_DRUCK));
		akiOtpBezeichnungDruck.getParameter().getRef().add(poolKeyManagerPV.getXMLRefByPoolId(POOL.AUSGANGSPARAMETER,
				H2PConstants.POOL_ID_AUSGANGSPARAMETER_ORTSPUNKT_ZIEL_BEZEICHNUNG_DRUCK));
		ausgangskontextPool.getItem().add(akiOtpBezeichnungDruck);
		poolKeyManagerPV.consumeItemKey(H2PConstants.POOL_ID_AUSGANGSKONTEXT_ORTSPUNKT_BEZEICHNUNG_DRUCK);

		XMLAusgangskontextItem akiViaBezeichnung = makeXMLAusgangskontexItem("AK-HUSST-Via-Bezeichnung",
				H2PConstants.POOL_ID_AUSGANGSKONTEXT_VIA_BEZEICHNUNG);
		akiViaBezeichnung.getParameter().getRef().add(poolKeyManagerPV.getXMLRefByPoolId(POOL.AUSGANGSPARAMETER,
				H2PConstants.POOL_ID_AUSGANGSPARAMETER_VIA_BEZEICHNUNG));
		ausgangskontextPool.getItem().add(akiViaBezeichnung);
		poolKeyManagerPV.consumeItemKey(H2PConstants.POOL_ID_AUSGANGSKONTEXT_VIA_BEZEICHNUNG);

		XMLAusgangskontextItem akiViaBezeichnungDruck = makeXMLAusgangskontexItem("AK-HUSST-Via-BezeichnungDruck",
				H2PConstants.POOL_ID_AUSGANGSKONTEXT_VIA_BEZEICHNUNG_DRUCK);
		akiViaBezeichnungDruck.getParameter().getRef().add(poolKeyManagerPV.getXMLRefByPoolId(POOL.AUSGANGSPARAMETER,
				H2PConstants.POOL_ID_AUSGANGSPARAMETER_VIA_BEZEICHNUNG_DRUCK));
		ausgangskontextPool.getItem().add(akiViaBezeichnungDruck);
		poolKeyManagerPV.consumeItemKey(H2PConstants.POOL_ID_AUSGANGSKONTEXT_VIA_BEZEICHNUNG_DRUCK);

		XMLAusgangskontextItem akiTicketDruck = makeXMLAusgangskontexItem("AK-HUSST-Ticket-Druck",
				H2PConstants.POOL_ID_AUSGANGSKONTEXT_TICKET_DRUCK);
		akiTicketDruck.getParameter().getRef().add(poolKeyManagerPV.getXMLRefByPoolId(POOL.AUSGANGSPARAMETER,
				H2PConstants.POOL_ID_AUSGANGSPARAMETER_TICKET_GUELTIGKEITSENDEDRUCKTEXT));
		akiTicketDruck.getParameter().getRef().add(poolKeyManagerPV.getXMLRefByPoolId(POOL.AUSGANGSPARAMETER,
				H2PConstants.POOL_ID_AUSGANGSPARAMETER_TICKET_GUELTIKEITSBEGINNDRUCKTEXT));
		akiTicketDruck.getParameter().getRef().add(poolKeyManagerPV.getXMLRefByPoolId(POOL.AUSGANGSPARAMETER,
				H2PConstants.POOL_ID_AUSGANGSPARAMETER_TICKET_PREIS));
		akiTicketDruck.getParameter().getRef().add(poolKeyManagerPV.getXMLRefByPoolId(POOL.AUSGANGSPARAMETER,
				H2PConstants.POOL_ID_AUSGANGSPARAMETER_TICKET_PREISMWST));
		akiTicketDruck.getParameter().getRef().add(poolKeyManagerPV.getXMLRefByPoolId(POOL.AUSGANGSPARAMETER,
				H2PConstants.POOL_ID_AUSGANGSPARAMETER_TICKET_PREISSTUFENDRUCKTEXT));
		akiTicketDruck.getParameter().getRef().add(poolKeyManagerPV.getXMLRefByPoolId(POOL.AUSGANGSPARAMETER,
				H2PConstants.POOL_ID_AUSGANGSPARAMETER_TICKET_SORTEDRUCKTEXT));
		akiTicketDruck.getParameter().getRef().add(poolKeyManagerPV.getXMLRefByPoolId(POOL.AUSGANGSPARAMETER,
				H2PConstants.POOL_ID_AUSGANGSPARAMETER_TICKET_STARTTARIFPUNKTDRUCKTEXT));
		akiTicketDruck.getParameter().getRef().add(poolKeyManagerPV.getXMLRefByPoolId(POOL.AUSGANGSPARAMETER,
				H2PConstants.POOL_ID_AUSGANGSPARAMETER_TICKET_VIADRUCKTEXT));
		akiTicketDruck.getParameter().getRef().add(poolKeyManagerPV.getXMLRefByPoolId(POOL.AUSGANGSPARAMETER,
				H2PConstants.POOL_ID_AUSGANGSPARAMETER_TICKET_ZIELTARIFPUNKTDRUCKTEXT));
		ausgangskontextPool.getItem().add(akiTicketDruck);
		poolKeyManagerPV.consumeItemKey(H2PConstants.POOL_ID_AUSGANGSKONTEXT_TICKET_DRUCK);

		return ausgangskontextPool;
	}

	private XMLAusgangskontextItem makeXMLAusgangskontexItem(String name, int poolIdItemKey) throws Exception {
		XMLAusgangskontextItem ausgangskontextItem = of.createXMLAusgangskontextItem();
		ausgangskontextItem.setName(makeXMLString(name));
		ausgangskontextItem.setSprache(of.createXMLRefSet1N());
		ausgangskontextItem.setParameter(of.createXMLRefSet1N());
		ausgangskontextItem.getSprache().getRef().add(poolKeyManagerPV.getXMLRefByPoolId(POOL.SPRACHE, 58));

		return ausgangskontextItem;
	}

	private XMLTarifpunktPool generateXMLTarifpunktPool() throws Exception {
		System.out.println("generiere XMLTarifpunktPool");

		XMLTarifpunktPool tpPool = of.createXMLTarifpunktPool();
		tpPool.setKey(poolKeyManagerPV.nextPool(POOL.TARIFPUNKT));
		XMLDatentabelleItem mappingRefExternToTpNr_BG = pvTm.getDatentabellePool().getItem().stream().filter(
				dti -> dti.getNr().getValue() == H2PConstants.DATENTABELLE_NR_ORTSPUNKT_REFEXTERN_TO_PKM_TARIFPUNKT_NR)
				.findFirst().get();
		XMLDatentabelleItem mappingIbisToTpNr_BG = pvTm.getDatentabellePool().getItem().stream().filter(
				dti -> dti.getNr().getValue() == H2PConstants.DATENTABELLE_NR_ORTSPUNKT_IBISCODE_TO_PKM_TARIFPUNKT_NR)
				.findFirst().get();
		XMLDatentabelleItem mappingTypNrToTpNr_BG = pvTm.getDatentabellePool().getItem().stream().filter(
				dti -> dti.getNr().getValue() == H2PConstants.DATENTABELLE_NR_ORTSPUNKT_TYP_NR_TO_PKM_TARIFPUNKT_NR)
				.findFirst().get();
		XMLDatentabelleItem mappingOTPTypBGToTrPkt = pvTm.getDatentabellePool().getItem().stream().filter(
				dti -> dti.getNr().getValue() == H2PConstants.DATENTABELLE_OTPTYP_BEDIENGEBIET_TO_TARIFRELEVANTERPUNKT)
				.findFirst().get();

		try (ResultSet rsHusstTarifpunkte = con.createStatement().executeQuery(
				"select * from Tarifpunkte where ID_Zeitraum=1 order by ID_Tarifpunkttyp,ID_Tarifpunkt,ID_Tarifgebiet")) {
			while (rsHusstTarifpunkte.next()) {
				XMLTarifpunktItem tpItem = of.createXMLTarifpunktItem();

				tpItem.setNr(makeXMLInteger(rsHusstTarifpunkte.getInt("ID_Tarifpunkt")));
				tpItem.setTyp(makeXMLString(
						"Tarifpunkttyp_" + Long.toUnsignedString(rsHusstTarifpunkte.getLong("ID_Tarifpunkttyp"))));
				tpItem.setName(makeXMLString(rsHusstTarifpunkte.getString("Bezeichnung") + " (HUSST Tarifpunkt)"));
				tpItem.setTextMatrix(of.createXMLAusgangstextMatrix());
				tpItem.setGeobezug(of.createXMLGeobezugPart());
				tpItem.getGeobezug().getValue();
				tpItem.setOrtsbezug(of.createXMLStringValue());

				// schreibe bezeichnungen in die ausgangstextmatrix.
				// Referenz auf den Ausgangskontext fehlt noch

				XMLAusgangstextEntry tpName = of.createXMLAusgangstextEntry();
				tpName.setValue(rsHusstTarifpunkte.getString("Bezeichnung"));
				tpName.setRef(poolKeyManagerPV.getXMLRefByPoolId(POOL.AUSGANGSKONTEXT,
						H2PConstants.POOL_ID_AUSGANGSKONTEXT_TARIFPUNKT_BEZEICHNUNG));
				tpItem.getTextMatrix().getText().add(tpName);
				
				XMLAusgangstextEntry tpNameTicket = of.createXMLAusgangstextEntry();
				tpNameTicket.setValue(rsHusstTarifpunkte.getString("Bezeichnung"));
				tpNameTicket.setRef(poolKeyManagerPV.getXMLRefByPoolId(POOL.AUSGANGSKONTEXT,
						H2PConstants.POOL_ID_AUSGANGSKONTEXT_TICKET_DRUCK));
				tpItem.getTextMatrix().getText().add(tpNameTicket);

				tpPool.getItem().add(tpItem);
				poolKeyManagerPV.consumeItemKey(rsHusstTarifpunkte.getInt("ID_Tarifpunkt"));

			}
		}

		// Ortpunkte mit Typ "Ortspunkt_*"
		try (ResultSet rsHusstOrtspunkte = con.createStatement().executeQuery(
				"select * from Ortspunkte where ID_Zeitraum=1 order by ReferenzExtern,ID_Ortspunkttyp,ID_Ortspunkt,ID_Bediengebiet")) {
			while (rsHusstOrtspunkte.next()) {
				XMLTarifpunktItem tpItem = of.createXMLTarifpunktItem();

				tpItem.setNr(makeXMLInteger(makePkmTarifpunktNrFromOrtspunktId(rsHusstOrtspunkte)));
				tpItem.setTyp(makeXMLString(
						"Ortspunkttyp_" + Long.toUnsignedString(rsHusstOrtspunkte.getLong("ID_Ortspunkttyp"))));
				tpItem.setName(makeXMLString(rsHusstOrtspunkte.getString("Bezeichnung") + " (HUSST Ortspunkt)"));
				tpItem.setTextMatrix(of.createXMLAusgangstextMatrix());
				tpItem.setGeobezug(of.createXMLGeobezugPart());
				tpItem.getGeobezug().getValue();
				tpItem.setOrtsbezug(of.createXMLStringValue());

				// schreibe bezeichnungen in die ausgangstextmatrix.
				// Referenz auf den Ausgangskontext fehlt noch
				XMLAusgangstextEntry tpName = of.createXMLAusgangstextEntry();
				tpName.setValue(rsHusstOrtspunkte.getString("Bezeichnung"));
				tpName.setRef(poolKeyManagerPV.getXMLRefByPoolId(POOL.AUSGANGSKONTEXT,
						H2PConstants.POOL_ID_AUSGANGSKONTEXT_ORTSPUNKT_BEZEICHNUNG));
				tpItem.getTextMatrix().getText().add(tpName);

				// erzeuge Mappingtabellen keys
				XMLArrayValue xmlKeyArray = of.createXMLArrayValue();
				xmlKeyArray.getBitsOrTextOrZahl().add(makeXMLInteger(rsHusstOrtspunkte.getInt("ID_Ortspunkttyp")));
				xmlKeyArray.getBitsOrTextOrZahl().add(makeXMLInteger(rsHusstOrtspunkte.getInt("Ortsnummer")));
				mappingTypNrToTpNr_BG.getDatensatzkey().getBitsOrTextOrZahl().add(xmlKeyArray);
				mappingRefExternToTpNr_BG.getDatensatzkey().getBitsOrTextOrZahl()
						.add(makeXMLString(rsHusstOrtspunkte.getString("ReferenzExtern") != null
								? rsHusstOrtspunkte.getString("ReferenzExtern")
								: rsHusstOrtspunkte.getString("Ortsnummer")));
				mappingIbisToTpNr_BG.getDatensatzkey().getBitsOrTextOrZahl()
						.add(makeXMLString(rsHusstOrtspunkte.getString("IBISNr")));

				// Mappingtabellen values
				XMLArrayValue xmlValueArray = of.createXMLArrayValue();
				xmlValueArray.getBitsOrTextOrZahl()
						.add(makeXMLInteger(makePkmTarifpunktNrFromOrtspunktId(rsHusstOrtspunkte)));
				xmlValueArray.getBitsOrTextOrZahl().add(makeXMLInteger(rsHusstOrtspunkte.getInt("ID_Bediengebiet")));
				mappingTypNrToTpNr_BG.getDatensatzvalue().getBitsOrTextOrZahl().add(xmlValueArray);
				mappingRefExternToTpNr_BG.getDatensatzvalue().getBitsOrTextOrZahl().add(xmlValueArray);
				mappingIbisToTpNr_BG.getDatensatzvalue().getBitsOrTextOrZahl().add(xmlValueArray);

				tpPool.getItem().add(tpItem);
				poolKeyManagerPV.consumeItemKey(makePkmTarifpunktNrFromOrtspunktId(rsHusstOrtspunkte));
			}
		}

		// Relationscodes mit Typ "Relationscode"
		try (ResultSet rsHusstRelationscodes = con.createStatement()
				.executeQuery("select * from Relationscodes where ID_Zeitraum=1 order by ID_Relcode")) {
			while (rsHusstRelationscodes.next()) {
				XMLTarifpunktItem tpItem = of.createXMLTarifpunktItem();

				tpItem.setNr(
						makeXMLInteger(H2PConstants.ID_RELCODE_OFFSET + rsHusstRelationscodes.getInt("ID_Relcode")));
				tpItem.setTyp(makeXMLString("Relationscode"));
				tpItem.setName(makeXMLString(rsHusstRelationscodes.getLong("ID_Relcode") + " (HUSST Relationscode)"));
				tpItem.setTextMatrix(of.createXMLAusgangstextMatrix());
				tpItem.setGeobezug(of.createXMLGeobezugPart());
				tpItem.getGeobezug().getValue();
				tpItem.setOrtsbezug(of.createXMLStringValue());

				tpPool.getItem().add(tpItem);
				poolKeyManagerPV
						.consumeItemKey(H2PConstants.ID_RELCODE_OFFSET + rsHusstRelationscodes.getInt("ID_Relcode"));
			}
		}

		// Tarifrelevantepunkte mit Typ "Tarifrelevanterpunkt"
		try (ResultSet rsHusstTarifrelevantepunkte = con.createStatement().executeQuery(
				"select * from Tarifrelevantepunkte where ID_Zeitraum=1 order by ID_Tarifrelevanterpunkt,ID_Ortspunkt")) {
			while (rsHusstTarifrelevantepunkte.next()) {
				XMLTarifpunktItem tpItem = of.createXMLTarifpunktItem();

				tpItem.setNr(makeXMLInteger(H2PConstants.ID_TARIFRELEVANTERPUNKT_OFFSET
						+ rsHusstTarifrelevantepunkte.getInt("ID_Tarifrelevanterpunkt")));
				tpItem.setTyp(makeXMLString("Tarifrelevanterpunkt"));
				tpItem.setName(makeXMLString(
						rsHusstTarifrelevantepunkte.getString("Bezeichnung") + " (HUSST Tarifrelevanterpunkt " + "#"
								+ rsHusstTarifrelevantepunkte.getInt("ID_Tarifrelevanterpunkt") + ")"));
				tpItem.setTextMatrix(of.createXMLAusgangstextMatrix());
				tpItem.setGeobezug(of.createXMLGeobezugPart());
				tpItem.getGeobezug().getValue();
				tpItem.setOrtsbezug(of.createXMLStringValue());

				// schreibe bezeichnungen in die ausgangstextmatrix.
				XMLAusgangstextEntry tpName = of.createXMLAusgangstextEntry();
				tpName.setValue(rsHusstTarifrelevantepunkte.getString("Bezeichnung"));
				tpName.setRef(poolKeyManagerPV.getXMLRefByPoolId(POOL.AUSGANGSKONTEXT,
						H2PConstants.POOL_ID_AUSGANGSKONTEXT_TARIFPUNKT_BEZEICHNUNG));
				tpItem.getTextMatrix().getText().add(tpName);

				tpPool.getItem().add(tpItem);
				poolKeyManagerPV.consumeItemKey(H2PConstants.ID_TARIFRELEVANTERPUNKT_OFFSET
						+ rsHusstTarifrelevantepunkte.getInt("ID_Tarifrelevanterpunkt"));
			}
		}

		// Erzeuge aggegierte Mappingtabelle OTPTyp,Bediengebiet zu Tarifrelevanterpunkt
		try (ResultSet rsHusstTarifrelevantepunkte = con.createStatement().executeQuery(
				"select * from Tarifrelevantepunkte where ID_Zeitraum=1 order by ID_OTPTyp,ID_Bediengebiet,ID_Tarifrelevanterpunkt")) {
			int lastID_OTPTyp = -1;
			int lastID_Bediengebiet = -1;
			XMLArrayValue xmlValueArray = null;
			while (rsHusstTarifrelevantepunkte.next()) {

				int ID_OTPTyp = rsHusstTarifrelevantepunkte.getInt("ID_OTPTyp");
				int ID_Bediengbiet = rsHusstTarifrelevantepunkte.getInt("ID_Bediengebiet");

				// neuer schlüssel ?
				if (lastID_OTPTyp != ID_OTPTyp || lastID_Bediengebiet != ID_Bediengbiet) {
					XMLArrayValue xmlKeyArray = of.createXMLArrayValue();
					xmlValueArray = of.createXMLArrayValue();

					xmlKeyArray.getBitsOrTextOrZahl()
							.add(makeXMLInteger(rsHusstTarifrelevantepunkte.getInt("ID_OTPTyp")));
					xmlKeyArray.getBitsOrTextOrZahl()
							.add(makeXMLInteger(rsHusstTarifrelevantepunkte.getInt("ID_Bediengebiet")));
					mappingOTPTypBGToTrPkt.getDatensatzkey().getBitsOrTextOrZahl().add(xmlKeyArray);
					mappingOTPTypBGToTrPkt.getDatensatzvalue().getBitsOrTextOrZahl().add(xmlValueArray);
				}

				// wert hinzufügen
				xmlValueArray.getBitsOrTextOrZahl().add(makeXMLInteger(H2PConstants.ID_TARIFRELEVANTERPUNKT_OFFSET
						+ rsHusstTarifrelevantepunkte.getInt("ID_Tarifrelevanterpunkt")));

				lastID_OTPTyp = ID_OTPTyp;
				lastID_Bediengebiet = ID_Bediengbiet;
			}
		}
		return tpPool;
	}

	private int makePkmTarifpunktNrFromOrtspunktId(ResultSet rsOrtspunktID) throws SQLException {
		return H2PConstants.ID_ORTSPUNKT_OFFSET + rsOrtspunktID.getInt("ID_Ortspunkt");
	}

	private XMLVersionPart generateXMLVersionPart() throws DatatypeConfigurationException {
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
		return versionPart;
	}

	private XMLOrganisationPart generateXMLOrganisationPart() {
		// TODO: Die Org-ID muss als Übergabeparameter kommen, erstmal HUSST als Dummy
		// mit der 0
		System.out.println("generiere XMLOrganisationPart");
		XMLOrganisationPart organisationPart = of.createXMLOrganisationPart();

		organisationPart.setNr(makeXMLInteger(0));
		organisationPart.setName(makeXMLString("HUSST"));

		return organisationPart;
	}

	private XMLAusgangstextMatrix generateXMLAusgangstextMatrix() {
		System.out.println("generiere XMLAusgangstextMatrix");
		XMLAusgangstextMatrix ausgangsMatrix = of.createXMLAusgangstextMatrix();
		return ausgangsMatrix;
	}

	private XMLSprachePool generateXMLSprachePool() {
		System.out.println("generiere XMLSprachePool");
		XMLSprachePool sprachePool = of.createXMLSprachePool();
		sprachePool.setKey(poolKeyManagerPV.nextPool(POOL.SPRACHE));

		XMLSpracheItem spracheItem = of.createXMLSpracheItem();
		spracheItem.setNr(makeXMLInteger(58));
		spracheItem.setName(makeXMLString("Deutsch"));
		sprachePool.getItem().add(spracheItem);

		// pool key is der gleiche
		poolKeyManagerPV.consumeItemKey(58);

		return sprachePool;
	}

	private XMLVariablePool generateXMLVariablePart() {
		System.out.println("generiere XMLVariablePart");
		XMLVariablePool variablePool = of.createXMLVariablePool();
		variablePool.setKey(poolKeyManagerPV.nextPool(POOL.VARIABLE));

		return variablePool;
	}

	private XMLFunktionPool generateXMLFunktionPool() {
		System.out.println("generiere XMLFunktionPool");
		XMLFunktionPool funktionPool = of.createXMLFunktionPool();
		funktionPool.setKey(poolKeyManagerPV.nextPool(POOL.FUNKTION));

		return funktionPool;
	}

	private XMLAusnahmePool generateXMLAusnahmePool() {
		System.out.println("generiere XMLAusnahmePool");
		XMLAusnahmePool ausnahmePool = of.createXMLAusnahmePool();
		ausnahmePool.setKey(poolKeyManagerPV.nextPool(POOL.AUSNAHME));

		return ausnahmePool;
	}

	private XMLAuswahldatenPool generateXMLAuswahldatenPool() {
		System.out.println("generiere XMLAuswahldatenPool");
		XMLAuswahldatenPool auswahldatenPool = of.createXMLAuswahldatenPool();
		auswahldatenPool.setKey(poolKeyManagerPV.nextPool(POOL.AUSWAHLDATEN));

		return auswahldatenPool;
	}

	private XMLAusgangsdatenfamiliePool generateXMLAusgangsdatenfamiliePool() {
		System.out.println("generiere XMLAusgangsdatenfamiliePool");
		XMLAusgangsdatenfamiliePool ausgangsdatenfamiliePool = of.createXMLAusgangsdatenfamiliePool();
		ausgangsdatenfamiliePool.setKey(poolKeyManagerPV.nextPool(POOL.AUSGANGSDATENFAMILIE));

		return ausgangsdatenfamiliePool;
	}

	private XMLAbhaengigkeitskriteriumPool generateXMLAbhaengigkeitskriteriumPool() {
		System.out.println("generiere XMLAbhaengigkeitskriteriumPool");
		XMLAbhaengigkeitskriteriumPool abhaengigkeitskriteriumPool = of.createXMLAbhaengigkeitskriteriumPool();
		abhaengigkeitskriteriumPool.setKey(poolKeyManagerPV.nextPool(POOL.ABHÄNGIGKEITSKRITERIUM));

		return abhaengigkeitskriteriumPool;
	}

	private XMLIdentifikationsparameterPool generateXMLIdentifikationsparameterPool() throws Exception {
		System.out.println("generiere XMLIdentifikationsparameterPool");
		XMLIdentifikationsparameterPool identifikationsparameterPool = of.createXMLIdentifikationsparameterPool();
		identifikationsparameterPool.setKey(poolKeyManagerPV.nextPool(POOL.IDENTIFIKATIONSPARAMETER));

		// TODO: Die Identifikationsparameterwerte dürfen nur geschrieben werden, wenn
		// es Werte dazu in den Daten gibt.
		// Zuerst müssen die Identifikationsparemter vollständig erzeugt werden und
		// danach erst die dazugehörigen Werte
		// damit die einzelnen XML Pools passen

		// 100 - Sortengruppe
		XMLIdentifikationsparameterItem ipiSortengruppe = of.createXMLIdentifikationsparameterItem();
		ipiSortengruppe.setNr(of.createXMLIntegerValue());
		ipiSortengruppe.getNr().setValue(H2PConstants.IDENTIFIKATIONSPARAMETER_SORTENGRUPPE_NR);
		ipiSortengruppe.setName(of.createXMLStringValue());
		ipiSortengruppe.getName().setValue("Sortengruppe");
		identifikationsparameterPool.getItem().add(ipiSortengruppe);
		poolKeyManagerPV.consumeItemKey(H2PConstants.IDENTIFIKATIONSPARAMETER_SORTENGRUPPE_NR);

		// 101 - Tarifart
		XMLIdentifikationsparameterItem ipiTarifart = of.createXMLIdentifikationsparameterItem();
		ipiTarifart.setNr(of.createXMLIntegerValue());
		ipiTarifart.getNr().setValue(H2PConstants.IDENTIFIKATIONSPARAMETER_TARIFART_NR);
		ipiTarifart.setName(of.createXMLStringValue());
		ipiTarifart.getName().setValue("Tarifart");
		identifikationsparameterPool.getItem().add(ipiTarifart);
		poolKeyManagerPV.consumeItemKey(H2PConstants.IDENTIFIKATIONSPARAMETER_TARIFART_NR);

//        // 100 - Preisspalte1
//        XMLIdentifikationsparameterItem ipiPreisspalte1 = of.createXMLIdentifikationsparameterItem();
//        ipiPreisspalte1.setNr(of.createXMLIntegerValue());
//        ipiPreisspalte1.getNr().setValue(100);
//        ipiPreisspalte1.setName(of.createXMLStringValue());
//        ipiPreisspalte1.getName().setValue("Preisspalte 1");
//        identifikationsparameterPool.getItem().add(ipiPreisspalte1);
//        poolKeyManager.consumeItemKey(101);
//
//        // 101 - Komfortklassen
//        XMLIdentifikationsparameterItem ipiKomfortklassen = of.createXMLIdentifikationsparameterItem();
//        ipiKomfortklassen.setNr(of.createXMLIntegerValue());
//        ipiKomfortklassen.getNr().setValue(101);
//        ipiKomfortklassen.setName(of.createXMLStringValue());
//        ipiKomfortklassen.getName().setValue("Komfortklassen");
//        identifikationsparameterPool.getItem().add(ipiKomfortklassen);
//        poolKeyManager.consumeItemKey(102);
//
//        // 102 - Fahrgasttypen
//        XMLIdentifikationsparameterItem ipiFahrgasttypen = of.createXMLIdentifikationsparameterItem();
//        ipiFahrgasttypen.setNr(of.createXMLIntegerValue());
//        ipiFahrgasttypen.getNr().setValue(102);
//        ipiFahrgasttypen.setName(of.createXMLStringValue());
//        ipiFahrgasttypen.getName().setValue("Fahrgasttyp");
//        identifikationsparameterPool.getItem().add(ipiFahrgasttypen);
//        poolKeyManager.consumeItemKey(103);
//
//        // 103 - Rabattklassen
//        XMLIdentifikationsparameterItem ipiRabattklassen = of.createXMLIdentifikationsparameterItem();
//        ipiRabattklassen.setNr(of.createXMLIntegerValue());
//        ipiRabattklassen.getNr().setValue(103);
//        ipiRabattklassen.setName(of.createXMLStringValue());
//        ipiRabattklassen.getName().setValue("Rabattklassen");
//        identifikationsparameterPool.getItem().add(ipiRabattklassen);
//        poolKeyManager.consumeItemKey(104);
//
//        // 104 - Reisetypen
//        XMLIdentifikationsparameterItem ipiReisetypen = of.createXMLIdentifikationsparameterItem();
//        ipiReisetypen.setNr(of.createXMLIntegerValue());
//        ipiReisetypen.getNr().setValue(104);
//        ipiReisetypen.setName(of.createXMLStringValue());
//        ipiReisetypen.getName().setValue("Reisetypen");
//        identifikationsparameterPool.getItem().add(ipiReisetypen);
//        poolKeyManager.consumeItemKey(105);

		// Werte für die Sortengruppen (100)
		XMLIdentifikationsparameterwertPool ipiSortengruppenWertPool = of.createXMLIdentifikationsparameterwertPool();
		ipiSortengruppenWertPool.setKey(poolKeyManagerPV.nextPool(POOL.IDENTIFIKATIONSPARAMETERWERT_SORTENGRUPPE));
		ipiSortengruppe.setWertPool(ipiSortengruppenWertPool);
		PreparedStatement psSortengruppen = con.prepareStatement("select * from Sortengruppen where ID_Zeitraum=1");
		try (ResultSet rsSortengruppen = psSortengruppen.executeQuery()) {
			// iterate through data
			while (rsSortengruppen.next()) {
				XMLIdentifikationsparameterwertItem ipiSortengruppeWert = of
						.createXMLIdentifikationsparameterwertItem();

				ipiSortengruppeWert.setNr(makeXMLInteger(rsSortengruppen.getInt("ID_Sortengruppe")));
				ipiSortengruppeWert.setName(makeXMLString(rsSortengruppen.getString("Bezeichnung")));
				ipiSortengruppeWert.setTextMatrix(of.createXMLAusgangstextMatrix());

				ipiSortengruppenWertPool.getItem().add(ipiSortengruppeWert);
				poolKeyManagerPV.consumeItemKey(rsSortengruppen.getInt("ID_Sortengruppe"));
			}
		}

		// Werte für die Tarifarten (101)
		XMLIdentifikationsparameterwertPool ipiTarifartenWertPool = of.createXMLIdentifikationsparameterwertPool();
		ipiTarifartenWertPool.setKey(poolKeyManagerPV.nextPool(POOL.IDENTIFIKATIONSPARAMETERWERT_TARIFART));
		ipiTarifart.setWertPool(ipiTarifartenWertPool);
		PreparedStatement psTarifarten = con.prepareStatement(
				"select ID_Tarifart,Bezeichnung from Tarifarten where ID_Zeitraum=1 and ID_Tarifgebiet=1");
		try (ResultSet rsTarifarten = psTarifarten.executeQuery()) {
			// iterate through data
			while (rsTarifarten.next()) {
				XMLIdentifikationsparameterwertItem ipiTarifartWert = of.createXMLIdentifikationsparameterwertItem();

				ipiTarifartWert.setNr(makeXMLInteger(rsTarifarten.getInt("ID_Tarifart")));
				ipiTarifartWert.setName(makeXMLString(rsTarifarten.getString("Bezeichnung")));
				ipiTarifartWert.setTextMatrix(of.createXMLAusgangstextMatrix());

				ipiTarifartenWertPool.getItem().add(ipiTarifartWert);
				poolKeyManagerPV.consumeItemKey(rsTarifarten.getInt("ID_Tarifart"));
			}
		}

//
//        // Wert für die Komfortklassen 	
//        XMLIdentifikationsparameterwertPool ipiwKomfortklassenPool = of.createXMLIdentifikationsparameterwertPool();
//        PreparedStatement psKomfortklassen = con
//                .prepareStatement("select * from DefKomfortklassen where ID_Zeitraum=1");
//        try (ResultSet rsKomfortklassen = psKomfortklassen.executeQuery()) {
//        	// init key pool, if data is available
//        	if(rsKomfortklassen.isBeforeFirst()) {
//                ipiwKomfortklassenPool.setKey(poolKeyManager.nextPool(POOL.IDENTIFIKATIONSPARAMETERWERT));        		
//                ipiKomfortklassen.setWertPool(ipiwKomfortklassenPool);
//        	}
//        	// iterate through data
//            while (rsKomfortklassen.next()) {
//                XMLIdentifikationsparameterwertItem ipiwKomfortklasse = of
//                        .createXMLIdentifikationsparameterwertItem();
//
//                ipiwKomfortklasse.setNr(of.createXMLIntegerValue());
//                ipiwKomfortklasse.getNr().setValue(rsKomfortklassen.getInt("ID_Komfortklasse"));
//                ipiwKomfortklasse.setName(of.createXMLStringValue());
//                ipiwKomfortklasse.getName().setValue(rsKomfortklassen.getString("Bezeichnung"));
//
//                ipiwKomfortklassenPool.getItem().add(ipiwKomfortklasse);
//                poolKeyManager.consumeItemKey(rsKomfortklassen.getInt("ID_Komfortklasse"));
//            }
//        }
//
//        // TODO: Analog für Fahrgasttypen, Rabattklassen und Reisetypen

		return identifikationsparameterPool;
	}

	private XMLEFMProduktPool generateXMLEfmProduktPool() throws SQLException {
		System.out.println("generiere XMLEfmProduktPool");
		XMLEFMProduktPool pvKmEfmProduktPool = of.createXMLEFMProduktPool();
		pvKmEfmProduktPool.setKey(poolKeyManagerPV.nextPool(POOL.EFMPRODUKT));

		return pvKmEfmProduktPool;
	}

	private XMLTarifproduktPool generateXMLTarifproduktPool() throws SQLException, Exception {
		System.out.println("generiere XMLTarifproduktPool");
		XMLTarifproduktPool pvKmTarifproduktPool = of.createXMLTarifproduktPool();
		pvKmTarifproduktPool.setKey(poolKeyManagerPV.nextPool(POOL.TARIFPRODUKT));
		XMLDatentabelleItem mappingExtRefToId = pvTm.getDatentabellePool().getItem().stream().filter(
				dti -> dti.getNr().getValue() == H2PConstants.DATENTABELLE_NR_SORTE_REFEXTERN_TO_PKM_TARIFPRODUKT_NR)
				.findFirst().get();

		PreparedStatement psTarifprodukte = con.prepareStatement("select s.*,sge.ID_Sortengruppe,sa.ID_Tarifart "
				+ "from Sorten s " + "	left outer join SortengruppenElemente sge on s.ID_Sorte=sge.ID_Sorte "
				+ "	left outer join SortenTarifarten sa on s.ID_Sorte=sa.ID_Sorte "
				+ "where s.ID_Zeitraum=1 and ID_Tarifgebiet=1 " + "order by s.ID_Sorte");
		try (ResultSet rsTarifprodukte = psTarifprodukte.executeQuery()) {
			while (rsTarifprodukte.next()) {
				XMLTarifproduktItem xmlTarifproduktItem = of.createXMLTarifproduktItem();

				xmlTarifproduktItem.setNr(makeXMLInteger(rsTarifprodukte.getInt("ID_Sorte")));
				xmlTarifproduktItem.setName(makeXMLString(rsTarifprodukte.getString("Bezeichnung")));
				xmlTarifproduktItem.setExtNr(makeXMLString(rsTarifprodukte.getString("ReferenzExtern")));
				xmlTarifproduktItem.setTextMatrix(of.createXMLAusgangstextMatrix());
				xmlTarifproduktItem.setPreisanpassung(of.createXMLBooleanValue());
				xmlTarifproduktItem.getPreisanpassung().setValue(false);
				xmlTarifproduktItem.setEfmprodukt(of.createXMLRef01());
				xmlTarifproduktItem.setIdentifikation(of.createXMLRefSet0N());
				xmlTarifproduktItem.setKontingentierung(of.createXMLRef01());

				xmlTarifproduktItem.setNachfolgedatenTable(of.createXMLNachfolgedatenTable());
				xmlTarifproduktItem.getNachfolgedatenTable().setAusnahme(of.createXMLRefList0N());
				xmlTarifproduktItem.getNachfolgedatenTable().setKriterium(of.createXMLRefList0N());
				xmlTarifproduktItem.getNachfolgedatenTable().setNachfolger(of.createXMLRefList0N());
				xmlTarifproduktItem.getNachfolgedatenTable().setVorgaenger(of.createXMLRefList0N());

				xmlTarifproduktItem
						.setGueltigkeitszeitrahmensausnahmeTable(of.createXMLGueltigkeitszeitrahmensausnahmeTable());
				xmlTarifproduktItem.getGueltigkeitszeitrahmensausnahmeTable().setAusnahme(of.createXMLRefList0N());
				xmlTarifproduktItem.getGueltigkeitszeitrahmensausnahmeTable()
						.setBewertungsbedingung(of.createXMLRefList0N());
				xmlTarifproduktItem.getGueltigkeitszeitrahmensausnahmeTable()
						.setDatenPool(of.createXMLGueltigkeitszeitrahmensdatenPool());
				xmlTarifproduktItem.getGueltigkeitszeitrahmensausnahmeTable()
						.setSpezialbedingung(of.createXMLRefList0N());
				xmlTarifproduktItem.getGueltigkeitszeitrahmensausnahmeTable()
						.setTagesbedingung(of.createXMLRefList0N());
				xmlTarifproduktItem.getGueltigkeitszeitrahmensausnahmeTable()
						.setTageszeitbedingung(of.createXMLRefList0N());
				xmlTarifproduktItem.getGueltigkeitszeitrahmensausnahmeTable()
						.setTarifpunktbedingung(of.createXMLRefList0N());
				xmlTarifproduktItem.getGueltigkeitszeitrahmensausnahmeTable()
						.setVerkehrsmittellinienbedingung(of.createXMLRefList0N());

				xmlTarifproduktItem
						.setGueltigkeitszeitrahmensdatenTable(of.createXMLGueltigkeitszeitrahmensdatenTable());
				xmlTarifproduktItem.getGueltigkeitszeitrahmensdatenTable().setAusnahme(of.createXMLRefList0N());
				xmlTarifproduktItem.getGueltigkeitszeitrahmensdatenTable()
						.setBewertungsbedingung(of.createXMLRefList0N());
				xmlTarifproduktItem.getGueltigkeitszeitrahmensdatenTable()
						.setDatenPool(of.createXMLGueltigkeitszeitrahmensdatenPool());
				xmlTarifproduktItem.getGueltigkeitszeitrahmensdatenTable().setSpezialbedingung(of.createXMLRefList0N());
				xmlTarifproduktItem.getGueltigkeitszeitrahmensdatenTable().setTagesbedingung(of.createXMLRefList0N());
				xmlTarifproduktItem.getGueltigkeitszeitrahmensdatenTable()
						.setTageszeitbedingung(of.createXMLRefList0N());
				xmlTarifproduktItem.getGueltigkeitszeitrahmensdatenTable()
						.setTarifpunktbedingung(of.createXMLRefList0N());
				xmlTarifproduktItem.getGueltigkeitszeitrahmensdatenTable()
						.setVerkehrsmittellinienbedingung(of.createXMLRefList0N());

				xmlTarifproduktItem.setNachfolgeausnahmeTable(of.createXMLNachfolgeausnahmeTable());
				xmlTarifproduktItem.getNachfolgeausnahmeTable().setAusnahme(of.createXMLRefList0N());
				xmlTarifproduktItem.getNachfolgeausnahmeTable().setKriterium(of.createXMLRefList0N());
				xmlTarifproduktItem.getNachfolgeausnahmeTable().setNachfolger(of.createXMLRefList0N());
				xmlTarifproduktItem.getNachfolgeausnahmeTable().setVorgaenger(of.createXMLRefList0N());

				xmlTarifproduktItem.setPreisausnahmeTable(of.createXMLPreisausnahmeTable());
				xmlTarifproduktItem.getPreisausnahmeTable().setAusnahme(of.createXMLRefList0N());
				xmlTarifproduktItem.getPreisausnahmeTable().setBewertungsbedingung(of.createXMLRefList0N());
				xmlTarifproduktItem.getPreisausnahmeTable().setBezahlartbedingung(of.createXMLRefList0N());
				xmlTarifproduktItem.getPreisausnahmeTable().setDatenPool(of.createXMLPreisdatenPool());
				xmlTarifproduktItem.getPreisausnahmeTable().setMitnahmebedingung(of.createXMLRefList0N());
				xmlTarifproduktItem.getPreisausnahmeTable().setModulkontextbedingung(of.createXMLRefList0N());
				xmlTarifproduktItem.getPreisausnahmeTable().setRabattmedienbedingung(of.createXMLRefList0N());
				xmlTarifproduktItem.getPreisausnahmeTable().setSpezialbedingung(of.createXMLRefList0N());
				xmlTarifproduktItem.getPreisausnahmeTable().setTagesbedingung(of.createXMLRefList0N());
				xmlTarifproduktItem.getPreisausnahmeTable().setTageszeitbedingung(of.createXMLRefList0N());
				xmlTarifproduktItem.getPreisausnahmeTable().setTarifpunktbedingung(of.createXMLRefList0N());
				xmlTarifproduktItem.getPreisausnahmeTable().setVerkehrsmittellinienbedingung(of.createXMLRefList0N());
				xmlTarifproduktItem.getPreisausnahmeTable().setWaehrung(of.createXMLRefList0N());
				xmlTarifproduktItem.getPreisausnahmeTable().setZahlungsintervallbedingung(of.createXMLRefList0N());
				xmlTarifproduktItem.getPreisausnahmeTable().setZeitraumbedingung(of.createXMLRefList0N());

				xmlTarifproduktItem.setRueckzahlungsausnahmeTable(of.createXMLRueckzahlungsausnahmeTable());
				xmlTarifproduktItem.getRueckzahlungsausnahmeTable().setAusnahme(of.createXMLRefList0N());
				xmlTarifproduktItem.getRueckzahlungsausnahmeTable().setBewertungsbedingung(of.createXMLRefList0N());
				xmlTarifproduktItem.getRueckzahlungsausnahmeTable().setDatenPool(of.createXMLRueckzahlungsdatenPool());
				xmlTarifproduktItem.getRueckzahlungsausnahmeTable().setMitnahmebedingung(of.createXMLRefList0N());
				xmlTarifproduktItem.getRueckzahlungsausnahmeTable().setModulkontextbedingung(of.createXMLRefList0N());
				xmlTarifproduktItem.getRueckzahlungsausnahmeTable().setRabattmedienbedingung(of.createXMLRefList0N());
				xmlTarifproduktItem.getRueckzahlungsausnahmeTable().setSpezialbedingung(of.createXMLRefList0N());
				xmlTarifproduktItem.getRueckzahlungsausnahmeTable().setTagesbedingung(of.createXMLRefList0N());
				xmlTarifproduktItem.getRueckzahlungsausnahmeTable().setTarifpunktbedingung(of.createXMLRefList0N());
				xmlTarifproduktItem.getRueckzahlungsausnahmeTable()
						.setVerkehrsmittellinienbedingung(of.createXMLRefList0N());
				xmlTarifproduktItem.getRueckzahlungsausnahmeTable().setWaehrung(of.createXMLRefList0N());
				xmlTarifproduktItem.getRueckzahlungsausnahmeTable().setZeitraumbedingung(of.createXMLRefList0N());

				xmlTarifproduktItem.setRueckzahlungsdatenTable(of.createXMLRueckzahlungsdatenTable());
				xmlTarifproduktItem.getRueckzahlungsdatenTable().setWaehrung(of.createXMLRefList0N());
				xmlTarifproduktItem.getRueckzahlungsdatenTable().setTagesbedingung(of.createXMLRefList0N());
				xmlTarifproduktItem.getRueckzahlungsdatenTable().setZeitraumbedingung(of.createXMLRefList0N());
				xmlTarifproduktItem.getRueckzahlungsdatenTable().setTarifpunktbedingung(of.createXMLRefList0N());
				xmlTarifproduktItem.getRueckzahlungsdatenTable().setBewertungsbedingung(of.createXMLRefList0N());
				xmlTarifproduktItem.getRueckzahlungsdatenTable()
						.setVerkehrsmittellinienbedingung(of.createXMLRefList0N());
				xmlTarifproduktItem.getRueckzahlungsdatenTable().setMitnahmebedingung(of.createXMLRefList0N());
				xmlTarifproduktItem.getRueckzahlungsdatenTable().setRabattmedienbedingung(of.createXMLRefList0N());
				xmlTarifproduktItem.getRueckzahlungsdatenTable().setModulkontextbedingung(of.createXMLRefList0N());
				xmlTarifproduktItem.getRueckzahlungsdatenTable().setSpezialbedingung(of.createXMLRefList0N());
				xmlTarifproduktItem.getRueckzahlungsdatenTable().setDatenPool(of.createXMLRueckzahlungsdatenPool());

				xmlTarifproduktItem
						.setUngueltigkeitszeitpunktsausnahmeTable(of.createXMLUngueltigkeitszeitpunktsausnahmeTable());
				xmlTarifproduktItem.getUngueltigkeitszeitpunktsausnahmeTable().setAusnahme(of.createXMLRefList0N());
				xmlTarifproduktItem.getUngueltigkeitszeitpunktsausnahmeTable()
						.setDatenPool(of.createXMLUngueltigkeitszeitpunktsdatenPool());
				xmlTarifproduktItem.getUngueltigkeitszeitpunktsausnahmeTable()
						.setModulkontextbedingung(of.createXMLRefList0N());
				xmlTarifproduktItem.getUngueltigkeitszeitpunktsausnahmeTable()
						.setSpezialbedingung(of.createXMLRefList0N());
				xmlTarifproduktItem.getUngueltigkeitszeitpunktsausnahmeTable()
						.setTagesbedingung(of.createXMLRefList0N());
				xmlTarifproduktItem.getUngueltigkeitszeitpunktsausnahmeTable()
						.setZeitraumbedingung(of.createXMLRefList0N());

				xmlTarifproduktItem
						.setUngueltigkeitszeitpunktsdatenTable(of.createXMLUngueltigkeitszeitpunktsdatenTable());
				xmlTarifproduktItem.getUngueltigkeitszeitpunktsdatenTable().setAusnahme(of.createXMLRefList0N());
				xmlTarifproduktItem.getUngueltigkeitszeitpunktsdatenTable()
						.setDatenPool(of.createXMLUngueltigkeitszeitpunktsdatenPool());
				xmlTarifproduktItem.getUngueltigkeitszeitpunktsdatenTable()
						.setModulkontextbedingung(of.createXMLRefList0N());
				xmlTarifproduktItem.getUngueltigkeitszeitpunktsdatenTable()
						.setSpezialbedingung(of.createXMLRefList0N());
				xmlTarifproduktItem.getUngueltigkeitszeitpunktsdatenTable().setTagesbedingung(of.createXMLRefList0N());
				xmlTarifproduktItem.getUngueltigkeitszeitpunktsdatenTable()
						.setZeitraumbedingung(of.createXMLRefList0N());

//                XMLAusgangstextEntry tpiBezeichnungKurz=of.createXMLAusgangstextEntry();
//                tpiBezeichnungKurz.setValue(rsTarifprodukte.getString("BezeichnungKurz"));
//                tpiBezeichnungKurz.setRef(poolKeyManager.getXMLRefByPoolId(POOL.AUSGANGSKONTEXT, H2PConstants.POOL_ID_AUSGANGSKONTEXT_SORTE_BEZEICHNUNG_KURZ));
//                xmlTarifproduktItem.getTextMatrix().getText().add(tpiBezeichnungKurz);
//                
                XMLAusgangstextEntry tpiName=of.createXMLAusgangstextEntry();
                tpiName.setValue(rsTarifprodukte.getString("Bezeichnung"));
                tpiName.setRef(poolKeyManagerPV.getXMLRefByPoolId(POOL.AUSGANGSKONTEXT, H2PConstants.POOL_ID_AUSGANGSKONTEXT_SORTE_BEZEICHNUNG));
                xmlTarifproduktItem.getTextMatrix().getText().add(tpiName);
                
                XMLAusgangstextEntry tpiNameDruck=of.createXMLAusgangstextEntry();
                tpiNameDruck.setValue(rsTarifprodukte.getString("Bezeichnung"));
                tpiNameDruck.setRef(poolKeyManagerPV.getXMLRefByPoolId(POOL.AUSGANGSKONTEXT, H2PConstants.POOL_ID_AUSGANGSKONTEXT_TICKET_DRUCK));
                xmlTarifproduktItem.getTextMatrix().getText().add(tpiNameDruck);

				// assign Identifikationsparameter
				xmlTarifproduktItem.setIdentifikation(of.createXMLRefSet0N());
				assignXMLIdentifikationsparameterWertForTarifproduktItem(xmlTarifproduktItem.getIdentifikation(),
						rsTarifprodukte.getInt("ID_Sortengruppe"), rsTarifprodukte.getInt("ID_Tarifart"));

				XMLPreisdatenTable xmlPreisdatenTable = of.createXMLPreisdatenTable();
				xmlTarifproduktItem.setPreisdatenTable(xmlPreisdatenTable);
				xmlPreisdatenTable.setWaehrung(of.createXMLRefList0N());

				XMLPreisdatenPool xmlPreisDatenPool = of.createXMLPreisdatenPool();
				xmlPreisdatenTable.setDatenPool(xmlPreisDatenPool);
				xmlPreisdatenTable.setBewertungsbedingung(of.createXMLRefList0N());
				xmlPreisdatenTable.setAusnahme(of.createXMLRefList0N());
				xmlPreisdatenTable.setBezahlartbedingung(of.createXMLRefList0N());
				xmlPreisdatenTable.setMitnahmebedingung(of.createXMLRefList0N());
				xmlPreisdatenTable.setModulkontextbedingung(of.createXMLRefList0N());
				xmlPreisdatenTable.setRabattmedienbedingung(of.createXMLRefList0N());
				xmlPreisdatenTable.setSpezialbedingung(of.createXMLRefList0N());
				xmlPreisdatenTable.setTagesbedingung(of.createXMLRefList0N());
				xmlPreisdatenTable.setTageszeitbedingung(of.createXMLRefList0N());
				xmlPreisdatenTable.setTarifpunktbedingung(of.createXMLRefList0N());
				xmlPreisdatenTable.setVerkehrsmittellinienbedingung(of.createXMLRefList0N());
				xmlPreisdatenTable.setZahlungsintervallbedingung(of.createXMLRefList0N());
				xmlPreisdatenTable.setZeitraumbedingung(of.createXMLRefList0N());

				try (PreparedStatement psPreise = con.prepareStatement(
						"select p.ID_Preisstufe,p.Preis,m.MwstSatz from Preise p left join Mwst m on p.ID_Mwst=m.ID_Mwst where p.ID_Sorte=? and p.ID_Zeitraum=1 and m.ID_Zeitraum=1 order by ID_Preisstufe,Preis,ID_Tarifgebiet")) {
					psPreise.setInt(1, rsTarifprodukte.getInt("ID_Sorte"));
					try (ResultSet rsPreise = psPreise.executeQuery()) {
						while (rsPreise.next()) {
							int refBewertungsbedingung = poolKeyManagerPV.getXMLRefByPoolId(POOL.BEWERTUNGSBEDINGUNG,
									rsPreise.getInt("ID_Preisstufe"));
							xmlPreisdatenTable.getBewertungsbedingung().getRef().add(refBewertungsbedingung);
							xmlPreisdatenTable.getWaehrung().getRef().add(poolKeyManagerPV
									.getXMLRefByPoolId(POOL.WÄHRUNG, H2PConstants.POOL_ID_WAEHRUNG_EUR));

							XMLPreisdatenItem xmlPreisdatenItem = of.createXMLPreisdatenItem();
							xmlPreisdatenItem.setMwstsatz(of.createXMLIntegerValue());
							xmlPreisdatenItem.setWert(of.createXMLIntegerValue());
							xmlPreisdatenItem.getMwstsatz().setValue(rsPreise.getInt("MwstSatz"));
							xmlPreisdatenItem.getWert().setValue(rsPreise.getInt("Preis"));
							xmlPreisDatenPool.getItem().add(xmlPreisdatenItem);

						}
					}
				}

				pvKmTarifproduktPool.getItem().add(xmlTarifproduktItem);
				poolKeyManagerPV.consumeItemKey(rsTarifprodukte.getInt("ID_Sorte"));

				// mapping table entry for extred to ID
				mappingExtRefToId.getDatensatzkey().getBitsOrTextOrZahl()
						.add(makeXMLString(rsTarifprodukte.getString("ReferenzExtern")));

				XMLIntegerValue xmlIDSorte = of.createXMLIntegerValue();
				xmlIDSorte.setValue(rsTarifprodukte.getLong("ID_Sorte"));
				mappingExtRefToId.getDatensatzvalue().getBitsOrTextOrZahl().add(xmlIDSorte);

			}
		}

		return pvKmTarifproduktPool;
	}

	private void assignXMLIdentifikationsparameterWertForTarifproduktItem(XMLRefSet0N xmlRefSet0N,
			Integer idSortengruppe, Integer idTarifart) throws Exception {
		// Sortengruppe
		if (idSortengruppe != 0) {
			xmlRefSet0N.getRef().add(
					poolKeyManagerPV.getXMLRefByPoolId(POOL.IDENTIFIKATIONSPARAMETERWERT_SORTENGRUPPE, idSortengruppe));
		}
		// Tarifart
		if (idTarifart != 0) {
			xmlRefSet0N.getRef()
					.add(poolKeyManagerPV.getXMLRefByPoolId(POOL.IDENTIFIKATIONSPARAMETERWERT_TARIFART, idTarifart));
		}
	}

	private XMLFremdproduktPool generateXMLFremdproduktPool() {
		System.out.println("generiere XMLFremdproduktPool");
		XMLFremdproduktPool fremdproduktPool = of.createXMLFremdproduktPool();

		fremdproduktPool.setKey(poolKeyManagerPV.nextPool(POOL.FREMDPRODUKT));

		return fremdproduktPool;
	}

	private XMLProduktgruppePool generateXMLProduktgruppePool() throws SQLException, Exception {
		System.out.println("generiere XMLProduktgruppePool");
		XMLProduktgruppePool produktgruppePool = of.createXMLProduktgruppePool();
		produktgruppePool.setKey(poolKeyManagerPV.nextPool(POOL.PRODUKTGRUPPE));
		return produktgruppePool;
	}

	private XMLTarifpunktgruppePool generateXMLTarifpunktgruppePool() throws SQLException, Exception {
		System.out.println("generiere XMLTarifpunktgruppePool");
		XMLTarifpunktgruppePool tarifpunktgruppePool = of.createXMLTarifpunktgruppePool();
		tarifpunktgruppePool.setKey(poolKeyManagerPV.nextPool(POOL.TARIFPUNKTGRUPPE));

		return tarifpunktgruppePool;
	}

	private XMLLiniePool generateXMLLiniePool() {
		System.out.println("generiere XMLLiniePool");
		XMLLiniePool liniePool = of.createXMLLiniePool();

		liniePool.setKey(poolKeyManagerPV.nextPool(POOL.LINIE));

		return liniePool;
	}

	private XMLVerkehrsmitteltypPool generateXMLVerkehrsmitteltypPool() {
		System.out.println("generiere XMLVerkehrsmitteltypPool");
		XMLVerkehrsmitteltypPool verkehrsmitteltypPool = of.createXMLVerkehrsmitteltypPool();

		verkehrsmitteltypPool.setKey(poolKeyManagerPV.nextPool(POOL.VERKEHRSMITTELTYP));

		return verkehrsmitteltypPool;
	}

	private XMLVerkehrsmittellinienbezugPool generateXMLVerkehrmittellinienbezugPool() throws SQLException {
		System.out.println("generiere XMLVerkehrmittellinienbezugPool");
		XMLVerkehrsmittellinienbezugPool verkehrsmittelbezugPool = of.createXMLVerkehrsmittellinienbezugPool();
		verkehrsmittelbezugPool.setKey(poolKeyManagerPV.nextPool(POOL.VERKEHRSMITTELLINIENBEZUG));

		// Default "für alle" mit rowId -1
		XMLVerkehrsmittellinienbezugItem verkehrsmittellinienbezugItemAlle = of
				.createXMLVerkehrsmittellinienbezugItem();
		verkehrsmittellinienbezugItemAlle.setName(makeXMLString("Alle Verkehrsmittel"));
		verkehrsmittelbezugPool.getItem().add(verkehrsmittellinienbezugItemAlle);
		poolKeyManagerPV.consumeItemKey(-1);

		return verkehrsmittelbezugPool;
	}

	private XMLModulkontextPool generateXMLModulkontextPool() throws SQLException {
		System.out.println("generiere XMLModulkontextPool");
		XMLModulkontextPool modulkontextPool = of.createXMLModulkontextPool();
		modulkontextPool.setKey(poolKeyManagerPV.nextPool(POOL.MODULKONTEXT));

		XMLModulkontextItem modulkontextItem = of.createXMLModulkontextItem();
		modulkontextItem.setNr(makeXMLInteger(H2PConstants.POOL_ID_MODULKONTEXT_HUSST_ENDGERAET));
		modulkontextItem.setName(makeXMLString("HUSST Endgerät (Standard) Modulkontext"));
		modulkontextPool.getItem().add(modulkontextItem);
		poolKeyManagerPV.consumeItemKey(H2PConstants.POOL_ID_MODULKONTEXT_HUSST_ENDGERAET);

		return modulkontextPool;
	}

	private XMLBezahlartPool generateXMLBezahlartPool() throws SQLException {
		System.out.println("generiere XMLBezahlartPool");
		XMLBezahlartPool bezahlartPool = of.createXMLBezahlartPool();
		bezahlartPool.setKey(poolKeyManagerPV.nextPool(POOL.BEZAHLART));

		return bezahlartPool;
	}

	private XMLMitnahmetypPool generateXMLMitnahmetypPool() throws SQLException {
		System.out.println("generiere XMLMitnahmetypPool");
		XMLMitnahmetypPool mitnahmetypPool = of.createXMLMitnahmetypPool();
		mitnahmetypPool.setKey(poolKeyManagerPV.nextPool(POOL.MITNAHMETYP));

		return mitnahmetypPool;
	}

	private XMLRabattmedientypPool generateXMLRabattmedientypPool() {
		System.out.println("generiere XMLRabattmedientypPool");
		XMLRabattmedientypPool rabattmedientypPool = of.createXMLRabattmedientypPool();

		rabattmedientypPool.setKey(poolKeyManagerPV.nextPool(POOL.RABATMEDIENTYP));

		return rabattmedientypPool;
	}

	private XMLTagesbedingungPool generateXMLTagesbedingungPool()
			throws SQLException, ParseException, DatatypeConfigurationException {
		System.out.println("generiere XMLTagesbedingungPool");
		XMLTagesbedingungPool tagesbedingungPool = of.createXMLTagesbedingungPool();
		tagesbedingungPool.setKey(poolKeyManagerPV.nextPool(POOL.TAGESBEDINGUNG));

		return tagesbedingungPool;
	}

	private XMLTageszeitbedingungPool generateXMLTageszeitbedingungPool()
			throws SQLException, DatatypeConfigurationException {
		System.out.println("generiere XMLTageszeitbedingungPool");
		XMLTageszeitbedingungPool tageszeitbedingungPool = of.createXMLTageszeitbedingungPool();
		tageszeitbedingungPool.setKey(poolKeyManagerPV.nextPool(POOL.TAGESZEITBEDINGUNG));

		return tageszeitbedingungPool;
	}

	private XMLModulkontextbedingungPool generateXMLModulkontextbedingungPool() throws Exception {
		System.out.println("generiere XMLModulkontextbedingungPool");
		XMLModulkontextbedingungPool modulkontextbedingungPool = of.createXMLModulkontextbedingungPool();
		modulkontextbedingungPool.setKey(poolKeyManagerPV.nextPool(POOL.MODULKONTEXTBEDINGUNG));

		XMLModulkontextbedingungItem modulkontextbedingungItem = of.createXMLModulkontextbedingungItem();
		modulkontextbedingungItem.setName(makeXMLString("HUSST Endgerät (Standard) Modulkontextbedingung"));
		modulkontextbedingungItem.setElement(of.createXMLRefSet0N());
		modulkontextbedingungItem.getElement().getRef().add(poolKeyManagerPV.getXMLRefByPoolId(POOL.MODULKONTEXT,
				H2PConstants.POOL_ID_MODULKONTEXT_HUSST_ENDGERAET));
		modulkontextbedingungPool.getItem().add(modulkontextbedingungItem);
		poolKeyManagerPV.consumeItemKey(H2PConstants.POOL_ID_MODULKONTEXTBEDINGUNG_HUSST_ENDGERAET);

		return modulkontextbedingungPool;
	}

	private XMLVerkehrsmittellinienbedingungPool generateXMLVerkehsrmittellinienbedingungPool() {
		System.out.println("generiere XMLVerkehsrmittellinienbedingungPool");
		XMLVerkehrsmittellinienbedingungPool verkehrsmittellinienbedingungPool = of
				.createXMLVerkehrsmittellinienbedingungPool();

		verkehrsmittellinienbedingungPool.setKey(poolKeyManagerPV.nextPool(POOL.VERKEHRSMITTELLINIENBEDINGUNG));

		return verkehrsmittellinienbedingungPool;
	}

	private XMLZuordnungstypPool generateXMLZuordnungstypPool() throws SQLException {
		System.out.println("generiere XMLZuordnungstypPool");
		XMLZuordnungstypPool zuordnungstypPool = of.createXMLZuordnungstypPool();
		zuordnungstypPool.setKey(poolKeyManagerPV.nextPool(POOL.ZUORDNUNGSTYP));

		// Ortspunkt zu Tarifrelevanterpunkt
		// Der Zurodnungstypname ergibt sich aus
		// "HUSST-OTPTyp-[OTPTyp]-zu-Bediengebiet-[ID_Bediengebiet]"
		// select distinct ID_Bediengebiet,ID_OTPTyp from Tarifrelevantepunkte where
		// ID_Zeitraum=1 order by ID_Bediengebiet,ID_OTPTyp
		try (ResultSet rsZuordnungstypPool = con.createStatement().executeQuery(
				"select distinct ID_OTPTyp,ID_Bediengebiet from Tarifrelevantepunkte where ID_Zeitraum=1 order by ID_OTPTyp,ID_Bediengebiet")) {
			while (rsZuordnungstypPool.next()) {
				XMLZuordnungstypItem zuordnungstypItemOpZuTarifrelevanterpunkt = of.createXMLZuordnungstypItem();

				zuordnungstypItemOpZuTarifrelevanterpunkt
						.setName(makeXMLString(buildZurordnungstypName(rsZuordnungstypPool.getInt("ID_OTPTyp"),
								rsZuordnungstypPool.getInt("ID_Bediengebiet"))));

				zuordnungstypPool.getItem().add(zuordnungstypItemOpZuTarifrelevanterpunkt);
				poolKeyManagerPV.consumeItemKey(buildZuordnungstypNr(rsZuordnungstypPool.getInt("ID_OTPTyp"),
						rsZuordnungstypPool.getInt("ID_Bediengebiet")));
			}
		}

		// Tarifrelevanterpunkt zu Relationscode
		XMLZuordnungstypItem zuordnungstypItemTarifrelevanterpunktZuRelationscode = of.createXMLZuordnungstypItem();

		zuordnungstypItemTarifrelevanterpunktZuRelationscode
				.setName(makeXMLString("HUSST-Tarifrelevanterpunkt-zu-HUSST-RelCode"));

		zuordnungstypPool.getItem().add(zuordnungstypItemTarifrelevanterpunktZuRelationscode);
		poolKeyManagerPV.consumeItemKey(H2PConstants.ZUORDNUNGSTYP_TARIFRELEVANTERPUNKT_ZU_RELCODE);

		return zuordnungstypPool;
	}

	private int buildZuordnungstypNr(int otpTyp, int idBediengebiet) {
		return otpTyp * 1000 + idBediengebiet;
	}

	private String buildZurordnungstypName(int otpTyp, int idBediengebiet) {
		return String.format("HUSST-Ortspunkt-zu-Tarifrelevanterpunkt-mit-OTPTyp-%d-und-Bediengebiet-%d", otpTyp,
				idBediengebiet);
	}

	private XMLZuordnungsdatenMatrix generateXMLZuordnungsdatenMatrix() throws SQLException, Exception {
		System.out.println("generiere XMLZuordnungsdatenMatrix");
		XMLZuordnungsdatenMatrix zuordnungsdatenMatrix = of.createXMLZuordnungsdatenMatrix();

		generateXMLZuordnungsdatenMatrixOrtspunktZuTarifrelevanterpunkt(zuordnungsdatenMatrix);
		generateXMLZuordnungsdatenMatrixTarifrelevanterpunktZuRelCode(zuordnungsdatenMatrix);

		return zuordnungsdatenMatrix;
	}

	private void generateXMLZuordnungsdatenMatrixTarifrelevanterpunktZuRelCode(
			XMLZuordnungsdatenMatrix zuordnungsdatenMatrix) throws SQLException, Exception {
		// Tarifrelevanterpunkt zu Relcode
		XMLZuordnungsdatentypEntry typTarifrelevanterpunktZuRelCode = null;
		XMLZuordnungsbezugEntry vlbTarifrelevanterpunktZuRelCode = null;
		XMLZuordnungsdatenvonEntry entryTarifrelevanterpunktZuRelCode = null;
		ResultSet rsTarifrelevanterPunktZuRelCode = con.createStatement().executeQuery(
				"select distinct ID_Tarifrelevanterpunkt,ID_Relcode from Tarifrelevantepunkte where ID_Zeitraum=1 order by ID_Tarifrelevanterpunkt,ID_Relcode");
		int oldTypRef = 0;
		int oldVonRef = 0;
		while (rsTarifrelevanterPunktZuRelCode.next()) {

			// Ortspunkte zu Tarifrelevante zusammenstellen

			int typRef = poolKeyManagerPV.getXMLRefByPoolId(POOL.ZUORDNUNGSTYP,
					H2PConstants.ZUORDNUNGSTYP_TARIFRELEVANTERPUNKT_ZU_RELCODE);
			if (oldTypRef != typRef) {
				typTarifrelevanterpunktZuRelCode = of.createXMLZuordnungsdatentypEntry();
				typTarifrelevanterpunktZuRelCode.setRef(typRef);
				zuordnungsdatenMatrix.getTyp().add(typTarifrelevanterpunktZuRelCode);
				oldTypRef = typRef;

				vlbTarifrelevanterpunktZuRelCode = of.createXMLZuordnungsbezugEntry();
				vlbTarifrelevanterpunktZuRelCode
						.setRef(poolKeyManagerPV.getXMLRefByPoolId(POOL.VERKEHRSMITTELLINIENBEZUG, -1));
				typTarifrelevanterpunktZuRelCode.getBezug().add(vlbTarifrelevanterpunktZuRelCode);
			}

			int vonRef = poolKeyManagerPV.getXMLRefByPoolId(POOL.TARIFPUNKT, H2PConstants.ID_TARIFRELEVANTERPUNKT_OFFSET
					+ rsTarifrelevanterPunktZuRelCode.getInt("ID_Tarifrelevanterpunkt"));
			if (oldVonRef != vonRef) {
				entryTarifrelevanterpunktZuRelCode = of.createXMLZuordnungsdatenvonEntry();
				entryTarifrelevanterpunktZuRelCode.setRef(vonRef);
				vlbTarifrelevanterpunktZuRelCode.getVon().add(entryTarifrelevanterpunktZuRelCode);
				oldVonRef = vonRef;
			}
			int zuRef = poolKeyManagerPV.getXMLRefByPoolId(POOL.TARIFPUNKT,
					H2PConstants.ID_RELCODE_OFFSET + rsTarifrelevanterPunktZuRelCode.getInt("ID_Relcode"));
			XMLZuordnungszuEntry zuEntry = of.createXMLZuordnungszuEntry();
			zuEntry.setValue(zuRef);
			entryTarifrelevanterpunktZuRelCode.getZu().add(zuEntry);
		}
		rsTarifrelevanterPunktZuRelCode.close();
	}

	private XMLZuordnungsbezugEntry generateXMLZuordnungsdatenMatrixOrtspunktZuTarifrelevanterpunkt(
			XMLZuordnungsdatenMatrix zuordnungsdatenMatrix) throws SQLException, Exception {
		XMLZuordnungsdatentypEntry typOrtspunktZuTarifrelevanterpunkt = null;
		XMLZuordnungsbezugEntry vlbOrtspunktZuTarifrelevanterpunkt = null;
		XMLZuordnungsdatenvonEntry entryOrtspunktZuTarifrelevanterpunkt = null;

		// Ortspunkte zu Tarifrelevantepunkte
		ResultSet rsOrtspunktZuTarifrelevanterPunkt = con.createStatement().executeQuery(
				"select * from Tarifrelevantepunkte where ID_Zeitraum=1 order by ID_OTPTyp,ID_Bediengebiet,ID_Ortspunkt,ID_Tarifrelevanterpunkt");
		int oldTypRef = 0;
		int oldVonRef = 0;
		while (rsOrtspunktZuTarifrelevanterPunkt.next()) {

			// Ortspunkte zu Tarifrelevante zusammenstellen

			int typRef = poolKeyManagerPV.getXMLRefByPoolId(POOL.ZUORDNUNGSTYP,
					buildZuordnungstypNr(rsOrtspunktZuTarifrelevanterPunkt.getInt("ID_OTPTyp"),
							rsOrtspunktZuTarifrelevanterPunkt.getInt("ID_Bediengebiet")));
			if (oldTypRef != typRef) {
				typOrtspunktZuTarifrelevanterpunkt = of.createXMLZuordnungsdatentypEntry();
				typOrtspunktZuTarifrelevanterpunkt.setRef(typRef);
				zuordnungsdatenMatrix.getTyp().add(typOrtspunktZuTarifrelevanterpunkt);
				oldTypRef = typRef;

				vlbOrtspunktZuTarifrelevanterpunkt = of.createXMLZuordnungsbezugEntry();
				vlbOrtspunktZuTarifrelevanterpunkt
						.setRef(poolKeyManagerPV.getXMLRefByPoolId(POOL.VERKEHRSMITTELLINIENBEZUG, -1));
				typOrtspunktZuTarifrelevanterpunkt.getBezug().add(vlbOrtspunktZuTarifrelevanterpunkt);
			}

			int vonRef = poolKeyManagerPV.getXMLRefByPoolId(POOL.TARIFPUNKT,
					makePkmTarifpunktNrFromOrtspunktId(rsOrtspunktZuTarifrelevanterPunkt));
			if (oldVonRef != vonRef) {
				entryOrtspunktZuTarifrelevanterpunkt = of.createXMLZuordnungsdatenvonEntry();
				entryOrtspunktZuTarifrelevanterpunkt.setRef(vonRef);
				vlbOrtspunktZuTarifrelevanterpunkt.getVon().add(entryOrtspunktZuTarifrelevanterpunkt);
				oldVonRef = vonRef;
			}
			int zuRef = poolKeyManagerPV.getXMLRefByPoolId(POOL.TARIFPUNKT, H2PConstants.ID_TARIFRELEVANTERPUNKT_OFFSET
					+ rsOrtspunktZuTarifrelevanterPunkt.getInt("ID_Tarifrelevanterpunkt"));
			XMLZuordnungszuEntry zuEntry = of.createXMLZuordnungszuEntry();
			zuEntry.setValue(zuRef);
			entryOrtspunktZuTarifrelevanterpunkt.getZu().add(zuEntry);
		}
		rsOrtspunktZuTarifrelevanterPunkt.close();
		return vlbOrtspunktZuTarifrelevanterpunkt;
	}

	private XMLZuordnungsausnahmeMatrix generateXMLZuordnungsausnahmeMatrix() {
		System.out.println("generiere XMLZuordnungsausnahmeMatrix");
		XMLZuordnungsausnahmeMatrix zuordnungsausnahmeMatrix = of.createXMLZuordnungsausnahmeMatrix();

		return zuordnungsausnahmeMatrix;
	}

	private XMLWegevariantePool generateXMLWegevariantenPool() throws SQLException, Exception {
		System.out.println("generiere XMLWegevariantenPool");
		XMLWegevariantePool wegevariantePool = of.createXMLWegevariantePool();
		wegevariantePool.setKey(poolKeyManagerPV.nextPool(POOL.WEGEVARIANTEN));

		// Default Via -1 (Alle Wege)
		XMLWegevarianteItem wegevarianteItem = of.createXMLWegevarianteItem();
		wegevarianteItem.setNr(makeXMLInteger(0));
		wegevarianteItem.setName(makeXMLString("Alle Wege (kein Via)"));
		wegevarianteItem.setGeobezug(of.createXMLGeobezugPart());
		wegevarianteItem.getGeobezug().getValue();
		wegevarianteItem.setTextMatrix(of.createXMLAusgangstextMatrix());
		wegevarianteItem.setTarifpunktfolgePool(of.createXMLTarifpunktfolgePool());
		wegevariantePool.getItem().add(wegevarianteItem);
		poolKeyManagerPV.consumeItemKey(0);

		// Vias der Relationen
		try (ResultSet rsVias = con.createStatement()
				.executeQuery("select ID_Via,Bezeichnung,BezeichnungDruck " + "from Vias " + "where ID_Zeitraum=1")) {
			while (rsVias.next()) {
				wegevarianteItem = of.createXMLWegevarianteItem();
				wegevarianteItem.setNr(makeXMLInteger(1));
				wegevarianteItem.setName(makeXMLString(rsVias.getString("Bezeichnung")));
				wegevarianteItem.setGeobezug(of.createXMLGeobezugPart());
				wegevarianteItem.getGeobezug().getValue();
				wegevarianteItem.setTextMatrix(of.createXMLAusgangstextMatrix());
				
				XMLAusgangstextEntry tpNameTicket = of.createXMLAusgangstextEntry();
				tpNameTicket.setValue(rsVias.getString("BezeichnungDruck"));
				tpNameTicket.setRef(poolKeyManagerPV.getXMLRefByPoolId(POOL.AUSGANGSKONTEXT,
						H2PConstants.POOL_ID_AUSGANGSKONTEXT_TICKET_DRUCK));
				wegevarianteItem.getTextMatrix().getText().add(tpNameTicket);
				
				wegevarianteItem.setTarifpunktfolgePool(of.createXMLTarifpunktfolgePool());
				wegevariantePool.getItem().add(wegevarianteItem);
				poolKeyManagerPV.consumeItemKey(rsVias.getInt("ID_Via"));
			}
		}

		return wegevariantePool;
	}

	/**
	 * 
	 * @return
	 * @throws SQLException
	 */
	private XMLBewertungstypPool generateXMLBewertungstypPool() throws SQLException {

		System.out.println("generiere XMLBewertungstypPool");
		XMLBewertungstypPool bewertungstypPool = of.createXMLBewertungstypPool();
		bewertungstypPool.setKey(poolKeyManagerPV.nextPool(POOL.BEWERTUNGSTYP));

		// Preisstufe (HUSST Standard)
		XMLBewertungstypItem bewertungstypItem = of.createXMLBewertungstypItem();

		bewertungstypItem.setName(makeXMLString("Preisstufe"));

		bewertungstypPool.getItem().add(bewertungstypItem);
		poolKeyManagerPV.consumeItemKey(-1);

		return bewertungstypPool;
	}

	private XMLBewertungsdatenPool generateXMLBewertungsdatenPool() throws SQLException {
		System.out.println("generiere XMLBewertungsdatenPool");
		XMLBewertungsdatenPool bewertungsdatenPool = of.createXMLBewertungsdatenPool();
		bewertungsdatenPool.setKey(poolKeyManagerPV.nextPool(POOL.BEWERTUNGSDATEN));

		ResultSet rsBewertungsdatenPool = con.createStatement().executeQuery(
				"select * from PREISSTUFEN where ID_ZEITRAUM=1 order by Preisstufennummer,ID_Tarifgebiet");

		while (rsBewertungsdatenPool.next()) {

			XMLIntegerValue wert = of.createXMLIntegerValue();
			wert.setValue(rsBewertungsdatenPool.getLong("ID_Preisstufe"));

			XMLValueFunction arrayValue = of.createXMLValueFunction();
			arrayValue.getBitsOrTextOrZahl().add(wert);

			XMLBewertungsdatenItem bewertungdatenItem = of.createXMLBewertungsdatenItem();
			bewertungdatenItem.setName(makeXMLString(rsBewertungsdatenPool.getString("BezeichnungKurz")));
			bewertungdatenItem.setWert(arrayValue);

			bewertungdatenItem.setTextMatrix(of.createXMLAusgangstextMatrix());

//            XMLAusgangstextEntry bdiPreisstufennummer=of.createXMLAusgangstextEntry();
//            bdiPreisstufennummer.setValue(rsBewertungsdatenPool.getString("Preisstufennummer"));
//            bewertungdatenItem.getTextMatrix().getText().add(bdiPreisstufennummer);
//            
//            XMLAusgangstextEntry bdiBezeichnung=of.createXMLAusgangstextEntry();
//            bdiBezeichnung.setValue(rsBewertungsdatenPool.getString("Bezeichnung"));
//            bewertungdatenItem.getTextMatrix().getText().add(bdiBezeichnung);
//
//            XMLAusgangstextEntry bdiBezeichnungKurz=of.createXMLAusgangstextEntry();
//            bdiBezeichnungKurz.setValue(rsBewertungsdatenPool.getString("BezeichnungKurz"));
//            bewertungdatenItem.getTextMatrix().getText().add(bdiBezeichnungKurz);

			bewertungsdatenPool.getItem().add(bewertungdatenItem);
			poolKeyManagerPV.consumeItemKey(rsBewertungsdatenPool.getInt("ID_PREISSTUFE"));
		}
		rsBewertungsdatenPool.close();

		return bewertungsdatenPool;
	}

	private XMLBewertungsdatenMatrix generateXMLBewertungsdatenMatrix() throws SQLException, Exception {
		System.out.println("generiere XMLBewertungsdatenMatrix");
		XMLBewertungsdatenMatrix bewertungsdatenMatrix = of.createXMLBewertungsdatenMatrix();

		ResultSet rsBewertungsdaten = con.createStatement()
				.executeQuery("select " + "tr.ID_TarifpunktStart, " + "tr.ID_TarifpunktZiel, " + "r.ID_VIA, "
						+ "tr.ID_Preisstufe " + "from Relationen r " + "	inner join Relationszuordnungen rz "
						+ "	inner join Teilrelationen tr "
						+ "	on r.ID_Relation=rz.ID_Relation and rz.ID_Teilrelation=tr.ID_Teilrelation "
						+ "where r.ID_Zeitraum=1");

		int refBewertungstyp = -1, oldRefBewertungstyp = -1;
		int refVlb = -1, oldRefVlb = -1;
		int refVon = -1, oldRefVon = -1;
		int refNach = -1, oldRefNach = -1;
		int refUeber = -1;

		XMLBewertungsdatentypEntry bewertungsdatentypEntry = null;
		XMLBewertungsbezugEntry bewertungsbezugEntry = null;
		XMLBewertungsdatenvonEntry bewertungsdatenvonEntry = null;
		XMLBewertungsdatennachEntry bewertungsdatennachEntry = null;
		XMLBewertungsdatenueberEntry bewertungsdatenueberEntry = null;

		while (rsBewertungsdaten.next()) {

			// Bewertungstyp
			refBewertungstyp = poolKeyManagerPV.getXMLRefByPoolId(POOL.BEWERTUNGSTYP, -1);
			if (oldRefBewertungstyp != refBewertungstyp) {
				bewertungsdatentypEntry = of.createXMLBewertungsdatentypEntry();
				bewertungsdatentypEntry.setRef(refBewertungstyp);
				bewertungsdatenMatrix.getTyp().add(bewertungsdatentypEntry);
				// reset others
				oldRefVlb = -1;
			}

			// VLB
			refVlb = poolKeyManagerPV.getXMLRefByPoolId(POOL.VERKEHRSMITTELLINIENBEZUG, -1);
			if (oldRefVlb != refVlb) {
				bewertungsbezugEntry = of.createXMLBewertungsdatenbezugEntry();
				bewertungsbezugEntry.setRef(refVlb);
				bewertungsdatentypEntry.getBezug().add(bewertungsbezugEntry);
				// reset others
				oldRefVon = -1;
			}

			// Von
			refVon = poolKeyManagerPV.getXMLRefByPoolId(POOL.TARIFPUNKT,
					rsBewertungsdaten.getInt("ID_TarifpunktStart"));
			if (oldRefVon != refVon) {
				bewertungsdatenvonEntry = of.createXMLBewertungsdatenvonEntry();
				bewertungsdatenvonEntry.setRef(refVon);
				bewertungsbezugEntry.getVon().add(bewertungsdatenvonEntry);
				// resette nach referenzen
				oldRefNach = -1;
			}

			// Nach
			refNach = poolKeyManagerPV.getXMLRefByPoolId(POOL.TARIFPUNKT,
					rsBewertungsdaten.getInt("ID_TarifpunktZiel"));
			if (oldRefNach != refNach) {
				bewertungsdatennachEntry = of.createXMLBewertungsdatennachEntry();
				bewertungsdatennachEntry.setRef(refNach);
				bewertungsdatenvonEntry.getNach().add(bewertungsdatennachEntry);
			}

			// Über (via)
			refUeber = poolKeyManagerPV.getXMLRefByPoolId(POOL.WEGEVARIANTEN, rsBewertungsdaten.getInt("ID_Via"));
			bewertungsdatenueberEntry = of.createXMLBewertungsdatenueberEntry();
			bewertungsdatenueberEntry.setRef(refUeber);
			bewertungsdatenueberEntry.setValue(poolKeyManagerPV.getXMLRefByPoolId(POOL.BEWERTUNGSDATEN,
					rsBewertungsdaten.getInt("ID_Preisstufe")));
			bewertungsdatennachEntry.getUeber().add(bewertungsdatenueberEntry);

			oldRefBewertungstyp = refBewertungstyp;
			oldRefVlb = refVlb;
			oldRefVon = refVon;
			oldRefNach = refNach;
		}
		rsBewertungsdaten.close();
		return bewertungsdatenMatrix;
	}

	private XMLBewertungsausnahmeMatrix generateXMLBewertungsausnahmeMatrix() {
		System.out.println("generiere XMLBewertungsausnahmeMatrix");
		XMLBewertungsausnahmeMatrix bewertungsausnahmeMatrix = of.createXMLBewertungsausnahmeMatrix();

		return bewertungsausnahmeMatrix;
	}

	private XMLNummerninterpretationPool generateXMLNummerninterpretationPool() {
		System.out.println("generiere XMLNummerninterpretationPool");
		XMLNummerninterpretationPool nummerninterpretationPool = of.createXMLNummerninterpretationPool();

		nummerninterpretationPool.setKey(poolKeyManagerPV.nextPool(POOL.NUMMERNINTERPRETATION));

		return nummerninterpretationPool;
	}

	private XMLBitleisteninterpretationPool generateXMLBitleisteninterpretationPool() {
		System.out.println("generiere XMLBitleisteninterpretationPool");
		XMLBitleisteninterpretationPool bitleisteninterpretationPool = of.createXMLBitleisteninterpretationPool();

		bitleisteninterpretationPool.setKey(poolKeyManagerPV.nextPool(POOL.BITLEISTENINTERPRETATION));

		return bitleisteninterpretationPool;
	}

	private XMLRaumnummerninterpretationPool generateXMLRaumnummerninterpretationPool() {
		System.out.println("generiere XMLRaumnummerninterpretationPool");
		XMLRaumnummerninterpretationPool raumnummerninterpretationPool = of.createXMLRaumnummerninterpretationPool();

		raumnummerninterpretationPool.setKey(poolKeyManagerPV.nextPool(POOL.RAUMNUMMERNINTERPRETATION));

		return raumnummerninterpretationPool;
	}

	private XMLNachfolgekriteriumPool generateXMLNachfolgekriteriumPool() {
		System.out.println("generiere XMLNachfolgekriteriumPool");
		XMLNachfolgekriteriumPool nachfolgekriteriumPool = of.createXMLNachfolgekriteriumPool();

		nachfolgekriteriumPool.setKey(poolKeyManagerPV.nextPool(POOL.NACHFOLGERKRITERIUM));

		return nachfolgekriteriumPool;
	}

	private XMLSchluesselPool generateXMLSchluesselPool() {
		System.out.println("generiere XMLSchluesselPool");
		XMLSchluesselPool schluesselPool = of.createXMLSchluesselPool();

		schluesselPool.setKey(poolKeyManagerPV.nextPool(POOL.SCHLÜSSEL));

		return schluesselPool;
	}

	private XMLKontingentierungPool generateXMLKontigentierungPool() {
		System.out.println("generiere XMLKontigentierungPool");
		XMLKontingentierungPool kontigentierungPool = of.createXMLKontingentierungPool();

		kontigentierungPool.setKey(poolKeyManagerPV.nextPool(POOL.KONTIGENTIERUNG));

		return kontigentierungPool;
	}

	private XMLWaehrungPool generateXMLWaehrungPool() {
		System.out.println("generiere XMLWaehrungPool");
		XMLWaehrungPool waehrungPool = of.createXMLWaehrungPool();
		waehrungPool.setKey(poolKeyManagerPV.nextPool(POOL.WÄHRUNG));

		XMLWaehrungItem waehrungItem = of.createXMLWaehrungItem();
		waehrungItem.setName(makeXMLString("Euro-Cent"));
		waehrungItem.setNr(makeXMLInteger(10536)); // ISO Wert für Euro-Cent
		waehrungItem.setTextMatrix(of.createXMLAusgangstextMatrix());
		poolKeyManagerPV.consumeItemKey(H2PConstants.POOL_ID_WAEHRUNG_EUR);

		waehrungPool.getItem().add(waehrungItem);

		return waehrungPool;
	}

	private XMLZahlungsintervallPool generateXMLZahlungsintervallPool() {
		System.out.println("generiere XMLZahlungsintervallPool");
		XMLZahlungsintervallPool zahlungsintervallPool = of.createXMLZahlungsintervallPool();
		zahlungsintervallPool.setKey(poolKeyManagerPV.nextPool(POOL.ZAHLUNGSINTERVALL));

		return zahlungsintervallPool;
	}

	private XMLSpezialbedingungPool generateXMLSpezialbedingungPool() {
		System.out.println("generiere XMLSpezialbedingungPool");
		XMLSpezialbedingungPool spezialbedingungPool = of.createXMLSpezialbedingungPool();

		spezialbedingungPool.setKey(poolKeyManagerPV.nextPool(POOL.SPEZIALBEDINGUNG));

		return spezialbedingungPool;
	}

	private XMLBezahlartbedingungPool generateXMLBezahlartbedingungPool() {
		System.out.println("generiere XMLBezahlartbedingungPool");
		XMLBezahlartbedingungPool bezahlartbedingungPool = of.createXMLBezahlartbedingungPool();

		bezahlartbedingungPool.setKey(poolKeyManagerPV.nextPool(POOL.BEZAHLARTBEDINGUNG));

		return bezahlartbedingungPool;
	}

	private XMLZahlungsintervallbedingungPool generateXMLZahlungsintervallbedingungPool() throws Exception {
		System.out.println("generiere XMLZahlungsintervallbedingungPool");
		XMLZahlungsintervallbedingungPool zahlungsintervallbedingungPool = of.createXMLZahlungsintervallbedingungPool();
		zahlungsintervallbedingungPool.setKey(poolKeyManagerPV.nextPool(POOL.ZAHLUNGSINTERVALLBEDINGUNG));

		return zahlungsintervallbedingungPool;
	}

	private XMLZeitraumbedingungPool generateXMLZeitraumbedingungPool() {
		System.out.println("generiere XMLZeitraumbedingungPool");
		XMLZeitraumbedingungPool zeitraumbedingungPool = of.createXMLZeitraumbedingungPool();

		zeitraumbedingungPool.setKey(poolKeyManagerPV.nextPool(POOL.ZEITRAUMBEDINGUNG));

		return zeitraumbedingungPool;
	}

	private XMLTarifpunktbedingungPool generateXMLTarifpunktbedingungPool() {
		System.out.println("generiere XMLTarifpunktbedingungPool");
		XMLTarifpunktbedingungPool tarifpunktbedingungPool = of.createXMLTarifpunktbedingungPool();

		tarifpunktbedingungPool.setKey(poolKeyManagerPV.nextPool(POOL.TARIFPUNKTBEDINGUNG));

		return tarifpunktbedingungPool;
	}

	private XMLBewertungsbedingungPool generateXMLBewertungsbedingungPool() throws SQLException, Exception {
		System.out.println("generiere XMLBewertungsbedingungPool");
		XMLBewertungsbedingungPool bewertungsbedingungPool = of.createXMLBewertungsbedingungPool();
		bewertungsbedingungPool.setKey(poolKeyManagerPV.nextPool(POOL.BEWERTUNGSBEDINGUNG));

		ResultSet rsBewertungsbedingungPool = con.createStatement()
				.executeQuery("select * from Preisstufen where ID_ZEITRAUM=1 order by ID_Preisstufe,ID_Tarifgebiet");

		while (rsBewertungsbedingungPool.next()) {
			XMLBewertungsbedingungItem bewertungsbedingugItem = of.createXMLBewertungsbedingungItem();

			bewertungsbedingugItem.setName(
					makeXMLString("Bewertungsbedingung " + rsBewertungsbedingungPool.getString("Bezeichnung")));
			XMLRef11 xmlRef11 = of.createXMLRef11();
			xmlRef11.setRef(poolKeyManagerPV.getXMLRefByPoolId(POOL.BEWERTUNGSTYP, -1));
			bewertungsbedingugItem.setBewertungstyp(xmlRef11);
			bewertungsbedingugItem.setWerte(of.createXMLArrayValue());
			XMLIntegerValue xmlPreisstufe = of.createXMLIntegerValue();
			xmlPreisstufe.setValue(rsBewertungsbedingungPool.getLong("ID_Preisstufe"));
			bewertungsbedingugItem.getWerte().getBitsOrTextOrZahl().add(xmlPreisstufe);

			bewertungsbedingungPool.getItem().add(bewertungsbedingugItem);
			poolKeyManagerPV.consumeItemKey(rsBewertungsbedingungPool.getInt("ID_Preisstufe"));
		}
		rsBewertungsbedingungPool.close();

		return bewertungsbedingungPool;
	}

	private XMLMitnahmebedingungPool generateXMLMitnahmebedingungPool() {
		System.out.println("generiere XMLMitnahmebedingungPool");
		XMLMitnahmebedingungPool mitnahmebedingungPool = of.createXMLMitnahmebedingungPool();

		mitnahmebedingungPool.setKey(poolKeyManagerPV.nextPool(POOL.MITNAHMEBEDINGUNG));

		return mitnahmebedingungPool;
	}

	private XMLRabattmedienbedingungPool generateXMLRabattmedienbedingungPool() {
		System.out.println("generiere XMLRabattmedienbedingungPool");
		XMLRabattmedienbedingungPool rabattmedienbedingungPool = of.createXMLRabattmedienbedingungPool();

		rabattmedienbedingungPool.setKey(poolKeyManagerPV.nextPool(POOL.RABATTMEDIENBEDINGUNG));

		return rabattmedienbedingungPool;
	}

	private XMLTarifpunktreferenzPool generateXMLTarifpunktreferenzPool() {
		System.out.println("generiere XMLTarifpunktreferenzPool");
		XMLTarifpunktreferenzPool tarifpunktreferenzPool = of.createXMLTarifpunktreferenzPool();
		tarifpunktreferenzPool.setKey(poolKeyManagerPV.nextPool(POOL.TARIFPUNKTREFERENZ));

		return tarifpunktreferenzPool;
	}

	private XMLStringValue makeXMLString(String value) {
		XMLStringValue xmlStringValue = of.createXMLStringValue();
		xmlStringValue.setValue(value);
		return xmlStringValue;
	}

	private XMLIntegerValue makeXMLInteger(int value) {
		XMLIntegerValue xmlIntegerValue = of.createXMLIntegerValue();
		xmlIntegerValue.setValue(value);
		return xmlIntegerValue;
	}

}
