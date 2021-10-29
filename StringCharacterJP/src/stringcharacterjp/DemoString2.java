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
public class DemoString2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1 = "hallo world";
        //2 method of substring()''
        //extract hello from s1
        String s2 = s1.substring(0,5);//index 5 is not included
        System.out.println(s2);
        //extract world from s1
        System.out.println(s1.substring(6));//Start from index 6 till last character
        
        
        
        
        String s3 = "welcome";
        String s4 = "Welcome";
        //String is case sensitive
        if(s3.equals(s4)){
            System.out.println("Equal");
            
        }else{
            System.out.println("Not Equal");
        }
        
        
        //String.compare(String 1)
        //return 3 type of value
        //0 =>Same content
        //+value => string 1 > String 2
        //-value => String 1 < String 2
        
        System.out.println("A".compareTo("a"));
        System.out.println("Ali".compareTo("Ahmad"));
        
        
        String message = "   welcome to java   ";
        System.out.println(message.toUpperCase());
        //message = message.toUpperCase();
        System.out.println(message);
        //remove space <no no>
        System.out.println(message.trim());
        
        //String.replace();
        
        String s5 = "labd";
        System.out.println(s5.replaceAll("[a,b,c]","z"));
        
        String s6 = String.valueOf(false);
        System.out.println(s6);
        
        char[] charArray = message.trim().toCharArray();
        for(int i = 0;i<charArray.length;i++){
            System.out.println(charArray[i]+" ");
        }
        
        
        
    }
    
}
