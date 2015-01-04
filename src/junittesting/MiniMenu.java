package junittesting;

import java.io.IOException;

/**
 *
 * @author Per
 */
public class MiniMenu {
    private MiniCalc calc = new MiniCalc();
    
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

    public void callCalculator(int choice) throws IOException {
        int integer1 = 0;
        int integer2 = 0;
        int integerResult = 0;
        double doubleResult = 0.0;
        
        if(choice==1){
            System.out.println("***************************************\n"
                + "Addition\n"
                + "***************************************\n"
                    + "Enter first integer:");
            integer1 = System.in.read();
            System.out.println("\nEnter second integer:");
            integer2 = System.in.read();
            integerResult = calc.add(integer1, integer2);
            printResult(Integer.toString(integerResult));
        }
    }

    private void printResult(String integerResult) {
        System.out.println("\nResult "+integerResult+"\n");
    }
}
