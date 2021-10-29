/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringcharacterjp;

/**
 *
 * @author dogaa
 */
public class DemoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = "Ali bin ahmad";
        String StudentId = new String("D1234");
        System.out.println(name);
        System.out.println(StudentId);
        System.out.println(name.length());
        String message = name+StudentId;
        System.out.println(message);
        //String.concat(String);
        System.out.println(name.concat(StudentId));
        System.out.println("A".concat("B".concat("C".concat("D"))));
        
        
        String sentence ="hello world";
        //charAt(x)=>return character at position x
        System.out.println(sentence.charAt(8));
        //indexOf("1") => Return index value
        System.out.println(sentence.indexOf("l",4));
        //find the letter backwards
        System.out.println(sentence.lastIndexOf("l"));
        
        
        
    }
    
}
