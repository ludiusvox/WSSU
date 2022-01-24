package Snowtable;
import java.util.ArrayList;
import java.util.Collections;
import java.io.*;
import java.util.Scanner;
/**
 * Write a description of class CitySnow here.
 * 
 * @author (Aaron Linder) 
 * @version (2.0)
 */
public class CitySnow
{
    public static void main(String[] args)
    {
    Scanner in = new Scanner(System.in);
    String[] cities = {"Asheville","BannerElk","Boone",
    "GrandfatherMountain","Highland","KerrScottReservoir",
    "Morganton","Oconaluftee","PisgahForest","Waterville"};
    double[] inches ={13.2,38.7,35.3,53.5,11.8,9.7,3.9,6.5,7.5,4.1}; 
    int count=0;
    for (int index = 0; index < cities.length; index ++)
    {System.out.println(cities[index] + " has " + inches[index] + " inches of snow.");
    }   
   //create a grader averagubg object, passing the interest 
   //array as an arguement to a constructor.
   Grader myAverager = new Grader(inches);
   //Display the adjusted average.
   System.out.println("your adjusted average is " + myAverager.getAverage());
   for (int index = 0; index < cities.length; index ++)
    {
        if (inches[index] > myAverager.getAverage()== true )count ++;
    }
        System.out.println("The cities above the average snowfall is " + count 
         );
   
   
         
   System.out.println(" The lowest snowfall is : " + myAverager.getLowestScore());
   System.out.println(" The highest snowfall is : " + myAverager.getHighestScore());

}
}

    
