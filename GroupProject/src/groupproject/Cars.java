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
import java.util.*;
public class Cars {
     public static int Cars(boolean[] state,String name[],int price[]){
        int b;
        for(int a=0;a<name.length;a++){
            if(a==0){
                System.out.println("\nPerdua");
                System.out.println("-------------------------------------------------------");
            }
            if(a==8){
                System.out.println("\nProton");
                System.out.println("-------------------------------------------------------");
            }
            if(a==13){
                System.out.println("\nHonda");
                System.out.println("-------------------------------------------------------");
            }
            if(a==16){
                System.out.println("\nToyota");
                System.out.println("-------------------------------------------------------");
            }
            if(a==26){
                System.out.println("\nHundai");
                System.out.println("-------------------------------------------------------");
            }
            if(a==28){
                System.out.println("\nNissan");
                System.out.println("-------------------------------------------------------");
            }
            if(a==30){
                System.out.println("\nBMW");
                System.out.println("-------------------------------------------------------");
            }
            if(a==32){
                System.out.println("\nAUDI");
                System.out.println("-------------------------------------------------------");
            }
            if(a==36){
                System.out.println("\nMercedecs"); 
                System.out.println("-------------------------------------------------------");
            }
            if(a==38){
                System.out.println("\nFord");   
                System.out.println("-------------------------------------------------------");
            }
            if(a==40){
                System.out.println("\nMitsubishi");  
                System.out.println("-------------------------------------------------------");
            }
            if(a==41){
                System.out.println("\nWeststar");
                System.out.println("-------------------------------------------------------");
            }
            System.out.print((a+1)+". "+name[a]+"\tRM"+price[a]+"\t");
            
            if (state[a]==true){
                System.out.println("Avalible");
            }else{
                System.out.println("Not Avalible");
            }
        }
        System.out.println("-------------------------------------------------------");
        b = Menu.Menu1(state, name, price);
        return b;
    } 
     
     
     
    public static int Produa(boolean state[],String name[],int price[]){
        int b = 0;
        for(int a=0;a<8;a++){
            if(a==0){
                System.out.println("\n\bAuto Transmission\b");
                System.out.println("-------------------------------------------------------");
            }
            if(a==6){
                System.out.println("\nManual Transmission");
                System.out.println("-------------------------------------------------------");
            }
            System.out.print((a+1)+". "+name[a]+"\tRM"+price[a]+"\t");
            if (state[a]==true){
                System.out.println("Avalible");
            }else{
                System.out.println("Not Avalible");
            }
            
        }
        b = Cars.Produa1(state, name, price);
        return b;
    }
    public static int Produa1(boolean state[],String name[],int price[]){
        Scanner input = new Scanner(System.in);
        int e , b = 0;
        System.out.println("");
            System.out.println("Pick a car you like(1-8) or enter\"0\" to back");
            System.out.print("_______________________________________________________\nYou choose>: ");
            e = input.nextInt();
            if(e-1==-1){
                b = Brand.Brand(state,name,price);
            }else{
            if(e<1 || e>8){
            System.out.println("--------------------------------------------------------");
            System.out.println("");
            System.out.println("!invalid input,plese enter again!");
            System.out.println("");
            System.out.println("--------------------------------------------------------");
            b = Cars.Produa1(state, name,price);
            }else{
            if(state[e-1] == true){
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("-------------------------------------------------------");
                System.out.println("");
                System.out.println("You have chose "+name[e-1]+"\tRM"+price[e-1]);
                System.out.println("");
                b=e;
            }else{
                
                Cars.Avalible(state[e-1]);
                
                b = Cars.Produa1(state, name, price);
            } 
            }    
        }
            
            return b;
    }
    
    
    public static int Proton(boolean state[],String name[],int price[]){
        int b = 0;
        for(int a=0;a<5;a++){
            if(a==0){
                System.out.println("\n\bAuto Transmission\b");
                System.out.println("-------------------------------------------------------");
            }
            if(a==4){
                System.out.println("\nManual Transmission");
                System.out.println("-------------------------------------------------------");
            }
            System.out.print((a+1)+". "+name[(a+8)]+"\tRM"+price[(a+8)]+"\t");
            if (state[(a+8)]==true){
                System.out.println("Avalible");
            }else{
                System.out.println("Not Avalible");
            }
            
        }
        b = Cars.Proton1(state, name, price);
        return b;
    }
    public static int Proton1(boolean state[],String name[],int price[]){
        Scanner input = new Scanner(System.in);
        int e , b = 0;
        System.out.println("");
            System.out.println("Pick a car you like(1-5) or enter\"0\" to back");
            System.out.print("_______________________________________________________\nYou choose>: ");
            e = input.nextInt();
            if(e-1==-1){
                b = Brand.Brand(state,name,price);
            }else{
            if(e<1 || e>5){
            System.out.println("--------------------------------------------------------");
            System.out.println("");
            System.out.println("!invalid input,plese enter again!");
            System.out.println("");
            System.out.println("--------------------------------------------------------");
            b = Cars.Proton1(state, name,price);
            }else{
            if(state[(e-1)+8] == true){
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("-------------------------------------------------------");
                System.out.println("");
                System.out.println("You have chose "+name[(e-1)+8]+"\tRM"+price[(e-1)+8]);
                System.out.println("");
                b=e+8;
            }else{
                
                Cars.Avalible(state[(e-1)+8]);
                
                b = Cars.Proton1(state, name, price);
            } 
            }    
        }
            
            return b;
    }
    
    
    public static int Honda(boolean state[],String name[],int price[]){
        int b = 0;
        for(int a=0;a<3;a++){
            if(a==0){
                System.out.println("\n\bAuto Transmission\b");
                System.out.println("-------------------------------------------------------");
            }
            if(a==6){
                System.out.println("\nManual Transmission");
                System.out.println("-------------------------------------------------------");
            }
            System.out.print((a+1)+". "+name[a+13]+"\tRM"+price[a+13]+"\t");
            if (state[a+13]==true){
                System.out.println("Avalible");
            }else{
                System.out.println("Not Avalible");
            }
            
        }
        b = Cars.Honda1(state, name, price);
        return b;
    }
    public static int Honda1(boolean state[],String name[],int price[]){
        Scanner input = new Scanner(System.in);
        int e , b = 0;
        System.out.println("");
            System.out.println("Pick a car you like(1-3) or enter\"0\" to back");
            System.out.print("_______________________________________________________\nYou choose>: ");
            e = input.nextInt();
            if(e-1==-1){
                b = Brand.Brand(state,name,price);
            }else{
            if(e<1 || e>3){
            System.out.println("--------------------------------------------------------");
            System.out.println("");
            System.out.println("!invalid input,plese enter again!");
            System.out.println("");
            System.out.println("--------------------------------------------------------");
            b = Cars.Honda1(state, name,price);
            }else{
            if(state[(e-1)+13] == true){
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("-------------------------------------------------------");
                System.out.println("");
                System.out.println("You have chose "+name[(e-1)+13]+"\tRM"+price[(e-1)+13]);
                System.out.println("");
                b=e+13;
            }else{
                
                Cars.Avalible(state[(e-1)+13]);
                
                b = Cars.Honda1(state, name, price);
            } 
            }    
        }
            
            return b;
    }
    
    
    public static int Toyota(boolean state[],String name[],int price[]){
        int b = 0;
        for(int a=0;a<10;a++){
            if(a==0){
                System.out.println("\n\bAuto Transmission\b");
                System.out.println("-------------------------------------------------------");
            }
            if(a==9){
                System.out.println("\nManual Transmission");
                System.out.println("-------------------------------------------------------");
            }
            System.out.print((a+1)+". "+name[a+16]+"\tRM"+price[a+13]+"\t");
            if (state[a+16]==true){
                System.out.println("Avalible");
            }else{
                System.out.println("Not Avalible");
            }
            
        }
        b = Cars.Toyota1(state, name, price);
        return b;
    }
    
    
    public static int Toyota1(boolean state[],String name[],int price[]){
        Scanner input = new Scanner(System.in);
        int e , b = 0;
        System.out.println("");
            System.out.println("Pick a car you like(1-10) or enter\"0\" to back");
            System.out.print("_______________________________________________________\nYou choose>: ");
            e = input.nextInt();
            if(e-1==-1){
                b = Brand.Brand(state,name,price);
            }else{
            if(e<1 || e>10){
            System.out.println("--------------------------------------------------------");
            System.out.println("");
            System.out.println("!invalid input,plese enter again!");
            System.out.println("");
            System.out.println("--------------------------------------------------------");
            b = Cars.Toyota1(state, name,price);
            }else{
            if(state[(e-1)+16] == true){
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("-------------------------------------------------------");
                System.out.println("");
                System.out.println("You have chose "+name[(e-1)+16]+"\tRM"+price[(e-1)+16]);
                System.out.println("");
                b=e+16;
            }else{
                
                Cars.Avalible(state[(e-1)+16]);
                
                b = Cars.Toyota1(state, name, price);
            } 
            }    
        }
            
            return b;
    }
    
    
    public static int Hundai(boolean state[],String name[],int price[]){
        int b = 0;
        for(int a=0;a<2;a++){
            if(a==0){
                System.out.println("\n\bAuto Transmission\b");
                System.out.println("-------------------------------------------------------");
            }
            if(a==6){
                System.out.println("\nManual Transmission");
                System.out.println("-------------------------------------------------------");
            }
            System.out.print(((a-1)+26)+". "+name[a+26]+"\tRM"+price[a+26]+"\t");
            if (state[a+26]==true){
                System.out.println("Avalible");
            }else{
                System.out.println("Not Avalible");
            }
            
        }
        b = Cars.Hundai1(state, name, price);
        return b;
    }
    
    
    public static int Hundai1(boolean state[],String name[],int price[]){
        Scanner input = new Scanner(System.in);
        int e , b = 0;
        System.out.println("");
            System.out.println("Pick a car you like(1-2) or enter\"0\" to back");
            System.out.print("_______________________________________________________\nYou choose>: ");
            e = input.nextInt();
            if(e-1==-1){
                b = Brand.Brand(state,name,price);
            }else{
            if(e<1 || e>2){
            System.out.println("--------------------------------------------------------");
            System.out.println("");
            System.out.println("!invalid input,plese enter again!");
            System.out.println("");
            System.out.println("--------------------------------------------------------");
            b = Cars.Hundai1(state, name,price);
            }else{
            if(state[(e-1)+26] == true){
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("-------------------------------------------------------");
                System.out.println("");
                System.out.println("You have chose "+name[(e-1)+26]+"\tRM"+price[(e-1)+26]);
                System.out.println("");
                b=e+26;
            }else{
                
                Cars.Avalible(state[(e-1)+26]);
                
                b = Cars.Hundai1(state, name, price);
            } 
            }    
        }
            
            return b;
    }
    
    
    public static int Nissan(boolean state[],String name[],int price[]){
        int b = 0;
        for(int a=0;a<2;a++){
            if(a==0){
                System.out.println("\n\bAuto Transmission\b");
                System.out.println("-------------------------------------------------------");
            }
            if(a==6){
                System.out.println("\nManual Transmission");
                System.out.println("-------------------------------------------------------");
            }
            System.out.print((a+1)+". "+name[a+28]+"\tRM"+price[a+28]+"\t");
            if (state[a+28]==true){
                System.out.println("Avalible");
            }else{
                System.out.println("Not Avalible");
            }
            
        }
        b = Cars.Nissan1(state, name, price);
        return b;
    }
    
    
    public static int Nissan1(boolean state[],String name[],int price[]){
        Scanner input = new Scanner(System.in);
        int e , b = 0;
        System.out.println("");
            System.out.println("Pick a car you like(1-2) or enter\"0\" to back");
            System.out.print("_______________________________________________________\nYou choose>: ");
            e = input.nextInt();
            if(e-1==-1){
                b = Brand.Brand(state,name,price);
            }else{
            if(e<1 || e>2){
            System.out.println("--------------------------------------------------------");
            System.out.println("");
            System.out.println("!invalid input,plese enter again!");
            System.out.println("");
            System.out.println("--------------------------------------------------------");
            b = Cars.Nissan1(state, name,price);
            }else{
            if(state[(e-1)+28] == true){
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("-------------------------------------------------------");
                System.out.println("");
                System.out.println("You have chose "+name[(e-1)+28]+"\tRM"+price[(e-1)+28]);
                System.out.println("");
                b=e+28;
            }else{
                
                Cars.Avalible(state[(e-1)+28]);
                
                b = Cars.Nissan1(state, name, price);
            } 
            }    
        }
            
            return b;
    }
    
    
    public static int BMW(boolean state[],String name[],int price[]){
        int b = 0;
        for(int a=0;a<2;a++){
            if(a==0){
                System.out.println("\n\bAuto Transmission\b");
                System.out.println("-------------------------------------------------------");
            }
            if(a==1){
                System.out.println("\nManual Transmission");
                System.out.println("-------------------------------------------------------");
            }
            System.out.print((a+1)+". "+name[a+30]+"\tRM"+price[a+30]+"\t");
            if (state[a+30]==true){
                System.out.println("Avalible");
            }else{
                System.out.println("Not Avalible");
            }
            
        }
        b = Cars.BMW1(state, name, price);
        return b;
    }
    
    
    public static int BMW1(boolean state[],String name[],int price[]){
        Scanner input = new Scanner(System.in);
        int e , b = 0;
        System.out.println("");
            System.out.println("Pick a car you like(1-2) or enter\"0\" to back");
            System.out.print("_______________________________________________________\nYou choose>: ");
            e = input.nextInt();
            if(e-1==-1){
                b = Brand.Brand(state,name,price);
            }else{
            if(e<1 || e>2){
            System.out.println("--------------------------------------------------------");
            System.out.println("");
            System.out.println("!invalid input,plese enter again!");
            System.out.println("");
            System.out.println("--------------------------------------------------------");
            b = Cars.BMW1(state, name,price);
            }else{
            if(state[(e-1)+30] == true){
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("-------------------------------------------------------");
                System.out.println("");
                System.out.println("You have chose "+name[(e-1)+30]+"\tRM"+price[(e-1)+30]);
                System.out.println("");
                b=e+30;
            }else{
                
                Cars.Avalible(state[(e-1)+30]);
                
                b = Cars.BMW1(state, name, price);
            } 
            }    
        }
            
            return b;
    }
    
    
    public static int Audi(boolean state[],String name[],int price[]){
        int b = 0;
        for(int a=0;a<4;a++){
            if(a==0){
                System.out.println("\n\bAuto Transmission\b");
                System.out.println("-------------------------------------------------------");
            }
            if(a==2){
                System.out.println("\nManual Transmission");
                System.out.println("-------------------------------------------------------");
            }
            System.out.print((a+1)+". "+name[a+32]+"\tRM"+price[a+32]+"\t");
            if (state[a=32]==true){
                System.out.println("Avalible");
            }else{
                System.out.println("Not Avalible");
            }
            
        }
        b = Cars.Audi1(state, name, price);
        return b;
    }
    
    
    public static int Audi1(boolean state[],String name[],int price[]){
        Scanner input = new Scanner(System.in);
        int e , b = 0;
        System.out.println("");
            System.out.println("Pick a car you like(1-4) or enter\"0\" to back");
            System.out.print("_______________________________________________________\nYou choose>: ");
            e = input.nextInt();
            if(e-1==-1){
                b = Brand.Brand(state,name,price);
            }else{
            if(e<1 || e>4){
            System.out.println("--------------------------------------------------------");
            System.out.println("");
            System.out.println("!invalid input,plese enter again!");
            System.out.println("");
            System.out.println("--------------------------------------------------------");
            b = Cars.Audi1(state, name,price);
            }else{
            if(state[(e-1)+32] == true){
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("-------------------------------------------------------");
                System.out.println("");
                System.out.println("You have chose "+name[(e-1)+32]+"\tRM"+price[(e-1)+32]);
                System.out.println("");
                b=e+32;
            }else{
                
                Cars.Avalible(state[(e-1)+32]);
                
                b = Cars.Audi1(state, name, price);
            } 
            }    
        }
            
            return b;
    }
    
    
    public static int Mercedes(boolean state[],String name[],int price[]){
        int b = 0;
        for(int a=0;a<2;a++){
            if(a==0){
                System.out.println("\n\bAuto Transmission\b");
                System.out.println("-------------------------------------------------------");
            }
            if(a==1){
                System.out.println("\nManual Transmission");
                System.out.println("-------------------------------------------------------");
            }
            System.out.print((a+1)+". "+name[a+36]+"\tRM"+price[a+36]+"\t");
            if (state[a+36]==true){
                System.out.println("Avalible");
            }else{
                System.out.println("Not Avalible");
            }
            
        }
        b = Cars.Mercedes1(state, name, price);
        return b;
    }
    
    
    public static int Mercedes1(boolean state[],String name[],int price[]){
        Scanner input = new Scanner(System.in);
        int e , b = 0;
        System.out.println("");
            System.out.println("Pick a car you like(1-2) or enter\"0\" to back");
            System.out.print("_______________________________________________________\nYou choose>: ");
            e = input.nextInt();
            if(e-1==-1){
                b = Brand.Brand(state,name,price);
            }else{
            if(e<1 || e>2){
            System.out.println("--------------------------------------------------------");
            System.out.println("");
            System.out.println("!invalid input,plese enter again!");
            System.out.println("");
            System.out.println("--------------------------------------------------------");
            b = Cars.Mercedes1(state, name,price);
            }else{
            if(state[(e-1)+36] == true){
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("-------------------------------------------------------");
                System.out.println("");
                System.out.println("You have chose "+name[(e-1)+36]+"\tRM"+price[(e-1)+36]);
                System.out.println("");
                b=e+36;
            }else{
                
                Cars.Avalible(state[(e-1)+36]);
                
                b = Cars.Mercedes1(state, name, price);
            } 
            }    
        }
            
            return b;
    }
    
    
    public static int Ford(boolean state[],String name[],int price[]){
        int b = 0;
        for(int a=0;a<2;a++){
            if(a==0){
                System.out.println("\n\bAuto Transmission\b");
                System.out.println("-------------------------------------------------------");
            }
            if(a==1){
                System.out.println("\nManual Transmission");
                System.out.println("-------------------------------------------------------");
            }
            System.out.print((a+1)+". "+name[a+38]+"\tRM"+price[a+38]+"\t");
            if (state[a+38]==true){
                System.out.println("Avalible");
            }else{
                System.out.println("Not Avalible");
            }
            
        }
        b = Cars.Ford1(state, name, price);
        return b;
    }
    
    
    public static int Ford1(boolean state[],String name[],int price[]){
        Scanner input = new Scanner(System.in);
        int e , b = 0;
        System.out.println("");
            System.out.println("Pick a car you like(1-2) or enter\"0\" to back");
            System.out.print("_______________________________________________________\nYou choose>: ");
            e = input.nextInt();
            if(e-1==-1){
                b = Brand.Brand(state,name,price);
            }else{
            if(e<1 || e>2){
            System.out.println("--------------------------------------------------------");
            System.out.println("");
            System.out.println("!invalid input,plese enter again!");
            System.out.println("");
            System.out.println("--------------------------------------------------------");
            b = Cars.Ford1(state, name,price);
            }else{
            if(state[(e-1)+38] == true){
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("-------------------------------------------------------");
                System.out.println("");
                System.out.println("You have chose "+name[(e-1)+38]+"\tRM"+price[(e-1)+38]);
                System.out.println("");
                b=e+38;
            }else{
                
                Cars.Avalible(state[(e-1)+38]);
                
                b = Cars.Ford1(state, name, price);
            } 
            }    
        }
            
            return b;
    }
    
    
    public static int Mitsubishi(boolean state[],String name[],int price[]){
        int b = 0;
        for(int a=0;a<1;a++){
            if(a==0){
                System.out.println("\n\bAuto Transmission\b");
                System.out.println("-------------------------------------------------------");
            }
            if(a==6){
                System.out.println("\nManual Transmission");
                System.out.println("-------------------------------------------------------");
            }
            System.out.print((a+1)+". "+name[a+40]+"\tRM"+price[a+40]+"\t");
            if (state[a+40]==true){
                System.out.println("Avalible");
            }else{
                System.out.println("Not Avalible");
            }
            
        }
        b = Cars.Mitsubishi1(state, name, price);
        return b;
    }
    
    
    public static int Mitsubishi1(boolean state[],String name[],int price[]){
        Scanner input = new Scanner(System.in);
        int e , b = 0;
        System.out.println("");
            System.out.println("Pick a car you like(1-1) or enter\"0\" to back");
            System.out.print("_______________________________________________________\nYou choose>: ");
            e = input.nextInt();
            if(e-1==-1){
                b = Brand.Brand(state,name,price);
            }else{
            if(e<1 || e>1){
            System.out.println("--------------------------------------------------------");
            System.out.println("");
            System.out.println("!invalid input,plese enter again!");
            System.out.println("");
            System.out.println("--------------------------------------------------------");
            b = Cars.Mitsubishi1(state, name,price);
            }else{
            if(state[(e-1)+40] == true){
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("-------------------------------------------------------");
                System.out.println("");
                System.out.println("You have chose "+name[(e-1)+40]+"\tRM"+price[(e-1)+40]);
                System.out.println("");
                b=e+39;
            }else{
                
                Cars.Avalible(state[(e-1)+40]);
                
                b = Cars.Mitsubishi1(state, name, price)+39;
            } 
            }    
        }
            
            return b;
    }
    
    
    public static int Westsar(boolean state[],String name[],int price[]){
        int b = 0;
        for(int a=0;a<1;a++){
            if(a==0){
                System.out.println("\n\bAuto Transmission\b");
                System.out.println("-------------------------------------------------------");
            }
            if(a==6){
                System.out.println("\nManual Transmission");
                System.out.println("-------------------------------------------------------");
            }
            System.out.print((a+1)+". "+name[a+41]+"\tRM"+price[a+41]+"\t");
            if (state[a+40]==true){
                System.out.println("Avalible");
            }else{
                System.out.println("Not Avalible");
            }
            
        }
        b = Cars.Westsar1(state, name, price);
        return b;
    }
    
    
    public static int Westsar1(boolean state[],String name[],int price[]){
        Scanner input = new Scanner(System.in);
        int e , b = 0;
        System.out.println("");
            System.out.println("Pick a car you like(1-1) or enter\"0\" to back");
            System.out.print("_______________________________________________________\nYou choose>: ");
            e = input.nextInt();
            if(e-1==-1){
                b = Brand.Brand(state,name,price);
            }else{
            if(e<1 || e>1){
            System.out.println("--------------------------------------------------------");
            System.out.println("");
            System.out.println("!invalid input,plese enter again!");
            System.out.println("");
            System.out.println("--------------------------------------------------------");
            b = Cars.Westsar1(state, name,price);
            }else{
            if(state[e+40] == true){
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("-------------------------------------------------------");
                System.out.println("");
                System.out.println("You have chose "+name[e+40]+"\tRM"+price[e+40]);
                System.out.println("");
                b=e+40;
                
            }else{
                
                Cars.Avalible(state[e+40]);
                
                b = Cars.Westsar1(state, name, price);
                
            } 
            }    
        }
            return b;
    }
    
    
    public static void Avalible(boolean a){
        if(a == false){
        System.out.println("-------------------------------------------------------");
        System.out.println("");
        System.out.println("Sorry The car is currently ouut of stock.");
        System.out.println("");
        System.out.println("-------------------------------------------------------");
        
    }
}

}
