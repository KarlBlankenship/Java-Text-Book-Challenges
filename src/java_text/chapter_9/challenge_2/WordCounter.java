/*
 * Write a method that accepts a String object as an argument
 * and returns the number of words it contains. For instance,
 * if the argument is "Four score and seven years ago" the
 * method should return the number 6. Demonstrate the method
 * in a program that asks the user to input a string and then
 * passes it to the method. The number of words in the string
 * should be displayed on the screen.
 */
package java_text.chapter_9.challenge_2;

import javax.swing.JOptionPane;

/**
 * WordCounter class will count the number of words in a given 
 * string.
 * @author Karl
 */
public class WordCounter {

    /**
     * The amin method for executing the program.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String input;   // The string reference variable to hold user input.
        
        // Ask the user to enter a string.
        input = JOptionPane.showInputDialog("Enter a string of words.");
        
        // Tokenize the input string.
        String[] tokens = input.split(" ");
        
        // Find the number of words and display the results.
        JOptionPane.showMessageDialog(null, 
                "The input String: " + input +
                        " contains " + tokens.length +
                        " words.");
        System.exit(0);
    }
    
}
