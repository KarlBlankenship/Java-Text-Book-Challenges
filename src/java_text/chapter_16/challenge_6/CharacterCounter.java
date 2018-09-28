/*
 * Write a method that uses recursion to count the number of times a
 * specific character occurs in an array of characters. Demonstrate the
 * method in a program.
 */
package java_text.chapter_16.challenge_6;

/**
 * Public class for launching the main method and the character 
 * counter method.
 * @author Karl
 */
public class CharacterCounter {

    /**
     * Main method.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Initialize the character array to be searched.
        char[] charArray = {'t','b','a','i','d','t','f','g','t','t'};
        // Set a search character.
        char target = 'a';
        //Print out search results.
        System.out.println("The char " + target + " was found " +
                counter(charArray, target, 0) + " times in the array.");
    }
    
    /**
     * counter method will accept an array of characters and count
     * how many times a specified character is present.
     * @param input array of characters
     * @param x specified search character
     * @param index starting index for the search
     * @return count of how many times the specified character was present
     */
    private static int counter(char[] input, char x, int index) {
        if (index == input.length)
            return 0;
        else if (input[index] == x)
            return 1 + counter(input, x, index + 1);
        else
            return counter(input, x, index + 1);  
    }
}
