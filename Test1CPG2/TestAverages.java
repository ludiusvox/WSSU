package Test1CPG2;
import java.io.*;    //Needed for IOException

/**
 * This program uses the TestScoreReader class to read 
 * test scores from a file and get their averages.
 */
public class TestAverages
{
    public static void main(String[] args)
                            throws IOException
    {
        double average;         // To hold an average
        int studentNumber = 1;  //To count students
        
        //Create a TestScoreReader object.
        TestScoreReader scoreReader = new TestScoreReader("Test1CPG2/Grades.csv");
        
        // Process the file contents.
        while (scoreReader.readNextLine())
        {
            // Get this student's Average.
            average = scoreReader.getAverage();
            if (average > .85){
            //Display this student's average.
            System.out.println("Average for student number " + studentNumber + " is " + average);
            // Increment the student number.
        } else {
        System.out.println("Average from student number below 85 percent is " + studentNumber + "is" + average);
        }
            studentNumber++;
            
        }
        // Close the file.
        scoreReader.close();
        System.out.println("No more Scores.");
    }

}