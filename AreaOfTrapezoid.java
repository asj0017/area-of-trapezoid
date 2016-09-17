/**
 * 
 * Calculates the area of a triangle.
 *
 * @author Amber Jackson
 * @version 07-14-2015
 */

import java.util.Scanner;

public class AreaOfTrapezoid {
   /**
    * Prints to std output.
    *
    * @param args Command line arguments (not used).
    */

   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      double height = 0;
      double base1 = 0;
      double base2 = 0;
      
      System.out.print("Enter values for height, base1, and base2 of a trapezoid:\n"
         + "\theight: ");
      height = userInput.nextDouble();
      
      System.out.print("\tbase1: ");
      base1 = userInput.nextDouble();
   
      System.out.print("\tbase2: ");
      base2 = userInput.nextDouble();
      
      System.out.print("\n");
      
      System.out.println("\tA trapezoid with height = "
           + (double) height + ", base1 = " 
           + (double) base1 + ", base2 = "
           + (double) base2 + ", has an area of "
           + (height * (base1 + base2)) / 2 + " square units.");
   }
}
