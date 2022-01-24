
import javax.swing.JOptionPane;
/**
 * Write a description of class RestaurantBill here.
 * 
 * @Aaron Linder (your name) 
 * @1.0 (a version number or a date)
 * Write a program that computes the tax and tip on a restaurant bill.  
 * The program should ask the user to enter the charge for the meal.  The tax should be 6.75 percent
 * of the meal charge.
 * the tip should be 15 percent of the total after adding the tax.  Display the meal charge, tax amount,
 * tip amount, and total bill on the screen.
 */
public class RestaurantBill
{
  
    public static void main(String[] args);
       
    String meal; // price for the meal
    double tax; // tax rate
    double mealwtax; //taxed meal price
    double tip; // tip amount
    double total; // total amount
   
    // Get the price for the meal.
    meal = JOptionPane.showInputDialog("What is the price" + "for the meal?");
    
    // Get the meal with tax.
    mealwtax = 
        JOptionPane.showInputDialog("What is the tax rate");
    
   // Convert the input to a double.
   mealwtax = Double.parseDouble(inputString);
   
   // Calculate the tip amount.
   tip = (meal*mealwtax) * 1.15
   
   // Display the results
   JOptionPane.showMessageDialog(null, "tip")
   
   //End the program
   System.exit(0);
}

  
}
