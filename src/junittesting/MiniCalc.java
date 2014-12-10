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
            //retStr += "A";
                retStr = "A" + retStr;
            }
            else if(rest==11){
              //  retStr += "B";
                retStr = "B" + retStr;
            }
            else if(rest==12){
                //retStr += "C";
                retStr = "C" + retStr;
            }
            else if(rest==13){
                //retStr += "D";
                retStr = "D" + retStr;
            }
            else if(rest==14){
                //retStr += "E";
                retStr = "E" + retStr;
            }
            else if(rest==15){
                //retStr += "F";
                retStr = "F" + retStr;
            }
            else{
                //retStr += Integer.toString(rest);
                retStr = Integer.toString(rest) + retStr;
            }
        }
        return retStr;        
    }

    String intToBinary(int i) {
        String binStr = "";
        boolean zeroFlag = true;
        int base = i;
        int[] index = {1,2,4,8,16,32,64,128,256,512,1024,2048,4096,8192,16384,32768};//65536
       
        for(int k = index.length-1; k >= 0; k--){
            if(base>=index[k]){
                if(zeroFlag){
                    zeroFlag = false;
                }
                base = base - index[k];
                binStr += "1";
            }
            else{
                if(!zeroFlag){
                    binStr+= "0";
                }
            }                
        }  
        return binStr;
    }
    
}
