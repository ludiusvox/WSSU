import java.io.File;
import java.io.FileNotFoundException;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Test x = new Test();
        x.high();
    }

    public void high() {
        // to format the scores
        DecimalFormat df = new DecimalFormat("###.#");
        df.setRoundingMode(RoundingMode.HALF_UP);

        ArrayList<Double> averages = new ArrayList<Double>();

        File file2 = new File("Readme.txt");

        try {
            Scanner scanner = new Scanner(file2);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] values = line.split(",");

                // Converts String Array into Double Array
                double[] scoresPerPerson = new double[values.length];

                for (int i = 1; i < values.length; i++) {
                    scoresPerPerson[i] = Double.parseDouble(values[i]);
                }

                // Finds the sum and then the average, adds it to a array List
                double sum = 0.0;

                for (double i : scoresPerPerson) {
                    sum += i;
                }

                double average = sum / values.length;
                averages.add(average);

                System.out.println(values[0] + ": " + df.format(average) + " "
                        + getCharGrade(average));

            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Computes the average and get the max min

        double max = 0;
        double min = 100;
        double totalAverage = 0;

        for (double average : averages) {
            if (average > max) {
                max = average;
            }
            if (average < min) {
                min = average;
            }
            totalAverage += average;
        }

        // Final step to get the general average
        totalAverage /= averages.size();

        // Print out the final general data
        System.out.println();
        System.out.println("High : " + df.format(max));
        System.out.println("Low : " + df.format(min));
        System.out.println("Average : " + df.format(totalAverage));
    }

    private String getCharGrade(double average) {

        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}