
import java.util.Scanner; 
import java.text.DecimalFormat;
/**
 * Write a description of class aa1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class precourseassignment
{
  public static void main(String[] args)
  {
      int number = 0; // value of number
      int number2; //added number
      int count = 1;
      //Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      do{
      // Get the number value
      
      System.out.print("What is the number value?");
      System.out.print("..........");
      number2 = keyboard.nextInt();
      
      if (number2 < 0)
        System.out.print( "Error" );
      else
        number = number + number2;
        
      System.out.print( " The number is  " +  number );
      count++;
    }while( count < 100);
}}
