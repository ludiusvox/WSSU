package ATMmachine2;


/**
 * Write a description of class Withdraw here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Withdraw extends ATMMachine
{
    static double withdraw = 0;    
    public void setWithdraw(double w)
    {
        withdraw = w;
    }
    public static double getWithdraw()
    {
        return withdraw;
    }
}