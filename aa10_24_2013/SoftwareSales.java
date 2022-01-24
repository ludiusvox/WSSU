package aa10_24_2013;

import java.util.Scanner;

public class SoftwareSales
{
public static void main( String[] args )
{


Scanner in = new Scanner( System.in );

System.out.println( "Please enter number of sales: " );
int count = in.nextInt();

double discount = 0.0;

if( count < 10 )
{
// no discount
}
else if( count <20 )
{
discount = 0.2;
}
else if( count < 50 )
{
discount = 0.3;
}
else if( count < 100 )
{
discount = 0.4;
}
else
{
discount = 0.5;
}

double costBeforeDiscount = count * 99;
double amountOfDiscount = costBeforeDiscount * discount;
double finalCost = costBeforeDiscount - amountOfDiscount;
System.out.println( "Cost Before Discount" + costBeforeDiscount );
System.out.println( "Amount of discount:" + amountOfDiscount );
System.out.println( "Amount of purchase:" + finalCost );
}
} 