import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MathTest {

    @Test
    void factorialTest(){
        assertEquals(1, Math.factorial(0));
        assertEquals(1, Math.factorial(1));
        assertEquals(362880, Math.factorial(9));
        assertEquals(24, Math.factorial(4));
    }

    @Test
    void factorialIllegalArgumentTest(){
        assertThrows(IllegalArgumentException.class, () -> Math.factorial(-1));
    }
}
