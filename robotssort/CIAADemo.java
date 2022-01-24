package robotssort;

import java.io.*;
import java.util.StringTokenizer;
import java.text.* ;
public class CIAADemo
{
        public static void main(String[] args) throws IOException{
            int num_schools = 20; //counts
            double average;  
            int studentNumber =1;
            String[] CIAAData = new String[num_schools]; //out of index
            String[] student = new String[num_schools];
            int[] category = new int[num_schools];
            int[] round1 = new int[num_schools];
            int[] round2 = new int[num_schools];
            int[] round3 = new int[num_schools];
            FileReader freader = new FileReader("Readme.txt");
            BufferedReader inputFile = new BufferedReader(freader);
            // Create an object
            CIAA report = new CIAA(num_schools);
            Bubblesort arrange = new Bubblesort();
            // Read the data from the fileen
            DecimalFormat df = new DecimalFormat ( "####.##" ) ;
        for (int index = 0; index < num_schools; index ++)
            {
                CIAAData[index] = inputFile.readLine();
            }
        inputFile.close();
        System.out.println("Student Index with Category");
        System.out.println("");
        for (int index = 0; index < CIAAData.length; index++)
            {
                StringTokenizer strTokenizer = new StringTokenizer(CIAAData[index],",");
                {
                    student[index] = strTokenizer.nextToken();
                    category[index] = Integer.parseInt(strTokenizer.nextToken());
                    round1[index] = Integer.parseInt(strTokenizer.nextToken());
                    round2[index] = Integer.parseInt(strTokenizer.nextToken());
                    round3[index] = Integer.parseInt(strTokenizer.nextToken());
                    System.out.println(student[index] + " " + category[index]);
//                     report.setStudent(student[index],index);
//                     report.setCategory(category[index], index);
//                     report.setRound1(round1[index], index);
//                     report.setRound2(round2[index], index);
//                     report.setRound3(round3[index], index);
                }
            }
        System.out.println("");
        System.out.println("Schools");
        System.out.println("");
        for(int index = 0; index < student.length; index++)
        {
        System.out.println(student[index] + " " + category[index] + " "
        + round1[index] +" " + round2[index] + " " + round3[index]);
        System.out.println();}
        System.out.println("");
                        
        
        System.out.println("Averages");
        System.out.println("");
        System.out.println("T h e       U n s o r t e d       L i s t ");
        System.out.println("");
        for(int index = 0; index < student.length; index++)
            {
        System.out.println(student[index] + " " + category[index] + " "
        + (df.format((round1[index] + round2[index] + round3[index])/3)) + " " );
        System.out.println();}
        
        System.out.println("");
        System.out.println("T h e   S o r t e d     L i s t ");
        System.out.println("");
         
        for(int index = 0; index < student.length; index++)
            {
        System.out.println(arrange);
        
        }
                    
        }
    }  
