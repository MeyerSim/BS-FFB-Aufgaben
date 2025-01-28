import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TesteSetter.
 *
 * @author  (Bichler)
 * @version (Nov 2019)
 */
public class TesteSetter
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

    @Test
    public void testSetX()
    {
        robo1.setX(5.0);
        assertEquals( 5.0, robo1.getX(), 0.00000001 );
    }

    @Test
    public void testSetY()
    {
        robo1.setY(6.0);
        assertEquals( 6.0, robo1.getY(), 0.00000001 );
    }
}
