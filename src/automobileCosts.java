
import java.util.Scanner;

/* Write a program that asks the user to enter the monthly costs for the following expenses
* incurred from operating his or her automobile: loan payment, insurance, gas, oil, tires, and maintenance.
* The program should then display the total monthly cost of these expenses,
* and the total annual cost of these expenses.
 */
public class automobileCosts {

    static Scanner userInput = new Scanner(System.in);

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
        
        System.out.println("Loan Payment \t\t" + "$" + loanPayment + "\t\t\t " + "$" + (loanPayment * 12));
        System.out.println("Insurance \t\t" + "$" + insurance + "\t\t\t " + "$" + (insurance * 12));
        System.out.println("Gas \t\t\t" + "$" + gas + "\t\t\t " + "$" + (gas * 12));
        System.out.println("Oil \t\t\t" + "$" + oil + "\t\t\t " + "$" + (oil * 12));
        System.out.println("Tires \t\t\t" + "$" + tires + "\t\t\t " + "$" + (tires * 12));
        System.out.println("Maintenance \t\t" + "$" + maintenance + "\t\t\t " + "$" + (maintenance * 12));
        
        System.out.println();
        
        System.out.println("Monthly Total: $" + monthlyTotal);
        System.out.println("Yearly Total: $" + yearlyTotal);

    }

}
