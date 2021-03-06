package aa1;

//Aaron Linder
//9/27/2013
//The purpose of this class is to model a television.
import java.util.Scanner;
/**
  
*/

public class Car
{
   private int yearModel; // The car's year model
   private String make;   // The car's make
   private int speed;   // The current speed

   /**
    The constructor initializes the car's
    year model and make.
    @param y The car's year model.
    @param m The car's make.
   */

   public Car(int y, String m)
   {
      yearModel = y;
      make = m;
      speed = 0;
   }

   /**
    The getYearModel method returns the car's
    year model.
    @return The car's year model.
   */

   public int getYearModel()
   {
      return yearModel;
   }

   /**
    The getMake method returns the car's make.
    @return The car's make.
   */

   public String getMake()
   {
      return make;
   }

   /**
    The getSpeed method returns the car's
    current speed.
    @return The car's current speed.
   */

   public int getSpeed()
   {
      return speed;
   }

   /**
    The accelerate method increases the car's
    speed by 5 MPH.
   */

   public void accelerate()
   {
      speed += 5;
   }

   /**
    The brake method decreases the car's
    speed by 5 MPH.
   */

   public void brake()
   {
      speed -= 5;
   }
}

