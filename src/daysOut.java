/* Write a program that calculates the average number of days a company’s employees are absent.
* The program should have the following functions:
*   •	A function called by main that asks the user for the number of employees in the company.
*		This value should be returned as an int. (The function accepts no arguments.)
*   •	A function called by main that accepts one argument: the number of employees in the company.
*		The function should ask the user to enter the number of days each employee missed during the past year.
*		The total of these days should be returned as an int.
*   •	A function called by main that takes two arguments: the number of employees in the company
*		and the total number of days absent for all employees during the year.
*		The function should return, as a double, the average number of days absent.
*		(This function does not perform screen output and does not ask the user for input.)
 */

import java.util.Scanner;

public class daysOut {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        // variables
        int employees;
        int total;
        double average;

        // functions called in main
        employees = numOfEmployees();
        total = numofDaysMissing(employees);
        average = avgDaysWorked(employees, total);

        // outputs average days employees are absent
        System.out.println("\nThe average number of days a company's employees are absent is: "
                + average + "\n");
    }

    // function for number of employees
    public static int numOfEmployees() {
        int workers;
        System.out.print("Enter the number of employees in the company: ");
        workers = userInput.nextInt();
        System.out.println();
        return workers;
    }

    // function for the number of days missed
    public static int numofDaysMissing(int w) {
        int workers = w;
        int total = 0;
        int absent;

        for (int employeeNum = 0; employeeNum < workers; employeeNum++) {
            System.out.print("Number of days employee " + (employeeNum + 1) + " missed: ");
            absent = userInput.nextInt();
            total += absent;

            while (absent < 0) {
                System.out.print("Please, do not enter negative number! Try again: ");
                absent = userInput.nextInt();
            }
        }
        return total;
    }

    // function for average number of days absent
    public static double avgDaysWorked(int work, int totl) {
        int w = work;
        int t = totl;
        double avg;

        avg = (w * 365) / t;
        return avg;
    }

}
