/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import p2.Cylinder;

/**
 *
 * @author dogaa
 */
public class DemoInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5);
        System.out.println("Radus : "+cylinder.getRadius());
        System.out.println("Length : "+cylinder.getLength());
        System.out.println("Area : "+cylinder.findArea());
        System.out.println("Access numberOfObject : "+cylinder.getNumberOfObject());
        System.out.println("Access numberOfObject : "+circle.getNumberOfObject());
        circle c = new circle();
        System.out.println(c.toString());
        System.out.println(cylinder.toString());
    }
    
    
}
