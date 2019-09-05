package pac;

import org.junit.Test;
import static org.junit.Assert.*;

public class TranslateTest {
    Translate tr = new Translate();
    
    @Test
    public void testGetLimitation(){
        for (int i = 1; i <= 25; i++) {
            assertEquals(1, tr.getLimitation(i));
        }
        
        for (int i = 26; i <= 50; i++) {
            assertEquals(2, tr.getLimitation(i));
        }
        
        for (int i = 51; i <= 75; i++) {
            assertEquals(3, tr.getLimitation(i));
        }
        
        for (int i = 76; i <= 100; i++) {
            assertEquals(4, tr.getLimitation(i));
        }    
    }
    
    @Test
    public void testRandomNr(){
        int temp;
        for (int i = 0; i < 20; i++) {
            temp = tr.randomNr(1);
            assertTrue(temp > 0 && temp <6);
            
            temp = tr.randomNr(2);
            assertTrue(temp > 5 && temp < 11);
            
            temp = tr.randomNr(3);
            assertTrue(temp > 10 && temp < 16);
            
            temp = tr.randomNr(4);
            assertTrue(temp > 15 && temp < 21);
        }
    }   
}
