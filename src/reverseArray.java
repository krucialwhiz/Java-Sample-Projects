/*
* Write a function that accepts an int array and the array’s size as arguments.
* The function should create a copy of the array, except that the element values
* should be reversed in the copy. Demonstrate the function in a complete program.
 */

import java.util.Scanner;

public class reverseArray {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        final int SIZE = 7;
        int numbers[SIZE] = { 2, 34, 11, 155, 69, 101, 0 };

        // function call
        showReverseArray(numbers, SIZE);

    }

    public static void showReverseArray(int values[], int size) {
        // Make nums point to values.
        int[] nums = values;

        // Display the elements in the original array.
        System.out.println("The elements of the original array are: ");

        // Displaying the first element of the array.
        System.out.print(nums + " ");

        // Making nums point to the subsequent elements
        while (nums < values[size - 1]) {
            nums++;
            // Display the subsequent elements
            System.out.print(nums + " ");
        }

        System.out.println("\nThe elements of the reversed array are: ");
        System.out.print(nums + " ");  // To display the first element

        while (nums > values) {
            // Move backward to the previous element.
            nums--;
            // Display the elements that nums point to.
            System.out.print(nums + " ");
        }
        System.out.println();
    }

}
