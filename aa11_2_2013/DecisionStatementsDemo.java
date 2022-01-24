package aa11_2_2013;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.*;
public class DecisionStatementsDemo
{
public static void main(String[] args)
{
double years;
String name;
double currentsalary;
double raisepercent = 1;
double raiseamount;
double newsalary;
Scanner keyboard = new Scanner(System.in);


System.out.println("What is the Faculty Members name ?");
name = keyboard.next();

System.out.println("What is the current Facilty Members salary?");
currentsalary = keyboard.nextInt();
   
System.out.println("How many years has the faculty served at Caldwell State University ?");
years = keyboard.nextDouble();
if ( years >= 15 )
{raisepercent = 1.15;}
else if ( years <= 15 )
{raisepercent = 1;}

raiseamount = (currentsalary * raisepercent) - currentsalary ;
newsalary = currentsalary + raiseamount;
DecisionStatements ds = new DecisionStatements(raisepercent, name, currentsalary, raiseamount,newsalary, years);
System.out.println("the salary with possible raises is:" + newsalary);

}
}