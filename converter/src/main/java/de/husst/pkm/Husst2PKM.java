package de.husst.pkm;

import java.io.File;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

/**
 * The Class Husst2PKM.
 */
public class Husst2PKM {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		final File husstDatabaseFile;
		final File pkmTargetFile;

		// create the parser
		final CommandLineParser parser = new DefaultParser();
		CommandLine line = null;

		// generate cli options
		Options options = new Options();
		options.addOption("help", false, "Show this help");
		options.addOption("h", "husst-database", true, "HuSSt Tariff as DB3 Database");
		options.addOption("p", "pkm-file", true, "PKM target file name");
		try {
			// parse the command line arguments
			line = parser.parse(options, args);
			if (line.hasOption("help") || !line.hasOption("h") || !line.hasOption("p")) {
				HelpFormatter formatter = new HelpFormatter();
				formatter.printHelp("husst2pkm", options);
				return;
			}
		} catch (ParseException exp) {
			System.err.println("Parsing failed, reason: " + exp.getMessage());
		}

		// get arguments and check
		husstDatabaseFile = new File(line.getOptionValue("h"));
		pkmTargetFile = new File(line.getOptionValue("p"));
		if (!husstDatabaseFile.exists()) {
			System.err.println("HuSSt Database " + husstDatabaseFile.getAbsolutePath() + " doesn't exist");
			return;
		}

		if (!pkmTargetFile.exists()) {
			System.err.println("PKM target directory for " + pkmTargetFile.getAbsolutePath() + " doesn't exist");
			return;
		}

		// start conversion
		System.out.println("Starting HuSSt to PKM conversion with");
		System.out.println("HuSSt Database  :" + husstDatabaseFile.getAbsolutePath());
		System.out.println("PKM Target file :" + pkmTargetFile.getAbsolutePath());
		H2PConverter converter = new H2PConverter();
		try {
			converter.generatePKM(husstDatabaseFile, pkmTargetFile);
		} catch (Exception e) {
			System.err.println("Conversion failed, reason" + e.getMessage());
			return;
		}

		System.out.println("Conversion finished");
	}

}
