import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class RationalTest {
    @Test
    public void testRational(){
        Rational r = new Rational();
        assertNotNull(r);
    }

    @Test
    public void testRational2() throws Rational.Illegal {
        long nomainator = 5;
        long denominator = 10;
        Rational r = new Rational(nomainator, denominator);
        assertNotNull(r);
    }

    @Test
    public void testAdd() throws Rational.Illegal {
        Rational x = new Rational(1, 3);
        Rational y = new Rational(1,6);
        x.add(y);
        assertEquals(1, x.numerator);
        assertEquals(2, x.denominator);
    }

    @Test
    public void testSubtract(){
        try {
            Rational x = new Rational(2, 3);
            Rational y = new Rational(1,6);
            x.subtract(y);
            assertEquals(1, x.numerator);
            assertEquals(2, x.denominator);
        } catch (Rational.Illegal illegal) {
            illegal.printStackTrace();
        }
    }

    @Test
    public void testMultiply() throws Rational.Illegal {
        Rational x = new Rational(4, 5);
        Rational y = new Rational(1,4);
        x.multiply(y);
        assertEquals(1, x.numerator);
        assertEquals(5, x.denominator);
    }

    @Test
    public void testDivide() throws Rational.Illegal {
        Rational x = new Rational(5, 8);
        Rational y = new Rational(2,3);
        x.divide(y);
        assertEquals(15, x.numerator);
        assertEquals(16, x.denominator);
    }

    @Test
    public void stringTest() throws Rational.Illegal {
        Rational r = new Rational(7,8);
        Rational s = new Rational(5,1);
        assertEquals("7/8",r.toString());
        assertEquals("5", s.toString());
    }


}
