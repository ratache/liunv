package junittesting;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Per
 */
public class MiniMenu {
    private MiniCalc calc;
    boolean DEBUG = true;
    Scanner scan;

    //Constructor with dependency injection
    public MiniMenu(MiniCalc inparam){
        calc = inparam;
        scan = new Scanner(System.in);
    }
    
    boolean run() throws IOException {        
        int choice = getChoice();    
        if(choice!=7){
            callCalculator(choice);
            return false;
        }
        else{
            return true;
        }
    }

    public int getChoice() throws IOException {
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
        
        int choice = scan.nextInt();
        return choice;
    }    

    public void callCalculator(int choice) throws IOException {
        int integer1 = 0;
        int integer2 = 0;
        double double1 = 0.0;
        double double2 = 0.0;
        String strResult;
        
        if(choice==1){
            System.out.println("***************************************\n"
                + "Addition\n"
                + "***************************************\n"
                    + "Enter first integer:");
            
            integer1 = scan.nextInt();            
            System.out.println("\nEnter second integer:");
            integer2 = scan.nextInt();
            
            if(DEBUG){
                integer1 = 1;
                integer2 = 1;                
            }            
            
            int integerResult = calc.add(integer1, integer2);
            printResult(Integer.toString(integerResult));
        }
        else if(choice==2){
            System.out.println("***************************************\n"
                    + "Subtraction\n"
                    + "***************************************\n"
                    + "Enter first integer:");
            
            integer1 = scan.nextInt();
            System.out.println("\nEnter second integer:");
            integer2 = scan.nextInt();
            
            int integerResult = calc.subtract(integer1, integer2);
            printResult(Integer.toString(integerResult));
        }
        else if(choice==3){
            System.out.println("***************************************\n"
                    + "Divide\n"
                    + "***************************************\n"
                    + "Enter first integer:");
            
            integer1 = scan.nextInt();
            System.out.println("\nEnter second integer:");
            integer2 = scan.nextInt();
            
            double doubleResult = calc.divide(integer1, integer2);
            printResult(String.valueOf(doubleResult));
        }
        else if(choice==4){
            System.out.println("***************************************\n"
                    + "Multiply\n"
                    + "***************************************\n"
                    + "Enter first integer:");
            
            integer1 = scan.nextInt();
            System.out.println("\nEnter second integer:");
            integer2 = scan.nextInt();
            
            int integerResult = calc.multiply(integer1, integer2);
            printResult(Integer.toString(integerResult));
        }
        else if(choice==5){

            System.out.println("***************************************\n"
                    + "Int to hex\n"
                    + "***************************************\n"
                    + "Enter integer:");
            if(DEBUG){
                strResult = calc.intToHex(1);
            }
            else{
                integer1 = scan.nextInt();
                strResult = calc.intToHex(integer1);
            }          
            printResult(strResult);
        }
        else if(choice==6){

            System.out.println("***************************************\n"
                    + "Int to binary\n"
                    + "***************************************\n"
                    + "Enter integer:");
            
            if(DEBUG){
                strResult = calc.intToBinary(1);
            }
            else{
                integer1 = scan.nextInt();
                strResult = calc.intToBinary(integer1);
            }          
            printResult(strResult);
        }
    }

    private void printResult(String integerResult) {
        System.out.println("\nResult "+integerResult+"\n");
    }
    //Setter injection
    public void setMockObject(MiniCalc bobInject){
        calc = bobInject;
    }
}
