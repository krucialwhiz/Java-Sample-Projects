/* Write a function named “CoinToss” that simulates the tossing of a coin.
* When you call the function, it should generate a random number in the range of 1 through 2.
* If the random number is 1, the function should display “heads.”
* If the random number is 2, the function should display “tails.”
* Demonstrate the function in a program that asks the user how many times
* the coin should be tossed and then simulates the tossing of the coin that number of times.
 */

import java.util.Random;
import java.util.Scanner;

public class coinToss {

    static Scanner userInput = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {

        // variables
        int coinTossCount, numOfToss;

        // input: asks users to flip coin "x" number of times
        System.out.print("How many times do you want to flip the coin?: ");
        numOfToss = userInput.nextInt();

        // for loop outputs the toss number and the result of each toss
        for (coinTossCount = 1; coinTossCount <= numOfToss; coinTossCount++) {
            System.out.print("Toss number " + coinTossCount + " : ");
            CoinToss();
            System.out.println();
        }
    }

    public static void CoinToss() {

        // generates random number range 1 - 2
        int randomNumber = rand.nextInt(2) + 1;

        if (randomNumber == 1) {
            System.out.print("heads");
        } else if (randomNumber == 2) {
            System.out.print("tails");
        }
    }

}
