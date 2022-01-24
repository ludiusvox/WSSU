//  To calculate the statistics on a file of numbers
import java.util.Scanner;
import java.text.DecimalFormat;
import java.io.*;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;

public class FileStats
{
    String filename = "Readme.txt";
    private double mean;    //the arithmetic average
    private double stdDev;  //the standard deviation
    String readRow= null;
    boolean rowsLeft = true;
    BufferedReader reader= null;
    FileReader file = null;
    int count=0;
    double sum = 0;
    private double variance;
    
    File inputfile = new File ("Readme.txt");
    Scanner scan = new Scanner(inputfile);
    //Constructor calls calculateMean and calculateStdDev methods
    //and store the results in the respective instance variables
     
    public FileStats(String filename) throws IOException
    {
        mean = calculateMean(filename);
        stdDev = calculateStdDev(filename);
        
    }
    
    public double getVariance() throws IOException
    {
        return variance;
    }
    //returns the mean
    public double getMean() throws IOException
    {
        return mean;
    }
    //returns the standard deviation
    public double getStdDev() throws IOException
    {
        return stdDev;
    }

    //returns the calculated arithmetic average
    public double calculateMean(String filename) throws IOException
    {
        //ADD LINES FOR TASK 4
        FileReader fs =  new FileReader(filename);
        BufferedReader ls = new BufferedReader(fs);
        
        //String words = scan.next(); //I am not sure how this line works
        double num1 = Double.parseDouble(scan.nextLine());
        System.out.println(num1);
        double num2 = Double.parseDouble(scan.nextLine());
        System.out.println(num2);
        double num3 = Double.parseDouble(scan.nextLine());
        System.out.println(num3);
        double num4 = Double.parseDouble(scan.nextLine());
        System.out.println(num4);
        double num5 = Double.parseDouble(scan.nextLine());
        System.out.println(num5);
        double num6 = Double.parseDouble(scan.nextLine());
        System.out.println(num6);
        double mean = (num1 + num2 + num3+ num4+ num5+ num6)/6;
        System.out.println("mean" + mean);
        ls.close();
        fs.close();
    
    return mean;}
    //returns the calculated standard deviation
    public double calculateVariance(String filename) throws IOException
    {
        return variance;}
    public double calculateStdDev(String filename) throws IOException
    {
        //ADD LINES FOR TASK 5
        File inputfile = new File ("Readme.txt");
        Scanner scan = new Scanner(inputfile);
        FileReader fs =  new FileReader(filename);
        BufferedReader ls = new BufferedReader(fs);
        
        double num1 = Double.parseDouble(scan.nextLine());
        System.out.println(num1);
        double num2 = Double.parseDouble(scan.nextLine());
        System.out.println(num2);
        double num3 = Double.parseDouble(scan.nextLine());
        System.out.println(num3);
        double num4 = Double.parseDouble(scan.nextLine());
        System.out.println(num4);
        double num5 = Double.parseDouble(scan.nextLine());
        System.out.println(num5);
        double num6 = Double.parseDouble(scan.nextLine());
        System.out.println(num6);
        double sum =(num1 + num2 + num3+ num4+ num5+ num6);
        double mean =(num1 + num2 + num3+ num4+ num5+ num6)/6;
        double variance =Math.pow(sum - mean, 1)/6;
        double stdDev =Math.pow(variance, .5);
        System.out.println("stdDev (population dist)" + stdDev);
        fs.close();
        ls.close();
        
        

        
        return stdDev;
    }
}
