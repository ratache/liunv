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
    public void testCorrectCalls() {//tests for correct output
        assertNotNull("Testing if minicalc is instantiated",bob);
        assertEquals(-4, bob.add(1, -5));//testing negative value one
        assertEquals(5, bob.subtract(10,5));//testing subtract
        assertEquals(0.4, bob.divide(4,10), 0.001);//testing divide
        assertEquals(16, bob.multiply(4,4));
        assertEquals("FEDCBA0", bob.intToHex(267242400));
        assertEquals("1", bob.intToBinary(1));
        assertEquals("11110111111", bob.intToBinary(1983));
        assertEquals("1111111111111111", bob.intToBinary(65536));
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testIllegalArgumentIntToHex(){
        int negative = -1;
        bob.intToHex(negative);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testIllegalArgumentIntToBin(){
        int negative = -1;
        bob.intToBinary(negative);
    }
    
    @Test
    public void testZeroIntegerInput(){
        int zeroInt = 0;
        assertEquals("0", bob.intToHex(zeroInt));
        assertEquals("", bob.intToBinary(zeroInt));        
    }
}
