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
public class DemoPrivate {
    public static void main(String[] args){
    
        circle c1 = new circle(5);
        System.out.println(c1.getRadius());
        System.out.println("method : "+c1);
        display(c1.getRadius(),c1);
        System.out.println("method : "+c1.getRadius());
}
    //passing object to method
    //passing a value to method
    //circle c=> passing object to method
    public static void display(double r,circle c){
        System.out.println(r);
        System.out.println(c.getRadius());
        System.out.println("method : "+c);
        c.setRadius(10);
    }
}
