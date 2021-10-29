/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupproject;

/**
 *
 * @author dogaa
 */
import java.util.*;
public class Menu {
    public static void Menu(boolean[] state,String name[],int price[]){
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("-------------------------------------------------------");
        System.out.println("");
        System.out.println("\t\t-= MMX Car RentTing=- \n \n  Best place to find the car that Suitable for you");
        System.out.println("");
        System.out.println("-------------------------------------------------------");
        System.out.println("");
        System.out.println("\t\t       Welcome!");
    }
    
    public static int Menu1(boolean[] state,String name[],int price[]){
        Scanner input = new Scanner(System.in);
        int a = 0,b = 0;
        System.out.println("");
        System.out.println("-------------------------------------------------------");
        System.out.println("What would you like to do?");
        System.out.println("-------------------------------------------------------");
        System.out.println("");
        System.out.println("pls chose 1 , 2 , 3 or 4");
        System.out.println("");
        System.out.println("1. Book a car now!\t\t3.Price calculator\n2. View car list and the price!\t4.Exit" );
        System.out.print("_______________________________________________________\nYou choose>: ");
        a = input.nextInt();
        
        switch(a){
            case 1 : System.out.println("");
                     System.out.println("");

                     b = Brand.Brand(state,name,price);break;
            case 2 : System.out.println("");
                     System.out.println("");

                     b = Cars.Cars(state,name,price);break;
            case 3 : System.out.println("");
                     System.out.println("");

                     b = cal.cal(state, name, price);break;
            case 4 : System.out.println("-------------------------------------------------------");
                     exit(state,name,price);break;
            default : System.out.println("-------------------------------------------------------");
                      System.out.println("");
                      System.out.println("!invalid input,plese enter again!");
                      System.out.println("");
                      System.out.println("-------------------------------------------------------");
                      b = Menu.Menu1(state, name,price);
                      break;
        }
        return b;
    }
    
   
    
    public static void exit(boolean[] state,String name[],int price[]){
        Scanner input = new Scanner(System.in);
        String exit1 = "YES";
        String exit3 = "NO";
        System.out.println("\t\t  !!!Warning!!!");
        System.out.println("      If you exit now, your order will not count");
        System.out.println("");
        System.out.println("\t  Do you really want to Exit?\n\nType\"YES\"to exit \"NO\"for Menu");
        System.out.println("");
        System.out.print("_______________________________________________________\nYou choose>: ");
        String exit2 = input.nextLine();
        System.out.println("-------------------------------------------------------");
        
        if(exit2.equals(exit1)){
            System.out.println("QAQ bye...");
            System.out.println("-------------------------------------------------------");
            System.exit(0);
        }else
        {if(exit2.equals(exit3)){
            System.out.println("-------------------------------------------------------");
            Menu1(state,name,price);
            
        }else{
            System.out.println("!invalid input,plese enter again!");
            System.out.println("-------------------------------------------------------");
            exit(state,name,price);
        }
    }
    }
    
    
    public static boolean Repeat(){
        Scanner input = new Scanner(System.in);
        String a,b = "Y",c = "N";
        boolean d = true;
        System.out.println("");
        System.out.println("Do you want to start a new booking or complete booking?\n'Y' for continue\t\t'N' for exit");
        System.out.println("");
        System.out.println("Please enter \"Y\" for yes \"N\" for no");
        System.out.print("_______________________________________________________\nYou choose>: ");
        a = input.next();
        System.out.println("-------------------------------------------------------");
        if(a.equals(b)){
            d = true;
            System.out.println("");
            System.out.println("");

        }else{
        if(a.equals(c)){
            d = false;
            System.out.println("");
            System.out.println("");

        }else{
            System.out.println("");
            System.out.println("!invalid input,plese enter again!");
            System.out.println("");
            System.out.println("-------------------------------------------------------");
            d = Repeat();
            
        }
        }
        
        return d;
    }
    
    
    public static void PayMethod(){
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println("Chose your prefer payment method");
        System.out.println("");
        System.out.println("1. Credit Card\t2. Online Banking");
        System.out.println("");
        System.out.print("_______________________________________________________\nYou choose>: ");
        int a = input.nextInt();
        System.out.println("");
        switch(a){
            case 1 : System.out.println("How much you want to pay?");
                    System.out.println("");
                    break;
            case 2 : System.out.println("How much you want to pay?");
                    System.out.println("");
                    break;
            default : System.out.println("-------------------------------------------------------");
                      System.out.println("");
                      System.out.println("!invalid input,plese enter again!");
                      System.out.println("");
                      System.out.println("-------------------------------------------------------");
                      System.out.println("");
                      PayMethod();
                      break;
        }
        
        
    }
    
    public static void PayMethod1(int total){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Total is RM "+total);
        System.out.print("_______________________________________________________\nYou pay>: ");
        int a = input.nextInt();
        if(a<total){
            System.out.println("invalide ammount or ammout not correct ");
            PayMethod1(total);
        }else{
            a -= total;
            System.out.println("Change>:"+a);
        }
        
       
    }
    
    public static int driver(){
        Scanner input = new Scanner(System.in);
        String a,b = "Y",c = "N";
        int d=0;
        System.out.println("");
        System.out.println("Do you need a Driver? (+RM450)");
        System.out.println("");
        System.out.println("Please enter \"Y\" for yes \"N\" for no");
        System.out.print("_______________________________________________________\nYou choose>: ");
        a = input.next();
        System.out.println("-------------------------------------------------------");
        if(a.equals(b)){
            d = 1;
            System.out.println("");
            System.out.println("");

        }else{
        if(a.equals(c)){
            d = 0;
            System.out.println("");
            System.out.println("");

        }else{
            System.out.println("");
            System.out.println("!invalid input,plese enter again!");
            System.out.println("");
            System.out.println("-------------------------------------------------------");
            Repeat();
        }
        }
        
        return d;
    }
    
    public static boolean repeat(){
        Scanner input = new Scanner(System.in);
        int a = 0;
        boolean b = false;
        
        
        do{
            System.out.print("_______________________________________________________\nYou choose>: ");
            a = input.nextInt();
            if(a == 2){
               System.out.println("Thank you");
               System.exit(0);
            }
            if (a == 1){
                b = true;
                break;
            }else{
                System.out.println("-------------------------------------------------------");
                System.out.println("");
                System.out.println("!invalid input,plese enter again!");
                System.out.println("");
                System.out.println("-------------------------------------------------------");
            }
            
            
        }while(a!=1||a!=2);
        return b;
    }
    
}

    
