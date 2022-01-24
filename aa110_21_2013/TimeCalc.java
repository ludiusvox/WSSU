package aa110_21_2013;

import java.util.Scanner;


public class TimeCalc
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner (System.in);

    double seconds; // The number of seconds


    // Get the number of seconds.

    System.out.println("Enter the number of seconds");
    seconds = scan.nextDouble();

    System.out.println("That equals:");

    // Display the number of days, if any.

    if (seconds >= 86400)
    {
      // cast seconds to an int so we get integer division: whole number of days

      System.out.print(((int)seconds / 86400) + " days ");
      // remove full days from seconds, so it represents a portion of a day

      seconds %= 86400;
    }

    // Display the number of hours, if any.

    if (seconds >= 3600)
    {
      System.out.print(((int)seconds / 3600) + " hours ");
      seconds %= 3600;
    }

    // Display the number of minutes, if any.

    if (seconds >= 60)
    {
      System.out.print(((int)seconds / 60) + " minutes ");
      seconds %= 60;
    }

    System.out.println(seconds + " seconds.");
  }
}