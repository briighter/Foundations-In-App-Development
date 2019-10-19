/**
 * Southern NH University
 * IT - 145 Foundations in Application Development
 * Instructor: Joe Parker
 * Student: Jason Lima
 * Date: 10/12/18
 *
 * Description:
 *
 * This class will control the properties and methods of handling
 * products available in stores. This program will create new products
 * and be able to assign a Name, Price, and Quantity
 * the user wants to purchase.
 */
package shoppingcartprinter;

/**
 *
 * @author Jason
 * @version 1.0
 */
public class ItemToPurchase {

    /*Initiating provate field variables*/
    private String itemName = "none";
    private double itemPrice = 0;
    private int itemQuantity = 0;

    /*Creation of the default constructor for class*/
    public ItemToPurchase() {
        itemName = "none";
        itemPrice = 0;
        itemQuantity = 0;
    }

    /**
     * ***Begin Setters****
     */
    /*Method for setting Item Name*/
    public void setItemName(String nameOfItem) {
        itemName = nameOfItem;
    }


    /*Method for setting Item price*/
    public void setItemPrice(double priceOfItem) {
        itemPrice = priceOfItem;
    }

    /*Method for setting Item Quantity*/
    public void setItemQuantity(int quanitityOfItem) {
        itemQuantity = quanitityOfItem;
    }

    /**
     * ****Begin Getter
     *
     * @return s****
     */
    /*Method for getting name*/
    public String getName() {
        return itemName;
    }

    /*Method for getting item price*/
    public double getPrice() {
        return itemPrice;
    }

    /*Method for getting idem quantity*/
    public int getQuantity() {
        return itemQuantity;
    }

    /**
     * ***Mutators****
     */
    /*Increase quantity amount*/
    public int increaseQuanitity(int increaseAmt) {
        itemQuantity = itemQuantity + increaseAmt;
        return itemQuantity;
    }

    /*Decrease quantity amount*/
    public int decreaseQuanitity(int decreaseAmt) {
        itemQuantity = itemQuantity - decreaseAmt;
        if (itemQuantity < 0) {
            itemQuantity = 0;
        }
        return itemQuantity;
    }

}
