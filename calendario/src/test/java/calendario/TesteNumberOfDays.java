//Teste unitários da classe Cal 

package calendario;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TesteNumberOfDays{

    private Cal calendar; //Initialize calendar 
     
    @BeforeEach
    public void setUp() {
        calendar = new Cal();  // Initialize calendar here
    }
   
    @Test
    public void testeNumberOfDaysBefore1752() {
        //A contagem de dias antes do calendario Gregoriano
        assertEquals(31, calendar.numberOfDays(3, 1752));
        assertEquals(31, calendar.numberOfDays(12, 1752));
        assertEquals(31, calendar.numberOfDays(10, 1753));

    }

    @Test
    public void testNumberOfDaysOtherMonths() {
        // Testa se o método retorna o número correto de dias para outros meses

        assertEquals(31, calendar.numberOfDays(1, 2024)); // Janeiro
        assertEquals(30, calendar.numberOfDays(4, 2001)); // Abril
        assertEquals(31, calendar.numberOfDays(7, 1989)); // Julho
        assertEquals(31, calendar.numberOfDays(12, 2022)); // Dezembro
    }

       
    
}