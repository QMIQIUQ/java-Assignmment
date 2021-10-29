/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringcharacterjp;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author dogaa
 */

public class DemoStringTokennizer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //by default delimeter => white space
        //return delimeter = > by default false
        //StringTokenizer("hello, my name is Alex","e",true)
        //1.String
        //2.delimeter
        //3.return delimeter
        StringTokenizer t  = new StringTokenizer("hello, my name is Alex","A",true);
        
        //countTokens()
        System.out.println(t.countTokens());
        while(t.hasMoreTokens()){
            System.out.println(t.nextToken());
        }
        
        
        
        // demo using Scanner class
        
        
        Scanner s = new Scanner("hello, my name is Alex");
        s.useDelimiter("my");
        while(s.hasNext()){
            System.out.println(s.next());
        }
        
        
        //String clsaa, split method
        
        String msg = "hells, my name is Alex";
        
        String[] array = msg.split(" ");
        
        for(int i = 0; i<array.length;i++){
            System.out.println(array[i]);
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
         
    }
    
    
    
}
