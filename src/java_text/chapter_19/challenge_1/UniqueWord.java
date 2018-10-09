/*
 * Write an application that reads a line of input from the keyboard,
 * and then displays each unique word that was entered, sorted in 
 * ascending order. You can do this by tokenizing the line of input
 * and adding each token to an appropriate Set object.
 */
package java_text.chapter_19.challenge_1;

import java.util.*;

/**
 * This program will accept a line of text from the keyboard
 * and will display each unique word that was entered in ascending
 * order.
 * @author Karl
 */
public class UniqueWord 
{
    /**
     * The main method executes the program.
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String line; // Reference variable for line entered by keyboard.
        
        // Create a scanner reference variable for storing the keyboard input.
        Scanner keyboard = new Scanner(System.in);
        
        // Ask the user to enter a line of words.
        System.out.println("Please enter a line of words...");
        
        // Retrieve the keyboard input.
        line = keyboard.nextLine();
        
        
        
        
    }
    
}
