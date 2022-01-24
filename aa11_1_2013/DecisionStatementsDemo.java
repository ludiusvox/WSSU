package aa11_1_2013;

import java.util.Scanner;
import java.text.DecimalFormat;

public class DecisionStatementsDemo
{
public static void main(String[] args)
{
int years;
String name;
int currentsalary;

System.out.println("What is the Faculty Members name ?");
name = input.nextString();
   
System.out.println("What is the current Facilty Members salary?");
currentsalary = imput.nextInt();
   
System.out.println("How Many years has the faculty served at Caldwell State University ?");
years = input.nextInt();
DecisionStatements ds = new DecisionStatements(years, name, currentsalary);
}
}