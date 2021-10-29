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
import static groupproject.Menu.Menu1;
import java.util.*;

public class Brand {
    public static int Brand(boolean[] state,String name[],int price[]){
        Scanner input = new Scanner(System.in);
        int a = 0,b = 0;
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("-------------------------------------------------------");
        System.out.println("Pick a brand that you like the most\n");
        System.out.println("1. Produa\t2. Proton\t3. Honda\n"
                            + "4. Toyota\t5. Hundai\t6. Nissan\n"
                            + "7. BMW\t\t8. Audi\t\t9. Mercedes\n"
                            + "10. Ford\t11. Mitsubishi\t12. Westar\n"
                            + "13. Back to Menu");
        System.out.print("_______________________________________________________\nYou choose>: ");
        a = input.nextInt();
            switch(a){
                case 1 : System.out.println("-------------------------------------------------------");
                         System.out.println("");
                         System.out.println("\t\tYou chose Produa");
                         System.out.println("");
                         System.out.println("-------------------------------------------------------");
                         b = Cars.Produa(state,name,price);
                         break;
                case 2 : System.out.println("-------------------------------------------------------");
                         System.out.println("");
                         System.out.println("\t\tYou chose Proton");
                         System.out.println("");
                         System.out.println("-------------------------------------------------------");
                         b = Cars.Proton(state,name,price);
                         break;
                case 3 : System.out.println("-------------------------------------------------------");
                         System.out.println("");
                         System.out.println("\t\tYou chose Honda");
                         System.out.println("");
                         System.out.println("-------------------------------------------------------");
                         b = Cars.Honda(state,name,price);
                         break;
                    
                case 4 : System.out.println("-------------------------------------------------------");
                         System.out.println("");
                         System.out.println("\t\tYou chose Toyota");
                         System.out.println("");
                         System.out.println("-------------------------------------------------------");
                         b = Cars.Toyota(state,name,price);
                         break;
                case 5 : System.out.println("-------------------------------------------------------");
                         System.out.println("");
                         System.out.println("\t\tYou chose Hundai");
                         System.out.println("");
                         System.out.println("-------------------------------------------------------");
                         b = Cars.Hundai(state,name,price);
                         break;
                case 6 : System.out.println("-------------------------------------------------------");
                         System.out.println("");
                         System.out.println("\t\tYou chose Nissan");
                         System.out.println("");
                         System.out.println("-------------------------------------------------------");
                         b = Cars.Nissan(state,name,price);
                         break;
                case 7 : System.out.println("-------------------------------------------------------");
                         System.out.println("");
                         System.out.println("\t\tYou chose BMW");
                         System.out.println("");
                         System.out.println("-------------------------------------------------------");
                         b = Cars.BMW(state,name,price);
                         break;
                case 8 : System.out.println("-------------------------------------------------------");
                         System.out.println("");
                         System.out.println("\t\tYou chose Audi");
                         System.out.println("");
                         System.out.println("-------------------------------------------------------");
                         b = Cars.Audi(state,name,price);
                         break;
                case 9 : System.out.println("-------------------------------------------------------");
                         System.out.println("");
                         System.out.println("\t\tYou chose Mercedes");
                         System.out.println("");
                         System.out.println("-------------------------------------------------------");
                         b = Cars.Mercedes(state,name,price);
                         break;
                case 10 :System.out.println("-------------------------------------------------------");
                         System.out.println("");
                         System.out.println("\t\tYou chose Ford");
                         System.out.println("");
                         System.out.println("-------------------------------------------------------");
                         b = Cars.Ford(state,name,price);
                         break;
                case 11 :System.out.println("-------------------------------------------------------");
                         System.out.println("");
                         System.out.println("\t\tYou chose Mitsubishi ");
                         System.out.println("");
                         System.out.println("-------------------------------------------------------");
                         b = Cars.Mitsubishi(state,name,price);
                         break;
                case 12 :System.out.println("-------------------------------------------------------");
                         System.out.println("");
                         System.out.println("\t\tYou chose Westsar");
                         System.out.println("");
                         System.out.println("-------------------------------------------------------");
                         b = Cars.Westsar(state,name,price);
                         break;
                case 13 :System.out.println("");
                         System.out.println("");
                         System.out.println("");
                         System.out.println("");
                         System.out.println("");
                         System.out.println("");
                         System.out.println("");
                         System.out.println("");
                         System.out.println("");
                         System.out.println("");
                         System.out.println("");
                         System.out.println("");
                         b = Menu.Menu1(state,name,price );
                         break;
                default : System.out.println("-------------------------------------------------------");
                          System.out.println("");
                          System.out.println("!invalid input,plese enter again!");
                          System.out.println("");
                          b = Brand.Brand(state, name, price);
                          
                          break;
            }
            
        return b;
        }
        
    }

