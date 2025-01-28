import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TesteKopieKonstruktor.
 *
 * @author  (Bichler)
 * @version (Nov 2019)
 */
public class TesteCopyKonstruktor
{
    private Roboter robo1;
    private Roboter robo2;

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

    @Test
    public void testCopyKonstruktor()
    {
        Roboter roboterKopie = new Roboter(robo1);
        assertEquals( 1.0, roboterKopie.getX(), 0.00000001 );
        assertEquals( 2.0, roboterKopie.getY(), 0.00000001 );
    }   

}
