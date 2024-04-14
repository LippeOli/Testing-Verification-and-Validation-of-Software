package calendario;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class TestCalClass {
  public Cal calendar;

  @BeforeEach
  void setup() {
    calendar = new Cal();
  }

  @Test
  void testFirstOfMonth() {
    // Teste para o mês de janeiro de 2024, que começa em uma terça-feira (2)
    assertEquals(4, calendar.firstOfMonth(2, 2024));

    // Teste para o mês de fevereiro de 2024, que começa em uma sexta-feira (5)
    assertEquals(4, calendar.firstOfMonth(2, 2024));

    // Teste para o mês de setembro de 1752, que começa em uma quinta-feira (4)
    assertEquals(2, calendar.firstOfMonth(9, 1752));
  }

  @Test
  void testNumberOfDays() {
    // Teste para o mês de fevereiro de 2024, que tem 29 dias (ano bissexto)
    assertEquals(29, calendar.numberOfDays(2, 2024));

    // Teste para o mês de setembro de 1752, que tem 19 dias (calendário juliano)
    assertEquals(19, calendar.numberOfDays(9, 1752));

    // Outro teste para verificar se não é nulo
    assertNotNull(calendar.numberOfDays(8, 2022));
  }

  @Test
  void testIsLeap() {
    // Teste para um ano bissexto antes de 1752 (1700)
    assertTrue(calendar.isLeap(1700));

    // Teste para um ano que não é bissexto antes de 1752 (1701)
    assertFalse(calendar.isLeap(1701));

    // Teste para um ano bissexto após 1752 (2020)
    assertTrue(calendar.isLeap(2020));

    // Teste para um ano que não é bissexto após 1752 (1800)
    assertFalse(calendar.isLeap(1800));

    // Teste para verificar se não é nulo
    assertNotNull(calendar.isLeap(2020));
  }

}
