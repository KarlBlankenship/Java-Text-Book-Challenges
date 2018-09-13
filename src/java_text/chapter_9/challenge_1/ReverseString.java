/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_text.chapter_9.challenge_1;

import java.util.Scanner;

/**
 * This class will prompt the user to enter a string which will then be 
 * displayed with the characters in reverse order.
 * @author Karl
 */
public class ReverseString {

    /**
     * Main method for executing this program.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String inputString; // String reference variable to hold input string.
        Scanner keyboard = new Scanner(System.in); // New Scanner object.
        
        // Prompt user to enter a string.
        System.out.println("Please enter a string.");
        
        // Read string upon enter.
        inputString = keyboard.nextLine();
        
        // Display the results.
        System.out.println(reverseOrder(inputString));
        
    }
    
    public static String reverseOrder(String input) {
            String outputString = ""; // Create the return string.
            
            String[] tokens = input.split(""); // Split string into an array.
            
            // Convert tokens back into a string in reverse order.
            for (int i=tokens.length - 1; i >= 0;i--)
                outputString = outputString + (tokens[i]);
            
            return outputString; // Return the reversed output string.
        }
    
}
