import java.text.DecimalFormat; // Needed for Decimal Format
import java.util.Scanner; //Needed for the Scanner Class
import java.io.*;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
/**
 * This program writes data to a file
 */
public class StatsDemo
{
public static void main(String[] args) throws IOException
{
    String filename;
    
    
    
    
    DecimalFormat formatter = new DecimalFormat("#0.000");
    Scanner keyboard = new Scanner(System.in);
    System.out.println("This program calculates statistic on a file contain a series of number.");
    System.out.println("Enter the file name: ");
    filename = keyboard.nextLine();
    FileStats ds = new FileStats(filename);
    FileWriter ts = new FileWriter("Results.txt");
    PrintWriter bs = new PrintWriter(ts);
    bs.println("Mean" + formatter.format(ds.getMean()));
    System.out.println("Mean" + formatter.format(ds.getMean()));
    bs.println("stdDev" +formatter.format(ds.getStdDev()));
    System.out.println("stdDev" + formatter.format(ds.getStdDev()));
    bs.close();
}
 }   
    



    
  

