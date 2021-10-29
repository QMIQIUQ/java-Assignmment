/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessnumber;

/**
 *
 * @author dogaa
 */
import java.util.*;
public class GuessNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int b=0;
        do{
        start();
        Scanner input = new Scanner(System.in);
        int ii = 0;
        String exit = "N",again = "Y";
        do{
        System.out.println("Do you want to repeat?(Y-Yes N-No)");

        
        String out = input.next();
        
        if(out.charAt(0) == exit.charAt(0)){
            System.exit(0);
        }else{
        if(out.charAt(0) == again.charAt(0)){
            ii--;
        }else{
        if(out.charAt(0) != again.charAt(0)&&out.charAt(0) != exit.charAt(0)){
            System.out.println("Invalide input");
            ii = 0;
            
        }
        }
        }
        }while(ii==0);
        }while(b==0);

    }
    
    
        public static void start(){
        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = 100;
        int num =(int)(Math.random()*100);
        System.out.println(num);
        for(int i = 10;i!=0;i--){    
        System.out.println("["+i+" chances]");
        System.out.print("Please gest the number between "+a+"-"+b+" : ");
        int user = input.nextInt();
        if(user!=num){
            if(user<num){
                a = user;

            }
            if(user>num){
                b = user;
                }      
        }
        
        
        if(i == 1){
            System.out.println("You lose");
            
        }
        if(user==num){
            System.out.println("You win");
            i=1;
        }
        }
        }

}
