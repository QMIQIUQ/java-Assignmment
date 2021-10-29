/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringcharacterjp;

/**
 *
 * @author dogaa
 */
import java.util.*;
public class CheckPalindrom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String user = " ";
        System.out.print("Palindrom checker\nyour input=>  ");
        user = input.next();
        char[] mirror = new char[user.length()];
        char[] user1 = user.toCharArray();
        for(int i = 0;i<user1.length;i++){
            mirror[i] = user1[user1.length-(i+1)];
        }
        for(int i = 0;i<user1.length;i++){
            if(user1[i]==mirror[i]){
                
            }else{
                System.out.println("It is not a palindrom");
                System.exit(0);
            }
        }
        System.out.println("It is palindrom");
        
        
    }
    
}
