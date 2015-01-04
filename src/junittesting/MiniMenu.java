/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junittesting;

import java.io.IOException;

/**
 *
 * @author Per
 */
public class MiniMenu {

    boolean run() throws IOException {
        int choice = getChoice();
        if(choice!=7){
            callCalculator(choice);
            return true;
        }
        else{
            return false;
        }
    }

    public int getChoice() throws IOException {
        int choice;
        System.out.println("***************************************\n"
                + "MENU\n"
                + "***************************************\n"
                + "1. Addition\n"
                + "2. Subtraction\n"
                + "3. Divide\n"
                + "4. Multiply\n"
                + "5. Number to hex value\n"
                + "6. Number to binary value\n"
                + "7. Quit\n");
        choice = System.in.read();
        
        return choice;
    }    

    private void callCalculator(int choice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
