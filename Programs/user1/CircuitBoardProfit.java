
/**
 * Write a description of class CircuitBoardProfit here.
 * An electronics company sells circuit boards at a 40 percent profit.  If you know the retail price of a
 * Circuit board, you can calculate its profit with the following formula:
 * Profit = Retail Price * .4
 * Write a program that asks for the retail price of the circuit board, calculate's the amount of profit 
 * earned from that product, displays the results on the screen.
 * @author (Aaron Linder) 
 * @version (1.0)
 */
import javax.swing.JOptionPane;

public class CircuitBoardProfit
{
    // instance variables - replace the example below with your own
    public static void main(String[]args)
     {
         String RetailPrice;      //For the retail price
         Double ProfitPercentage; //For the profit amount
         int Profit;
         //Get the circuit board price
        
         RetailPrice = JOptionPane.showInputDialog("What is the retail price?");
         
         //Calculate Profit
      
         ProfitPercentage = JOptionPane.showInputDialog("What is the profit percentage?");
         Profit = ProfitPercentage * RetailPrice;
         
         JOptionPane.showMessageDialog(null, "The profit is" + Profit);
         
         // End the program
         
         System.Exit(0);
        }
    }
         
         
      
         
         
         
      

