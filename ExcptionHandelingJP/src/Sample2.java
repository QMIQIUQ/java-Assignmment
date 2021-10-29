import java.util.*;
public class Sample2 {
           
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter an integer: ");
       //int number = 0;
       String[] c = new String[2];
       try{
           System.out.println(c[2]);
       int number = scanner.nextInt();
       //when error it will just skip the following statement~~
       System.out.println("The number entered is "+number);
        
       }catch(InputMismatchException e){
           System.out.println("wrong input");
       }
       
    }
}
