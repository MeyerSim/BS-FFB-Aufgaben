import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TesteAbstandsermittlung.
 *
 * @author  (Bichler)
 * @version (Nov 2019)
 */
public class TesteAbstandsermittlung
{
    private Roboter robo1;
    private Roboter robo2;
    private Roboter robo3;
    private Roboter ursprung;

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        robo1 = new Roboter(1,2);
        robo2 = new Roboter(3,4);
        robo3 = new Roboter(1,2);
        ursprung = new Roboter();
    }

    @Test
    public void testdistFromOrigin()
    {
        assertEquals(2.23606797, robo1.distFromOrigin(), 0.00000001 );
        assertEquals(0.0, ursprung.distFromOrigin(), 0.00000001 );
        assertEquals(5.0, robo2.distFromOrigin(), 0.00000001 );
    }

    @Test
    public void testdistFrom(){
        assertEquals(2.23606797, robo1.distFrom(new Roboter(0,0)), 0.00000001);
        assertEquals(12.529964086, robo1.distFrom(new Roboter(7,13)), 0.00000001);
    }

    @Test
    public void testmeetRoboter()
    {
        Roboter robo3 = new Roboter(1,2);
        assertEquals(true, robo3.meetRoboter(robo1));
        assertEquals(false, robo2.meetRoboter(robo1));
        assertEquals(false, robo3.meetRoboter(robo2));
    }
}
