/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junittesting;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author UndeadAmilo
 */
public class MiniCalcTest {
    private MiniCalc bob;
    
    public MiniCalcTest() {
        bob = new MiniCalc();
    }

    @Test
    public void testadd() {
        
        assertNotNull("Testing if minicalc is instantiated",bob);
        assertEquals(-4, bob.add(1, -5));//testing negative value one
        assertEquals(5, bob.subtract(10,5));//testing subtract
        assertEquals(0.4, bob.divide(4,10), 0.001);//testing divide
        assertEquals(16, bob.multiply(4,4));
        assertEquals("F4240", bob.intToHex(1000000));
      //  assertEquals("11111110", bob.intToBinary(254));
    }
}
