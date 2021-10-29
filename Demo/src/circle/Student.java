package circle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dogaa
 */
public class Student {
    String name;
    int age;
    String studentId;
    
    public Student(){
        
    }
    public Student(String newName,int newAge, String newStudentId){
        setName(newName);
        setAge(newAge);
        setStudentId(newStudentId);
    }
 
    public void setName(String aName){
        name = aName;
    }
    
    public String getName(){
	return name;
    }

    public void setAge(int aAge){
        age = aAge;
    }
    
    public int getAge(){
	return age;
    }
    
    public void setStudentId(String astudentId){
        studentId = astudentId;
    }
    
    public String getStudentId(){
	return studentId;
    }
    
    public String display(){
        
        String age1 = Integer.toString(age);
        String msg = "Student ID: "+getStudentId()
                +"\nStudent Name: "+getName()
                +"\nStudent Age: "+getAge();
        return msg;
    }
}
