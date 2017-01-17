/* Write a program that asks the user for a positive integer value.
 * The program should use a loop to get the sum of all the integers from 1 up to the number entered.
 * For example, if the user enters 50, the loop will find the sum of 1, 2, 3, 4, ... 50.
 * Input Validation: Do not accept a negative number.
 */

import java.util.Scanner;

public class sumOfNumbers {
    
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        // variables
        int integerInput;
        int sum = 0;

        // do while construct loops until a valid input is entered
        do {
            System.out.print("Enter a positive integer value: ");
            integerInput = userInput.nextInt();
        } while (integerInput < 0);

        // for loop takes integerInput and adds the sum of positive integers up to that integer
        for (int i = 1; i <= integerInput; i++) {
            sum += i;
        }
        // outputs sum 
        System.out.println("\nThe sum of positive integers up to " + integerInput + " is: " + sum);

    }

}
