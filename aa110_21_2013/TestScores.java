package aa110_21_2013;

import java.util.Scanner; 
public class TestScores
 {
 private double Score1;		
 private double Score2;		
 private double Score3;		
 private double Total;
 private double Average;  
 public void setTestScores(double S1, double S2, double S3)
 {
 
Score1 = S1;
Score2 = S2;
Score3 = S3;  
 }
	   
  public double getScore1()
 {
 return Score1;
 }
 
  public double getScore2()			//Using the accessor get, to retrieve the
 {											// the values stored in the different scores.
 return Score2;
 }
 
  public double getScore3()
 {
 return Score3;
 }
 
  public double getTotal()				// also using the getTotal accessor to get
 {													//retrieve a total sum of scores
 return Total = Score1 + Score2 + Score3;
 }
 
  public double getAverage()				// getAverage Accessor is to retrieve
 {												// an average of the 3 test scores
 return Average = Total / 3;
 }
 public static void main(String[]args)
	{
	
		double Score1;
		double Score2;
		double Score3;
		//creates the scanner object to input information.
		Scanner keyboard = new Scanner(System.in);
		//create a testscores object.
		TestScores scores = new TestScores();
		//get the first score.
		System.out.print("What is the first score?");
		Score1 = keyboard.nextDouble();
		//get the second score.
		System.out.print("what is the second score?");
		Score2 = keyboard.nextDouble();
		//get the thrid score.
		System.out.print("What is the second score?");
		Score3 = keyboard.nextDouble();
		scores.setTestScores(Score1, Score2, Score3);
		//show the total of all 3 scores.
		System.out.println("Your total for all three tests is: " +scores.getTotal());
		
		//Show the average for all 3 scores
		System.out.println("Your average of all your tests is: " + scores.getAverage());
		
	}
 }
