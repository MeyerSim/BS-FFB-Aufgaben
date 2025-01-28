

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Die Test-Klasse AutoTest.
 *
 * @author  (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class AutoTest
{
    private Auto autoStandard;
    private Auto autoVariabel;
    
    /**
     * Konstruktor fuer die Test-Klasse AutoTest
     */
    public AutoTest()
    {
    }

    /**
     *  Setzt das Testgerüst fuer den Test.
     *
     * Wird vor jeder Testfall-Methode aufgerufen.
     */
    @Before
    public void setUp()
    {
        autoStandard = new Auto();
        autoVariabel = new Auto(40.0,4.0);
    }
    
    //Test getBenzinStand
    
    @Test
    public void testGetBenzinStand()
    {
        assertEquals(0.0, autoStandard.getBenzinStand(), 0.000001);
        assertEquals(0.0, autoVariabel.getBenzinStand(), 0.000001);
    }
    
    //Test getKmStand
    
    @Test
    public void testGetKmStand()
    {
        assertEquals(0, autoStandard.getKmStand(), 0.000001);
        assertEquals(0, autoVariabel.getKmStand(), 0.000001);
    }
    
    //Test tanken
    
    @Test
    public void testTanken()
    {
        autoStandard.tanken(40);
        assertEquals(40, autoStandard.getBenzinStand(), 0.000001);
        autoVariabel.tanken(40);
        assertEquals(40, autoVariabel.getBenzinStand(), 0.000001);
     }
    
    // Test fahren
        
    @Test
    public void testFahrenBenzinStandErniedrigen()
    {
        autoStandard.tanken(10);
        autoStandard.fahren(100);
        assertEquals(5.0, autoStandard.getBenzinStand(), 0.000001);
        autoVariabel.tanken(10);
        autoVariabel.fahren(100);
        assertEquals(6.0, autoVariabel.getBenzinStand(), 0.000001);
    }
    
    @Test
    public void testFahrenKilometerStandErhoehen()
    {
        autoStandard.tanken(10);
        autoStandard.fahren(2);
        assertEquals(2,autoStandard.getKmStand(),0.000001);
        autoVariabel.tanken(10);
        autoVariabel.fahren(2);
        assertEquals(2,autoVariabel.getKmStand(),0.000001);
    }
    
    // Test Kennzeichen
    
    @Test
    public void testSetUndGetKennzeichen()
    {
        autoStandard.setKennzeichen("FFB A-123");
        assertEquals("FFB A-123", autoStandard.getKennzeichen());
    }
    
            
    @Test
    public void testFahrenBisTankLeer()
    {
        autoStandard.tanken(10);
        autoStandard.fahren(10000);
        assertEquals(0.0, autoStandard.getBenzinStand(), 0.000001);
        assertEquals(200,autoStandard.getKmStand(),0.000001);
        autoVariabel.tanken(10);
        autoVariabel.fahren(10000);
        assertEquals(0.0, autoVariabel.getBenzinStand(), 0.000001);
        assertEquals(250,autoVariabel.getKmStand(),0.000001);
    }
    
    @Test
    public void testUebertanken()
    {
        autoStandard.tanken(100);
        assertEquals(50.0, autoStandard.getBenzinStand(), 0.000001);
        autoVariabel.tanken(100);
        assertEquals(40.0, autoVariabel.getBenzinStand(), 0.000001);
    }
    
 
    @Test
    public void testVolltanken()
    {
        autoStandard.tanken();
        assertEquals(50.0, autoStandard.getBenzinStand(), 0.000001);
        autoVariabel.tanken();
        assertEquals(40.0, autoVariabel.getBenzinStand(), 0.000001);
    }
        
    

}
