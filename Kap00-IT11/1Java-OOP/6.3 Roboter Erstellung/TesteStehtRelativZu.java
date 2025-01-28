import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TesteStehtRelativZu.
 *
 * @author  (Bichler)
 * @version (Nov 2019)
 */
public class TesteStehtRelativZu
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
