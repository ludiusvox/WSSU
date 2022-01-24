package aa10_24_2013;

public class BankCharges
{
   private final double MONTHLY_FEE = 10.0;         // Monthly fee
   private final double LOW_BALANCE = 400.0;        // Low balance 
   private final double LOW_BALANCE_FEE = 15.0;     // Low balance fee (under $400)
   private int checksWritten;                       // Number of checks written
   private double balance;                          // Account balance

   
   public BankCharges(double b, int c)
   {
      balance = b;
      checksWritten = c;
   }

   /**
      The setChecksWritten method sets the
      number of checks written for a month.
  */

   public void setChecksWritten(int c)
   {
      checksWritten = c;
   }

   /**
      The setBalance method sets the account's balance.
     
   */

   public void setBalance(double b)
   {
      balance = b;
   }

   /**
      The getChecksWritten method returns
      the number of checks written for a month.
  */

   public int getChecksWritten()
   {
      return checksWritten;
   }

   /**
      The getBalance method returns the
      account balance.
  */
   
   public double getBalance()
   {
      return balance;
   }

   /**
      The getFees method returns the amount
      of monthly fees for the account.
  */
   
   public double getFees()
   {
      double fees = MONTHLY_FEE;
      
      if (balance < LOW_BALANCE)
         fees += LOW_BALANCE_FEE;
      
      if (checksWritten >= 60)
         fees += (checksWritten * 0.04);
      else if (checksWritten >= 40)
         fees += (checksWritten * 0.06);
      else if (checksWritten >= 20)
         fees += (checksWritten * 0.08);
      else
         fees += (checksWritten * 0.1);      

      return fees;
   }  
}