import java.util.Scanner; 
import javax.swing.JOptionPane;
/**
 * Write a description of class Body Mass Index
 * 
 * @Aaron Linder
 * 1.0 (09/16/2013)
 */




public class BMI
{
    public static void main (String[]args)
    {
     int Height; // Height in inches^2
     int Weight; // Weight in pounds
     int BMI; // Body mass index
     String Category;
     // create a scanner to read input
     Scanner keyboard = new Scanner(System.in);
     
     // Get the height of the person
     System.out.print("What is the height of the person?");
     Height = keyboard.nextInt();
     
     // get the weight of the person
     System.out.print("What is the weight of the person?");
     Weight = keyboard.nextInt();
     //Calculate the BMI
     
     BMI = (Weight*703)/(((Height)*(Height)));
     System.out.println(BMI);
     //calculate the category
    {
     if (BMI < 18.5)
     System.out.println("The person is in the BMI category of Underweight");
     else 
     if (BMI < 25)
     
     System.out.println("The person is in the BMI category of Normal Weight");
     else 
     if (BMI < 30)
     
     System.out.println("The person is in the BMI category of Overweight");
     else if (BMI > 30)
     System.out.println("The person is in the BMI category of Obese");
    }
    
    }
     
}
         
        
     
  
        
        
     
     
    
    


