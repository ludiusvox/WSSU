package robotssort;

import java.util.Scanner; //For Scanner
import java.io.*; //For File and IOExceptions
/**
 * Write a description of class CIAA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CIAA
{
    // instance variables - replace the example below with your own
    private int num_schools;
    private String[] student;
    private int[] category;
    private int[] round1;
    private int[] round2;
    private int[] round3;
    private int[] index;
    private Scanner inputFile;
    private String line;
    private double[] total;
    private double[] average;
    private String filename;
   
    
    /**
     * Constructor for objects of class CIAA
     */
    
    
    public CIAA(int num_schools) throws IOException
    {
        // initialise instance variables
    
    student = new String[num_schools];
    category = new int[num_schools];
    round1 = new int[num_schools];
    round2 = new int[num_schools];
    round3 = new int[num_schools];
    average = new double[num_schools];
    total = new double[num_schools];}
    {
   }
public void setStudent(String studentname, int index)
    {
        student[index] = studentname;
    }
public void setCategory(int categorynumber, int index)
    {
        category[index] = categorynumber;
    }
public void setRound1(int round1number, int index)
    {
        round1[index] = round1number;
    }
public void setRound2(int round2number, int index)
    {
        round2[index] = round2number;
    }
public void setRound3(int round3number, int index)
    {
        round3[index] = round3number;
    }
public double[] getAverage()
        {
           
            
           for(int index = 0; index < round1.length; index ++)
           
           total[index] = round1[index] + round2[index] + round3[index];
           
           for(int index = 0; index < round1.length; index++)
           
           average[index] = total[index]/3;
            
            
            
           return average;
        }
    
public boolean readNextLine(){ 
            boolean lineRead; // Flag variable
            
            // Determine whether there is more to read.
            lineRead = inputFile.hasNext();
            
            // If so, read the next line
            if (lineRead)
            line = inputFile.nextLine();
            
            return lineRead;
    }   
/**
* The close method closes the file.
*/
public void close() throws IOException
{
            inputFile.close();
}    
       }
