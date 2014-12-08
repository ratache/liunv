/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junittesting;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author UndeadAmilo
 */
public class MiniCalcTest {
    
    public MiniCalcTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    /*
        Test of addition of two int values. Testing this addition method
        is related to constraints on the input and checking that the output
        is correct.
    */
    @Test
    public void testadd() {
        try{
            new MiniCalc();
            fail();
        }
        catch(IllegalArgumentException e){
            //ok!
        }
        fail("The test case is a prototype.");
    }
    
}
