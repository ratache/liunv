package junittesting;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
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
    public MiniMenu sutMenu;
    private MiniCalc mockedCalc;
    
    public MiniMenuTest() {
        
    }
 
    @Before
    public void setUp() {
        //given
        sutMenu = new MiniMenu();
        mockedCalc = mock(MiniCalc.class);
        sutMenu.setMockObject(mockedCalc);
        //when
        when(mockedCalc.add(1, 1)).thenReturn(2);//this is the expected result
    }

    /*
        This test tests behaviour when menu choice is correct.
        We have three different abstract valuetypes, the choice of the user
        the expected result and input.
        *SUT MiniMenu.callCalculator()
    */
    @Test
    public void testBasicFunctionalityWorks() throws Exception {
        sutMenu.callCalculator(1);       
        //then
//        assertSame(2,mockedCalc.add(1, 1));//Here we assert the add result
        verify(mockedCalc,times(1)).add(-1, -1);//Verifies that method is tested
    }
    
//    @Test
//    public void testIncorrectlyMenuChoice()throws Exception {
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
