/* Write a program that generates a random number and asks the user to guess what the number is.
* If the user’s guess is higher than the random number, the program should display “Too high, try again.”
* If the user’s guess is lower than the random number, the program should display “Too low, try again.”
* The program should use a loop that repeats until the user correctly guesses the random number.
*
* You should also keep a count of the number of guesses that the user makes.
* When the user correctly guesses the random number, the program should display the number of guesses.
 */

import java.util.Random;
import java.util.Scanner;

public class randomNumberGuessingGame {

    static Scanner userInput = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {

        // variables
        int randomNumber;
        int guessAttempts = 1;
        int guess;

        // random number generator generates a random number from 1 - 20
        randomNumber = rand.nextInt(20) + 1;
        

        // do while loop accepts a number from 1 -20
        do {
            System.out.print("Guess a number from 1 to 20: ");
            guess = userInput.nextInt();

            /* if else statements tests if guess is too high, too low or is equal to
		the random number and outputs the result
             */
            if (guess > randomNumber) {
                System.out.println("Too high, try again !!!\n");
            } else if (guess < randomNumber) {
                System.out.println("Too low, try again!!!\n");
            } else if (guess == randomNumber) {
                System.out.println("\nCongratulations!!! You gueesed it. Number of guesses: "
                        + guessAttempts);
            }
            guessAttempts++;
        } while ((guess != randomNumber)); // end of do while loop

    }

}
