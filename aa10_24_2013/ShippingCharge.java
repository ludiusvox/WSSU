package aa10_24_2013;

import java.util.Scanner;           // Required for the Scanner class.

public class ShippingCharge
{
    public static void main (String[] args)
    { 

int weight = 0;                                         // Declare and initialize variable to hold the entered weight.
double distance = 0.0;                                  // Declare and initialize variable to hold the entered distance.
double rate;                                            // This variable will hold the calculated rate.
int distanceMultiplier = (int)distance / 500;           // This will hold the increments of the shipping charge.
int distanceRemainder;                                  // This will decide if the shipping charge advance up one level.

Scanner input = new Scanner(System.in);                 // Create a Scanner object for the input.

// Get the weight of the package.
System.out.println("What is the weight of the package (in pounds) ?");
weight = input.nextInt();

// Get the shipping distance of the package.
System.out.println("What is the shipping distance (in miles) ?");
distance = input.nextDouble();

distanceRemainder = (int)distance % 500; 
if (distanceRemainder == 0)
    {
    if (weight <= 2)
        System.out.println("Total Shipping Cost is: $ " + (distanceMultiplier * 1.10));
        }
    else if (weight > 2 && weight <= 6)
    {
        System.out.println("Total Shipping Cost is: $ " + (distanceMultiplier * 2.20));
        }
    else if (weight > 6 && weight <= 10)
    {
        System.out.println("Total Shipping Cost is: $ " + (distanceMultiplier * 3.70));
        }
    else
    {
        System.out.println("Total Shipping Cost is: $ " + (distanceMultiplier * 3.80));
        }
        
if (distanceRemainder != 0)
    {
        if (weight <= 2)
        System.out.println("Total Shipping Cost is: $ " +(distanceMultiplier + 1) * 1.10);
        }
    else if (weight > 2 && weight <= 6)
    {
        System.out.println("Total Shipping Cost is: $ " +(distanceMultiplier + 1) * 2.20);
        }
    else if (weight > 6 && weight <= 10)
    {
        System.out.println("Total Shipping Cost is: $ " +(distanceMultiplier + 1) * 3.70);
        }
    else
    {
        System.out.println("Total Shipping Cost is: $ " +(distanceMultiplier + 1) * 3.80); 
        
        System.exit(0);
}

    }
}


