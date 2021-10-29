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
public class DemoCharacter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.isUpperCase('a'));
        System.out.println(new Character('a').charValue());
        Character c = new Character('a');
        char c1 = 'a';
        System.out.println(c.charValue());
        Character char1 = new Character('a');
        System.out.println(char1.equals('A'));
        System.out.println('a'=='A');
        System.out.println(char1.compareTo('a'));
        
        
        
        
    }
    
}
