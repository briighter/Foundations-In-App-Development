/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package textmsgexpander;
import java.util.Scanner;
/**
 *
 * @author Jason
 */
public class TextMsgExpander {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userInput = "";
        
        
        System.out.println("Enter text: ");
        userInput = scnr.nextLine();
        
        System.out.println("You entered: " + userInput);
        System.out.println("");
        // Expand common text message abbreviations. Output a message for each
        // abbreviation that is expanded, then output the expanded line. 
        // Note: Check for abbreviations in the order provided below. (5 pts)
        if (userInput.contains("BFF")) {
            userInput = userInput.replace("BFF", "best friend forever");
            System.out.println("Replaced \"BFF\" with \"best friend forever\".");
        }
        if (userInput.contains("IDK")) {
            userInput = userInput.replace("IDK", "I don't know");
            System.out.println("Replaced \"IDK\" with \"I don't know\".");
        }
        if (userInput.contains("JK")) {
            userInput = userInput.replace("JK", "just kidding");
            System.out.println("Replaced \"JK\" with \"just kidding\".");
        }
        if (userInput.contains("TMI")) {
            userInput = userInput.replace("TMI", "too much information");
            System.out.println("Replaced \"TMI\" with \"too much information\".");
        }
        if (userInput.contains("TTYL")) {
            userInput = userInput.replace("TTYL", "talk to you later");
            System.out.println("Replaced \"TTYL\" with \"talk to you later\".");
        }
        
        System.out.println("");
        System.out.println("Expanded: " + userInput);
    }
    
}
