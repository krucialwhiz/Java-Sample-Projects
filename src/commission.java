/* TDC Company gives out high commission to all workers if their sales are greater
* than $4000.00. Write a program that will prompt the user to input a worker’s sale. 
* If their sales are greater or $4000.00 then 60% commission will be given. 
* If workers’ sales are less than $4000.00, a 30% commission is given. 
* Output the appropriate result.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class commission {

    static Scanner userInput = new Scanner(System.in);
    static DecimalFormat roundOff = new DecimalFormat("#.00");

    public static void main(String[] args) {

        // variables
        final double COM_SIXTY = 0.6;
        final double COM_THIRTY = 0.3;

        double workerSale;
        double workerCommission;
        double totalCommission;
        System.out.print("Enter the worker's sales: $");
        workerSale = userInput.nextDouble();
        
        System.out.println();

        if (workerSale > 4000) {
            workerCommission = (workerSale * COM_SIXTY);
            totalCommission = (workerSale * COM_SIXTY) + workerSale;
            System.out.println("The worker has receive a 60% commission");
            System.out.println("The worker's commission is: $" + roundOff.format(workerCommission) );
            System.out.println("The worker's total is: $" + roundOff.format(totalCommission));
        } else {
            workerCommission = (workerSale * COM_THIRTY);
            totalCommission = (workerSale * COM_THIRTY) + workerSale;
            System.out.println("The worker has receive a 30% commission");
            System.out.println("The worker's commission is: $" + roundOff.format(workerCommission) );
            System.out.println("The worker's total is: $" + roundOff.format(totalCommission));  
        }

    }

}
