import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class testeGehenOhneParameter.
 *
 * @author  (Bichler)
 * @version (Nov 2019)
 */
public class TesteGehenOhneParameter
{
    private Roboter robo1;
    private Roboter robo2;
    private Roboter ursprung;

    @Before
    public void setUp()
    {
        robo1 = new Roboter(1,2);
        robo2 = new Roboter(3,4);
        ursprung = new Roboter();
    }
    // allgemeine Methoden
    @Test    public void testGeheNachRechts()
    {
        robo1.goRight();
        assertEquals( 2.0, robo1.getX(), 0.0000001 );
        assertEquals( 2.0, robo1.getY(), 0.0000001 );
    }

    @Test    public void testGeheNachLinks()
    {
        robo1.goLeft();
        assertEquals( 0.0, robo1.getX(), 0.0000001 );
        assertEquals( 2.0, robo1.getY(), 0.0000001 );
    }

    @Test    public void testGeheNachOben()
    {
        robo1.goUp();
        assertEquals( 1.0, robo1.getX(), 0.0000001 );
        assertEquals( 1.0, robo1.getY(), 0.0000001 );
    }

    @Test    public void testGeheNachUnten()
    {
        robo1.goDown();
        assertEquals( 1.0, robo1.getX(), 0.0000001 );
        assertEquals( 3.0, robo1.getY(), 0.0000001 );
    }

}
