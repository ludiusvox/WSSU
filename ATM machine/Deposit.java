
/**
 * Write a description of class Deposit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Deposit extends ATMMachine
{
    static double deposit;
    public void setDeposit(double d)
    {
        deposit = d;
    }
    public static double getDeposit()
    {
        return deposit;
    }
}
