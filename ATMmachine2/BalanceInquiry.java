package ATMmachine2;


/**
 * Write a description of class BalanceInquiry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BalanceInquiry extends ATMMachine
{
    static double balance = 2000;
    public void setBalance(double b)
    {
        balance = b;
    }
    public static double getBalance()
    {
        return balance;
    }    
}