package aa10_24_2013;

import java.util.Scanner; 
import java.text.DecimalFormat;


public class BankChargesTest
{
   public static void main(String[] args)
   {
      int checks;          // Number of checks written
      double balance;      // Account balance

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Get the account balance.
      System.out.print("What is the account balance? ");
      balance = keyboard.nextDouble();
      
      // Get the number of checks written.
      System.out.print("How many checks were written? ");
      checks = keyboard.nextInt();
      
      // Create a BankCharges object.
      BankCharges bc = new BankCharges(balance, checks);
      
      // Display the fees.
      DecimalFormat dollar = new DecimalFormat("#,##0.00");
      System.out.println("Bank fees: $" +
                        dollar.format(bc.getFees()));
   }
}