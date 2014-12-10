/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junittesting;

/**
 *
 * @author UndeadAmilo
 */
public class MiniCalc {
    public int add(int x1, int x2){
        return x1 + x2;
    }

    public int subtract(int x1, int x2) {
        return x1 - x2;
    }

    public double divide(int x1, int x2) {
        return (double)x1/x2;
    }

    public int multiply(int x1, int x2) {
        return x1 * x2;
    }

    public String intToHex(int i) {
        String retStr = "";
        int convert, divide, rest;
        
        convert = i;
        
        while(convert>0){
            divide = convert/16;
            rest = convert - divide * 16;
            convert = divide;
            
            if(rest==10){
            retStr += "A";
            }
            else if(rest==11){
                retStr += "B";
            }
            else if(rest==12){
                retStr += "C";
            }
            else if(rest==13){
                retStr += "D";
            }
            else if(rest==14){
                retStr += "E";
            }
            else if(rest==15){
                retStr += "F";
            }
            else{
                retStr += Integer.toString(rest);
            }
        }
        return retStr;        
    }

    String intToBinary(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
