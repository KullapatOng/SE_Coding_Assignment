import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CupTest {

    @Test
    void getLiquidType() {
        Cup c = new Cup("Orange juice", 85.7);
        assertEquals("Orange juice", c.getLiquidType());
    }

    @Test
    void getPercentagefull(){
        Cup d = new Cup("Cocoa", 75.45);
        assertEquals(75.45, d.getPercentfull());
    }
}