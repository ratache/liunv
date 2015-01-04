/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junittesting;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

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
 * REFs:
 * http://martinfowler.com/articles/mocksArentStubs.html
 * In these tests the collaborator is MiniCalc and SUT is MiniMenu
 * Mockin is about setting up data and expected results. Running the code
 * and make sure the returned value equals the expected mock value.
 * This applies to expecting bad values aswell.
 * The MiniMenu class is polled by main() in a while loop until the user quits
 * under real conditions.
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

    /*
        This test tests behaviour when menu choice is correct.
    */
    @Test
    public void testCorrectlyMenuChoice() throws Exception {
        //given
        int menuChoice,add = 1;
        int result = 2;
        when(bobMock.add(add, add)).thenReturn(result);//this is the expected result
        //when
        int resultOfCall = bobMenu.getChoice();
        //then
        assertThat(resultOfCall, is(result));
    }
    
    @Test
    public void testIncorrectlyMenuChoice()throws Exception {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
