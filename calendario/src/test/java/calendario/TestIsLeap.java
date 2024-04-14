package calendario;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class TestIsLeap {
  public Cal calendar;

  @BeforeEach
  void setup() {
    calendar = new Cal();
  }

  @Test
  void testLeapYearsBefore1752() {
    // Anos bissextos antes de 1752 são determinados apenas pela divisibilidade por 4
    assertEquals(true, calendar.isLeap(1700));
    assertEquals(false, calendar.isLeap(1701));
    assertEquals(true, calendar.isLeap(1704));
    assertEquals(true, calendar.isLeap(1752)); // 1752 é um ano bissexto no calendário juliano
  }

  @Test
  void testLeapYearsAfter1752() {
    // Anos bissextos após 1752 são determinados pelas regras gregorianas
    assertEquals(false, calendar.isLeap(1800)); // 1800 é divisível por 100 mas não por 400
    assertEquals(true, calendar.isLeap(2000)); // 2000 é divisível por 400
    assertEquals(false, calendar.isLeap(1900)); // 1900 é divisível por 100 mas não por 400
    assertEquals(true, calendar.isLeap(2020)); // 2020 é divisível por 4
  }
}
