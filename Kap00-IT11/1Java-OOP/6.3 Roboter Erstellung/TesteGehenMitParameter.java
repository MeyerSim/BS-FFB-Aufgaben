import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TestegehenMitParameter.
 *
 * @author  (Bichler)
 * @version (Nov 2019)
 */
public class TesteGehenMitParameter
{
    private Roboter robo1;
    private Roboter robo2;
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
    }
    
    @Test    public void testGeheNachRechtsUmStrecke()
    {
        robo1.goRight(3);
        assertEquals( 4.0, robo1.getX(), 0.0000001 );
        assertEquals( 2.0, robo1.getY(), 0.0000001 );
    }

    @Test    public void testGeheNachLinksUmStrecke()
    {
        robo1.goLeft(3);
        assertEquals( -2.0, robo1.getX(), 0.0000001 );
        assertEquals( 2.0, robo1.getY(), 0.0000001 );
    }

    @Test    public void testGeheNachObenUmStrecke()
    {
        robo1.goUp(3);
        assertEquals( 1.0, robo1.getX(), 0.0000001 );
        assertEquals( -1.0, robo1.getY(), 0.0000001 );
    }

    @Test    public void testGeheNachUntenUmStrecke()
    {
        robo1.goDown(3);
        assertEquals( 1.0, robo1.getX(), 0.0000001 );
        assertEquals( 5.0, robo1.getY(), 0.0000001 );
    }
}
