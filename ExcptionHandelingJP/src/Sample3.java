 import javax.swing.*;
public class Sample3 {
           
    public static void main(String[] args) {
        String s1,s2;
        double num1,num2, average;
        try{
            s1=JOptionPane.showInputDialog("Enter a number:");
            num1=Double.parseDouble(s1);
            s2=JOptionPane.showInputDialog("Great! Now enter another number:");
            num2=Double.parseDouble(s2);
            average =(num1+num2)/2.0;
            JOptionPane.showMessageDialog(null, "The average of " + num1 + " and " + num2 + " is " + average, "Sample Input Dialog", JOptionPane.INFORMATION_MESSAGE);
            
        }catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null, "number must be numeric");
        }finally{
            System.exit(0);
        }
             
    }
    
    
}
