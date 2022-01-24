package robotssort;

import java.io.*;
import java.util.StringTokenizer;
import java.text.* ;
//  This function performs an ascending order selection sort on Array. 
public class Bubblesort
{
public static void SelectionSort(String[] name) throws IOException
{
    int num_schools = 20;
    
    int[] category;
   
    double[] average;
    int  startScan, minIndex, minValue;
    FileReader freader = new FileReader("Readme.txt");
    BufferedReader inputFile = new BufferedReader(freader);
    CIAA report2 = new CIAA(num_schools);
    DecimalFormat df = new DecimalFormat ( "####.##" ) ;
}
public static void BubbleSort(String[] name, int[] category, double[] average) 
    { 
      boolean sorted = false;  
      String temp;
      int temp2 = 0;
      double temp3 = 0;
      while (!sorted) 
      { 
           sorted= false; 

            for ( int x = 0; x < name.length-1; x++) 
            {                                        
                  if (name[x].compareToIgnoreCase(name[x + 1]) > 0) 
                  {                           
                        temp = name[x];
                        temp2 = category[x];
                        temp3 = average[x];
                        name[x] = name[x+1];
                        category[x] = category[x+1];
                        average[x] = average[x+1];
                        name[1] = temp;
                        category[x+1] = temp2;
                        average[x+1] = temp3;
                        
                        sorted = true;
                  } 

            }                 
      } 
 
} 
  
   
}