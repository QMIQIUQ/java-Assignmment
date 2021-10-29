public class TestCircle {
  /** Main method */
  public static void main(String[] args) {
      Circle c4 = null;
      String[] nameArray = new String[2];
      try{
        
        Circle c1 = new Circle(5);
        //Circle c2 = new Circle(-5);
        //Circle c3 = new Circle(0);
        nameArray[2] = "alibaba";
        System.out.println(c4.getRadius());
        
  
    }catch(IllegalArgumentException e){
        System.out.println(e.getMessage());
    }catch(NullPointerException w){
        
    }
    
    System.out.println("Number of objects created: " + Circle.getNumberOfObjects());
  }
}