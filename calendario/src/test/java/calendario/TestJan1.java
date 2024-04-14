package calendario;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class TestJan1 {
  public Cal calendar;

  @BeforeEach
  void setup() {
    calendar = new Cal();
  }

  @Test
  void testCalendarWithPositiveAndNegativeNumbers() {
    assertEquals(calendar.jan1(2024), 1);
    assertEquals(calendar.jan1(9999), 5);
    assertEquals(calendar.jan1(99999), 5);
    assertEquals(calendar.jan1(0), 4);
    assertEquals(calendar.jan1(-2024), -5);
    assertEquals(calendar.jan1(-9999), -6);
    assertEquals(calendar.jan1(-99999), -2);
  }

  @Test
  void testGregorianCalendar() {
    assertEquals(calendar.jan1(2022), 6);
    assertEquals(calendar.jan1(2023), 0);
    assertEquals(calendar.jan1(2024), 1);
  }

  @Test
  void testJulianCalendar() {
    assertEquals(calendar.jan1(1750), 1);
    assertEquals(calendar.jan1(1755), 3);
    assertEquals(calendar.jan1(1760), 2);
  }

  @Test
  void testCalendarChange() {
    assertEquals(calendar.jan1(1754), 2);
    assertEquals(calendar.jan1(1800), 3);
  }
}
