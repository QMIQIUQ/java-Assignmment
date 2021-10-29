/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumofdigit;

/**
 *
 * @author dogaa
 */
import java.util.*;
public class SumOfDigit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total;
        boolean a= false;
        
        
        String user;
        
        do{
         System.out.print("Please enter int to add > ");   
        user = input.next();
        }while(!valid(user));
        
    total = addString(user); 
    System.out.println("Total is "+total);
    
    }
    
    public static int addString(String user){
        int a,b=0,c=0;
        a =Integer.parseInt(user); 
        while(a!=0){        
            b=a%10;  
            c+=b;
            a/=10;
        }
        
        
        return c;
        
    }
    public static boolean valid(String user){
        for(int i=0;i<user.length();i++){
        if(!Character.isDigit(user.charAt(i))){
            return false;
        }   
        }
        return true;
        }
    }

