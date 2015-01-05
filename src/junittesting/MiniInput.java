/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junittesting;

import java.util.Scanner;

/**
 *
 * @author UndeadAmilo
 */
public class MiniInput {
    Scanner scan;
    
    public MiniInput(){
        scan = new Scanner(System.in);
    }
    
    public int scanForInteger(){
        int i = scan.nextInt();
        return i;
    }
    
}
