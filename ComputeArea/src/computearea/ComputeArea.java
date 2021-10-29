/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computearea;

/**
 *
 * @author dogaa
 */
import java.util.*;
public class ComputeArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        System.out.println("Calculate Area");
        do{
        
        System.out.println("---------------------------------------------");
        System.out.println("1.Rectangle");
        System.out.println("2.Square");
        System.out.println("3.Triangle");
        System.out.println("4.Circle");
        System.out.println("5.Exit");
        System.out.println("---------------------------------------------");
        System.out.print("Select: ");
        String shape = input.next();
        double area=0;
        switch(Integer.parseInt(shape)){
            case 1 : area=calculateRectangle(); break;
            case 2 : area=calculateSquare(); break;
            case 3 : area=calculateTriangle(); break;
            case 4 : area=calculateCircle(); break;
            case 5 : a=5;System.out.println("Bye"); break;
        }
        display(shape,area);
        }while(a!=5);

    }
    public static double calculateRectangle(){
        Scanner input = new Scanner(System.in);
        double w,h,ans;
        System.out.print("Enter width: ");
        w = input.nextDouble();
        System.out.print("Enter Height: ");
        h = input.nextDouble();
        ans = w*h;

        return ans;
    }
    
    public static double  calculateSquare(){
        Scanner input = new Scanner(System.in);
        double w,ans;
        System.out.print("Enter length of side: ");
        w = input.nextDouble();
        ans = w*w;

        return ans;
    }
    
    public static double  calculateTriangle(){
        Scanner input = new Scanner(System.in);
        double b,h,ans;
        System.out.print("Enter base: ");
        b = input.nextDouble();
        System.out.print("Enter Height: ");
        h = input.nextDouble();
        ans = 0.5*b*h;

        return ans;
    }
    
    public static double  calculateCircle(){
        Scanner input = new Scanner(System.in);
        double r,ans,p=3.1415;
        System.out.print("Enter radius: ");
        r = input.nextDouble();
        ans = p*r*r;

        return ans;
    }
    
    public static void display(String shape, double area) {
        switch(Integer.parseInt(shape)){
            case 1 : System.out.println("The area of the rectangle is "+area); break;
            case 2 : System.out.println("The area of the square is "+area); break;
            case 3 : System.out.println("The area of the triangle is "+area); break;
            case 4 : System.out.println("The area of the circle is "+area); break;

                
        }
        
       
    }
}
