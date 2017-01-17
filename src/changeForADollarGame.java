/* Create a change-counting game that gets the user to enter the number of coins required
* to make exactly one dollar. The program should ask the user to enter the number of pennies,
* nickels, dimes, and quarters. If the total value of the coins entered is equal to one dollar,
* the program should congratulate the user for winning the game. Otherwise, the program should display
* a message indicating whether the amount entered was more than or less than one dollar.
 */

import java.util.Scanner;

public class changeForADollarGame {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        // variables
        int pennyCount, nickelCount, dimeCount, quaterCount;

        final double PENNY = 0.01;
        final double NICKEL = 0.05;
        final double DIME = 0.10;
        final double QUATER = 0.25;

        double dollarTotal;

        // input for the amount of pennies, nickels, dimes and quarters
        System.out.print("Enter the amount of pennies: ");
        pennyCount = userInput.nextInt();

        System.out.print("Enter the amount of nickels: ");
        nickelCount = userInput.nextInt();

        System.out.print("Enter the amount of dimes: ");
        dimeCount = userInput.nextInt();

        System.out.print("Enter the amount of quarters: ");
        quaterCount = userInput.nextInt();

        // calculates 1 dollar 
        dollarTotal = (PENNY * pennyCount) + (NICKEL * nickelCount)
                + (DIME * dimeCount) + (QUATER * quaterCount);

        // tests if the amount entered is below, above or equal to 1 dollar and displys the result
        if (dollarTotal == 1.00) {
            System.out.println("\nCongratulations !!! You have won the game !!!");
        } else if (dollarTotal < 1.00) {
            System.out.println("\nSorry !!! The amount you entered is less than $1 !!!");
        } else {
            System.out.println("\nSorry !!! The amount you entered is more than $1 !!!");
        }

    }

}
