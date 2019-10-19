/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /*
 * Southern NH University
 * IT - 145 Foundations in Application Development
 * Instructor: Joe Parker
 * Student: Jason Lima
 * Date: 09/12/18
 *
 * Description: Purpose of this program is to automate inventory decision
 *              making and make it easier to determine of supplier should be
 *              re-ordered.
 *
 * A description of the program line 1 goes here
 * A description of the program line 2 goes here
 * A description of the program line 3 goes here
 */
package reordersupplies;

import java.util.Scanner;

/**
 *
 * @author Jason
 */
public class ReorderSupplies {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in); //Create the scanner

        // Initialize the variables
        int applesOnHand;
        int applesInvGoal;
        int applesToOrder;
        int orangesOnHand;
        int orangesInvGoal;
        int orangesToOrder;

        // Ask merchant for information regarding inventory and inventory goals
        System.out.println("How many apples are in inventory: ");
        applesOnHand = scnr.nextInt();
        System.out.println("How many apples should be in inventory: ");
        applesInvGoal = scnr.nextInt();
        System.out.println("How many oranges are in inventory: ");
        orangesOnHand = scnr.nextInt();
        System.out.println("How many organges should be in inventory: ");
        orangesInvGoal = scnr.nextInt();

        /* Check to see if inventory meets goal, of not , calculate difference
         * If condition is TRUE calculate differenct and print to user.
         * If condition is FALSE print no order needed.
         */
        // Begin conditional logic for inventory levels
        if (applesOnHand < applesInvGoal) {
            applesToOrder = applesInvGoal - applesOnHand;
            System.out.println("Merchant must order " + applesToOrder + " apples.");
        } else {
            System.out.println("Sufficient apples inventory.");
        }
        if (orangesOnHand < orangesInvGoal) {
            orangesToOrder = orangesInvGoal - orangesOnHand;
            System.out.println("Merchant must order " + orangesToOrder + " oranges.");
        } else {
            System.out.println("Sufficient oranges in inventory.");
        }

    }

}
