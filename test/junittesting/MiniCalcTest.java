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
            int x1 = 1;
            int x2 = -5;
            bob.add(x1, x2);
           //fail();
        }
        catch(IllegalArgumentException e){
            //ok!
        }
    }
    
}
