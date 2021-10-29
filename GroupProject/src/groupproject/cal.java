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
import static groupproject.Menu.exit;
import java.util.*;
public class cal {
    public static int cal(boolean state[],String name[],int price[]){
        Scanner input = new Scanner(System.in);
        int prices,days,a,b = 0;
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("-------------------------------------------------------");
        System.out.println("Price calculator");
        System.out.println("-------------------------------------------------------");
        System.out.println("");
        System.out.println("Here can help you to calculate the price");
        System.out.println("");
        System.out.println("Please enter car price(Per Day)\nfor example:300");
        System.out.println("");
        
        System.out.print("_______________________________________________________\nCar Price RM>: ");
        prices = input.nextInt();
        System.out.println("-------------------------------------------------------");
        System.out.println("");
        System.out.println("Please enter how many days you want to rent\nfor example :3");
        System.out.println("");
        System.out.print("_______________________________________________________\nDays>: ");
        days = input.nextInt();
        System.out.println("-------------------------------------------------------");
        System.out.println("");
        System.out.println("The total price are : RM"+(prices*days));
        System.out.println("");
        System.out.println("-------------------------------------------------------");
        b = cal.exit(state, name, price);
        return b;
    }
    
    
    public static int cal2(boolean state[],String name[],int price[],int[] cartype){
        Scanner input = new Scanner(System.in);
        
        int a,b = 0;
        System.out.println("How many days you want to rent?");
        System.out.println("");
        System.out.print("_______________________________________________________\nDays>: ");
        b = input.nextInt();
        a = price[cartype[0]];
        System.out.println("-------------------------------------------------------");
        System.out.println("The total price are : RM"+(a*b));
        System.out.println("-------------------------------------------------------");
        
        
        return b;
    }

    
    public static int exit(boolean state[],String name[],int price[]){
        Scanner input = new Scanner(System.in);
        int b ;
        System.out.println("");
        System.out.println("Do you want to continue using price calculator?"); 
        System.out.println("");
        System.out.println("Enter \"Y\" for Yes \"N\" for No");
        System.out.print("_______________________________________________________\nYou choose>: ");
        String exit1 = "Y";
        String exit2 = "N";
        String exit3 = input.nextLine();
        System.out.println("-------------------------------------------------------");
        System.out.println("");
        if(exit3.equals(exit1)){
            b = cal.cal(state, name, price);
        }else
        {if(exit3.equals(exit2)){
            b = Menu1(state,name,price);
            
        }else{
            System.out.println("!invalid input,plese enter again!");
            System.out.print("");
            System.out.println("-------------------------------------------------------");
            b = cal.exit(state, name, price);
        }
        
    }
        return b;
    }
    
    public static int promotion(){
        Scanner input=new Scanner(System.in);
        
        int i=0;
        int a=0;
        int total=0;
        System.out.println("");
        System.out.println("-------------------------------------------------------");
        System.out.println("");
        System.out.println("Welcome to scissor rock paper game,here you can have a chance to get discount!!");
        System.out.println("The rules are simple");
        System.out.println("U only have three chance to play");
        System.out.println("The more you win, the more discount you will get!");
        System.out.println("Choose wisely!!");
        System.out.println("");
        System.out.println("-------------------------------------------------------");
        System.out.println("");
        System.out.println("just enter");
        
      do{
        int computer=(int)(Math.random()*3);
        System.out.println(i+"chance");
        System.out.println("(0)for scissor\t(1)for rock\t(2)for paper");
        
        boolean t = false;
        System.out.print("_______________________________________________________\nYou choose>: ");
        int user=5;
        while(t!=true){
        
        user=input.nextInt();
        if(user<0&&user>2){
            System.out.println("Incorrect input");
        }else{
            t = true;
        }
        }
        switch (computer) {
            case 0:System.out.println("The computer is scissor.");break;
            case 1:System.out.println("The computer is rock.");break;
            case 2:System.out.println("The computer is paper.");break;     
        }
        
        switch(user){
            case 1:System.out.println("You are scissor");break;
            case 2:System.out.println("You are rock");break;
            case 3:System.out.println("You are paper");
        }
        
        if (computer==user)
            System.out.println("too.It is a draw.");
        else{
            if(user==0&&computer==2){
                System.out.println(".You won.");
                a++;
            }
        else    if(user==1&&computer==0){
                System.out.println(".You won.");
                a++;}
        else    if(user==2&&computer==1){
                System.out.println(".You won.");
                a++;}
        else  {  
            System.out.println(".You lose.");
          
               }}
              i++;
      }while(i!=3);
      if (a==1){
          System.out.println("Congratulations!!you won 1 times \nyou got RM100 Discount!!!");
          total=100;
      }else if(a==2){
          System.out.println("Congratulations!!you won 2 times \nyou got RM200 Discount!!!");
                  total=200;
      }else if(a==3){
          System.out.println("Congratulations!!you won 3 times \nyou got RM300 Discount!!!");
          total=300;
      }else{
          System.out.println("Congratulations!!you won 0 times \nyou got RM20 Discount!!!");
          total=20;
      }
      return total;
      }
      
}
      

