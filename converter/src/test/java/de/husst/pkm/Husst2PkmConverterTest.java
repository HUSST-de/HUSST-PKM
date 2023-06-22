package de.husst.pkm;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import org.junit.Test;

import jakarta.xml.bind.JAXBException;

public class Husst2PkmConverterTest {   

    H2PConverter sut=new H2PConverter();
    
    
    /**
     * Test generate PKM demotarif.
     *
     * @throws ClassNotFoundException the class not found exception
     * @throws JAXBException the JAXB exception
     * @throws SQLException the SQL exception
     * @throws IOException Signals that an I/O exception has occurred.
     * @throws Exception the exception
     */
    @Test
    public void testGeneratePKMDemotarif() throws ClassNotFoundException, JAXBException, SQLException, IOException, Exception {
        File husstDemoTariffFile=new File("./src/test/ressources/HUSST_Demotarif_HUSST4Maas_1.0.db3");
        File husstDemoTariffPkmFile=new File("./src/test/ressources/");
        sut.generatePKM(husstDemoTariffFile, husstDemoTariffPkmFile);
    }
}
