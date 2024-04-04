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

    @Test
    public void testNextSecond2() {
        Time time = new Time(12, 59, 44);
        Time expectedTime = new Time(12, 59, 45);
        assertEquals(expectedTime, time.nextSecond());
    }

    @Test
    public void testNextSecond3() {
        Time time = new Time(1, 9, 59);
        Time expectedTime = new Time(1, 10, 0);
        assertEquals(expectedTime, time.nextSecond());
    }

    @Test
    public void testNextSecond4() {
        Time time = new Time(17, 59, 59);
        Time expectedTime = new Time(18, 0, 0);
        assertEquals(expectedTime, time.nextSecond());
    }

    @Test
    public void testNextSecond5() {
        Time time = new Time(23, 59, 59);
        Time expectedTime = new Time(0, 0, 0);
        assertEquals(expectedTime, time.nextSecond());
    }
}