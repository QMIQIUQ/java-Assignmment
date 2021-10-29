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
public class person {
     public static int person(){
        Scanner input = new Scanner(System.in);
        int a = 0;
        while(a<2 || a>7){
        System.out.println("------------------------------------------------");
        System.out.println("how many preson?\n");
        System.out.println("pls chose between 2-7 preson");
        System.out.print("________________________________________________\nYou chose>: ");
        a = input.nextInt();
        if(a<2 || a>7){
            System.out.println("------------------------------------------------");
            System.out.println("!invalid input,plese enter again!");
        }
        }
        return a;   
    } 
}
