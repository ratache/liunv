/*
    Testa JUnit
    Per Johansson - tdd inl1
 */
package junittesting;

import java.io.IOException;

/**
 *
 * @author Per
 */
public class main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        MiniMenu menu = new MiniMenu();
        while(menu.run()){
            System.out.println("Program Quit");
        }
    }
    
}