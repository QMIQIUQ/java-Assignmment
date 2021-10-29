/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author dogaa
 */
public class Person {
    int age;
    private String name;
    
    public Person(){
        
    }
    public Person(String newName,int newAge){
        setName(newName);
        setAge(newAge);
    }
    
    public void setName(String newName){
        name = newName;
        
    }
    
    public String getName(){
        return name;
    }
    
    public void setAge(int newAge){
        age = newAge;
    }
    
    public int getAge(){
        return age;
    }
    
    public int computeAge(){
        int computeAge = age*365;
        return computeAge;
    }
    
    public void printPerson(){
        String msg = "Name : "+getName()+"\nAge in days : "+computeAge();
        System.out.println(msg);
    }
    
    
    //toString() from object Class
    //return String Value => name + Age
    
    @Override
    public String toString(){
        String msg = "Name : "+getName()+"\nAge in Days : "+getAge();
        
        
        return msg;
                
    }
    
}
