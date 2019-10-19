/**
 * Southern NH University
 * IT - 145 Foundations in Application Development
 * Instructor: Joe Parker
 * Student: Jason Lima
 * Date: 10/14/18
 *
 * Description:
 *
 * This program will help automate the decision making of zookeepers.
 * To ensure the quality of the zookeepers responsibilities they will
 * be provided a program to automate their monitoring of animals and the
 * monitoring of their habitats.
 */
package monitor;

import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Jason
 * @verion 2.0
 */
public class Monitor {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner scnr = new Scanner(System.in);              //initialize Scanner
        int option;                                         // initualise user chioce object
        File animals = new File("\\Monitor\\animals.txt");  // get file location
        String animalFile = "animals";                      // set string to file name
        File habitats = new File("\\Monitor\\habitats.txt");// get file location for habitats
        String habitatFile = "habitats";                    // set string to file name
        AnimalsHabitat zoo = new AnimalsHabitat();          // create zoo object to use methods

        // User menu prompt
        String menuPrompt = "Enter a option to monitor:\n1)Animals\n"
                + "2)Habitats\n3)Exit the program";

        // Begin Program //
        System.out.println(menuPrompt);
        System.out.print("Enter Selection: ");
        option = scnr.nextInt(); // get user selection from menuPrompt
        
        // begin loop for valid input from menu //
        while (option < 1 || option > 3) {
            System.out.println("Enter a valid number.");
            option = scnr.nextInt();
        }
        // begin control flow //
        try {
            switch (option) {
                case 1: // if the user picks animals to monitor
                    zoo.askForWhichDetails(animalFile); // call method to look though the animals.txt data
                    break;
                case 2: // if the user picks habitats to monitor
                    zoo.askForWhichDetails(habitatFile); // call method to look though the habitats.txt data
                    break;
                case 3: // if the user picks to exit program
                    System.out.println("Exiting program...");
                    break;
                default: // if the user picks none of the options
                    System.out.println("Enter a valid option");
                    break;
            }
        } catch (IOException e) { // catch exception if file not found
            System.out.print(e);
        }
    }
}
