import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class LeapYearTest {
        @Test
        public void leapyear_if_divided_by_4_and_not_100(){
            assertTrue(leapyear.isLeapYear(4));
            assertFalse(leapyear.isLeapYear(200));}

        @Test
        public void leapyear_if_divided_by_400() {
            assertTrue(leapyear.isLeapYear(2000));}

        @Test
        public void not_leapyear_if_not_divided_by_4() {
            assertFalse(leapyear.isLeapYear(5));}

        @Test
        public void not_leapyear_if_divided_by_100_and_not_400() {
            assertFalse(leapyear.isLeapYear(1700));
    }
}
