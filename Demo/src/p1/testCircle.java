/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import circle.*;

/**
 *
 * @author dogaa
 */
public class testCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create circle object
        int number = 10;
        String name;
        int age;
        circle c1;
        c1 = new circle();
        circle c2 = new circle(200);
        
        //c1.setRadius(100);
        System.out.println("c1 radius: "+c1.getRadius());
        System.out.println("c2 radius: "+c2.getRadius());
        System.out.println("c1 area: "+c1.findArea());
        c1.setRadius(2);
        System.out.println("c1 area: "+c1.findArea());
    }
    
    
}
