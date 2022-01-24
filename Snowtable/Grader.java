package Snowtable;

/**
 * Write a description of class Grader here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Grader
{
//the testScores field is a variable 
//that will reference an array
//of test scores.
private double[] testScores;

/**
 * The constructor accepts an array of test scores as an arguement.
 */

public Grader(double[] scoreArray)
{
    //Assign the array argument to 
    //the testScores field.
    testScores = scoreArray;
}
public double getHighestScore()
{
    //store the first value in the array in the variable highest
    double highest = testScores[0];
    //Search the array for the highest value.
    for(int index = 1; index < testScores.length; index++)
    {
        if (testScores[index] > highest)
        highest = testScores [index];
    }
return highest;
}
    /**
 * The getLowestScore
 */
public double getLowestScore()
{
    double lowest;  //to hold the lowest score
    
    // get the first test score in the array.
    lowest = testScores[0];
    
    //Step through the rest of the array. When
    //a value less than lowest is found, assign
    //it to lowest.
    for (int index = 1; index < testScores.length; index++)
    {
        if (testScores[index] < lowest)
        lowest = testScores[index];
    }
    //resturn the lowest test score.
    return lowest;
   
}
  /**
     * The getAverage method returns the average of the test scores with the lowest score dropped.
     */
    public double getAverage()
    {
        double total = 0; // to hold the score total
        double lowest; // to hold the lowest score
        double average; // to hold the average
        
        //If the array contains less than two test
        //scores, diosply an error message and
        //average to 0.
        
        if(testScores.length < 2)
        {
            System.out.println("ERROR: You must have at " + "least two test scores!");
            average = 0;
        }
        else
        {
            //First, calculate the total of the scores.
            for (double score : testScores)
            total += score;
            
            //Next,get the lowest score.
            lowest = getLowestScore();
            
            //Subtract the lowest score from the total.
            total -= lowest;
            
            //Get the adjusted average.
            average = total / (testScores.length -1);}
            
            // return the adjusted average.
            return average;
    }
}