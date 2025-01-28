import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TesteEquals.
 *
 * @author  (Bichler)
 * @version (Nov 2019)
 */
public class TesteEquals
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
    public void testAbstandVomUrsprung()
    {
        assertEquals(2.23606797, robo1.distFromOrigin(), 0.00000001 );
        assertEquals(0.0, ursprung.distFromOrigin(), 0.00000001 );
        assertEquals(5.0, robo2.distFromOrigin(), 0.00000001 );
    }

    @Test
    public void testDistanz(){
        assertEquals(2.23606797, robo1.distFrom(new Roboter(0,0)), 0.00000001);
        assertEquals(12.529964086, robo1.distFrom(new Roboter(7,13)), 0.00000001);
    }

    @Test
    public void testTrifft()
    {
        Roboter robo3 = new Roboter(1,2);
        assertEquals(true, robo3.meetRoboter(robo1));
        assertEquals(false, robo2.meetRoboter(robo1));
        assertEquals(false, robo3.meetRoboter(robo2));
    }

    @Test
    public void testEquals()
    {
        Roboter robo3 = new Roboter(1,2);
        assertEquals(true, robo3.equals(robo1));
        assertEquals(false, robo2.equals(robo1));
        assertEquals(false, robo3.equals(robo2));

        assertEquals(false, robo3.equals(null));
        assertEquals(true, robo1.equals(robo1));
        assertEquals(false, robo3.equals(new Object()));
    }

    @Test
    public void testStehtUeber()
    {
        Roboter robo3 = new Roboter(1,2);
        assertEquals(true, robo1.standsAbove(new Roboter(1,2.1)));
        assertEquals(false, robo1.standsAbove(new Roboter(1,1.9)));

        assertEquals(false, robo1.standsAbove(robo1));
        assertEquals(false, robo1.standsAbove(robo3));

    }

    @Test
    public void testStehtUnter()
    {
        Roboter robo3 = new Roboter(1,2);
        assertEquals(false, robo1.standsBelow(new Roboter(1,2.1)));
        assertEquals(true, robo1.standsBelow(new Roboter(1,1.9)));

        assertEquals(false, robo1.standsBelow(robo1));
        assertEquals(false, robo1.standsBelow(robo3));
    }

    @Test
    public void testStehtRechtsVon()
    {
        Roboter robo3 = new Roboter(1,2);
        assertEquals(false, robo1.standsRightOf(new Roboter(1.1,2)));
        assertEquals(true, robo1.standsRightOf(new Roboter(0.9,2)));

        assertEquals(false, robo1.standsRightOf(robo1));
        assertEquals(false, robo1.standsRightOf(robo3));
    }

    @Test
    public void testStehtLinksVon()
    {
        Roboter robo3 = new Roboter(1,2);
        assertEquals(true, robo1.standsLeftOf(new Roboter(1.1,2)));
        assertEquals(false, robo1.standsLeftOf(new Roboter(0.9,2)));

        assertEquals(false, robo1.standsLeftOf(robo1));
        assertEquals(false, robo1.standsLeftOf(robo3));
    }

}
