package junittesting;

import java.io.IOException;

/**
 *
 * @author Per
 */
public class MiniMenu {
    private MiniCalc calc;
    private MiniInput input;
    

    //Constructor with dependency injection
    public MiniMenu(MiniCalc inparam){
        calc = inparam;       
        input = new MiniInput();
    }
    
//    boolean run() throws IOException {        
//        int choice = getChoice();    
//        if(choice!=7){
//            callCalculator(choice);
//            return false;
//        }
//        else{
//            return true;
//        }
//    }

//    public int getChoice() throws IOException {
//        System.out.println("***************************************\n"
//                + "MENU\n"
//                + "***************************************\n"
//                + "1. Addition\n"
//                + "2. Subtraction\n"
//                + "3. Divide\n"
//                + "4. Multiply\n"
//                + "5. Number to hex value\n"
//                + "6. Number to binary value\n"
//                + "7. Quit\n");
//        
//        int choice = input.scanForInteger();
//        return choice;
//    }    

    /*
        THIS METHOD IS IN AUTOMATIC TEST MODE
        proper method header looks like this public void callCalculator(int choice){}
    */
    public void callCalculator(int choice, int i1, int i2, double d1, double d2) throws IOException {
        int integer1 = i1;
        int integer2 = i2;
        double double1 = d1;
        double double2 = d2;
        String strResult;
        
        if(choice==1){
            System.out.println("***************************************\n"
                + "Addition\n"
                + "***************************************\n"
                    + "Enter first integer:");
            
            //integer1 = input.scanForInteger();
            System.out.println("\nEnter second integer:");
            //integer2 = input.scanForInteger();            
            
            int integerResult = calc.add(integer1, integer2);
            printResult(Integer.toString(integerResult));
        }
        else if(choice==2){
            System.out.println("***************************************\n"
                    + "Subtraction\n"
                    + "***************************************\n"
                    + "Enter first integer:");
            
            //integer1 = input.scanForInteger();
            System.out.println("\nEnter second integer:");
            //integer2 = input.scanForInteger();
            
            int integerResult = calc.subtract(integer1, integer2);
            printResult(Integer.toString(integerResult));
        }
        else if(choice==3){
            System.out.println("***************************************\n"
                    + "Divide\n"
                    + "***************************************\n"
                    + "Enter first integer:");
            
            //integer1 = input.scanForInteger();
            System.out.println("\nEnter second integer:");
            //integer2 = input.scanForInteger();
            
            double doubleResult = calc.divide(integer1, integer2);
            printResult(String.valueOf(doubleResult));
        }
        else if(choice==4){
            System.out.println("***************************************\n"
                    + "Multiply\n"
                    + "***************************************\n"
                    + "Enter first integer:");
            
            //integer1 = input.scanForInteger();
            System.out.println("\nEnter second integer:");
            //integer2 = input.scanForInteger();
            
            int integerResult = calc.multiply(integer1, integer2);
            printResult(Integer.toString(integerResult));
        }
        else if(choice==5){

            System.out.println("***************************************\n"
                    + "Int to hex\n"
                    + "***************************************\n"
                    + "Enter integer:");

//                integer1 = input.scanForInteger();
            strResult = calc.intToHex(integer1);
                      
              printResult(strResult);
        }
        else if(choice==6){

            System.out.println("***************************************\n"
                    + "Int to binary\n"
                    + "***************************************\n"
                    + "Enter integer:");

            //integer1 = input.scanForInteger();
            strResult = calc.intToBinary(integer1);
       
            printResult(strResult);
        }
    }

    private void printResult(String integerResult) {
        System.out.println("\nResult "+integerResult+"\n");
    }

}
