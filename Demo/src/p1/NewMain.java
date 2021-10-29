/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

/**
 *
 * @author dogaa
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        circle c1 = new circle(5);
        System.out.println("c1"+c1);
        double r = c1.getRadius();
        
        display(r,c1);
        System.out.println("r"+r);
        
    }
    
    public static void display(double radius, circle c){
        radius = 10;
        System.out.println("radius"+radius);
        c.setRadius(100);
        System.out.println("radius c"+c.getRadius());
        System.out.println("c"+c);
    }
}
