package CaldwellSpaandResort;

import java.util.Scanner;
import java.text.DecimalFormat;


public class Csparesortdemo
{
 public static void main (String[] args)
 {
    Scanner keyboard = new Scanner (System.in);
    char roomtype = 'D';
    double spa = 20;
    double mealplan = 60;
    double days = 0;
    double occupencytax = .1;
    double roomprice = 140;
    double totalamountdue;
    char choice;
    String input;

System.out.print("Enter the number of days you plan to stay?");
    days = keyboard.nextDouble();
    Csparesort ss = new Csparesort(roomtype, spa, mealplan, days, roomprice);
    
    roomprice = ss.getRoomprice(roomtype, roomprice);
    mealplan = ss.getMealplan(mealplan);
    spa = ss.getSpa(spa);
    System.out.println("****************************************************************************");
    System.out.println("                   C A L D W E L L  S P A & R E S O R T                     ");
    System.out.println("****************************************************************************");
    System.out.println("Type of Suite is (D-Deluxe, E-Executive):$ " + roomtype + "   The price of the room is ($)  " + roomprice);
    System.out.println("Amount of Days staying at the Spa&Resort:$ " + days);
    System.out.println("The suite cost of the resort is:$ " + roomprice);
    System.out.println("The meal cost package for the resort is:$ " + mealplan);
    System.out.println("The spa package cost is:$ " + spa);
    occupencytax = days * (roomprice + mealplan + spa) * .10;
    totalamountdue = days * (roomprice + mealplan + spa) * 1.10;
    System.out.println("The occupency tax is:$ " + occupencytax);
    System.out.println("The total amount due is:$ " + totalamountdue) ;



}}