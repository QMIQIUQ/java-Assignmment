/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

/**
 *
 * @author dogaa
 */
public class demoArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numberArray = new int[3];
                numberArray[0]=10;
                System.out.println(numberArray[0]);
       String[] nameArray = {"ali","Ahmad"};
       circle[] circleArray = new circle[2];
       circle c1 = new circle(5);
       circle c2 = new circle(10);
       circleArray[0] = c1;
       circleArray[1] = new circle(10);
       System.out.println(circleArray[0].getRadius());
       for(int index = 0;index<circleArray.length;index++ ){
           System.out.println(circleArray[index].getRadius());
       }
       //for each element(circle c)in circleArray
       for(circle c:circleArray){
           System.out.println(c.getRadius());
       }
    }
    
}
