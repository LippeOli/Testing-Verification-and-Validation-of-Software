package calendario;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class TestCal {
  public Cal calendar;

  @BeforeEach
  void setup() {
    calendar = new Cal();
  }

  @Test
  void testMonthWith30DaysStartingOnMonday() {
    String expected = "    1  2  3  4  5  6\n"
        + " 7  8  9 10 11 12 13\n"
        + "14 15 16 17 18 19 20\n"
        + "21 22 23 24 25 26 27\n"
        + "28 29 30 ";
    assertEquals(expected, calendar.cal(1, 30));
  }

  @Test
  void testMonthWith28DaysStartingOnThursday() {
    String expected = "             1  2  3\n"
        + " 4  5  6  7  8  9 10\n"
        + "11 12 13 14 15 16 17\n"
        + "18 19 20 21 22 23 24\n"
        + "25 26 27 28 ";
    assertEquals(expected, calendar.cal(4, 28));
  }

  @Test
  void testMonthWith31DaysStartingOnSunday() {
    String expected = " 1  2  3  4  5  6  7\n"
        + " 8  9 10 11 12 13 14\n"
        + "15 16 17 18 19 20 21\n"
        + "22 23 24 25 26 27 28\n"
        + "29 30 31 ";
    assertEquals(expected, calendar.cal(0, 31));
  }

  @Test
  void testSpecificCase() {
    String expected = "       1  2 14 15 16\n"
        + "17 18 19 20 21 22 23\n"
        + "24 25 26 27 28 29 30";
    assertEquals(expected, calendar.cal(3, 19));
  }

}
