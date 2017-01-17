/* A car with a 20-gallon gas tank averages 23.5 miles per gallon
* when driven in town and 28.9 miles per gallon when driven on the highway.
* Write a program that calculates and displays the distance the car can travel
*  on one tank of gas when driven in town and when driven on the highway.
*
* Hint: The following formula can be used to calculate the distance:
* Distance = Number of Gallons X Average Miles per Gallon.Ask the user
*
* to enter the number of gallons and then tell the user how long they can drive
* (the distance) for the average car for town and highway driving.
 */

import java.util.Scanner;

public class distancePerTankOfGas {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        // variables
        int numberOfGallons; // gallons of gas needed for car
        double distanceTown, distanceHighway; // calculated distance for the town and highway

        double avgMPGTown = 23.5; // average miles per gallon driving in town
        double avgMPGHighway = 28.9; // average miles per gallon driving on the highway 

        System.out.print("Enter the number of gallons needed for your car: "); // output statement 
        numberOfGallons = userInput.nextInt(); // input statement (accepts number of gallons)

        // calculations for distance traveled in town/ on highway
        distanceTown = numberOfGallons * avgMPGHighway;
        distanceHighway = numberOfGallons * avgMPGTown;

        // final output. Displays  distance traveled for town & highway
        System.out.println();
        System.out.println("You can travel " + distanceTown + " miles through town.\n"
                + "you can travel " + distanceHighway + " miles on the highway");

    }

}
