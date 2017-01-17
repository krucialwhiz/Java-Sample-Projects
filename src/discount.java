/* Calculate the discount given to a customer based on what is purchased. 
 * The customer purchased three items; find the sum of the three prices to get the total price.
 *  If the total is below $55.00, the customer will receive no discount. 
 * If the total price is $55.00 and  over, the customer will receive a 10% discount. 
 * If the total price is  $300.00 and over, the customer will receive a 15% discount. 
 * For any other purchase  $310.00 and over, the customer will get a 20% discount. 
 * The program should show the discount and the discounted price on the receipt.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class discount {

    static Scanner userInput = new Scanner(System.in);
    static DecimalFormat roundOff = new DecimalFormat("#.00");

    public static void main(String[] args) {

        final double DISCOUNT_TEN = 0.1;
        final double DISCOUNT_FIFTEEN = 0.15;
        final double DISCOUNT_TWENTY = 0.2;

        double item1, item2, item3;
        double itemTotal;

        System.out.print("Enter the price of the item: $");
        item1 = userInput.nextDouble();
        System.out.print("Enter the price of the item: $");
        item2 = userInput.nextDouble();
        System.out.print("Enter the price of the item: $");
        item3 = userInput.nextDouble();

        System.out.println();

        // calcualtions
        itemTotal = item1 + item2 + item3;

        if (itemTotal < 55) {
            System.out.println("Discount rate: 0%" + "\n" + "Discount: $0.00 \n"
                    + "Gross Total: $" + roundOff.format(itemTotal) + "\n" + "Net Total: $" + roundOff.format(itemTotal));
        } else if (itemTotal > 55 && itemTotal < 300) {
            System.out.println("Discount rate: 10%" + "\n" + "Discount: $" + roundOff.format(DISCOUNT_TEN * itemTotal) + "\n"
                    + "Gross Total: $" + roundOff.format(itemTotal) + "\n" + "Net Total: $" + roundOff.format(itemTotal - (DISCOUNT_TEN * itemTotal)));
        } else if (itemTotal > 300 && itemTotal < 310) {
            System.out.println("Discount rate: 15%" + "\n" + "Discount: $" + roundOff.format(DISCOUNT_FIFTEEN * itemTotal) + "\n"
                    + "Gross Total: $" + roundOff.format(itemTotal) + "\n" + "Net Total: $" + roundOff.format(itemTotal - (DISCOUNT_FIFTEEN * itemTotal)));
        } else {
            System.out.println("Discount rate: 20%" + "\n" + "Discount: $" + roundOff.format(DISCOUNT_TWENTY * itemTotal) + "\n"
                    + "Gross Total: $" + roundOff.format(itemTotal) + "\n" + "Net Total: $" + roundOff.format(itemTotal - (DISCOUNT_TWENTY * itemTotal)));
        }

    }

}
