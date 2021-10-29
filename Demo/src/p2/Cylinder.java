/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import p1.circle;

/**
 *
 * @author dogaa
 *///Cylinder(Subclass)Extends circle(Syperclass)
//rules:subclass extends at most 1 superclass but sueprclass can have more than 1 subclass
public class Cylinder extends circle{
    //subclass can inherit all data/method from superclass
    //extends
    //1)private data/ method cannot extend
    //2)cannot inherit constructor object
    //add length
    
    private double length;
    //example of overload method
    //same method name but diffrent parameter
    public Cylinder(){
        this(2);
        //super(5);//circle()
        //call superclass defult constructor if not explicit call it
    }
    public Cylinder(double length){
        super();
        setLength(length);
    }
    
    //can add new method
    public void setLength(double length){
        this.length = length;
        //this.length=> cylinder.length
    }      
    public double getLength(){
    return length;    
    }
    //override mathod
    //=>replace the method form the superclass
    //same method signature
    //@<= java tag
    @Override
    public double findArea(){
        double area = 2*PI*super.getRadius()*getLength()+2*super.findArea();
        return area;
    }
    //static method cannot be owerride
    //@Override
    public static int getNumberOfObject(){
        
        return 999;
    }
    
    @Override
    public String toString(){
        String msg = super.toString()+"\tLength"+getLength();
        return msg;
    }
}
