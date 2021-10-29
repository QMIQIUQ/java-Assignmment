/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package average;

/**
 *
 * @author dogaa
 */
public class Average {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] number = new int[20];
        int total = 0,above = 0,below = 0;
        double average;
       for(int a=0;a<number.length;a++){
            number[a] += Math.random()*100;
            total+=number[a];
            }
       //average
       average=total/number.length;
       System.out.printf("Average :%.2f\n",average);
       for(int a = 0;a<number.length;a++){
       if(number[a]>average){
           above++;
       }else{
       if(number[a]<average){
           below++;
       }
       }
       }
       System.out.println("Score above average : "+above);
       System.out.print("List of Score above average :");
       for(int a = 0;a<number.length;a++){
           if(number[a]>average){
           System.out.print(" "+number[a]);
       }
       }
       System.out.println("");
       System.out.println("Score below average : "+below);
       System.out.print("List of Score below average :");
       for(int a = 0;a<number.length;a++){
           if(number[a]<average){
           System.out.print(" "+number[a]);
       }
       }
       
       }
    }
    

