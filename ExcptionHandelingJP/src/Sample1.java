import java.util.*;
public class Sample1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two integer: ");
        
        try{
            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();
            System.out.println(number1 + " / "+ number2 + "is" +(number1/number2));    
        }catch(ArithmeticException e){
            System.out.println(e);
            //e-> e.toString() =>2 cannot / by 0
        }catch(InputMismatchException e){
            System.out.println("wrong input");
        }catch(Exception ex){
            System.out.print("error occurred");
        }finally{
            System.out.println("hi");
        }
        
        System.out.println("hello");
        
   
    }
}
