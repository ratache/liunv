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
        assertEquals(2, bob.divide(10,5));//testing divide
    }
}
