/* Write a program that lets the user enter the total rainfall for each of 12 months into an array of doubles.
* The program should calculate and display the total rainfall for the year, the average monthly rainfall,
* and the months with the high and low amounts. The program should also display a list of months,
* sorted in order of rainfall, from high to low.
*
* Input Validation: Do not accept negative numbers for monthly rainfall figures.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class rainfallStatistics {

    static Scanner userInput = new Scanner(System.in);
    static DecimalFormat roundOff = new DecimalFormat("0.00");

    public static void main(String[] args) {

        // variables
        final int MONTHS = 12;
        String name[] = new String[]  { "January","February","March","April","May","June","July","August","September","October","November","December"}; // array of months
        int counter = 0;
        double rain [] = new double[100000] ; // array to record inches of rain per month
        double avgYearRain;
        double year = 0;
        double high;
        double low;
        String highestMonth = "";
        String lowestMonth = "";

        // for loop used to asked user the amount of inches of rain for each month
        for (counter = 0; counter < MONTHS; counter++) {
            System.out.print("How many inches of rain does " + name[counter] + " have?: ");
            rain[counter] = userInput.nextDouble();
            while (rain[counter] < 0) {
                System.out.println("Please enter a number greater than 0.");
                rain[counter] = userInput.nextDouble();
            }
        }

        // for loop used to add all the inches together from each month
        for (counter = 0; counter < MONTHS; counter++) {
            year += rain[counter];
        }
        avgYearRain = year / MONTHS;

        System.out.println();

        System.out.println(" -------------------------------------------------");
        System.out.println("Months" + "Inches of Rainfall");
        System.out.println("--------------------------------------------------");

        // for loop used to display each month along with its inches of rain
        for (counter = 0; counter < MONTHS; counter++) {
            System.out.println(name[counter] + " \t\t" + rain[counter]);
        }
        System.out.println(" -------------------------------------------------");

        // finds month with the highest amount of rain
        high = rain[1];
        for (counter = 0; counter < MONTHS; counter++) {
            if (rain[counter] > high) {
                highestMonth = name[counter];
                high = rain[counter];
            }
        }

        // finds month with the lowest amount of rain
        low = rain[1];
        for (counter = 0; counter < MONTHS; counter++) {
            if (rain[counter] < low) {
                lowestMonth = name[counter];
                low = rain[counter];
            }
        }

        // outputs total yearly rainfaill, average monthly rainfall, highest and lowest months
        System.out.println();

        System.out.println("Total Rainfall for the year: " + roundOff.format(year) + " inches");
        System.out.println("Monthly average rainfall: " + roundOff.format(avgYearRain) + " inches");
        System.out.println("Month with highest amount of rainfall : "
                + highestMonth + " with " + roundOff.format(high) + " inches.");
        System.out.println("Month with lowest amount of rainfall: "
                + lowestMonth + " with " + roundOff.format(low) + " inches.");

        System.out.println();

    }

}
