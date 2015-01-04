package junittesting;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 *
 * @author Per Johansson
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
        We have three different abstract valuetypes, the choice of the user
        the expected result and input.
        *SUT MiniMenu.callCalculator()
    */
    @Test
    public void testCorrectlyMenuChoice() throws Exception {
        //given
        int menuChoice = 1;
        int num1 = 1;
        int num2 = 1;
        int result = 2;
        bobMenu.setMockObject(bobMock);
        when(bobMock.add(num1, num1)).thenReturn(result);//this is the expected result
        
        //when
        bobMenu.callCalculator(menuChoice);
        //then
        verify(bobMock).add(num1, num2);
    }
    
//    @Test
//    public void testIncorrectlyMenuChoice()throws Exception {
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
