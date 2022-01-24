package CaldwellSpaandResort;

import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * Write a description of class Csparesort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Csparesort
{
    
    
    // instance variables - replace the example below with your own
    Scanner keyboard = new Scanner (System.in);
    public char roomtype;
    private double spa;
    private double mealplan;
    private double days;
    private double occupencytax;
    private double roomprice;
    private double totalamountdue;
    private char choice;
    private String input;
    
    /**
     * Constructor for objects of class Csparesort
     */
    public Csparesort(char rt, double s, double mp, double d, double rp)
    {
        // initialise instance variables
        roomtype = rt;
        spa = s;
        mealplan = mp;
        days = d;
        roomprice = rp;
    }

    /**
     * Method to get the room price dependant on the type of room
     * 
     * @param  (D) || (E)
     * @return     roomprice (rp) 135 || 200 
     */
    public double getRoomprice(char rt, double rp)
    {
        System.out.println("What kind of room do you want?");
        System.out.print("(Deluxe Suite (D), Executive Suite (E))");
        input = keyboard.nextLine();
        roomtype = input.charAt(0);
        switch (roomtype)
        {
            case 'D':
            System.out.println("(D) Deluxe Suite");
            break;
            case 'E':
            System.out.println("(E) Executive Suite");
            break;
            default:
                
                System.out.println("ERROR! ");
            }
        if (roomtype == 'D')
        {
            roomprice = 135.00;
        }
        else if (roomtype == 'E')
        {
            roomprice = 200.00;
        }
        return roomprice;
    }
/**
 * Healthy Choice meal plan
 * 
 */
public double getMealplan(double mp)
{
System.out.println("Do you want to use the Healthy Choice Meal Plan Y-Yes, N-No?");
input = keyboard.nextLine();
choice = input.charAt(0);
if (choice ==  'Y' || choice == 'y')
{
mp = 60;
}
else
{
mp = 0;
}
return mp;
}
/**
 * Spa choice method
 */
public double getSpa(double s)
{
System.out.println("Do you want to use the optional recreation spa? (Y-Yes, N-No?");
input = keyboard.nextLine();
choice = input.charAt(0);
if (choice ==  'Y' || choice == 'y')
{
s = 20;
}
else
{
s = 0;
}
return s;
}

}