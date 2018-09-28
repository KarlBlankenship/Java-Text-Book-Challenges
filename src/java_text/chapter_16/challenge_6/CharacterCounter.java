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
        char[] charArray = {'a','b','c','i','d','e','f','g','t','y'};
        char target = 'a';
        System.out.println(counter(charArray, target, charArray.length-1));
    }
    
    private static int counter(char[] input, char x, int index) {
        if (index == 0 && input[index] == x)
            return 1;
        else if (index == 0 && input[index] != x)
            return 0;
        else if (input[index] == x)
            return 1 + counter(input, x, index - 1);
        else
            return counter(input, x, index - 1);        
    }
}
