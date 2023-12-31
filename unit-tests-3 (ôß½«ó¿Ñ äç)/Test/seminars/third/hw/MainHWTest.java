package seminars.third.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MainHWTest {

    @Test
    public void testIsNumberInRange() {
        assertTrue(MainHW.isNumberInRange(50));
        assertTrue(MainHW.isNumberInRange(100));
        assertTrue(MainHW.isNumberInRange(25));

        assertFalse(MainHW.isNumberInRange(24));
        assertFalse(MainHW.isNumberInRange(101));
        assertFalse(MainHW.isNumberInRange(-50));
    }

    @Test
    public void testIsEvenNumber() {
        assertTrue(MainHW.isEvenNumber(2));

        assertFalse(MainHW.isEvenNumber(3));

        assertTrue(MainHW.isEvenNumber(0));

        assertTrue(MainHW.isEvenNumber(-4));

        assertFalse(MainHW.isEvenNumber(-5));
    }
}