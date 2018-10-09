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
        // Have user enter a line of text, dibide into words and save into
        // a text array.
        // Create a scanner reference variable for storing the keyboard input.
        Scanner keyboard = new Scanner(System.in);
        // Ask the user to enter a line of words.
        System.out.println("Please enter a line of words...");
        // Retrieve the keyboard input.
        String line = keyboard.nextLine();
        System.out.println("This is the line you entered:");
        System.out.println(line);
        // Split the line into individual words by space.
        String[] words = line.split(" "); 
        
        // Create a TreeSet and store the words in it.
        // A Set will not allow duplicate words and a TreeSet
        // will store the words in ascending order.
        SortedSet<String> wordSet = new TreeSet<>();
        for (String word : words)
        {
            wordSet.add(word);
        }
        
        // Display the words in ascending order.
        System.out.println("\nThese are the words you entered");
        System.out.println("without duplicate and in ascending");
        System.out.println("order:");
        System.out.println(wordSet);
    }
}
