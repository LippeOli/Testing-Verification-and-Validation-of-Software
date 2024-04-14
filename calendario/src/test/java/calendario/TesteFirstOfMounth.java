//Teste unitários da funcao FOM (First Of Mounth) 

package calendario;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TesteFirstOfMounth {

    public Cal calendar;  
     
    @BeforeEach
    public void setUp() {
        calendar = new Cal();  // Inicializa o calendar 
    }
  

    @Test
    public void testFOMJaneiro2024() {
        //teste do mês de janeiro 
        assertEquals(1, calendar.firstOfMonth(1, 2024));
    }

    @Test
    public void testFOMMMaio2009() {
        //teste do mês de Maio
        assertEquals(5, calendar.firstOfMonth(5, 2009));
    }

    @Test
    public void testFOMAbril2004(){
        //teste do mês de Abril
        assertEquals(4, calendar.firstOfMonth(4, 2004));
    }

    @Test
    public void testFOMDecember1999(){
        //teste doe mês de Dezembro
        assertEquals(3, calendar.firstOfMonth(12, 1999));
    }
    
    
    
}