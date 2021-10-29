/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package removeduplicate;

/**
 *
 * @author Jackson Ang D190104B 2019/7/4
 */
import java.util.*;
public class RemoveDuplicate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        int []x=new int[10];
        int []y=new int[10];

        System.out.println("Enter 10 int: ");
        for(int a=0;a<x.length;a++){
            x[a]=input.nextInt();
            
            }
        
        for(int i=0;i<x.length;i++){
                for(int j=i+1;j<x.length;j++){
                    if(x[i]==x[j]){
                        x[i]=0;
                    }
                }
        }
        for(int i=0;i<x.length;i++){
            if(x[i]!=0){
                System.out.println(x[i]);
            }
        }           
             
              }
    }
    

