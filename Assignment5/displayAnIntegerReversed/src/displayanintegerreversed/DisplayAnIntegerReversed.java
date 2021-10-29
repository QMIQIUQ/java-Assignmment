/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package displayanintegerreversed;

/**
 *
 * @author Jackson Ang D190104B 28/05/2019
 * Display an integer reversed
 */
import java.util.*;
public class DisplayAnIntegerReversed {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a intiger that u want to dispaly reversed: ");
        int number = input.nextInt();
        reverse(number);
    }
    
    public static void reverse(int number){
        int b;
        for(int a=number;a!= 0;a/=10){
            b=a;
            b%=10;
         System.out.print(b);   
        }
    }

}
