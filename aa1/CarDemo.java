package aa1;

//Aaron Linder
//09/27/2013
//The purpose of this demo is to show off televisions we can make using our classes member functions


import java.util.*;

public class CarDemo
{
   public static void main(String[] args)
   {
      Car sportsCar = new Car(1972, "Nova");
      

      // Display the current status.

      System.out.println("Current status of the sports car:");
      System.out.println("Year model: " + sportsCar.getYearModel());
      System.out.println("Make: " + sportsCar.getMake());
      System.out.println("Speed: " + sportsCar.getSpeed());
      // Accelerate the sports car five times, the slowCar twice.

      System.out.println("\nAccelerating...");
      sportsCar.accelerate();
      sportsCar.accelerate();
      sportsCar.accelerate();
      sportsCar.accelerate();
      sportsCar.accelerate();

     

      // Display the speed.

      System.out.println("Now the sport car speed is " + sportsCar.getSpeed());
    

      // Brake the sports car three times, the slowCar once

      System.out.println("\nBraking...");
      sportsCar.brake();
      sportsCar.brake();
      sportsCar.brake();
      sportsCar.brake();
      sportsCar.brake();
      // Display the speed.

      System.out.println("Now the sport car speed is " + sportsCar.getSpeed());
   }
}