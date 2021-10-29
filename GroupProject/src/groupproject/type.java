/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupproject;

import java.util.Scanner;

/**
 *
 * @author dogaa
 */
public class type {
     public static int type(){
        Scanner input = new Scanner(System.in);
        int a = 0;
        while(a<1 || a>2){
        System.out.println("-------------------------------------------------------");
        System.out.println("which type o f car you like the most? \n");
        System.out.println("1. Manual\t\t2. Auto");
        System.out.print("_______________________________________________________\nYou chose>: ");
        a = input.nextInt();
        if(a<1 || a>2){
            System.out.println("-------------------------------------------------------");
            System.out.println("!invalid input,plese enter again!");
        }
        }
        return a;   
    }
}
