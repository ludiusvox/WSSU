
/**
 * Write a description of class MilesPerGallon here.
 * 
 * @Aaron Linder (your name) 
 * @1.0 (115-9) 9/5/2013 (a version number or a date)
 */
import java.util.Scanner; // Needed for the Scanner Class

import javax.swing.JOptionPane;
public class MilesPerGallon
{
    public static void main(String[]args)
    {
        int MilesDriven; // To hold the miles per gallon
        int GallonsofGasUsed; // To hold the amount of gallons per gas used
        double MilesperGallon; //To hold the miles per gallon
        
        // Create a Scanner Object to read imput
        Scanner keyboard = new Scanner(System.in);
        
        //Get the miles per gallon
        System.out.print("What is the miles per gallon?");
        MilesDriven = keyboard.nextInt();
        // Consume the remaining newline.
        keyboard.nextLine();
        
        // Get the Gallons of Gas used
        System.out.print("How many gallons of gas used?");
        GallonsofGasUsed = keyboard.nextInt();
        
        //Calculate the miles per gallon
        MilesperGallon = MilesDriven / GallonsofGasUsed;
        
        //Display the Results
        JOptionPane.showMessageDialog(null, "The Miles per Gallon is" + MilesperGallon + "MPG");
        
        //End the Program
        System.exit(0);
    }
}
 

