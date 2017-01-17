/* Value Mart Supermarket is keeping track of the number of stocks or items they have. 
* Write an algorithm to keep track of how many of the items remain at the end of the day
* if the initial quantity was 457. Input the quantity bought at each purchase; 
* calculate the total amount sold and the quantity remaining, 
* if the number of sales and quantity purchased is not known in advance. 
* Terminate the data by entering 0 for quantity.  
 */

import java.util.Scanner;

public class stock {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        int stock = 457;
        int quantity = -1;
        int netStock;

        while (quantity != 0) {
            System.out.print("\nEnter the number of items: ");
            quantity = userInput.nextInt();

            netStock = stock - quantity;
            System.out.println("\nThe number of items purchased from the stock was: " + quantity + "\n"
                    + "Number of items left in the stock is: " +  netStock); 

            stock = netStock;
        }
        
        System.exit(0);

    }

}
