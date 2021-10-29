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
//circles class
public class circle extends Object {
    public static final double PI = 3.142;
    //track number of object through constructor mathod;
    private static int numberOfObject = 0;
    //attribute
    //double/int/float......primitive numbers=>0
    private double radius;//class variable
    //method
    //constructor method
    //can having 1 or more constructor
    //1)method name = class name
    //2)no return type,not even void
    //default constructor
    //3) no arugment/parameter
    
    public circle(){
        //radius = 100;
        
        this(10);
    }
    
    public circle(double a){
        setRadius(a);
        numberOfObject++;
    }
    
    public void setRadius(double newRadius){
        //double redius;//local varable
        if(radius>=0){
            radius = newRadius;
        }
    }
    
    protected double getRadius(){
        return radius;
    }
    
    public double findArea(){
        double area = PI*this.radius*this.radius;
        return area;
    }
    
    public static int getNumberOfObject(){
        
        return numberOfObject;
    }
    @Override
    public String toString(){
        String msg = "Radius "+getRadius()+"\tArea "+findArea();
        return msg;
    }
}
