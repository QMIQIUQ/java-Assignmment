/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;

/**
 *
 * @author dogaa
 */
import java.util.*;
public class GetStudentInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name;
        int age;
        String id;
        Scanner input = new Scanner(System.in);
       
        System.out.print("Enter Student Name: ");
        name = input.nextLine();
        System.out.print("Enter Student Age: ");
        age = input.nextInt();
        System.out.print("Enter Student Studnet ID: ");
        id = input.next();
       
        Student student1 = new Student(name,age,id);
        System.out.println(student1.display());
        
    }
    
}
