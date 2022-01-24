package bankcharges2;


/**
 * Write a description of class BankCharges2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BankCharges2
{
    // instance variables - replace the example below with your own
    private double prevbalance;
    private final double addcharges;
    private double interest;
    private double minimumpayment;
    private double newbalance;
    private double charges;
    /**
     * Constructor for objects of class BankCharges2
     */
    public BankCharges2(double pb, double ac, double i, double nb)
    {
        // initialise instance variables
        prevbalance = pb;
        addcharges = ac;
        interest = i;
        newbalance = nb;
    }
    /**
     *  the setPrevbalance method sets the accounts balance 
     */
    public void setPrevbalance(double pb)
    {
        // put your code here
        prevbalance = pb;
    }
    /**
     * The Add charges method returns the of added charges for the account.
     */
    public double getCharges()
    {
        double charges = prevbalance;
        if (prevbalance > 0)
        charges += (addcharges * .02);
        
        if (prevbalance > 50)
        charges += (addcharges + 50);
        else if (prevbalance > 300)
        charges += (prevbalance * .20);
        
        return charges;
}
/**
 * get the new balance
 * 
 */
     public double getNewbalance()
     {
    newbalance = prevbalance + charges;
    return newbalance;
}
/** 
 * get the interest
 */
public double getInterest()
    {
        interest = prevbalance * .02;
        return interest;}
}