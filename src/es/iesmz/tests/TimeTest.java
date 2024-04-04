package es.iesmz.tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TimeTest {
    @Test
    public void testNextSecond1() {
        Time time = new Time(12, 14, 15);
        Time expectedTime = new Time(12, 14, 16);
        assertEquals(expectedTime, time.nextSecond());
    }
}