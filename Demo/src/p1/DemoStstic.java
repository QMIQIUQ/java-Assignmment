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
public class DemoStstic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        circle c1 = new circle();
        //c1.PI = 0;
        System.out.println(c1.PI+" "+circle.PI);
        circle c2 = new circle(10);
        circle c3 = new circle(15);
        System.out.println(c1.getNumberOfObject()+" "+c2.getNumberOfObject()+" "+c3.getNumberOfObject()+" "+circle.getNumberOfObject());
        System.out.println(c1.getRadius()+" "+c2.getRadius()+" "+c3.getRadius()+" ");
        System.out.println();
    }
    
    
}
