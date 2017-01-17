/* There are three seating categories at a stadium.
* For a baseball game, Class A seats cost $15, Class B seats cost $12, and Class C seats cost $9.
* Write a program that asks how many tickets for each class of seats were sold,
* then displays the amount of income generated from ticket sales.
* Format your dollar amount in fixed-point notation, with two decimal places of precision.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class stadiumSeating {

    static Scanner userInput = new Scanner(System.in);
    static DecimalFormat roundOff = new DecimalFormat("0.00");

    public static void main(String[] args) {

        // variables
        final int seatA = 15;
        final int seatB = 12;
        final int seatC = 9;

        int inputA, inputB, inputC;
        double total;

        // input for tickets
        System.out.println("\tCost of Tickets");
        System.out.println("------------------------------------------");
        System.out.println("Class A: $15\t Class B: $12\t Class C: $9\n");

        System.out.print("Enter the number of class A seat tickets needed: ");
        inputA = userInput.nextInt();

        System.out.print("Enter the number of class B seat tickets needed: ");
        inputB = userInput.nextInt();

        System.out.print("Enter the number of class C seat tickets needed: ");
        inputC = userInput.nextInt();

        // calculates total income from tickets
        total = (seatA * inputA) + (seatB * inputB) + (seatC * inputC);

        // output total ticket prices and sets it at 2 decimal places
        System.out.println("\nTotal income from tickets are: $" + roundOff.format(total));

    }

}
