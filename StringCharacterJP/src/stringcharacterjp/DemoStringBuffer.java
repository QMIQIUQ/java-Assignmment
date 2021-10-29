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
public class DemoStringBuffer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder();
        StringBuffer str = new StringBuffer(10);
        str.append("hello");//+,add
        str.append(",\nhow are you");
        System.out.println(str);
        
        //System.out.println(str.reverse());
        //hello ali
        str.insert(5," ali");
        System.out.println(str);
        
        str.delete(9, 10);
        System.out.println(str);
        
        str.replace(6, 9, "ahmad");
        
        String s = str.toString();
        System.out.println(s);
    }
    
}
