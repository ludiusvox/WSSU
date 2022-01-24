package aa11_2_2013;



public class DecisionStatements
{
   
    // instance variables - replace the example below with your own
    private double raisepercent; //declare and initialize variable to tell the percentages of raises
    private String name;  //declare and initialize variable to tell the faculties names
    public double currentsalary;  //declare and initialize varible to tell the current salaries
    private double raiseamount;  //this is the amount of salary increased by raises
    private double newsalary; //this is the total salary after raises
    public double years; //this is how many years the faculty has been serving
    
    
   
    public DecisionStatements(double rp, String n, double cs, double ra, double ns, double y)
    {
        // initialise instance variables
        raisepercent = rp;
        name = n;
        currentsalary = cs;
        raiseamount = ra;
        newsalary = ns;
        years = y;
    }
/**
 * method to get the new salary
 */
    public double getCurrentsalary(){
        System.out.println("The current salary is:" + currentsalary);
        return currentsalary;
    }
/**
 * method to calculate raise, amount, etc.
 */
    
public double getRaiseamount(double cs, double rp){
    if (years > 15)
      System.out.println("The amount of the raise is" + raiseamount);
       raiseamount = (currentsalary * raisepercent) - currentsalary ;
      return raiseamount;
    }
/**
 * Method to calculate new Salary
 */
public double getNewsalary(double ns){
    System.out.println("The new salary is" + currentsalary + raiseamount);
    newsalary = currentsalary + raiseamount;
    return newsalary;
}
}