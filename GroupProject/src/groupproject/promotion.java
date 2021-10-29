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
public class promotion {
     public static int promotion(){
        Scanner input = new Scanner(System.in);
        int a = 0;
        while(a<1 || a>2){
        System.out.println("");
        System.out.println("Chose between 1-2\n");
        System.out.println("1. between ?-?\t\t2.between ?-?");
        System.out.print("_______________________________________________________\nYou chose>: ");
        a = input.nextInt();
        if(a<1 || a>2){
            System.out.println("-------------------------------------------------------");
            System.out.println("invalid input,plese enter again");
            System.out.println("-------------------------------------------------------");
        }
        }
        return a;  
    } 
}
