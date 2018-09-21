/*
 * Write a recursive method that acceptsa string as its argument
 * and prints the string in reverse order.
 */
package java_text.chapter_16.challenge_3;

import java.util.Scanner;

/**
 *  
 * @author Karl
 */
public class RecursiveStringReversal {

    /**
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
    
    private static String reverseOrder(String input) {
        
        if (input.length() == 1)
                return String.valueOf(input.charAt(0));
        else
                return String.valueOf(input.charAt(input.length()-1)) + 
                        reverseOrder(input.substring(0,input.length()-1));
        
    }
    
}
