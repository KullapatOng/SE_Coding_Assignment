import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class RationalTest {
    @Test
    public void testRational(){
        Rational r = new Rational();
        assertNotNull(r);
        //the actual output, the null is the expected output
    }

    @Test
    public void testRational2(){
        long nomainator = 5;
        long denomainator = 10;
        try {
            Rational r = new Rational(nomainator, denomainator);
            assertNotNull(r);
        } catch (Rational.Illegal illegal) {
            illegal.printStackTrace();
        }
    }

    @Test
    public void addTest(){
        try {
            Rational r = new Rational(5, 4).add(new Rational(3,4));
            assertNotNull(r);
        } catch (Rational.Illegal illegal) {
            illegal.printStackTrace();
        }
    }

}
