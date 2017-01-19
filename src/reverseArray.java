/*
* Write a function that accepts an int array and the array’s size as arguments.
* The function should create a copy of the array, except that the element values
* should be reversed in the copy. Demonstrate the function in a complete program.
 */

import java.util.Scanner;

public class reverseArray {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        // function call
        showReverseArray();

    }

    public static void showReverseArray() {
        int size, i, j, temp;
        int arr[] = new int[50];

        System.out.print("Enter Array Size : ");
        size = userInput.nextInt();

        System.out.print("Enter Array Elements : ");
        for (i = 0; i < size; i++) {
            arr[i] = userInput.nextInt();
        }

        j = i - 1;     // now j will point to the last element
        i = 0;         // and i will point to the first element

        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        System.out.println("Reverse of Array is : ");
        for (i = 0; i < size; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

}
