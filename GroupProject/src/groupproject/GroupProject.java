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
public class GroupProject {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        

        
        String[] name = {"Produa viva(A)\t\t","Produa Axia(A)\t\t","Produa Myvi(A)\t\t","Produa Alza S(A)\t\t","Produa Alza SE(A)/Advance\t","Perodua Alza (A)(MPV 7 Seater)",
           "Produa Axia(M)\t\t","Produa Myvi 1.5 XTreme(M)\t",
           "Proton Saga FLX\t\t", "Proton Iriz 1.6 (A)\t\t ","Proton Inspira 2.0 (A)\t","Proton Exora Bold (A)\t",
           "Proton Saga FLX (M)\t\t",
     	   "Honda Jazz Hybrid (A)\t","Honda City V Spec (A)\t","Honda Accord (A)\t\t",
           "Toyota Vios (A)\t\t","Toyota Camry (A)\t\t","Toyota Estima 7/8saeter (A)\t","Toyota Alphard 2.4 7/8saeter (A)","Toyota Vellfire 2.4 7/8saeter (A)","Toyota Hilux (A)\t\t","Toyota Hiace (VAN 10 Seater) (A)","Toyota Vellfire - Luxury MPV (A)","Toyota Estima - Luxury MPV(A)",
           "Toyota Hiace 10seater(M)\t",
           "Hyundai Starex (12 seater) (A)","Hyundai Starex(Luxury 11 Seater)(A)",
           "Nissan Grand Livina (A)\t","Nissan Urvan (VAN 12 Seater)(A)",
           "BMW 5series M-Sport (A)\t",
           "BMW 5series M-Sport (M)\t",
           "AUDI A3 S-Line (A)\t\t","AUDI TTS (A)\t\t",
           "AUDI A3 S-Line(M)\t\t","AUDI TTS (M)\t\t",
           "Mercedes S400 Hybrid (A)\t",
           "Mercedes S400 Hybrid(M)\t",
           "Ford Transit (VAN  14 Seater) (A)",
           "Ford Transit (VAN  14 Seater)(M)",
           "Mitsubishi Attrage (A)\t",
           "Weststar Maxus G10 10seater (A)"};
        int[] price = {
            120,130,150,180,200,500,
            110,130,
            160,150,300,250,
            130,
            250,250,450,
            250,450,500,550,600,450,700,1200,1000,
            350,
            450,1000,
            245,700,
            900,
            900,
            700,1500,
            700,1500,
            2300,2300,
            850,
            850,
            170,
            450};
        
        int b=0,c=0,e,total=0;
        int[] cartype = new int[2] ;
        int[] userSelection = new int[99999999];
        int[] userSelection1 = new int[9999999];
        boolean f = false;
        //random Stock
        int[] state1 = new int [42];
        boolean[] state = new boolean[42];
        
        for(int a=0;a<state1.length;a++){
            state1[a] += 1;

            }
        for(int a=0;a<state.length;a++){
            if(state1[a]==0){
                state[a] = false;
            }else{
                state[a] = true; 
            }
 
        }
        
        //Programe Starts!!
        do{
        Menu.Menu(state,name,price);
        do{
        cartype[0] = Menu.Menu1(state, name, price);
        cartype[1] = cal.cal2(state, name, price,cartype); 
        state[cartype[0]-1] = false;
        for(int a = 0; a<cartype.length;a++){
            if(a%2==0){
                userSelection[c] = cartype[a]; 
                c++;
            }else{
                userSelection1[b] = cartype[a];
                b++;
            }
            
        }
        }while(Menu.Repeat()!=false);
        int d = Menu.driver();
        System.out.println("");
        System.out.println("\t\tyou have ordered");
        System.out.println("");
        System.out.println("-------------------------------------------------------");
        for(int a = 0;a<userSelection.length-1;a++){
            if(userSelection[a]==0){
            break;
            }  
            System.out.println((a+1)+". "+name[userSelection[a]]+"\tRM"+price[userSelection[a]]+"\t"+userSelection1[a]+" days");
            total+=price[userSelection[a]]*userSelection1[a];
        }
        if(d==1){
        System.out.println("Driver \t\t\t\t\tRM 450");
        total+=450;
        }
        System.out.println("");
        System.out.println("-------------------------------------------------------");
        System.out.println("");
        System.out.println("Total Price: RM "+total);
        System.out.println("");
        System.out.println("-------------------------------------------------------");
        if(total>1500){
            System.out.println("");
            System.out.println("Congratulations!! you got chance to get Discount!!!");
            System.out.println("");
            System.out.println("Enter 1 to play or other numbers to skip");
            System.out.println("");
            System.out.print("_______________________________________________________\nYou choose>: ");
            e = input.nextInt();
            if(e == 1){
                
                total-=cal.promotion();
            }
            System.out.println("-------------------------------------------------------");
            System.out.println("");
            System.out.println("Final Price is : RM "+total);
            System.out.println("");
            System.out.println("-------------------------------------------------------");
        }
            
        Menu.PayMethod();
        Menu.PayMethod1(total);
        System.out.println("");
        System.out.println("Thank you for ordering at our shop\nwould you like to order again?\n1) for yes\t2) for no");
        f = Menu.repeat();
        //reset
        for(int a = 0; a<userSelection1.length;a++){
      
                userSelection[a] = 0; 
                b=0;
                c=0;
                userSelection1[a] = 0;
                
            }
            
        
        
    }while(f==true);
        
    }
    
    
}

