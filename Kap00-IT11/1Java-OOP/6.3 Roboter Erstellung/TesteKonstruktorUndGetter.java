import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TesteKonstruktorUndGetter.
 *
 * @author  (Bichler)
 * @version (Nov 2019)
 */
public class TesteKonstruktorUndGetter
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
        ursprung = new Roboter();
    }

    @Test
    public void testStandardKonstruktorUndGetter()
    {
        assertEquals( 0.0, ursprung.getX(), 0.00000001 );
        assertEquals( 0.0, ursprung.getY(), 0.00000001 );
    }

    @Test
    public void testKonstruktorUndGetter()
    {
        assertEquals( 1.0, robo1.getX(), 0.00000001 );
        assertEquals( 2.0, robo1.getY(), 0.00000001 );
    }
}
