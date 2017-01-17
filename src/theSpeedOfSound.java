/* The following table shows the approximate speed of sound in air, water, and steel.
*  Medium           Speed
*    Air                 1,100 feet per second
*    Water            4,900 feet per second
*    Steel              16,400 feet per second
*
* Write a program that displays a menu allowing the user to select air, water, or steel.
* After the user has made a selection, he or she should be asked to enter the distance
* a sound wave will travel in the selected medium. The program will then display the amount of time it will take.
* (Round the answer to four decimal places.)
* Input Validation: Check that the user has selected one of the available choices from the menu.
* Do not accept distances less than 0.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class theSpeedOfSound {
    
    static Scanner userInput = new Scanner(System.in);
    static DecimalFormat roundOff = new DecimalFormat("0.0000");

    public static void main(String[] args) {

        // variables
        int choice;
        double mediumDistance, speed;

        final int AIR_LENGTH = 1100;
        final int WATER_LENGTH = 4900;
        final int STEEL_LENGTH = 16400;

        // shows options and accepts a valid choice
        do {
            System.out.println("\nOption\t Medium\t Speed \n"); 
            System.out.println("1.\t Air\t 1,100 ft/s");
            System.out.println("2.\t Water\t 4,900 ft/s");
            System.out.println("3.\t Steel\t 16,400 ft/s");
            System.out.print("\nSelect an option from the above choices given: ");
            choice = userInput.nextInt();

        } while (choice < 1 || choice > 3);

        // choices calculates and displays the output depending on the choice made
        switch (choice) {
            case 1:
                do {
                    System.out.print("\nEnter the distance of the sound wave will travel in air: ");
                    mediumDistance = userInput.nextDouble();
                } while (mediumDistance < 0);

                speed = mediumDistance / AIR_LENGTH;
                System.out.println("\nTime traveled in air: " + roundOff.format(speed) + " secs");
                break;
            case 2:
                do {
                    System.out.print("\nEnter the distance of the sound wave will travel in water: ");
                    mediumDistance = userInput.nextDouble();
                } while (mediumDistance < 0);

                speed = mediumDistance / WATER_LENGTH;
                System.out.println("\nTime traveled in water: " + roundOff.format(speed) + " secs");
                break;
            case 3:
                do {
                    System.out.print("\nEnter the distance of the sound wave will travel in steel: ");
                    mediumDistance = userInput.nextDouble();
                } while (mediumDistance < 0);

                speed = mediumDistance / STEEL_LENGTH;
                System.out.println("\nTime traveled in steel: " + roundOff.format(speed) + " secs");
                break;
        }

    }

}
