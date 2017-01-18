/* Write a function that returns an integer and accepts string as an argument.
* The function should count the number of characters in the string and return that number.
* Demonstrate the function in a simple program that asks the user to input a string,
* passes it to the function, and then displays the function’s return value.
 */

import java.util.Scanner;

public class stringLength {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        String strLength;

        System.out.print("Enter string: ");
        strLength = userInput.nextLine();

        // outputs the string and the number of characters in that string
        System.out.println("\nString: " + strLength);
        System.out.print("Number of charaters in the string: ");
        int strCount = stringCount(strLength);

        System.out.println();

    }

    public static int stringCount(String str) {

        // counts how many characters are in the array
        System.out.print(str.length());

        return str.length();
    }

}
