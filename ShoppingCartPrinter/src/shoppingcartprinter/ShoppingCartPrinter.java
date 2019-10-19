/**
 * Southern NH University
 * IT - 145 Foundations in Application Development
 * Instructor: Joe Parker
 * Student: Jason Lima
 * Date: 10/12/18
 *
 * Description:
 *
 * A description of the program line 1 goes here
 * A description of the program line 2 goes here
 * A description of the program line 3 goes here
 */
package shoppingcartprinter;

import java.util.Scanner;

/**
 *
 * @author Jason
 */
public class ShoppingCartPrinter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in); //Scanner initiated
        /*Instatiating user inputs for method parameters*/
        String userInputName;
        double userInputPrice;
        int userInputQuantity;

        /*Creating item object*/
        ItemToPurchase item = new ItemToPurchase();

        System.out.println("Item 1");
        /*Getting item object name*/
        System.out.print("Enter the item name: ");
        userInputName = scnr.nextLine();
        item.setItemName(userInputName);

        /*Getting item object price*/
        System.out.print("Enter the item price: ");
        userInputPrice = scnr.nextDouble();
        item.setItemPrice(userInputPrice);

        /*Getting item object quanitity*/
        System.out.print("Enter the item quantity: ");
        userInputQuantity = scnr.nextInt();
        item.setItemQuantity(userInputQuantity);

        /*Break line space*/
        System.out.println("");
        /*To allow user to input a new string in program*/
        scnr.nextLine();

        /*Creating item2 object*/
        ItemToPurchase item2 = new ItemToPurchase();

        System.out.println("Item 2");
        /*Getting item object name*/
        System.out.print("Enter the item name: ");
        userInputName = scnr.nextLine();
        item2.setItemName(userInputName);

        /*Getting item2 object price*/
        System.out.print("Enter the item price: ");
        userInputPrice = scnr.nextDouble();
        item2.setItemPrice(userInputPrice);

        /*Getting item2 object quanitity*/
        System.out.print("Enter the item quantity: ");
        userInputQuantity = scnr.nextInt();
        item2.setItemQuantity(userInputQuantity);

        /*Getting total cost of items*/
        System.out.println("\nTotalCost");
        /*Printing Item 1 Cost*/
        System.out.println(item.getName() + " " + item.getQuantity()
                + " @ $" + item.getPrice() + "= $"
                + (item.getQuantity() * item.getPrice()));
        /*Printing Item 2 cost*/
        System.out.println(item2.getName() + " " + item2.getQuantity()
                + " @ $" + item2.getPrice() + "= $"
                + (item2.getQuantity() * item2.getPrice()));
    }

}
