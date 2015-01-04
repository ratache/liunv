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
import static org.mockito.Mockito.mock;

/**
 *
 * @author Per Johansson
 * this test follows a guide/book called Instant Mockito by
 * Grzejszczak, Marcin. 
 * Notes about procedure of testing with this framework
 * For each defined test method:
    * 1.define how your mock should behave(given)
    * 2.execute the code(when)
    * 3.verify the behaviour on the mock (then) 
 */
public class MiniMenuTest {
    public MiniMenu bobMenu;
    private MiniCalc bobMock;
    
    public MiniMenuTest() {
        bobMock = mock(MiniCalc.class);
    }
 
    @Before
    public void setUp() {
        bobMenu = new MiniMenu();
    }

    @Test
    public void testCorrectlyMenuChoice() throws Exception {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testIncorrectlyMenuChoice()throws Exception {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
