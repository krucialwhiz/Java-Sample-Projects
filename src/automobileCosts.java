/* Write a program that asks the user to enter the monthly costs for the following expenses
* incurred from operating his or her automobile: loan payment, insurance, gas, oil, tires, and maintenance.
* The program should then display the total monthly cost of these expenses,
* and the total annual cost of these expenses.
*/

// Libraries used
import java.text.DecimalFormat;
import java.util.Scanner;

public class automobileCosts {

    static Scanner userInput = new Scanner(System.in);
    static DecimalFormat roundOff = new DecimalFormat("#.00");

    public static void main(String[] args) {

        double loanPayment, insurance, gas, oil, tires, maintenance;
        double monthlyTotal, yearlyTotal;

        System.out.println("Enter the monthly cost for each of the following expenses \n");

        // input for all monthly expenses
        System.out.print("Loan Payment: $");
        loanPayment = userInput.nextDouble();
        System.out.print("Insurance: $");
        insurance = userInput.nextDouble();
        System.out.print("Gas: $");
        gas = userInput.nextDouble();
        System.out.print("Oil: $");
        oil = userInput.nextDouble();
        System.out.print("Tires: $");
        tires = userInput.nextDouble();
        System.out.print("Maintenance: $");
        maintenance = userInput.nextDouble();

        System.out.println();

        // all calculations for monthly and yearly expenses
        monthlyTotal = loanPayment + insurance + gas + oil + tires + maintenance;
        yearlyTotal = monthlyTotal * 12;

        System.out.println("Expenses \t\t Monthly Cost \t\t Yearly Cost");
        System.out.println("------------------------------------------------------------");

        System.out.println("Loan Payment \t\t" + " $" + roundOff.format(loanPayment) + "\t\t " + 
                "$" + roundOff.format(loanPayment * 12));
        System.out.println("Insurance \t\t" + " $" + roundOff.format(insurance) + "\t\t " + 
                "$" + roundOff.format(insurance * 12));
        System.out.println("Gas \t\t\t" + " $" + roundOff.format(gas) + "\t\t " + "$" + roundOff.format(gas * 12));
        System.out.println("Oil \t\t\t" + " $" + roundOff.format(oil) + "\t\t " + "$" + roundOff.format(oil * 12));
        System.out.println("Tires \t\t\t" + " $" + roundOff.format(tires) + "\t\t " + "$" + roundOff.format(tires * 12));
        System.out.println("Maintenance \t\t" + " $" + roundOff.format(maintenance) + "\t\t " + 
                "$" + roundOff.format(maintenance * 12));

        System.out.println();

        System.out.println("Monthly Total: $" + roundOff.format(monthlyTotal));
        System.out.println("Yearly Total: $" + roundOff.format(yearlyTotal));

    }

}
