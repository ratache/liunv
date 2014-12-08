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
    
    public MiniCalcTest() {
    }

    @Test
    public void testadd() {
        try{
            MiniCalc bob = new MiniCalc();
            assertNull("Testing if minicalc is instantiated",bob);
//assertTrue(bob.add(1,-5).equals(-4),"Checking add with negative value");
           //fail();
        }
        catch(IllegalArgumentException e){
            //ok!
        }
    }
    
}
